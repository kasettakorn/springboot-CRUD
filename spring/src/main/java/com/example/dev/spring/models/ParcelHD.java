package com.example.dev.spring.models;

public class ParcelHD {
	String PARCEL_ID;
	String AMPHUR_CODE;
	String UTM_RATIO;
	String OPERATE_NAME;
	
	public ParcelHD() {
		// TODO Auto-generated constructor stub
	}

	public ParcelHD(String pARCEL_ID, String aMPHUR_CODE, String uTM_RATIO, String oPERATE_NAME) {
		PARCEL_ID = pARCEL_ID;
		AMPHUR_CODE = aMPHUR_CODE;
		UTM_RATIO = uTM_RATIO;
		OPERATE_NAME = oPERATE_NAME;
	}

	public String getPARCEL_ID() {
		return PARCEL_ID;
	}

	public void setPARCEL_ID(String pARCEL_ID) {
		PARCEL_ID = pARCEL_ID;
	}

	public String getAMPHUR_CODE() {
		return AMPHUR_CODE;
	}

	public void setAMPHUR_CODE(String aMPHUR_CODE) {
		AMPHUR_CODE = aMPHUR_CODE;
	}

	public String getUTM_RATIO() {
		return UTM_RATIO;
	}

	public void setUTM_RATIO(String uTM_RATIO) {
		UTM_RATIO = uTM_RATIO;
	}

	public String getOPERATE_NAME() {
		return OPERATE_NAME;
	}

	public void setOPERATE_NAME(String oPERATE_NAME) {
		OPERATE_NAME = oPERATE_NAME;
	}
	
	
	
	
	
	
	
	
	
	
	

}
