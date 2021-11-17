package stepDefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class EditLeadSteps extends BaseClass {
	
	@Given("click the findlead button")
	public void clickFindbutton() {
		driver.findElement(By.linkText("Find Leads")).click();
	  
	}

	@Then("click the phone")
	public void clickphone() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	    
	}

	@Then("enter the phonenumber {string}")
	public void enterphnno(String phnno) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phnno);
	   
	}

	@Then("click findleads button")
	public void clickFindLeadsbutton() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	}

	@Then("click the existing name")
	public void clickName() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}

	@Then("click edit button")
	public void clickEdit() {
		driver.findElement(By.linkText("Edit")).click();
	}

	@Then("enter company name {string}")
	public void entercompname(String company) {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(company);
	}

	@Then("click summit button")
	public void clickSummit() {
		driver.findElement(By.name("submitButton")).click();
	}
}
