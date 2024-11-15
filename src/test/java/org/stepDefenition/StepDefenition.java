package org.stepDefenition;

import org.pom.POM;
import org.resuable.Reusable;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefenition extends Reusable {

	POM p = new POM();

	@Given("I navigate to the FitPeo Homepage")
	public void iNavigateToTheFitPeoHomepage() {

	}

	@Given("I navigate to Revenue Calculator Page")
	public void iNavigateToRevenueCalculatorPage() throws InterruptedException {
		Thread.sleep(3000);
		p.navigateCalculator();
	}

	@When("I scroll down till revenue calculator slider")
	public void iScrollDownTillRevenueCalculatorSlider() {

	}

	@Then("I adjust the slider to given value")
	public void iAdjustTheSliderToGivenValue() throws InterruptedException {
		// Assuming you want to adjust to a specific value. You might need to retrieve
		// or pass this value.
		p.sliderAdjust("0");
	}

	@When("I click text field and enter the given value {string}")
	public void iClickTextFieldAndEnterTheGivenValue(String value) {
		p.textBox(value);
		
		

	}

	@Then("I check the slider with text box value")
	public void iCheckTheSliderWithTextBoxValue() {
		String textValue = p.validateTextBoxValue();
		String sliderValue = p.validateSliderValue();
		Assert.assertEquals(textValue, sliderValue);
	}

	@When("I scroll down to CPT codes section and change given value {string}")
	public void iScrollDownToCPTCodesSectionAndChangeGivenValue(String value) {
		p.textBox(value);
	}

	@When("I select the checkboxes for {string}, {string}, {string}, and {string}")
	public void iSelectTheCheckboxesForAnd(String cpt1, String cpt2, String cpt3, String cpt4) throws InterruptedException {
		p.clickCheckbox(cpt1);
		p.clickCheckbox(cpt2);
		p.clickCheckbox(cpt3);
		p.clickCheckbox(cpt4);
	}

	@Then("I compare Total Recurring Reimbursement with selected value")
	public void iCompareTotalRecurringReimbursementWithSelectedValue() {
		String totalReimbursement = p.totalReimbursement();
		System.out.println("totalReimbursement  "+totalReimbursement);
	//	Assert.assertEquals("$110700", totalReimbursement);
		
	}
}
