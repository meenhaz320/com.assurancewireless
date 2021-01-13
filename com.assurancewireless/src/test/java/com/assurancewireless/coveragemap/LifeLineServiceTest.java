package com.assurancewireless.coveragemap;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LifeLineServiceTest {

public WebDriver driver;
	
@BeforeTest
public void setup() {
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.get("https://www.assurancewireless.com/");
}

@Test
public void Lifelineservice_whatislifelie() {
String title = driver.getTitle();
System.out.println("The title is "+title);
}

@AfterTest
public void teardown() {
driver.quit();
}

}

