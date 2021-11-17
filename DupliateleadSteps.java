package stepDefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;

public class DupliateleadSteps extends BaseClass {
	@Then("click the duplicate lead button")
	public void click_the_duplicate_lead_button() {
		driver.findElement(By.linkText("Duplicate Lead")).click();
	}

}
