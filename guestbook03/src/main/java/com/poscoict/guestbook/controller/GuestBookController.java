package com.poscoict.guestbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.poscoict.guestbook.repository.GuestBookRepository;
import com.poscoict.guestbook.vo.GuestBookVo;

@Controller
public class GuestBookController {
	
	@Autowired
	private GuestBookRepository guestbookRepository;
	
	@RequestMapping("")
	public String index(Model model) {
		
		List<GuestBookVo> list = guestbookRepository.findAll();
		model.addAttribute("list", list);
		
		return "/WEB-INF/views/index.jsp";
	}
	
	@RequestMapping("/add")
	public String add(GuestBookVo vo) {
		guestbookRepository.insert(vo);
		
		return "redirect:/";
	}
	
	@RequestMapping("/deleteform/{no}")
	public String deleteform(@PathVariable("no") Long no, Model model) {
		model.addAttribute("no", no);
		return "/WEB-INF/views/deleteform.jsp";
	}
	
	@RequestMapping("/delete")
	public String delete(GuestBookVo vo) {
		guestbookRepository.delete(vo);
		
		return "redirect:/";
	}
}
