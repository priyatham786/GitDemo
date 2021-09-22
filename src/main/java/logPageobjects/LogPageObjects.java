package logPageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogPageObjects {
	WebDriver driver;
	

/*@FindBy(xpath="//div[@class='search_bg_htl']")
WebElement cityselection;*/
	By FlyingFrom=By.id("flying_from_N"); 
	By Selectcity=By.cssSelector("li[class='ac_odd'] b");
//By Selectover=By.cssSelector("li[class='ac_odd ac_over']");
By FlyingTo=By.id("flying_to_N");
By FlyingtoCitySelection=By.xpath("/html/body/div[6]/ul/li[3]/b");
By Calenderpickselector=By.cssSelector("i[class='fa fa-angle-down']");
By travelidselection=By.id("travel_id");
By adultdropdown=By.cssSelector(".popup.adultdrop");
By clickdone=By.cssSelector(".done");
By clickonsearch=By.id("searchengine_btn");
By EmailMobilenumberselection=By.cssSelector(".selectbtn");
By EnterEmail=By.id("Email");
By EnterMobileNumber=By.id("MobNo");
By Adult1selection=By.id("_ViewModel[0]._AdultM[0].Gender.ID");
By Firstname=By.id("divfirstname0");
By Lastname=By.id("divlastname0");
By FirstHeader=By.id("ui-accordion-accordion-header-1");
By Adult2selection=By.id("_ViewModel[0]._AdultM[1].Gender.ID");
By secondcustomerfirstname=By.id("divfirstname1");
By secondcustomerlastname=By.id("divlastname1");
By Paymentprocess=By.id("Process1_btn");


public LogPageObjects(WebDriver driver) {
	this.driver=driver;

}	

/*public WebElement getCitySelection() {
return cityselection ;
}*/
public WebElement getFlyingFrom() {
return driver.findElement(FlyingFrom);
}
public WebElement getSelectcity() {
return driver.findElement(Selectcity) ;
}
/*public WebElement getSelectover() {
return driver.findElement(Selectover);
}*/
public WebElement getFlyingTo() {
return driver.findElement(FlyingTo);
}
public WebElement getFlyingtoCitySelection() {
return driver.findElement(FlyingtoCitySelection);
}
public WebElement getCalenderpickselector() {
return driver.findElement(Calenderpickselector) ;
}
public WebElement gettravelidselection() {
return driver.findElement(travelidselection) ;
}
public WebElement getadultdropdown() {
return driver.findElement(adultdropdown) ;
}
public WebElement getDone() {
return driver.findElement(clickdone) ;
}
public WebElement getclickonsearch() {
	return driver.findElement(clickonsearch);
}
public WebElement getEmailMobilenumberselection() {
	return driver.findElement(EmailMobilenumberselection);
}
public WebElement getEnterEmail() {
	return driver.findElement(EnterEmail);
}
public WebElement getEnterMobileNumber() {
	return driver.findElement(EnterMobileNumber);
}
public WebElement getAdult1Selection() {
	return driver.findElement(Adult1selection);
}
public WebElement getFirstname() {
	return driver.findElement(Firstname);
}
public WebElement getLastname() {
	return driver.findElement(Lastname);
}
public WebElement getFirstHeader() {
	return driver.findElement(FirstHeader);
}
public WebElement getAdult2Selection() {
	return driver.findElement(Adult2selection);
}

public WebElement getSecondCustomerfirstname() {
	return driver.findElement(secondcustomerfirstname);
}
public WebElement getSecondCustomerlastname() {
	return driver.findElement(secondcustomerlastname);
}
public WebElement getPaymentProcess() {
	return driver.findElement(Paymentprocess);
}
}