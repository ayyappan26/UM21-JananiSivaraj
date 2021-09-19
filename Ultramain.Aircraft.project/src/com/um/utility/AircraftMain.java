package com.um.utility;

import com.um.bo.AircraftBo;

public class AircraftMain {

/*
 * objective of this project is to bring SectorID,Aircraftcode,fromstation,tostation values
 * from sector table. 
 * 
 * details will be showed according to the sector ID given by the user.
 * 
 * From main class viewAicraft is called which is in AircraftBo class.
 * 
 */
	public static void main(String[] args) {
		AircraftBo bo = new AircraftBo();

		bo.viewAircraft();
	}

}
