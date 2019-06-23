package edu.zut.cs.software.Warehouse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.zut.cs.software.moon.Warehouse.service.ShelvesgoodManager;
import edu.zut.cs.software.moon.base.web.spring.controller.GenericController;
import edu.zut.cs.software.sun.Warehouse.domain.Shelvesgoods;



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
	
	@RequestMapping("/delete")
	public String deleteShelvesgoods(Long id) {
		this.shelvesgoodManager.delete(id);
		return "forward:findallwaregoods";
	}
	
	

	//save site
	@RequestMapping("/tosave")
	public String tosaveSite() {
		return "site/save";
	}
	
	@RequestMapping("/save")
	public String saveSite(Shelvesgoods shelvesgoods){
		this.shelvesgoodManager.save(shelvesgoods);
		return "forward:findallwaregoods";
		
	}
}
