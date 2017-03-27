package com.dk.object;

import java.io.Serializable;
import java.sql.Timestamp;

public class MapWatchData implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5116570679179004293L;
	
	private Integer id;
	private String imei;
	private String xloc;
	private String yloc;
	private Integer bat;
	private Integer rssi;
	private String sos;
	private Timestamp watchDate;
	private Timestamp createDate;
	private String isPosition;
	private String address;
	private String type;
	private String gpsInfo;
	private String btsInfo;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getImei() {
		return imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}
	public String getXloc() {
		return xloc;
	}
	public void setXloc(String xloc) {
		this.xloc = xloc;
	}
	public String getYloc() {
		return yloc;
	}
	public void setYloc(String yloc) {
		this.yloc = yloc;
	}
	public Integer getBat() {
		return bat;
	}
	public void setBat(Integer bat) {
		this.bat = bat;
	}
	public Integer getRssi() {
		return rssi;
	}
	public void setRssi(Integer rssi) {
		this.rssi = rssi;
	}
	public String getSos() {
		return sos;
	}
	public void setSos(String sos) {
		this.sos = sos;
	}
	public Timestamp getWatchDate() {
		return watchDate;
	}
	public void setWatchDate(Timestamp watchDate) {
		this.watchDate = watchDate;
	}
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
	public String getIsPosition() {
		return isPosition;
	}
	public void setIsPosition(String isPosition) {
		this.isPosition = isPosition;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getGpsInfo() {
		return gpsInfo;
	}
	public void setGpsInfo(String gpsInfo) {
		this.gpsInfo = gpsInfo;
	}
	public String getBtsInfo() {
		return btsInfo;
	}
	public void setBtsInfo(String btsInfo) {
		this.btsInfo = btsInfo;
	}
	

}
