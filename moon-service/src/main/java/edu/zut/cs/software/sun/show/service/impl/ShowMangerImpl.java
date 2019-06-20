package edu.zut.cs.software.sun.show.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.zut.cs.software.moon.base.service.impl.GenericManagerImpl;
import edu.zut.cs.software.sun.show.dao.AdvertisingDao;
import edu.zut.cs.software.sun.show.domain.Advertising;
import edu.zut.cs.software.sun.show.service.ShowManger;

@Service()
@Transactional
public class ShowMangerImpl extends GenericManagerImpl<Advertising, Long> implements ShowManger{
	
	@Autowired
	AdvertisingDao advertisingDao;

	public AdvertisingDao getAdvertisingDao() {
		return advertisingDao;
	}

	public void setAdvertisingDao(AdvertisingDao advertisingDao) {
		this.advertisingDao = advertisingDao;
	}

	@Override
	public List<Advertising> findByPage(String Name) {
		//������ѯ�������ݶ���
		Advertising queryObject = new Advertising();
        queryObject.setAdvertsingClass("Name");;
        queryObject.setDateCreated(null);
        queryObject.setDateModified(null);
        //����ƥ���������ʹ�ò�ѯ����

        ExampleMatcher exampleMatcher = ExampleMatcher.matching()
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING) // �ı�Ĭ���ַ���ƥ�䷽ʽ��ģ����ѯ
                .withIgnoreCase(true) // �ı�Ĭ�ϴ�Сд���Է�ʽ�����Դ�Сд
                .withMatcher("Name", ExampleMatcher.GenericPropertyMatchers.startsWith()); // ��ַ���á���ʼƥ�䡱�ķ�ʽ��ѯ

        Example<Advertising> example = Example.of(queryObject, exampleMatcher);

        return advertisingDao.findAll(example);
	}
	
	@Override
	public List<Advertising> findAll() {
		// TODO Auto-generated method stub
		return advertisingDao.findAll();
	}


	@Override
	public void deleteByid(Long id) {
		// TODO Auto-generated method stub
		advertisingDao.deleteById(id);
	}

}
