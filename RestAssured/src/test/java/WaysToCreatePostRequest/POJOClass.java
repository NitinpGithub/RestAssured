package WaysToCreatePostRequest;

import org.json.JSONObject;

public class POJOClass {
	
	// Plane Old Java Object
	
	int ID;
	String Name;
	String Location;
	String Department;
	String Designation;
	int Fixed;
	int Variable;
	int Bonus;
	
	String []sal;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public int getFixed() {
		return Fixed;
	}
	public void setFixed(int fixed) {
		Fixed = fixed;
	}
	public int getVariable() {
		return Variable;
	}
	public void setVariable(int variable) {
		Variable = variable;
	}
	public int getBonus() {
		return Bonus;
	}
	public void setBonus(int bonus) {
		Bonus = bonus;
	}
	

}
