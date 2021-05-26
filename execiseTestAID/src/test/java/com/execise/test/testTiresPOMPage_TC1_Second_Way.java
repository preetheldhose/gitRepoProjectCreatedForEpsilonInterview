package com.execise.test;


import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.*;
import com.execise.pages.*;
import com.execise.HelperMethods.*;

public class testTiresPOMPage_TC1_Second_Way {

	public static WebDriver driver;
	public Properties prop, expText;
	public String baseUrl = "";
	public String overInflatedHarshTires_expectedText = "";
	public String overInflatedShorterTreadLife_expectedText = "";
	public String overInflatedLongerStopDist_expectedText = "";
	public String overInflatedProneDamage_expectedText = "";
	public 	boolean testStatus = false;
	public String chromeDriverPath = "";
	
	
	@BeforeTest
	public void setUp() throws FileNotFoundException, IOException {
		
		prop = new Properties();
		prop.load(new FileInputStream("./Configuration/configuration_file"));
		
		expText = new Properties();
		expText.load(new FileInputStream("./AssertationFields/AssertationFieldsTexts"));
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		baseUrl = prop.getProperty("baseUrl_tires");
		driver.get(baseUrl);
		
		overInflatedHarshTires_expectedText = expText.getProperty("HarshTires_expectedText");
		overInflatedShorterTreadLife_expectedText = expText.getProperty("ShorterTreadLife_expectedText");
		overInflatedLongerStopDist_expectedText = expText.getProperty("LongerStopDist_expectedText");
		overInflatedProneDamage_expectedText = expText.getProperty("ProneDamage_expectedText");
		
		driver.manage().window().maximize();

	}
	

	//Method to test/validate the 4 requirments provided in the Word Doc emailed me (I have placed the same Doc (requirement) on gitHub). 
	@Test
	public void testTiresPOMPage_TC1() throws InterruptedException {
		
		TiresPOMPage TiresPOMPagenew  = PageFactory.initElements(driver, TiresPOMPage.class);
		
		//Validate and assert the first requirement namely - Expected Content: (1. "Harsh ride") on 
		//the provided page as in Word Doc emailed to me : (I have placed the same Doc (requirement) on gitHub).
			//Also refer to ./Requirment_InterviewQuestion_ProvidedToMe_viaEmail/Requirment_InterviewQuestion_ProvidedToMe_viaEmail.doc file
		testStatus = TiresPOMPagenew.validateTest(driver, overInflatedHarshTires_expectedText);
		Assert.assertTrue(testStatus);
		
		//Validate and assert the first requirement namely - Expected Content: (1. "Harsh ride") on 
		//the provided page as in Word Doc emailed to me : (I have placed the same Doc (requirement) on gitHub).
			//Also refer to ./Requirment_InterviewQuestion_ProvidedToMe_viaEmail/Requirment_InterviewQuestion_ProvidedToMe_viaEmail.doc file
		testStatus = TiresPOMPagenew.validateTest(driver, overInflatedShorterTreadLife_expectedText);
		Assert.assertTrue(testStatus);
		
		//Validate and assert the first requirement namely - Expected Content: (1. "Harsh ride") on 
		//the provided page as in Word Doc emailed to me : (I have placed the same Doc (requirement) on gitHub).
			//Also refer to ./Requirment_InterviewQuestion_ProvidedToMe_viaEmail/Requirment_InterviewQuestion_ProvidedToMe_viaEmail.doc file
		testStatus = TiresPOMPagenew.validateTest(driver, overInflatedLongerStopDist_expectedText);
		Assert.assertTrue(testStatus);
		
		//Validate and assert the first requirement namely - Expected Content: (1. "Harsh ride") on 
		//the provided page as in Word Doc emailed to me : (I have placed the same Doc (requirement) on gitHub).
			//Also refer to ./Requirment_InterviewQuestion_ProvidedToMe_viaEmail/Requirment_InterviewQuestion_ProvidedToMe_viaEmail.doc file
		testStatus = TiresPOMPagenew.validateTest(driver, overInflatedProneDamage_expectedText);
		Assert.assertTrue(testStatus);
	
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
}