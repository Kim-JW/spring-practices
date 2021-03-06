package com.poscoict.container.config.videosystem.mixing;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.poscoict.container.videosystem.Avengers;
import com.poscoict.container.videosystem.BlankDisc;
import com.poscoict.container.videosystem.DVDPlayer;
import com.poscoict.container.videosystem.DigitalVideoDisc;

@Configuration
public class DvdConfig {

	@Bean
	public DigitalVideoDisc avengers() {
		return new Avengers();
	}

	// 주입(Injection) 하기 1
	// Bean 생성 메소드를 직접 호출하는 방법
	// 생성자 주입

	@Bean(name = "avengersInfinityWar")
	public DigitalVideoDisc blankDisc() {
		BlankDisc dvd = new BlankDisc();
		dvd.setTitle("Avengers Infinity War");
		dvd.setStudio("MARVEL");
		
		return dvd;
	}

}
