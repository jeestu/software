package edu.zut.cs.software.moon.Warehouse.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.zut.cs.software.moon.Warehouse.service.ShelvesManager;
import edu.zut.cs.software.moon.base.service.impl.GenericManagerImpl;
import edu.zut.cs.software.sun.Warehouse.dao.ShelvesDao;
import edu.zut.cs.software.sun.Warehouse.domain.Shelves;

@Service
@Transactional
public class ShelvesManagerlmpl extends GenericManagerImpl<Shelves,Long> implements ShelvesManager{

	 ShelvesDao  dao;
	
	 @Autowired
	    public void setDao(ShelvesDao dao)
	 {
		 this.dao=dao;
		 }


	    @Override
	    public Shelves save(Shelves shelves)
	    {
	    	return dao.save(shelves);
	    	}
	
	
	
	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
		
	}

	
	public Shelves findById(Long id){
        return dao.getOne(id);
    }
    

	 @Override
	    public List<Shelves> findAll()
	 {
		 return dao.findAll();
		 }

	
}
