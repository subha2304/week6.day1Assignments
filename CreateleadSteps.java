package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateleadSteps extends BaseClass{

	

	@Then("click createlead page")
	public void Clickclpage() {
		driver.findElement(By.linkText("Create Lead")).click();
	   
	}

	@Then("enter the companyname {string}")
	public void enterCompname(String company ) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
	}

	@Then("enter the firstname {string}")
	public void enterFirstname(String firstname ) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
	}

	@Then("enter the lastname {string}")
	public void enterLastname(String lastname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
	}

	@Then("enter the phnno {string}")
	public void enterphnno(String phnno) {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phnno);
	}

	@Then("click the summit button")
	public void clickSummitButton() {
		driver.findElement(By.name("submitButton")).click();
		}
	@Then("close the browser")
	public void closeBrowser() {
		driver.close();
		
	}
}