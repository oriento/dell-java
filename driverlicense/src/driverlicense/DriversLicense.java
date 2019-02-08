package driverlicense;
import java.time.*;
import java.util.*;

public class DriversLicense {

	public String firstName;
	public String lastName;
	public int dobYYY;
	public int dobMMM;
	public int dobDDD;
	public double heiht;
	public String gender;
	
	Date date = new Date();
	//returns first name
	public String getFirstName() {
		return firstName;
	}
	// Sets the first name
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	//returns the last name
	public String getLastName() {
		return lastName;
	}
	//Sets the last name
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	//returns the year
	public int getDobYYY() {
		return dobYYY;
	}
	// sets the year
	public void setDobYYY(int dobYYY) {
		this.dobYYY = dobYYY;
	}
	//returns the month
	public int getDobMMM() {
		return dobMMM;
	}
	//sets the month
	public void setDobMMM(int dobMMM) {
		this.dobMMM = dobMMM;
	}
	//returns the day
	public int getDobDDD() {
		return dobDDD;
	}
	//sets the day
	public void setDobDDD(int dobDDD) {
		this.dobDDD = dobDDD;
	}
	//returns the height 
	public double getHeiht() {
		return heiht;
	}
	//sets the height 
	public void setHeight(double heiht) {
		this.heiht = heiht;
	}
	//returns the gender 
	public String getGender() {
		return gender;
	}
	//sets the gender
	public void setGender(String gender) {
		this.gender = gender;
	}
	//concatinates the first and last name 
	public String getFullName() {
		return firstName+" "+lastName;
	}
	//calculate the age and returns the age 
	public int getAge() {
		LocalDate today = LocalDate.now(); // today's date
		  LocalDate birthday = LocalDate.of(this.dobYYY, this.dobMMM, this.dobDDD); // date of birth

		  Period period = Period.between(birthday, today);

		  int age = period.getYears(); // calculate the period between DOB and today in years
		  return age;

}
}
