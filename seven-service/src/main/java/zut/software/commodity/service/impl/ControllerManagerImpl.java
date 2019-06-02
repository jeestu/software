package zut.software.commodity.service.impl;

import zut.software.commodity.Domain.Controller;
import zut.software.commodity.dao.controllerDao;
import zut.spftware.commodity.service.ControllerManager;

public class ControllerManagerImpl implements ControllerManager {

	controllerDao controllerdao;

	public controllerDao getControllerdao() {
		return controllerdao;
	}
	
	public void setControllerdao(controllerDao controllerdao) {
		this.controllerdao = controllerdao;
	}
	@Override
	public void setController(Controller cu) {
		ControllerManagerImpl controllerManagerImpl=new ControllerManagerImpl();
		Controller c=new Controller();
		c.setControllerName(cu.getControllerName());
		c.setAge(cu.getAge());
		c.setTel(cu.getTel());
		controllerdao.save(c);
		controllerManagerImpl.getControllerdao().save(c);
		CommodityManagerImpl commodityManagerImpl=new CommodityManagerImpl();
		/*CommodityManagerImpl.setcommodity("ones", c);*/
	}
}
