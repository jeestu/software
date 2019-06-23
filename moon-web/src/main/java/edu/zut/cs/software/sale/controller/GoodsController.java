package edu.zut.cs.software.sale.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.zut.cs.software.moon.base.web.spring.controller.GenericController;
import edu.zut.cs.software.moon.sale.service.GoodsManager;
import edu.zut.cs.software.sun.sale.domain.Goods;

@Controller
@RequestMapping(path="goods")
public class GoodsController extends GenericController<Goods, Long, GoodsManager> {
	
	@Autowired
    private GoodsManager goodsManager;
	
	@RequestMapping(path = "index")
    public String index(){
        System.out.println("hello");
        return "main/index";
    }
    @RequestMapping("/findgoods")
	public String findAllGoods(Model model) {
		List<Goods> goodList=this.goodsManager.findAll();
		for(Goods goods:goodList) {
			System.out.println(goods);
		}
		model.addAttribute("goodList", goodList);
		return "sale/findgoods";
	}
    
    @RequestMapping("/delete")
	public String deleteGoods(Long id) {
		this.goodsManager.delete(id);
		return "forward:findgoods";
	}
    
    @RequestMapping("/toadd")
    public String toadd(){
        return "sale/addgoods";
    }
    
    @RequestMapping("/addgoods")
    public String Addorder(Goods goods){
        Goods good=goodsManager.save(goods);

        ModelAndView s=new ModelAndView();
        s.addObject(good);
        return "forward:findgoods.do";
    }
}
