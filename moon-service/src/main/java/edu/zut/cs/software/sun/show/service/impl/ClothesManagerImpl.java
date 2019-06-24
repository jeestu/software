package edu.zut.cs.software.sun.show.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



import edu.zut.cs.software.moon.base.service.impl.GenericManagerImpl;
import edu.zut.cs.software.sun.show.dao.ClothesDao;
import edu.zut.cs.software.sun.show.domain.Clothes;
import edu.zut.cs.software.sun.show.domain.ClothesBaseDao;
import edu.zut.cs.software.sun.show.service.ClothesManager;

@Service
@Transactional
public class ClothesManagerImpl extends GenericManagerImpl<Clothes,Long> implements ClothesManager{

	ClothesDao  dao;
	
	  @Autowired
	    public void setDao(ClothesDao dao){this.dao=dao;}


	    @Override
	    public Clothes save(Clothes good){return dao.save(good);}

	    
	    @Override
		public void deleteById(Long id) {
			// TODO Auto-generated method stub
			 dao.deleteById(id);
		}
	
		public Clothes findById(Long id){
	        return dao.getOne(id);
	    }
		@Override
		public void update(Clothes clothes) {
			// TODO Auto-generated method stub
			ClothesBaseDao.getintstan().update(clothes);
			
		}
	    
}
