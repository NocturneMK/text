package com.tz.xz.mapper;

import com.tz.xz.pojo.TbFilmInfo;
import com.tz.xz.pojo.TbFilmInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbFilmInfoMapper {
    int countByExample(TbFilmInfoExample example);

    int deleteByExample(TbFilmInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbFilmInfo record);

    int insertSelective(TbFilmInfo record);

    List<TbFilmInfo> selectByExample(TbFilmInfoExample example);

    TbFilmInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbFilmInfo record, @Param("example") TbFilmInfoExample example);

    int updateByExample(@Param("record") TbFilmInfo record, @Param("example") TbFilmInfoExample example);

    int updateByPrimaryKeySelective(TbFilmInfo record);

    int updateByPrimaryKey(TbFilmInfo record);
}