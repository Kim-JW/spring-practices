package com.poscoict.container.videosystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:com/poscoict/container/config/videosystem/DVDPlayerConfig.xml"})
public class DVDPlayerXmlConfigTest {
	
	@Rule
	public final SystemOutRule systemOutRule= new SystemOutRule().enableLog();
	
	//@Autowired
	// 예외 발생
	// Explicit XML Bean 설정 (Avengers) 에서는 id를 자동 부여하지 않는다.
	// 따라서 @Qualifier 사용 불가능. 
	private DigitalVideoDisc dvd1;
	
	@Qualifier("ironMan")
	@Autowired
	private DigitalVideoDisc dvd2;
	
	@Qualifier("avengersInfinityWar")
	@Autowired
	private DigitalVideoDisc dvd3;
	
	@Qualifier("avengersEndGame")
	@Autowired
	private DigitalVideoDisc dvd4;
	
	@Qualifier("avengersAgeOfUltron")
	@Autowired
	private DigitalVideoDisc dvd5;
	
	@Qualifier("avengersCaptainAmerica")
	@Autowired
	private DigitalVideoDisc dvd6;
	
	@Qualifier("avengersDirectorEdition")
	@Autowired
	private DigitalVideoDisc dvd7;
	
	@Qualifier("avengersExpansionEdition1")
	@Autowired
	private DigitalVideoDisc dvd8;
	
	
	@Autowired
	private DVDPack dvdPack;
	
	@Ignore
	@Test
	public void testDvd() {
//		ApplicationContext ac = new ClassPathXmlApplicationContext(
//				"com/poscoict/container/config/soundsystem/CDPlayer.xml");
		
//		CDPlayer cdPlayer = ac.getBean(CDPlayer.class);
	
		assertNotNull(dvd1);
	}
	
	@Test
	public void testDvd2() {
		assertNotNull(dvd2);
	}
	
	
	@Test
	public void testDvd3() {
		assertNotNull(dvd3);
	}
	
	@Test
	public void testDvd4() {
		assertNotNull(dvd4);
	}
	
	@Test
	public void testDvd5() {
		assertNotNull(dvd5);
	}
	
	@Test
	public void testDvd6() {
		assertNotNull(dvd6);
	}
	
	@Test
	public void testDvd7() {
		assertNotNull(dvd7);
	}
	
	@Test
	public void testDvd8() {
		assertNotNull(dvd8);
	}
	
	
	@Test
	public void testDvdPack() {
		assertNotNull(dvdPack);
	}
	
//	@Test
//	public void testPlay() {
//		dvd.play();
//		
//		assertEquals("Playing 붕붕 by 김하온", systemOutRule.getLog().replace("\r\n", "").replace("\n",""));
//		//assertEquals(s, "Playing 붕붕 by 김하온");
//	}
	
	
}
