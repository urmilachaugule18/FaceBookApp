package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import static UtilityLayer.UtilsClass.*;

public class RegisterPage extends BaseClass{
@FindBy(name="firstname")
private WebElement firstname;

@FindBy(name="lastname")
private WebElement lastname;

@FindBy(name="reg_email__")
private WebElement Email;

@FindBy(name="reg_email_confirmation__")
private WebElement ReEmail;

@FindBy(name="reg_passwd__")
private WebElement Password;

@FindBy(name="birthday_day")
private WebElement Date;

@FindBy(name="birthday_month")
private WebElement Month;

@FindBy(name="birthday_year")
private WebElement Year;

//@FindBy(name="//input[@name='sex']")
//private List<WebElement> gender;  String Gender

@FindBy(name="websubmit")
private WebElement Submit;

public RegisterPage() {
	PageFactory.initElements(driver, this);
}
public void RegisterFunctinality(String fname,String lname,String email,String reemail,
		String pass,String dd,String mm,String yyyy) {
	
	sendKeys(firstname, fname);
	sendKeys(lastname, lname);
	sendKeys(Email, email);
	sendKeys(ReEmail, reemail);
	sendKeys(Password, pass);
	selectbyvisible(Date, dd);
	selectbyvisible(Month, mm);
	selectbyvisible(Year, yyyy);
	//clcik(Submit);
}

}
