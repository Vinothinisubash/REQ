package com.stepdefenition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.pages.Loginpage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;



public class Stepdefenition {
	public static WebDriver driver;
	Loginpage  Lp = new Loginpage();
	@Given("user is on sauce app")
	public void user_is_on_sauce_app() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");
	}
	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {
		driver.findElement(Lp.username).sendKeys("vino");
		driver.findElement(Lp.password).sendKeys("vino123");

	}
	@Then("user enter submit button")
	public void user_enter_submit_button() {
		driver.findElement(Lp.login).click();
		
		
	    
	}




}
