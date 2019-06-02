package zut.software.sale.service.impl;

import org.junit.jupiter.api.Test;

class saleImplTest {

	@Test
	void test() {
		saleImpl impl=new saleImpl();
		impl.check_AfterGoods();
		impl.check_BeforeGoods();
		impl.sale_Goods();
	}

}
