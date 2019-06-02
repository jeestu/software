package zut.software.commodit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import zut.software.commodit.Domain.Commodit;
import zut.software.commodit.Domain.Shelves;
import zut.software.commodit.dao.commoditDao;



class commoditDaoTest {
	
	@Test
	public void savetest()
	{
		Shelves shelves =new Shelves();
		
		Commodit commodit=new Commodit();
		commodit.setShelves(shelves);
		
		commoditDao CommoditDao=new commoditDao();
		CommoditDao.save(commodit);
	}



	@Test
	public void findtest()
	{
		Shelves shelves =new Shelves();
		
		Commodit commodit=new Commodit();
		commodit.setShelves(shelves);
	
		commoditDao CommoditDao=new commoditDao();
		CommoditDao.find();
	}
	
	@Test
	public void deletetest()
	{
		Shelves shelves =new Shelves();
		Commodit commodit=new Commodit();
		commodit.setShelves(shelves);
		commoditDao CommoditDao=new commoditDao();
		CommoditDao.delete();
	}
	@Test
	public void updatetest()
	{
        Shelves shelves =new Shelves();
		
		Commodit commodit=new Commodit();
		commodit.setShelves(shelves);
	
		commoditDao CommoditDao=new commoditDao();
		CommoditDao.update();
		
	}
	
	@Test
	public void testGroupBytest()
	{

		Shelves shelves =new Shelves();
		
		Commodit commodit=new Commodit();
		commodit.setShelves(shelves);
	
		commoditDao CommoditDao=new commoditDao();
		CommoditDao.testGroupBy();
	}
	

}
