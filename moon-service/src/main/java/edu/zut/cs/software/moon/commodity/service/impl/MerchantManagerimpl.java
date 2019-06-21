package edu.zut.cs.software.moon.commodity.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.zut.cs.software.moon.base.service.impl.GenericManagerImpl;
import edu.zut.cs.software.moon.commodity.service.MerchantManager;
import edu.zut.cs.software.sun.commodity.dao.MerchantDao;
import edu.zut.cs.software.sun.commodity.domain.Merchant;

@Service
@Transactional
public class MerchantManagerimpl extends GenericManagerImpl<Merchant,Long> implements MerchantManager{
	MerchantDao  dao;
		
	 @Autowired
	    public void setDao(MerchantDao dao)
	 {
		 this.dao=dao;
		 }


	    @Override
	    public Merchant save(Merchant merchant)
	    {
	    	return dao.save(merchant);
	    	}
	
	
	
	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
		
	}

	
	public Merchant findById(Long id){
        return dao.getOne(id);
    }
    

	 @Override
	    public List<Merchant> findAll()
	 {
		 return dao.findAll();
		 }


}
