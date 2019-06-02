package zut.software.peo.service.impl;

import zut.software.peo.Domain.User;
import zut.software.peo.dao.userDao;
import zut.software.peo.service.Backstage;

public class BackstageImpl implements Backstage{

	@Override
	public void initatl() {
		// TODO Auto-generated method stub
		userDao UserDao=new userDao();
		UserDao.find();
	}
	@Override
	public void after_st() {
		// TODO Auto-generated method stub
		userDao UserDao=new userDao();
		User user=UserDao.getUser();
		String a=user.getName();
		String b=user.getGender();
		String c=user.getPeo().getPeoName();
		c=a+b;
		System.out.print("该用户信息为:"+c);
	}

	@Override
	public void total() {
		// TODO Auto-generated method stub
		userDao UserDao=new userDao();
		User user=UserDao.getUser();
		Integer id=user.getId();
		System.out.print("用户的信息:"+user.getName()+" "+user.getGender()+" "+user.getAge());
		System.out.print(" 所属部门:"+user.getPeo().getPeoName());
		System.out.print(" 职责:"+user.getPeo().getStname());
	}
}
