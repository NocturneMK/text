package com.tz.xz.service;

import com.tz.xz.pojo.TbUserInfo;

public interface UserService {
	public TbUserInfo selectUserInfo(String name, String pwd);
}
