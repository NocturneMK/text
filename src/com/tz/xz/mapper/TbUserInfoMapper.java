package com.tz.xz.mapper;

import com.tz.xz.pojo.TbUserInfo;
import com.tz.xz.pojo.TbUserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbUserInfoMapper {
    int countByExample(TbUserInfoExample example);

    int deleteByExample(TbUserInfoExample example);

    int deleteByPrimaryKey(Integer sId);

    int insert(TbUserInfo record);

    int insertSelective(TbUserInfo record);

    List<TbUserInfo> selectByExample(TbUserInfoExample example);

    TbUserInfo selectByPrimaryKey(Integer sId);

    int updateByExampleSelective(@Param("record") TbUserInfo record, @Param("example") TbUserInfoExample example);

    int updateByExample(@Param("record") TbUserInfo record, @Param("example") TbUserInfoExample example);

    int updateByPrimaryKeySelective(TbUserInfo record);

    int updateByPrimaryKey(TbUserInfo record);

}