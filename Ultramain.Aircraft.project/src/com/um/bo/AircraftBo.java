package com.um.bo;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import com.um.dao.InterfaceDao;
import com.um.dao.OracleDao;
import com.um.dto.AircraftDto;
import com.um.factory.AbstractFactory;
import com.um.utility.AircraftScan;

/*
 * In aircraft BO class, we get the input from User. That is Aircraft code.
 * and we are passing the value to method showAircrafteDetails to get hashmap where the details
 * of the given aircraft code will be present.
 * 
 */

public class AircraftBo {
	InterfaceDao airDao = new OracleDao();

	public void viewAircraft() {
		System.out.println("available aircraft codes are : A310, A380, B777");
		System.out.println("Which Aircraft details you want to display? :  ");
		Scanner scan = AircraftScan.getScannerInstance();
		String aircraftCode = scan.next();
		AbstractFactory factory = AbstractFactory.getFactory(1);
		InterfaceDao dao = factory.getDao();

		try {
			HashMap<String, AircraftDto> airmap = airDao.showAircrafteDetails(aircraftCode);
			printDetails(airmap);
		} catch (SQLException e) {
			e.getMessage();
		}
	}

	private void printDetails(HashMap<String, AircraftDto> airmap) {

		Set<String> sector = airmap.keySet();
		for (String sectorId : sector) {
			AircraftDto dto = airmap.get(sectorId);
			System.out.println("SectorID : " + dto.getSectorID());
			System.out.println("Aircraft Code : " + dto.getAircraftCode());
			System.out.println("From Station : " + dto.getFromStation());
			System.out.println("To Station : " + dto.getToStation());
			System.out.println("**************************************************");
		}

	}

}
