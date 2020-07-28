package com.tz.xz.tool;

import com.tz.xz.pojo.TbFilmInfo;

/**
 * 这个类是为了演示数据的封装，类似商城系统分页展示时的封装
 * @author Nocturne
 * 
 * 
 *
 */
public class FilmPackaging {
	private TbFilmInfo filmInfo;
	private Integer[] filmIds;
	
	public FilmPackaging() {}
	public TbFilmInfo getFilmInfo() {
		return filmInfo;
	}
	public void setFilmInfo(TbFilmInfo filmInfo) {
		this.filmInfo = filmInfo;
	}
	public Integer[] getFilmIds() {
		return filmIds;
	}
	public void setFilmIds(Integer[] filmIds) {
		this.filmIds = filmIds;
	}
	
}
