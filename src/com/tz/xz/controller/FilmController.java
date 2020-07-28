package com.tz.xz.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.tz.xz.pojo.TbFilmInfo;
import com.tz.xz.service.FilmService;
import com.tz.xz.tool.FilmPackaging;

/**
 * 整合SSM
 * 
Controller返回值类型
	1、ModelAndView类型
	2、String类型
		a、直接指定视图名称  例子：return "list";
		b、重定向到一个Controller的地址：return "redirect:/filmList.action";
		c、内部转发：return "forward:/filmList.action";
 * @author Nocturne
 * 
 * 上传文件测试：
 * 点击修改，点击上传图片就上传成功了，由于list.jsp没有显示图片，再次点击刚刚的修改，就可以看见了
 * 上传的文件会储存到配置的虚拟目录的路径中
 */

//我们定义这个类是一个servlet类
@Controller
@RequestMapping("/film")
public class FilmController {
	
	@Autowired//在springmvc.xml中开启了对service包的扫描，会扫描service包中所有的类，所以这里要使用自动装配
	private FilmService filmService;
	
	
	
	//显示列表
	@RequestMapping("/list.action")
	public ModelAndView filmList() {
		ModelAndView mv = new ModelAndView();
		//返回的数据
		mv.addObject("filmList", filmService.selectFilmList());
		//设置返回出去的页面资源地址
		mv.setViewName("list");
		
		return mv;
	}
	
	//修改，回显数据（根据ID查询电影信息，并返回给页面显示）
	@RequestMapping("/selectById.action")
	public ModelAndView selectById(Integer filmId) {//这里形参要和jsp页面中name的值相同
		ModelAndView mv = new ModelAndView();
		System.out.println(filmId);
		mv.addObject("film", filmService.selectById(filmId));
		mv.setViewName("edit");
		return mv;
	}
	//这个方法实现的操作：修改数据，上传图片，演示SpringMVC的异常处理
	@RequestMapping("/updateFilm.action")
	//此处传入的是封装类，由于此方法要的参数值是封装类中pojo，所以jsp页面中name的值为： pojo类的实例化名.属性名  
	public ModelAndView updateById(FilmPackaging filmPack, MultipartFile fileImg) throws IllegalStateException, IOException {//上传图片要加上MultipartFile，它是上传的工具类。注意：它的参数值要和jsp页面中相关的name值相同
		ModelAndView mv = new ModelAndView();
		
		//int i = 10/0;//演示SpringMVC的异常处理
		TbFilmInfo filmInfo = filmPack.getFilmInfo();
		
		//此处要加上判断，如果没有选择要上传的文件（不想上传文件，即文件名为空），就不需要调用上传文件的方法
		if(fileImg.getOriginalFilename() != "") {
			String picName = uploadImg(fileImg);//调用自己写的文件上传的方法
			filmPack.getFilmInfo().setfPic(picName);
		}
		
		filmService.updateTbFilmInfo(filmInfo);//调用修改数据的方法
		mv.setViewName("edit_ok");

		return mv;
	}
	
	
	@RequestMapping("/deleteById.action")
	public String deleteById(Integer filmId) {
		filmService.deleteById(filmId);
		return "redirect:/film/list.action";//重定向到这个路径
	}
	
	
	//根据多个id批量删除
	@RequestMapping("/deleteByIds.action")
	public String deleteByIds(FilmPackaging filmPack) {//此处传入的时封装类，jsp页面中name的值要和封装类中的属性名相同
		Integer[] ids = filmPack.getFilmIds();
		for (int i = 0; i < ids.length; i++) {
			System.out.println(ids[i]);
			filmService.deleteById(ids[i]);
		}
		return "redirect:/film/list.action";//重定向到这个路径
	}
	
	
	//上传图片的方法
	public String uploadImg(MultipartFile fileImg) throws IllegalStateException, IOException {//通过MultipartFile获取文件名
		String name = UUID.randomUUID().toString();//让图片的文件名唯一
		//获取上传文件的原始文件名
		String originalName = fileImg.getOriginalFilename();
		//获取文件后缀名
		String suffixName = originalName.substring(originalName.indexOf("."));
		//文件的新名称
		String reName = name + suffixName;
		
		//上传的文件
		fileImg.transferTo(new File("D:\\Java\\JavaCode\\ProjectImages\\SSMdemo\\" + reName));
		
		return reName;
	}
	
}
