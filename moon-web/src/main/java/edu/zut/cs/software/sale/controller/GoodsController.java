package edu.zut.cs.software.sale.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import edu.zut.cs.software.moon.base.web.spring.controller.GenericController;
import edu.zut.cs.software.moon.sale.service.GoodsManager;
import edu.zut.cs.software.sun.Warehouse.domain.Shelvesgoods;
import edu.zut.cs.software.sun.order.domain.Order;
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
	
	@RequestMapping(value = "/all", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
    public @ResponseBody List<Goods> getAll(){
        List<Goods> all = this.goodsManager.findAll();
        return all;
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
    
    @RequestMapping(path = "/delete/{id}",method = RequestMethod.DELETE,produces = "application/json;charset=utf-8")
    public  @ResponseBody Goods  deleteOne(@PathVariable(value = "id") Long id) {
    	Goods p = this.goodsManager.findById(id);
        this.goodsManager.deleteById(id);
        return p;
    }
    
    @RequestMapping(path = "save",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    public @ResponseBody Goods saveOne( Goods p){
        this.goodsManager.save(p);
        return p;
    }
}
