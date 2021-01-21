package com.example.dev.spring.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.dev.spring.models.ParcelHD;
import com.example.dev.spring.services.ParcelHD_Services;


@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
public class ParcelHD_Controller {
	@Autowired
	JdbcTemplate jdbcTemplate;
	private ParcelHD_Services parcelHD_Services;
	
	
	@GetMapping("/parcelhd/all")
	public List<ParcelHD> getAllParcelHD() {
		String sql = "SELECT * FROM PARCEL_HD";

		jdbcTemplate.setMaxRows(25);
		List<ParcelHD> list = jdbcTemplate.query(sql, 
				BeanPropertyRowMapper.newInstance(ParcelHD.class));
		return list;
	
	}
	
	@GetMapping("/parcelhd/{parcelid}")
	public ParcelHD getParcelHD(@PathVariable String parcelid) {
//		return parcelHD_Services.findByParcelId(parcelid);
		String sql = "SELECT * FROM PARCEL_HD WHERE PARCEL_ID=" + parcelid;
		List<ParcelHD> data = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(ParcelHD.class));
		return data.get(0);
	}
	
//	@DeleteMapping("/parcelhd/{parcelid}")
//	public ResponseEntity<Void> deleteParcelHD(@PathVariable String parcelid) {
//		ParcelHD parcelHD = parcelHD_Services.deleteByParcelId(parcelid);
//		
//		if(parcelHD != null) {
//			return ResponseEntity.noContent().build();
//		}
//		return ResponseEntity.notFound().build();
//	}
//	
//	@PutMapping("/parcelhd/{parcelid}")
//	public ResponseEntity<ParcelHD> updateParcelHD(@PathVariable String parcelid, @RequestBody ParcelHD parcelHD) {
//		parcelHD_Services.save(parcelHD);
//		
//		return new ResponseEntity<ParcelHD>(parcelHD, HttpStatus.OK);
//	}
//	
//	@PostMapping("/parcelhd")
//	public ResponseEntity<Void> createParcelHD(@RequestBody ParcelHD parcel_hd) {
//		ParcelHD createParcelHD = parcelHD_Services.save(parcel_hd);
//		
//		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{parcelid}").buildAndExpand(createParcelHD.getPARCEL_ID()).toUri();
//		
//		return ResponseEntity.created(uri).build();
//	}

}
