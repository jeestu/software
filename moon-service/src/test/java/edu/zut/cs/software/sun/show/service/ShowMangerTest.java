package edu.zut.cs.software.sun.show.service;

import static junit.framework.TestCase.assertNotNull;

import java.util.List;

import javax.sound.midi.VoiceStatus;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.software.moon.base.service.GenericManagerTestCase;
import edu.zut.cs.software.sun.show.domain.Advertising;
import edu.zut.cs.software.sun.show.service.ShowManger;


public class ShowMangerTest extends GenericManagerTestCase<Long, Advertising, ShowManger>{
	
	private static final Logger logger = LogManager.getLogger(ShowMangerTest.class.getName());
	
	 public ShowMangerTest() {
	        super(Advertising.class);
	    }
	 
	@Autowired
	ShowManger showManger;
	@Test
	public void findAll() {
		java.util.List<Advertising> list =showManger.findAll();
		assertNotNull(list);
        if(logger.isInfoEnabled()){
            logger.info(list);

        }
	}
	
	public void findByPage() {
		List<Advertising>list=showManger.findByPage("ʳƷ");
		assertNotNull(list);
        if(logger.isInfoEnabled()){
            logger.info(list);

        }
	}

}
