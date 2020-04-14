package com.sy.spring_1.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	public void memberJoin(Model model) { //이런식으로 선언하면 parameter의 스트링을 숫자로 바꾸는 작업을 안해도 된다.
		
		model.addAttribute("id","test");//member/memberJoin.jsp로 전달
	}
	
	@RequestMapping(value="memberJoin",  method= RequestMethod.POST )
	public void memberJoin2(MemberVO memberVO) {
		// HttpServletRequest
//		String id = request.getParameter("id");
//		System.out.println(id);
//		System.out.println("Member Join Post");
//		//파라미터 꺼내기
		
		//MemberVO의 멤버변수의 값으로 파라미터 값넣기
		//출력
		
		System.out.println(memberVO.getId());
		System.out.println(memberVO.getPw());
		System.out.println(memberVO.getName());
		System.out.println(memberVO.getAge());
		System.out.println(memberVO.getEmail());
		System.out.println(memberVO.getPhone());
		
	}
	
	
	@RequestMapping(value="memberLogin")
	public void memberLogin() {
		
	}
	@RequestMapping(value="memberLogin", method=RequestMethod.POST)
	public String memberLogin2(HttpSession session) {
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
