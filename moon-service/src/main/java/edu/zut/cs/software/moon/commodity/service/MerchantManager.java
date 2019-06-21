package edu.zut.cs.software.moon.commodity.service;

import java.util.List;

import edu.zut.cs.software.moon.base.service.GenericManager;
import edu.zut.cs.software.sun.commodity.domain.Merchant;

public interface MerchantManager extends GenericManager<Merchant, Long>{
	Merchant save(Merchant merchant);
	Merchant findById(Long id);
	List<Merchant> findAll();
	  
	void deleteById(Long id);

}
