package edu.zut.cs.software.sun.Warehouse.service.generator;

import java.util.List;

import edu.zut.cs.software.moon.Warehouse.service.ShelvesgoodManager;
import edu.zut.cs.software.moon.base.service.GenericGenerator;
import edu.zut.cs.software.moon.utils.ExcelAndXLSXUtil;
import edu.zut.cs.software.sun.Warehouse.domain.Shelvesgoods;
import edu.zut.cs.software.sun.Warehouse.domain.Shelves;


public class Shelvesgoodsgenerator extends GenericGenerator{

	private ShelvesgoodManager goodManager;
	    public  Shelvesgoodsgenerator(){}

	    public Shelvesgoodsgenerator(ShelvesgoodManager goodManager)
	    {this.goodManager=goodManager;}
	    
	 
	    public void init (String path)
	    {
	        try
	        {
	            List<List<String>> list = ExcelAndXLSXUtil.readXlsx(path);
	            for(int i =0;i<list.size();i++)
	            {
	            	Shelvesgoods good = new Shelvesgoods();
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
