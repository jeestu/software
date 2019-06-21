package edu.zut.cs.software.sun.order.service.generator;

import java.util.List;

import edu.zut.cs.software.moon.base.service.GenericGenerator;
import edu.zut.cs.software.moon.order.service.OrderManager;
import edu.zut.cs.software.moon.utils.ExcelAndXLSXUtil;

import edu.zut.cs.software.sun.order.domain.Customer;
import edu.zut.cs.software.sun.order.domain.Order;

public class Ordergenerator extends GenericGenerator {
	private OrderManager orderManager;
	public Ordergenerator() {}
	
	public Ordergenerator(OrderManager orderManager) {
		this.orderManager=orderManager;
	}

	public void init (String path)
    {
        try
        {
            List<List<String>> list = ExcelAndXLSXUtil.readXlsx(path);
            for(int i =0;i<list.size();i++)
            {
            	Order order = new Order();
            	Customer customer=new Customer();
                List<String> model = list.get(i);
                order.setCustomer(customer);
               
                orderManager.save(order);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
