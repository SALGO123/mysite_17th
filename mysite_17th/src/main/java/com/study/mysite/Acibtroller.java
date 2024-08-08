package com.study.mysite;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Acibtroller {
	@GetMapping("/a")
	@ResponseBody
	public String helloSpring(){
		return "ㅎ갸"
				+ ""
				+ " 나는ㅇ 왜?";
	}
	

}
