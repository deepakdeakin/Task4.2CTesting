package sit707_week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This class demonstrates Selenium locator APIs to identify HTML elements.
 * 
 * Details in Selenium documentation https://www.selenium.dev/documentation/webdriver/elements/locators/
 * 
 * @author Ahsan Habib
 */
public class SeleniumOperations {

	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	 public static boolean bunnings_login(String username, String password) {
	        try {
	            System.out.println("Fire up Safari browser.");
	            WebDriver driver = new SafariDriver();

	            System.out.println("Driver info: " + driver);

	            // Maximize the browser window
	            driver.manage().window().maximize();

	            // Open the login page
	            String loginUrl = "https://www.bunnings.com.au/login";
	            driver.get(loginUrl);

	            // Wait for email input field to be visible
	            WebDriverWait wait = new WebDriverWait(driver, 10);
	            WebElement emailInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okta-signin-username")));

	            // Populate email and password fields
	            emailInput.sendKeys(username);
	            WebElement passwordInput = driver.findElement(By.id("okta-signin-password"));
	            passwordInput.sendKeys(password);

	            // Click the submit button
	            WebElement submitButton = driver.findElement(By.id("okta-signin-submit"));
	            submitButton.click();

	            // Wait for the page to load (optional)
	            Thread.sleep(2000);

	            // Check if login is successful by verifying the redirection
	            boolean isLoggedIn = !driver.getCurrentUrl().equals(loginUrl);

	            // Close the browser
	            driver.quit();

	            return isLoggedIn;
	        } catch (Exception e) {
	            e.printStackTrace();
	            return false; // Return false in case of any exceptions
	        }
	 }
}
	
	
