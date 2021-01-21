package com.example.dev.spring.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.dev.spring.models.Member;
import com.example.dev.spring.repository.MemberRepository;

@Service
public class Member_Services {
	private static List<Member> members = new ArrayList<>();
	@Autowired
	JdbcTemplate jdbcTemplate;
	private MemberRepository memberRepository;
	
	public List<Member> getAll() {
		return memberRepository.findAll();
	}
	
	public Member save(Member member) {
		deleteByParcelId(member.getID());
		members.add(member);
		
		return member;
		
	}
	
	public Member deleteByParcelId(String id) {
//		Member member = findByParcelId(id);
//		
//		if (parcel == null) {
//			return null;
//		}
//		if (parcel_hd_list.remove(parcel)) {
//			return parcel;
//		}
		return null;
	}
	
	public Member findByParcelId(String id) {
		String sql = "SELECT * FROM MEMBER WHERE ID=" + id;
		List<Member> member = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Member.class));
		return member.get(0);
	}
	
	
	
	
	
}

