package edu.zut.cs.software.sun.commodity.service.generator;

import java.util.List;

import edu.zut.cs.software.moon.base.service.GenericGenerator;
import edu.zut.cs.software.moon.commodity.service.CommodityManager;
import edu.zut.cs.software.moon.utils.ExcelAndXLSXUtil;
import edu.zut.cs.software.sun.commodity.domain.Commodity;
import edu.zut.cs.software.sun.commodity.domain.Merchant;

public class Commoditygenerator extends GenericGenerator{
	private CommodityManager commodityManager;
    public  Commoditygenerator(){}

    public Commoditygenerator(CommodityManager commodityManager)
    {this.commodityManager=commodityManager;}
    
 
    public void init (String path)
    {
        try
        {
            List<List<String>> list = ExcelAndXLSXUtil.readXlsx(path);
            for(int i =0;i<list.size();i++)
            {
            	Commodity commodity = new Commodity();
            	Merchant merchant=new Merchant();
                List<String> model = list.get(i);
                commodity.setMerchant(merchant);
                commodity.setCommodityName("¼ÆËã»ú");
                commodityManager.save(commodity);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
