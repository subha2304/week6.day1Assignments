package stepDefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DeleteLeadSteps extends BaseClass {
   public static String leadID;
	@Given("click the findleads")
	public void clickFindleads() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@Then("click the phone button")
	public void clickphn() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}
	
	@Then("enter the phonenumber as {string}")
	public void enterphnno(String phonenumber) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phonenumber);
	}
	@Then("click the findleads button")
	public void clickfind() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	}

	@Then("gettext from the id")
	public void gettext() {
		 leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
	}

	@Then("click the firstId")
	public void clickfirstname() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}

	@Then("click the Delete button")
	public void clickdelete() {
		driver.findElement(By.linkText("Delete")).click();
	}

	@Then("click findleads")
	public void clickfindleads() {
		driver.findElement(By.linkText("Find Leads")).click();
	}

	@Then("enter the savedId name")
	public void sendname() {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);    
	}

	@Then("again click the findbutton")
	public void againclickfind() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}

	@Then("records should not be displayed")
	public void verifyrecord() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
		
	}

}
