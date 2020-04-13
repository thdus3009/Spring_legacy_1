package com.sy.spring_1.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/member/**")
public class MemberController {
	
	
	@RequestMapping(value="memberMyPage")
	public void memberMyPage() {
		
	}
	
	@RequestMapping(value= "memberDelete")
	public void memberDelete() {
		System.out.println("Member Delete");
	}
	
	@RequestMapping(value="memberJoin")
	public void memberJoin() {
		
	}
	@RequestMapping(value="memberJoin",  method= RequestMethod.POST )
	public void memberJoin2() {
		System.out.println("Member Join Post");
		
		
	}
	
	
	@RequestMapping(value="memberLogin")
	public void memberLogin() {
		
	}
	@RequestMapping(value="memberLogin", method=RequestMethod.POST)
	public String memberLogin2() {
		System.out.println("Member Login Post");
		
		return "redirect:../";
	}
	

	
	@RequestMapping(value="memberUpdate")
	public void memberUpdate() {
		
	}
	@RequestMapping(value="memberUpdate",  method=RequestMethod.POST)
	public void memberUpdate2() {
		System.out.println("Member Update Post");
	}
	

}
