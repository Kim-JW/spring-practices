package com.poscoict.helloweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 *
 * @RequestMapping: 클래스(타입) 단독 매핑
 * 
 * */

@Controller
@RequestMapping("/guestbook/*") // 모든 경로, 매핑, 추천하진 않음.
public class GuestBookController {
	
	@ResponseBody
	@RequestMapping
	public String list() {
		return "GuestBookController.list()";
	}
	
	@ResponseBody
	@RequestMapping
	public String delete() {
		return "GuestBookController.delete()";
	}
}
