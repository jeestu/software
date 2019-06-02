package zut.software.show.service.impl;

import org.junit.jupiter.api.Test;

import zut.software.show.service.impl.showImpl;

public class showImplTest {
	
	@Test
	public void test() {
		showImpl showimpl = new showImpl();
		showimpl.showPage();
		showimpl.showAdvertising();
	}

}
