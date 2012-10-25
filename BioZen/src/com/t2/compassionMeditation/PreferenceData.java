/*****************************************************************
BioZen

Copyright (C) 2011 The National Center for Telehealth and 
Technology

Eclipse Public License 1.0 (EPL-1.0)

This library is free software; you can redistribute it and/or
modify it under the terms of the Eclipse Public License as
published by the Free Software Foundation, version 1.0 of the 
License.

The Eclipse Public License is a reciprocal license, under 
Section 3. REQUIREMENTS iv) states that source code for the 
Program is available from such Contributor, and informs licensees 
how to obtain it in a reasonable manner on or through a medium 
customarily used for software exchange.

Post your updates and modifications to our GitHub or email to 
t2@tee2.org.

This library is distributed WITHOUT ANY WARRANTY; without 
the implied warranty of MERCHANTABILITY or FITNESS FOR A 
PARTICULAR PURPOSE.  See the Eclipse Public License 1.0 (EPL-1.0)
for more details.
 
You should have received a copy of the Eclipse Public License
along with this library; if not, 
visit http://www.opensource.org/licenses/EPL-1.0

*****************************************************************/
package com.t2.compassionMeditation;

import java.util.ArrayList;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import com.t2.compassionDB.BioUser;

@DatabaseTable
public class PreferenceData {

	public static final String USER_ID_FIELD_NAME = "preference";	
	
	
	// id is generated by the database and set on the object automagically
	@DatabaseField(generatedId = true)
	int id;	
	
	

	@DatabaseField(dataType=DataType.SERIALIZABLE)
	public ArrayList<Boolean> mBioHarnessParameters = new ArrayList<Boolean>();
	
	public PreferenceData() {
		// needed by ormlite
	}
	
	public PreferenceData(BioUser bioUser, long time) {
	}
	
}