package com.sy.spring_1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/sub/**")

public class SubController {
	@RequestMapping(value="sub1")
	public void sub1() {
	
	} //��û�ϴ� return���� ���� ���ߵǴ� ��θ��� ���ٸ� ���� return�� �ʿ���� void�� ���� �ȴ�. 
	
	@RequestMapping(value="sub2")
	public String sub2() {
		return "sub/sub2";
	}
	
}
