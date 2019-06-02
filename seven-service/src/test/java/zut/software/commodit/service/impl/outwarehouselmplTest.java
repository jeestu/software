package zut.software.commodit.service.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import zut.software.commodit.service.impl.outwarehouselmpl;


class outwarehouselmplTest {

	@Test
	void test() {
		
		outwarehouselmpl lmpl=new outwarehouselmpl();
		lmpl.Before_outware();                                                                                                                                     
		lmpl.at_outware();
		lmpl.After_outware();
		
	
	}

}
