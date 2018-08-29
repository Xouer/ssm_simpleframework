package com.ssm.service.imple;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.ssm.dao.UserMapper;
import com.ssm.pojo.User;
import com.ssm.service.IUserService;

@Service
@Transactional
public class UserServiceImpl implements IUserService{
	
	@Resource
    public UserMapper userMapper;

	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userMapper.selectByPrimaryKey(userId);
	}

}
