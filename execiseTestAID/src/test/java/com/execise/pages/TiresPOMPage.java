/**
 * 
 */
package com.execise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.execise.HelperMethods.HelperUtil;

/**
 * @author Preeth eldhose
 *
 */

public class TiresPOMPage {

	//driver from PF will be used here.
	public TiresPOMPage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	WebDriver driver;

	@FindBy(how = How.XPATH, using = "//*[@id=\"inflation\"]/div/div[1]/div/div[3]/ul/li[1]")
	WebElement overInflatedHarshTires;

	public WebElement passHarshTires() {
		return overInflatedHarshTires;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"inflation\"]/div/div[1]/div/div[3]/ul/li[2]")
	WebElement overInflatedShorterTreadLife;

	public WebElement passShorterTreadLife(WebElement overInflatedShorterTreadLife) {
		return overInflatedShorterTreadLife;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"inflation\"]/div/div[1]/div/div[3]/ul/li[3]")
	WebElement overInflatedLongerStopDist;

	public WebElement passoverInflatedLongerStopDist(WebElement overInflatedLongerStopDist) {
		return overInflatedLongerStopDist;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"inflation\"]/div/div[1]/div/div[3]/ul/li[4]")
	WebElement overInflatedProneDamage;

	public WebElement passoverInflatedProneDamage(WebElement overInflatedProneDamage) {
		return overInflatedProneDamage;
	}

	public String getoverInflatedHarshTiresText() throws InterruptedException {
		HelperUtil hc = new HelperUtil();
		String checkElementHarshTires = "//*[@id=\"inflation\"]/div/div[1]/div/div[3]/ul/li[1]";
		hc.checkEleLoaded(driver, checkElementHarshTires);
		String harshTiresText = overInflatedHarshTires.getText();
		return harshTiresText;
	}
	
	public String getoverInflatedShorterTreadLifeText() throws InterruptedException {
		HelperUtil hc = new HelperUtil();
		String checkElementShorterTreadLife = "//*[@id=\"inflation\"]/div/div[1]/div/div[3]/ul/li[2]";
		hc.checkEleLoaded(driver, checkElementShorterTreadLife);
		String ShorterTreadLifeText = overInflatedShorterTreadLife.getText();
		return ShorterTreadLifeText;
	}
	
	public String getoverInflatedLongerStopDistText() throws InterruptedException {
		HelperUtil hc = new HelperUtil();
		String checkElementLongerStopDist = "//*[@id=\"inflation\"]/div/div[1]/div/div[3]/ul/li[3]";
		hc.checkEleLoaded(driver, checkElementLongerStopDist);
		String longerStopDistText = overInflatedLongerStopDist.getText();
		return longerStopDistText;
	}
	
	public String getoverInflatedProneDamageText() throws InterruptedException {
		HelperUtil hc = new HelperUtil();
		String checkElementProneDamage = "//*[@id=\"inflation\"]/div/div[1]/div/div[3]/ul/li[4]";
		hc.checkEleLoaded(driver, checkElementProneDamage);
		String proneDamageText = overInflatedProneDamage.getText();
		return proneDamageText;
	}
	
	public String getPageSourceAsText(WebDriver driver) {
		
		String pageSourceAsText = driver.getPageSource();
		return pageSourceAsText;
		
	}

	public boolean validateTest(WebDriver driver, String checkExpected) {
		boolean testStatus = false;
		String pageSource = getPageSourceAsText(driver);
		if(pageSource.contains(checkExpected)) {
			testStatus = true;
		} else {
			testStatus = false;
		}
		return testStatus;
	}
}