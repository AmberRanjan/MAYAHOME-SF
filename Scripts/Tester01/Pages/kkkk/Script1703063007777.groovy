import org.openqa.selenium.WebElement

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory

import groovy.swing.factory.CollectionFactory
import io.appium.java_client.AppiumDriver


Mobile.startExistingApplication('com.maybank2u.salesforce.uatent')
//Mobile.delay(5)

AppiumDriver<?> driver = MobileDriverFactory.getDriver()
Set<String> toCompareSet = new HashSet<>();


Set<WebElement> data = driver.findElementsByXPath('(//*[@class = "android.widget.TextView"])'); 

for (int i = 1; i<=data.size(); i++) {
	
	String drpDorwnvalue  = driver.findElementByXPath('(//*[@class = "android.widget.TextView"])['+i+']').getText()
	toCompareSet.add(drpDorwnvalue)
	
}

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)
data = driver.findElementsByXPath('(//*[@class = "android.widget.TextView"])');

for (int i = 1; i<=data.size(); i++) {
	
	String drpDorwnvalue  = driver.findElementByXPath('(//*[@class = "android.widget.TextView"])['+i+']').getText()
	toCompareSet.add(drpDorwnvalue)	
}

println("Size of set"+toCompareSet.size())


ArrayList<String> toCompareList1 = new ArrayList<String>(Arrays.asList("Aunt", "Brother", "Daughter", "Father", "Friend", "Husband","In-Law","Mother","Sister","Son", "Uncle", "Wife"))
ArrayList<String> toCompareList = new ArrayList<String>()

/*for (WebElement el : data) {
	
	String drpDorwnvalue  = driver.findElementByClassName('android.widget.TextView').getText()
	//= el.getText();
	println("each row value ==========="+drpDorwnvalue)
	drpDownlst.add(drpDorwnvalue)
	CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.65)
}*/

/*Collections.sort(toCompareList)
Collections.sort(drpDownlst)
println("compare list=================================" +toCompareList)
println("drpdownlist ================================="+drpDownlst)


Boolean status = toCompareList.equals(drpDownlst)

Mobile.verifyEqual(true, status)*/
	
