package com.majustory.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExamController {
	
	@Autowired
	private ExamServiceImpl service;
	
	public ExamController() {
		System.out.println("ExamController 생성자 확인!!");
	}
	
	@RequestMapping("/select")
	public String select(Model model) {
		model.addAttribute("li", service.select());
		return "list.html";
	}
	
	@RequestMapping("/form")
	public void form() {
		// templates에 있는 메소드이름.html로 매핑된다.
		System.out.println("==> form.do 확인");
	}
	
	@RequestMapping("/insert")
	public String insert(ExamVo vo) {
		System.out.println("==> insert.do 확인");
		service.insert(vo);
		return "redirect:/select";
	}
	
	@RequestMapping("/content")
	public String content(Model model, ExamVo vo) {
		model.addAttribute("m", service.content(vo));
		return "content.html";
	}
}
