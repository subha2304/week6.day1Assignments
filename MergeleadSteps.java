package stepDefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;

public class MergeleadSteps extends BaseClass {
	@Then("enter the edit button")
	public void enter_the_edit_button() {
		driver.findElement(By.linkText("Edit")).click();
	}

	@Then("enter a companyName as {string}")
	public void enter_a_company_name_as(String cname) {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cname);
	}

}
