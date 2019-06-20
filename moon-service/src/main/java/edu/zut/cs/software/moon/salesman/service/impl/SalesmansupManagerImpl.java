package edu.zut.cs.software.moon.salesman.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.zut.cs.software.moon.base.service.impl.GenericManagerImpl;
import edu.zut.cs.software.moon.salesman.service.SalesmansupManager;
import edu.zut.cs.software.sun.salesman.dao.SalesmanDao;
import edu.zut.cs.software.sun.salesman.dao.SalesmansupDao;
import edu.zut.cs.software.sun.salesman.domain.Salesman;
import edu.zut.cs.software.sun.salesman.domain.Salesmansup;

@Service
@Transactional
public class SalesmansupManagerImpl extends GenericManagerImpl<Salesman,Long> implements SalesmansupManager{

	 Salesman salesman;
	 Salesmansup salesmansup;
	 SalesmanDao  salesmandao;
	 SalesmansupDao salesmansupdao;
	 
	 @Autowired
	    public void setDao(SalesmanDao salesmandao, SalesmansupDao salesmansupdao)
	 {
		 this.salesmandao=salesmandao;
		 this.salesmansupdao=salesmansupdao;
		 }


	    @Override
	    public Salesman save(Salesman salesman)
	    {
	    	return salesmandao.save(salesman);
	    	}
	
	
	
	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		salesmandao.deleteById(id);
		
	}

	
	public Salesman findById1(Long id){
        return salesmandao.getOne(id);
    }
    

	 @Override
	    public List<Salesman> findAll()
	 {
		 return salesmandao.findAll();
		 }


	@Override
	public Salesman findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}