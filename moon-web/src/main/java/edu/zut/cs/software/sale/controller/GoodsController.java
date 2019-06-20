package edu.zut.cs.software.sale.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
        return "index";
    }



    @RequestMapping(path = "/info/{id}",method = RequestMethod.GET,produces = "application/json;charset=utf-8")
    public @ResponseBody Goods getOne(@PathVariable(value = "id") Long id) {
        Goods expenditure = this.goodsManager.findById(id);
        return expenditure;

    }


    @RequestMapping(path = "info", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
   public @ResponseBody
    List<Goods> getAll(){
        List<Goods> all = this.goodsManager.findAll();
        return all;
    }

	/*
	 * @RequestMapping(path = "info/message", method = RequestMethod.GET, produces =
	 * "application/json;charset=utf-8") public @ResponseBody List<Goods>
	 * getAllByMessage(@RequestParam(value = "message") String message){
	 * List<Expenditure> all; List<Expenditure> goodNameAll; all =
	 * this.expenditureManger.getByDealPerson(message); goodNameAll =
	 * this.expenditureManger.findByGoods(message); all.addAll(goodNameAll); return
	 * all; }
	 */
}
