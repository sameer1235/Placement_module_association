package com.cg.placement.client;

import java.util.ArrayList;
import java.util.List;
import com.cg.placement.entities.College;
import com.cg.placement.entities.Placement;
import com.cg.placement.services.PlacemnetServiceImpl;
import com.cg.placement.services.CollegeServiceImpl;
import com.cg.placement.services.ICollegeService;
import com.cg.placement.services.IPlacementService;

public class ClientPlacemnet {

	public static void main(String[] args) {
		
		//CRUD OPERATION CALLING ACTIVITY for college and Placement.

		Placement placement = new Placement();
		IPlacementService Pservice = new PlacemnetServiceImpl();
		
		Placement placement1 = new Placement();
		IPlacementService Pservice1 = new PlacemnetServiceImpl();
	
		
		College college=new College();
		ICollegeService Cservice= new CollegeServiceImpl();
		
		College college1=new College();
		ICollegeService Cservice1 = new CollegeServiceImpl();
		
		// Creating College record

		college.setCollegeAdmin("SAM");
		college.setId(109);
		college.setCollegeName("KBN College");
		college.setLocation("Gulbarga");
		Cservice.addCollege(college);
		
		// Creating Placement record
		
		placement.setP_id(100);		// 1st record of placement
		placement.setS_name("Asif");
		placement.setCollege(college);
		placement.setDate("12/03/2023"); 
		placement.setQualification("B.E");
		placement.setYear(2021);
		
		Pservice.addPlacement(placement);
		
		placement1.setP_id(400);    // 2nd record of placement
		placement1.setS_name("Ahmed");
		placement1.setCollege(college);
		placement1.setDate("12/03/2023");
		placement1.setQualification("B.E");
		placement1.setYear(2021);
		
		Pservice1.addPlacement(placement1);
		List<Placement> list=new ArrayList<Placement>();
		list.add(placement1);
		list.add(placement);
		college.setPlacement(list);
		System.out.println("Row added");

		// Retrieve Placement record
	/*	System.out.println("Placement Details are : ");
		placement	= Pservice.searchPlacementById(2);
		college = Cservice.searchCollegeById(107);
		System.out.println("ID is:"+placement.getP_id());
		System.out.println("Student Name is:"+placement.getS_name());
		System.out.println("College name is:"+college.getCollegeName());
		System.out.println("Qualification is:"+placement.getQualification());
		System.out.println("Date is:"+placement.getDate());
		System.out.println("Year is:"+placement.getYear());
			
		// Retrieve college record
		System.out.println("====================================");
		System.out.println("College Details are : ");
		college = Cservice.searchCollegeById(107);
		System.out.println(college.getId());
		System.out.println("College Admin is : "+college.getCollegeAdmin());
		System.out.println("College name is : "+college.getCollegeName());
		*/

		// Update Placement record
	/*	placement	= Pservice.searchPlacementById(4);
		placement.setDate("24 April 2021");
		Pservice.updatePlacement(placement);

		// Update college record

		college = Cservice.searchCollegeById(107);
		college.setLocation("Maheboob Nagar Gulbarga");
		college = Cservice.updateCollege(college);
		
		System.out.println("Update is successful");
*/
		// Delete Placement record	
/*		placement	= Pservice.searchPlacementById(4);
		Pservice.cancelPlacement(placement);
	*/	
		// Delete college record				
		//college = Cservice.searchCollegeById(107);
		//Cservice.deleteCollege(103);
	
		
		System.out.println("Canceled and Deletion is successful");

	}
}
