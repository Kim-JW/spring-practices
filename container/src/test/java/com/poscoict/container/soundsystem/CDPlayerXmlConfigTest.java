package com.poscoict.container.soundsystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:com/poscoict/container/config/soundsystem/CDPlayerConfig.xml"})
public class CDPlayerXmlConfigTest {
	
	@Autowired
	private CDPlayer cdPlayer;
	
	@Test
	public void testCDPlayerNotNull() {
//		ApplicationContext ac = new ClassPathXmlApplicationContext(
//				"com/poscoict/container/config/soundsystem/CDPlayer.xml");
		
//		CDPlayer cdPlayer = ac.getBean(CDPlayer.class);
	
		assertNotNull(cdPlayer);
		
	}
	
	@Test
	public void testPlay() {
		cdPlayer.play();
		
		
		//assertEquals(s, "Playing 붕붕 by 김하온");
	}
	
	
}
