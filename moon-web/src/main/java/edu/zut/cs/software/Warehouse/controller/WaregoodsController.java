package edu.zut.cs.software.Warehouse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.annotation.JsonInclude;

import edu.zut.cs.software.moon.Warehouse.service.ShelvesgoodManager;
import edu.zut.cs.software.moon.base.web.spring.controller.GenericController;
import edu.zut.cs.software.sun.Warehouse.domain.Shelvesgoods;
import edu.zut.cs.software.sun.order.domain.Order;



@Controller
@RequestMapping("/warehouse")
public class WaregoodsController extends GenericController<Shelvesgoods, Long, ShelvesgoodManager>{
	
	ShelvesgoodManager shelvesgoodManager;
	@Autowired
	public void setSiteManager(ShelvesgoodManager shelvesgoodManager) {
		this.shelvesgoodManager = shelvesgoodManager;
		this.manager=this.shelvesgoodManager;
	}
	/**
	 *  test
	 * @return
	 */
	@RequestMapping("/index")
	public String mainIndex(){
		return "main/index";
	}
	/**
	 * 
	 */
	//find addsite
	@JsonInclude(JsonInclude.Include.NON_NULL) 
	@RequestMapping(value = "/all", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
    public @ResponseBody List<Shelvesgoods> getAll(){
        List<Shelvesgoods> all = this.shelvesgoodManager.findAll();
        return all;
    }

	@RequestMapping("/findallwaregoods")    //  /allwaregoods
	public String findAllSite(Model model) {
		List<Shelvesgoods> waregoodsList= this.shelvesgoodManager.findAll();
		for(Shelvesgoods site:waregoodsList) {
			System.out.println(site);
		}
		model.addAttribute("waregoodsList", waregoodsList);
		return "waregoods/findallwaregoods";
	}
	//
	@RequestMapping("/josn")    
	public @ResponseBody List<Shelvesgoods> josn(Model model) {
		List<Shelvesgoods> siteList= this.shelvesgoodManager.findAll();
		return siteList;
	}
	
	
	//delete site 
	
	/**@RequestMapping("/delete")
	public String deleteShelvesgoods(Long id) {
		this.shelvesgoodManager.delete(id);
		return "forward:findallwaregoods";
	}**/
	//摘抄
	@RequestMapping(path = "/delete/{id}",method = RequestMethod.DELETE,produces = "application/json;charset=utf-8")
    public  @ResponseBody Shelvesgoods  deleteOne(@PathVariable(value = "id") Long id) {
		Shelvesgoods p = this.shelvesgoodManager.findById(id);
        this.shelvesgoodManager.deleteById(id);
        return p;
    }


	
	@RequestMapping("/toadd")
    public String toadd(){
        return "waregoods/addwaregoods";
    }
    
   
	
	@RequestMapping("/addwaregoods")
    public String Addorder(Shelvesgoods shelvesgoods){
		Shelvesgoods ord=shelvesgoodManager.save(shelvesgoods);

        ModelAndView s=new ModelAndView();
        s.addObject(ord);
        return "forward:findallwaregoods.do";
    }
    
}
