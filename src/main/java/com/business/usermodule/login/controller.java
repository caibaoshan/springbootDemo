package com.business.usermodule.login;

import com.business.mapper.UserMapper;
import com.business.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class controller {

	@Autowired
	UserMapper userMapper;

	@RequestMapping("/hello")
	public List Hello(){
		List list=new ArrayList();
		list.add("cbs");
		list.add("i LOVE YOU");
		return list;
	}

	@RequestMapping("git/{id}")
	public User get(@PathVariable int id){
		return userMapper.gitUser(id);
	}
}
