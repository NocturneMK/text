package com.tz.xz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tz.xz.mapper.TbUserInfoMapper;
import com.tz.xz.pojo.TbUserInfo;
import com.tz.xz.pojo.TbUserInfoExample;

@Service 
public class UserServiceImpl implements UserService {
	@Autowired
	private TbUserInfoMapper userMapper;//负责操作数据库
	
	@Override
	public TbUserInfo selectUserInfo(String name, String pwd) {
		TbUserInfo userInfo=null;
		TbUserInfoExample u=new TbUserInfoExample();
		u.createCriteria().andSNameEqualTo(name).andSPwdEqualTo(pwd);
		List<TbUserInfo> list=userMapper.selectByExample(u);
		if(list.size()>0){
			userInfo=list.get(0);
		}
		return userInfo;
	}

}
