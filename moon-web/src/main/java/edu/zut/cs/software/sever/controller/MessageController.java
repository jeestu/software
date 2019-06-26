package edu.zut.cs.software.sever.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.zut.cs.software.moon.base.web.spring.controller.GenericController;
import edu.zut.cs.software.moon.message.service.MessageManager;
import edu.zut.cs.software.sun.sever.domain.Message;

@Controller
@RequestMapping("sever")
public class MessageController extends GenericController <Message,Long,MessageManager> {

	@Autowired
	private MessageManager messageManager;
	@Autowired
	public void setMessageManager(MessageManager messageManager) {
		this.messageManager = messageManager;
		this.manager=this.messageManager;
	}
	@RequestMapping(path = "index")
    public String index(){
        return "main/index";
    }
	
	@RequestMapping(value = "/all", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
    public @ResponseBody List<Message> getAll(){
        List<Message> all = this.messageManager.findAll();
        return all;
    }
	
	@RequestMapping("/findorder")
	public String findAllOrder(Model model) {
		List<Message> messageList=this.messageManager.findAll();
		for(Message messager:messageList) {
			System.out.println(messager);
		}
		//model.addAllAttributes(orderList);
		model.addAttribute("orderList", messageList);
		return "sever/findorder";
	}
	@RequestMapping(path = "/delete/{id}",method = RequestMethod.DELETE,produces = "application/json;charset=utf-8")

	 public  @ResponseBody Message  deleteOne(@PathVariable(value = "id") Long id) {
		Message p = this.messageManager.findById(id);
        this.messageManager.deleteById(id);
        return p;
    }
	
	@RequestMapping(path = "save",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    public @ResponseBody Message saveOne( Message p){
        this.messageManager.save(p);
        return p;
    }
    
	
}
