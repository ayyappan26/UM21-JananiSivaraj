package com.um.dao;

import java.sql.SQLException;
import java.util.HashMap;

import com.um.dto.AircraftDto;
/*
 * Implementation will be in OracleDao class
 * 
 */
public interface InterfaceDao {
	public HashMap<String, AircraftDto> showAircrafteDetails(String AircraftCode) throws SQLException;;

}
