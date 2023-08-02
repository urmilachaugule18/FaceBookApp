package UtilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class UtilsClass extends BaseClass
{
	public static void sendKeys(WebElement wb,String value) {
		if(wb.isDisplayed()&&wb.isEnabled()) {
			wb.sendKeys(value);
		}
	}
	public static void clcik(WebElement wb) {
		if(wb.isDisplayed()&&wb.isEnabled()) {
			wb.click();;
		}
	}
	public static void selectbyvisible(WebElement wb,String value) {
		Select sel=new Select(wb);
		sel.selectByVisibleText(value);
	}
    
	public static void radiobutton(List<WebElement> wb,String value) {
		for(WebElement abc:wb) {
			if(abc.getText().equalsIgnoreCase(value)) {
				abc.click();
				break;
			}
		}
	}
}
