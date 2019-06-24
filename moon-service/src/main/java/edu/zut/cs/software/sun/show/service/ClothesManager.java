package edu.zut.cs.software.sun.show.service;

import java.util.List;

import edu.zut.cs.software.moon.base.service.GenericManager;

import edu.zut.cs.software.sun.show.domain.Clothes;

public interface ClothesManager extends GenericManager<Clothes, Long>{

	Clothes save(Clothes clothes);
	Clothes findById(Long id);
	List<Clothes> findAll();

	void update(Clothes clothes);
	void deleteById(Long id);
}
