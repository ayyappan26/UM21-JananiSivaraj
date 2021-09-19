package com.um.dto;

public class AircraftDto {
	private String sectorID;
	private String aircraftCode;
	private String fromStation;
	private String toStation;

	
	public AircraftDto(String sectorId2, String code, String fromStation2, String toStation2) {
		sectorID = sectorId2;
		aircraftCode = code;
		fromStation = fromStation2;
		toStation = toStation2;
	}

	public String getSectorID() {
		return sectorID;
	}

	public void setSectorID(String sectorID) {
		this.sectorID = sectorID;
	}

	public String getAircraftCode() {
		return aircraftCode;
	}

	public void setAircraftCode(String aircraftCode) {
		this.aircraftCode = aircraftCode;
	}

	public String getFromStation() {
		return fromStation;
	}

	public void setFromStation(String fromStation) {
		this.fromStation = fromStation;
	}

	public String getToStation() {
		return toStation;
	}

	public void setToStation(String toStation) {
		this.toStation = toStation;
	}

}
