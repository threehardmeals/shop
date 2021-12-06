package kr.co.shop.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import kr.co.shop.member.service.MemberService;

public class MemberController {
    
	@Autowired
	@Qualifier("ms")
	private MemberService mservice;
}
