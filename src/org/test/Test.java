package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
			
		public static void main(String[] args) {
			
			//Setup the driver
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe" );
			
			//launching the browser
			WebDriver driver = new ChromeDriver();
			
			//go to the url
			driver.get("https://en-gb.facebook.com/");
			
			//to get the title
			String title = driver.getTitle(); //ctrl + 2 release and Press L
			System.out.println(title);
			
			//to get the url
			String url = driver.getCurrentUrl();
			System.out.println(url);
			
			//to maxximize the webpage
			driver.manage().window().maximize();
			
			//to close the browser
			driver.close();
			
		}
		}

	


