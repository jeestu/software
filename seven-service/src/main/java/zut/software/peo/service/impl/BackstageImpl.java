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
		System.out.print("���û���ϢΪ:"+c);
	}

	@Override
	public void total() {
		// TODO Auto-generated method stub
		userDao UserDao=new userDao();
		User user=UserDao.getUser();
		Integer id=user.getId();
		System.out.print("�û�����Ϣ:"+user.getName()+" "+user.getGender()+" "+user.getAge());
		System.out.print(" ��������:"+user.getPeo().getPeoName());
		System.out.print(" ְ��:"+user.getPeo().getStname());
	}
}
