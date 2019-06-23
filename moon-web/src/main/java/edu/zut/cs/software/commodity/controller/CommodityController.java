package edu.zut.cs.software.commodity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.zut.cs.software.moon.base.web.spring.controller.GenericController;
import edu.zut.cs.software.moon.commodity.service.CommodityManager;
import edu.zut.cs.software.sun.commodity.domain.Commodity;

@Controller
@RequestMapping("/commodity")
public class CommodityController extends GenericController<Commodity, Long, CommodityManager> {

	@Autowired
	private CommodityManager commodityManager;
	
	@Autowired
	public void setSiteManager(CommodityManager commodityManager) {
		this.commodityManager = commodityManager;
		this.manager=this.commodityManager;
	}
	
	
	@RequestMapping(path = "index")
    public String index(){
        //System.out.println("hello");
        return "main/index";
    }
	
	
	@RequestMapping("/findcommodity")
	public String findAllcommodity(Model model) {
		List<Commodity> commodityList=this.commodityManager.findAll();
		for(Commodity commodity:commodityList) {
			System.out.println(commodity);
		}
		//model.addAllAttributes(commodityList);
		model.addAttribute("commodityList", commodityList);
		return "commodity/findcommodity";
	}
	
	@RequestMapping("/delete")
	public String deleteCommodity(Long id) {
		this.commodityManager.delete(id);
		return "forward:findcommodity";
	}
	
	 
    @RequestMapping("/toadd")
    public String toadd(){
        return "commodity/addcommodity";
    }
    
    @RequestMapping("/addcommodity")
    public String Addorder(Commodity commodity){
        Commodity com=commodityManager.save(commodity);

        ModelAndView s=new ModelAndView();
        s.addObject(com);
        return "forward:findcommodity.do";
    }
    
    
}

