package com.tz.xz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tz.xz.mapper.TbFilmInfoMapper;
import com.tz.xz.pojo.TbFilmInfo;

@Service
public class FilmServiceImpl implements FilmService {
	
	//由于有了Mapper动态扫描的配置，TbFilmInfoMapper.xml与TbFilmInfoMapper接口映射。由TbFilmInfoMapper.xml中的sql语句来完成对数据库的操作
	@Autowired//由于开启了Mapper动态扫描，会扫描所有的映射文件，所以这里要使用自动装配的注解
	public TbFilmInfoMapper filmMapper;

	
	
	public List<TbFilmInfo> selectFilmList() {
		return filmMapper.selectByExample(null);//这个方法是使用逆向工程生成的，这一步相当于让dao层查询了数据库并返回了数据
	}

	
	public TbFilmInfo selectById(Integer filmId) {
		//这个方法是使用逆向工程生成的，这一步相当于让dao层查询了数据库并返回了数据
		return filmMapper.selectByPrimaryKey(filmId);
	}


	public int updateTbFilmInfo(TbFilmInfo filmInfo) {
		
		return filmMapper.updateByPrimaryKeySelective(filmInfo);
	}


	public int deleteById(Integer id) {
		
		return filmMapper.deleteByPrimaryKey(id);
	}
	
	
	

}
