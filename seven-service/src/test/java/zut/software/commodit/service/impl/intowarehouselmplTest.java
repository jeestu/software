package zut.software.commodit.service.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import zut.software.commodit.service.impl.intowarehouselmpl;
import zut.software.commodit.service.impl.outwarehouselmpl;

class intowarehouselmplTest {

	@Test
	void test() {
		intowarehouselmpl lmpl=new intowarehouselmpl();
		lmpl.Before_intoware();
		lmpl.at_intoware();
		lmpl.After_intoware();
	}

}
