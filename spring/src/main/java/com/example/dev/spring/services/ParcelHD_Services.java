package com.example.dev.spring.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import com.example.dev.spring.models.ParcelHD;

@Service
public class ParcelHD_Services {
	private static List<ParcelHD> parcel_hd_list = new ArrayList<>();
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<ParcelHD> getAll() {
		String sql = "SELECT * FROM PARCEL_HD";

		jdbcTemplate.setMaxRows(25);
		List<ParcelHD> list = jdbcTemplate.query(sql, 
				BeanPropertyRowMapper.newInstance(ParcelHD.class));
		return list;
	}
	
	public ParcelHD save(ParcelHD parcel) {
		deleteByParcelId(parcel.getPARCEL_ID());
		parcel_hd_list.add(parcel);
		
		return parcel;
		
	}
	
	public ParcelHD deleteByParcelId(String id) {
		ParcelHD parcel = findByParcelId(id);
		
		if (parcel == null) {
			return null;
		}
		if (parcel_hd_list.remove(parcel)) {
			return parcel;
		}
		return null;
	}
	
	public ParcelHD findByParcelId(String id) {
		String sql = "SELECT * FROM PARCEL_HD WHERE PARCEL_ID=" + id;
		List<ParcelHD> data = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(ParcelHD.class));
		return data.get(0);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
