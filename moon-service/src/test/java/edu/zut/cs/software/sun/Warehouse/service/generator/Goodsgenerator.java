package edu.zut.cs.software.sun.Warehouse.service.generator;

import java.util.List;

import edu.zut.cs.software.moon.Warehouse.service.GoodManager;
import edu.zut.cs.software.moon.base.service.GenericGenerator;
import edu.zut.cs.software.moon.utils.ExcelAndXLSXUtil;
import edu.zut.cs.software.sun.Warehouse.domain.Good;
import edu.zut.cs.software.sun.Warehouse.domain.Shelves;


public class Goodsgenerator extends GenericGenerator{

	private GoodManager goodManager;
	    public  Goodsgenerator(){}

	    public Goodsgenerator(GoodManager goodManager)
	    {this.goodManager=goodManager;}
	    
	 
	    public void init (String path)
	    {
	        try
	        {
	            List<List<String>> list = ExcelAndXLSXUtil.readXlsx(path);
	            for(int i =0;i<list.size();i++)
	            {
	            	Good good = new Good();
	            	Shelves shelves=new Shelves();
	                List<String> model = list.get(i);
	                good.setShelves(shelves);
	                good.setCommoditName("1鍙�");
	                goodManager.save(good);
	            }
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	    }
	    
}
