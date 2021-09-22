package easeMyTrip;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import logPageobjects.LogPageObjects;

public class EaseMyTrip {
	ExtentReports extent;
	@BeforeTest
	public void config() {
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
	  extent=new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("Associate Senior QA Enigineer", "Priyatham Bommareddy");
	
	}

	@Test
	public void easeMyTrip() throws InterruptedException {
		extent.createTest("Launch the travolook site");
		extent.createTest("Select From Destination");
		extent.createTest("Select To Destination");
		extent.createTest("Select date of the travel");
		extent.createTest("Select number of passengers");
		extent.createTest("Search flights");
		extent.createTest("Select Flight");
		extent.createTest("Enter Passenger 1 details");
		extent.createTest("Enter Passenger 2 details");
		extent.createTest("Continue to payment");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.travolook.in/");
		LogPageObjects lpo=new LogPageObjects(driver);
		lpo.getFlyingFrom().click();
		lpo.getSelectcity().click();
		//lpo.getSelectover().click();
		lpo.getFlyingTo().click();
		lpo.getFlyingtoCitySelection().click();
		lpo.getCalenderpickselector().click();
		List<WebElement> dates= driver.findElements(By.cssSelector(".ui-state-default"));
        int count=driver.findElements(By.cssSelector(".ui-state-default")).size();
        for(int i=0;i<count;i++) {
        	String date=driver.findElements(By.cssSelector(".ui-state-default")).get(i).getText();
        	if(date.equalsIgnoreCase("21")) {
        		driver.findElements(By.cssSelector(".ui-state-default")).get(i).click();
        	}
        }
        
		lpo.gettravelidselection().click();
        lpo.getadultdropdown().click();
        int i=1;
    	while(i<2){
    		driver.findElement(By.id("sub1plus")).click();
    		i++;
    	}
    	lpo.getDone().click();
    	lpo.getclickonsearch().click();
    	lpo.getEmailMobilenumberselection().click();
    	lpo.getEnterEmail().sendKeys("bpr@gmail.com");
    	lpo.getEnterMobileNumber().sendKeys("8765438765");
    	lpo.getAdult1Selection().click();
        WebElement dropdown=driver.findElement(By.id("_ViewModel[0]._AdultM[0].Gender.ID"));
		Select select=new Select(dropdown);
		select.selectByIndex(1);
			select.getFirstSelectedOption();
		lpo.getFirstname().sendKeys("bpr");
	    lpo.getLastname().sendKeys("dada");
	    lpo.getFirstHeader().click();
			
			WebElement dropdown2=driver.findElement(By.id("_ViewModel[0]._AdultM[1].Gender.ID"));
			Select select2=new Select(dropdown2);
			select2.selectByIndex(3);
				select2.getFirstSelectedOption();
				lpo.getAdult2Selection().click();
				lpo.getSecondCustomerfirstname().sendKeys("dada");
				lpo.getSecondCustomerlastname().sendKeys("sourav");
				lpo.getPaymentProcess().click();
			extent.flush();
}}