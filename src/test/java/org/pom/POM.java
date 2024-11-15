package org.pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.resuable.Reusable;

public class POM extends Reusable {

	public POM() {
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@FindBy(xpath = "//div[text()='Revenue Calculator']")
	private WebElement revenueCalculatorPage;

	@FindBy(xpath = "//input[@type='range']")
	private WebElement slider;

	@FindBy(xpath = "//input[@type='number']")
	private WebElement textBox;

	@FindBy(xpath = "//p[text()='Total Recurring Reimbursement for all Patients Per Month:']/child::p[contains(@class,'MuiTypography-root MuiTypography-b')]")
	private WebElement reimbursementTotal;

	@FindBy(xpath = "//input[@data-index='0']")
	private WebElement validate;

	@FindBy(xpath = "//p[text()='CPT-99458']//parent::div//following-sibling::label//child::span//child::input")
	private WebElement checkbox;

	public void navigateCalculator() {
		wait.until(ExpectedConditions.elementToBeClickable(revenueCalculatorPage));
		click(revenueCalculatorPage);
	}

	public void scrollToRevCal() {
		wait.until(ExpectedConditions.elementToBeClickable(textBox));
		scrollEle(textBox);
	}

	public void sliderAdjust(String value) throws InterruptedException {
		entTexDrop(slider, 94, 0);
		click(textBox);
		backSpace();
		enterText(textBox, value);
		//To check each actions I'm using Thread.Sleep 
		Thread.sleep(3000); 
	}

	public void textBox(String value) {

		click(textBox);
		backSpace();
		backSpace();
		backSpace();
		enterText(textBox, value);
	}

	

	
	public void clickCheckbox(String cptCode) throws InterruptedException {
		String xpath = "//p[text()='" + cptCode
				+ "']//parent::div//following-sibling::label//child::span//child::input";
		WebElement checkbox = driver.findElement(By.xpath(xpath));
		scrollEle(checkbox);
		clickEle(checkbox);

	}

	public String validateTextBoxValue() {
		return getAttribute(validate, "value");
	}
	public String validateSliderValue() {
		return getAttribute(slider, "value");
	}
	public String totalReimbursement() {
		return getText(reimbursementTotal);
	}
}
