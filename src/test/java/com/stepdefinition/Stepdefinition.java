package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.runner.RunnerClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Stepdefinition {
	
	public static WebDriver driver=RunnerClass.driver;
	
	
	@Given("^user Launch The Url In Adactin Application$")
	public void user_Launch_The_Url_In_Adactin_Application() throws Throwable {
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
	}

	@When("^user Enter The Username In User Field$")
	public void user_Enter_The_Username_In_User_Field() throws Throwable {
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("guru0750");
	}

	@When("^user Enter The Password In Paaword Field$")
	public void user_Enter_The_Password_In_Paaword_Field() throws Throwable {
		WebElement pass =driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("guru@0750");
	}

	@Then("^user Click The Login Button And It Navigates To Search Hotel Page$")
	public void user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page() throws Throwable {
		WebElement login = driver.findElement(By.xpath("//input[@value='Login']"));
		login.click();
	}

	@When("^User Select The Location$")
	public void user_Select_The_Location() throws Throwable {
		WebElement loc = driver.findElement(By.xpath("//select[@id='location']"));
		loc.click();
		Select b= new Select(loc);
		b.selectByIndex(2);
	}

	@When("^user Select The Hotels$")
	public void user_Select_The_Hotels() throws Throwable {
		WebElement hotel = driver.findElement(By.xpath("//select[@id='hotels']"));
		hotel.click();
		Select c= new Select(hotel);
		c.selectByIndex(2);
	}

	@When("^user Select The Room Type$")
	public void user_Select_The_Room_Type() throws Throwable {
		WebElement room = driver.findElement(By.xpath("//select[@id='room_type']"));
		room.click();
		Select d=new Select(room);
		d.selectByIndex(1);
	}

	@When("^user Select The Number Of Rooms$")
	public void user_Select_The_Number_Of_Rooms() throws Throwable {
		WebElement roomno = driver.findElement(By.xpath("//select[@id='room_nos']"));
		roomno.click();
		Select e=new Select(roomno);
		e.selectByIndex(3);
	}

	@When("^user Enter The Check In Date$")
	public void user_Enter_The_Check_In_Date() throws Throwable {
		WebElement datein = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		datein.click();
		datein.clear();
		datein.sendKeys("10/10/2023");
	}

	@When("^user Enter The Check Out Date$")
	public void user_Enter_The_Check_Out_Date() throws Throwable {
		WebElement dateout = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		dateout.click();
		dateout.clear();
		dateout.sendKeys("10/10/2023");
	}

	@When("^user Select The Adults Per Room$")
	public void user_Select_The_Adults_Per_Room() throws Throwable {
		WebElement childno = driver.findElement(By.xpath("//select[@id='adult_room']"));
		childno.click();
		Select f=new Select(childno);
		f.selectByIndex(3);
	}

	@When("^user Select The Children Per Room$")
	public void user_Select_The_Children_Per_Room() throws Throwable {
		WebElement child3=driver.findElement(By.xpath("//select[@id='child_room']"));
		 child3.click();
		Select g=new Select(child3);
		g.selectByIndex(3);
	}

	@Then("^user Click The Search Button And It Navigates To Next Page$")
	public void user_Click_The_Search_Button_And_It_Navigates_To_Next_Page() throws Throwable {
		WebElement sel=driver.findElement(By.xpath("//input[@id='Submit']"));
		sel.click();
	}

	@When("^user Select The Hotel Name$")
	public void user_Select_The_Hotel_Name() throws Throwable {
		WebElement butt = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
		butt.click();
	}

	@Then("^user Click The Continue Button And And It Navigates To Next Page$")
	public void user_Click_The_Continue_Button_And_And_It_Navigates_To_Next_Page() throws Throwable {
		WebElement cont = driver.findElement(By.xpath("//input[@id='continue']"));
		cont.click();
	}

	@When("^user Enter The First Name In First Name Field$")
	public void user_Enter_The_First_Name_In_First_Name_Field() throws Throwable {
		WebElement fname = driver.findElement(By.xpath("//input[@name='first_name']"));
		fname.click();
		fname.sendKeys("Gurunathan");
	}

	@When("^user Enter The Last Name In Last Name Field$")
	public void user_Enter_The_Last_Name_In_Last_Name_Field() throws Throwable {
		WebElement lname = driver.findElement(By.xpath("//input[@name='last_name']"));
		lname.click();
		lname.sendKeys("R");
	}

	@When("^user Enter The Billing Address In Billing Address Field$")
	public void user_Enter_The_Billing_Address_In_Billing_Address_Field() throws Throwable {
		WebElement add = driver.findElement(By.xpath("//textarea[@name='address']"));
		add.click();
		add.sendKeys("chennai");
	}

	@When("^user Enter The Credit Card No In Credit Card No Field$")
	public void user_Enter_The_Credit_Card_No_In_Credit_Card_No_Field() throws Throwable {
		WebElement ccnum = driver.findElement(By.xpath("//input[@name='cc_num']"));
		ccnum.click();
		ccnum.sendKeys("1234567890123456");
	}

	@When("^user Select The Credit Card Type In Credit Card Field$")
	public void user_Select_The_Credit_Card_Type_In_Credit_Card_Field() throws Throwable {
		WebElement cctype = driver.findElement(By.xpath("//select[@id='cc_type']"));
		cctype.click();
		Select h=new Select(cctype);
		h.selectByIndex(2);
	}

	@When("^user Select The Expiry Date In Month And Year$")
	public void user_Select_The_Expiry_Date_In_Month_And_Year() throws Throwable {
		WebElement year = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		year.click();
		Select j=new Select(year);
		j.selectByIndex(15);
		WebElement mon = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		mon.click();
		Select i=new Select(mon);
		i.selectByIndex(7);
	}

	@When("^user Enter The Cvv Number In Cvv Number Field$")
	public void user_Enter_The_Cvv_Number_In_Cvv_Number_Field() throws Throwable {
		WebElement ccvno = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
		ccvno.click();
		ccvno.sendKeys("123");
	}

	@Then("^User Click The Book Now And It Navigates To Next Page$")
	public void user_Click_The_Book_Now_And_It_Navigates_To_Next_Page() throws Throwable {
		WebElement book = driver.findElement(By.xpath("//input[@id='book_now']"));
		book.click();

	}
}
