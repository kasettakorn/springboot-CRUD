package com.example.dev.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.dev.spring.models.Member;
import com.example.dev.spring.repository.MemberRepository;
import com.example.dev.spring.services.Member_Services;


@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
public class Member_Controller {
	@Autowired
	JdbcTemplate jdbcTemplate;
//	private MemberRepository memberRepository;
	private Member_Services member_services;
	
	
	@GetMapping("/members/all")
	public List<Member> getAllMembers() {
		return member_services.getAll();
	
	}
	
//	@GetMapping("/members/{id}")
//	public ResponseEntity<Member> getMemberById(@PathVariable(value="id") String id) {
//		Member member = memberRepository.findById(id);
//		return ResponseEntity.ok().body(member);
//	}
	
//	@GetMapping("/members")
//	public Member createMember(@Validated @RequestBody Member member) {
//		return memberRepository.save(member);
//	}

//	@PutMapping("/members/{id}")
//	public ResponseEntity<Member> updateMember(@PathVariable(value="id") String id, @Validated @RequestBody Member member) {
//		
//	}

}

