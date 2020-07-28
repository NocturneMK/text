package com.tz.xz.service;

import java.util.List;

import com.tz.xz.pojo.TbFilmInfo;

public interface FilmService {

	/**
	 * 定义方法名要规范
	 * 查询：select 或 query
	 * 插入：insert 或 save
	 * 修改：update
	 * 删除：delete
	 */
	public List<TbFilmInfo> selectFilmList();
	
	public TbFilmInfo selectById(Integer filmId);
	
	public int updateTbFilmInfo(TbFilmInfo filmInfo);
	
	public int deleteById(Integer id);
}
