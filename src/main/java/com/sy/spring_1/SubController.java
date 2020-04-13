package com.sy.spring_1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/sub/**")

public class SubController {
	@RequestMapping(value="sub1")
	public void sub1() {
	
	} //요청하는 return값과 내가 가야되는 경로명이 같다면 굳이 return할 필요없이 void를 쓰면 된다. 
	
	@RequestMapping(value="sub2")
	public String sub2() {
		return "sub/sub2";
	}
	
}
