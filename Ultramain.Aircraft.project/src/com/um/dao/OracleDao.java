package com.um.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.um.data.DataConnection;
import com.um.dto.AircraftDto;
import com.um.utility.AircraftScan;

/*
 * In OracleDao we have a method implementation of showAircrafteDetails method. In gets value of aircraftcode
 * Interacts will SQL.
 * Brings the table values.
 * It sets the received values to the DTO variables through parameterized constructor.
 * Then it puts values into a map and returns it.
 * 
 */
public class OracleDao implements InterfaceDao {
	HashMap<String, AircraftDto> airmap=new HashMap<String,AircraftDto>();

	@Override
	
	public HashMap<String, AircraftDto> showAircrafteDetails(String AircraftCode) throws SQLException {
		Connection con = DataConnection.getDbConnection();
		String query = "select sectorid,code,from_station,to_station from sector where code= ? ";
		PreparedStatement pst = con.prepareStatement(query);
		pst.setString(1, AircraftCode);
		ResultSet AircraftResultset = pst.executeQuery();
		while (AircraftResultset.next()) {
			String sectorId=AircraftResultset.getString("SECTORID");
			String code=AircraftResultset.getString("CODE");
			String fromStation=AircraftResultset.getString("FROM_STATION");
			String toStation=AircraftResultset.getString("TO_STATION");
			AircraftDto dto=new AircraftDto(sectorId,code,fromStation,toStation);
			airmap.put(sectorId, dto);		
		}
		return airmap;
		
	}

}
