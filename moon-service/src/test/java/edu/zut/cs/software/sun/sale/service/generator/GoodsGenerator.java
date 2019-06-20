package edu.zut.cs.software.sun.sale.service.generator;

import java.util.List;

import edu.zut.cs.software.moon.base.service.GenericGenerator;
import edu.zut.cs.software.moon.sale.service.CouponManager;
import edu.zut.cs.software.moon.sale.service.GoodsManager;

public class GoodsGenerator extends GenericGenerator {
	private GoodsManager goodsManager;
	private CouponManager couponManager;
	public GoodsGenerator(){
		
	}
	public GoodsGenerator(GoodsManager goodsManager, CouponManager couponManager) {
		super();
		this.goodsManager = goodsManager;
		this.couponManager = couponManager;
	}
	public void init(String path) {
	/*	 List<List<String>> list =ExcelAndXLSXUtil.readXlsx(path);

         for(int i =0;i<list.size();i++){
             Goods expenditure = new Goods();
             List<String> model = list.get(i);
             expenditure.setPerson(personManager.findById(Long.parseLong(model.get(0))));
             expenditure.setCreatTime(Long.parseLong(model.get(1)));
             expenditure.setDealByPersonName(model.get(2));
             expenditure.setGoodName(model.get(3));
             expenditure.setDealMoney(Double.parseDouble(model.get(4)));
             goodsManager.save(expenditure);*/
	}
}
