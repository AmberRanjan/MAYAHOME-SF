import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

String propertyPurchsedFromDeveloper_EditCustomerDetails = GlobalVariable.propertyPurchsedFromDeveloper_EditCustomerDetails
String propertyCompleted6MonthsAgo_EditCustomerDetails = GlobalVariable.propertyCompleted6MonthsAgo_EditCustomerDetails

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/txt_PropertyPurchasedFromDeveloper'),
	'Is the property purchased directly from a developer?')

// if property purchased from developer = yes
if (propertyPurchsedFromDeveloper_EditCustomerDetails.equalsIgnoreCase('Yes')) {
	Mobile.tap(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/rdo_PropertyPurchseFromDeveloper_Yes'),
		0)

	Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/txt_PropertyCompleted 6MonthsAgo'),
		'Was the property completed more than 6 months ago?')

	// if property completed more than 6 months ago = yes
	if (propertyCompleted6MonthsAgo_EditCustomerDetails.equalsIgnoreCase('Yes')) {
		Mobile.tap(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/rdo_PropertyCompleted6MonthsAgo_Yes'),
			0)
		
		// input unit details, storey details, city details, postcode details, development name, state, development type
		
		WebUI.callTestCase(findTestCase('Tester1_Old/Pages/PropertyDetailsPage1/ReusuableMethods/NonlistedProperties'), [:], FailureHandling.STOP_ON_FAILURE)
		
		WebUI.callTestCase(findTestCase('Tester1_Old/Pages/PropertyDetailsPage2/PropertyDetailsPage2_NonListed'), [:], FailureHandling.STOP_ON_FAILURE)
		
		WebUI.callTestCase(findTestCase('Tester1_Old/Pages/PropertyDetailsPage3/PropertyDetailsPage3_NonListed'), [:], FailureHandling.STOP_ON_FAILURE)
					
		
		// if property completed more than 6 months ago = No
	} else if (propertyCompleted6MonthsAgo_EditCustomerDetails.equalsIgnoreCase('No')) {
		Mobile.tap(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/rdo_PropertyCompleted6MonthsAgo_No'),
			0)

		// input unit details, storey details, city details, postcode details, development name, state, development type
		
		WebUI.callTestCase(findTestCase('Tester1_Old/Pages/PropertyDetailsPage1/ReusuableMethods/NonlistedProperties'), [:], FailureHandling.STOP_ON_FAILURE)
		
		WebUI.callTestCase(findTestCase('Tester1_Old/Pages/PropertyDetailsPage2/PropertyDetailsPage2_NonListed'), [:], FailureHandling.STOP_ON_FAILURE)
		
		WebUI.callTestCase(findTestCase('Tester1_Old/Pages/PropertyDetailsPage3/PropertyDetailsPage3_NonListed'), [:], FailureHandling.STOP_ON_FAILURE)
		
		
	}
	//else if property under construction  = No
} else if (propertyPurchsedFromDeveloper_EditCustomerDetails.equalsIgnoreCase('No')) {
	Mobile.tap(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/rdo_PropertyPurchseFromDeveloper_No'),
		0)
	// input unit details, storey details, city details, postcode details, development name, state, development type
	
	WebUI.callTestCase(findTestCase('Tester1_Old/Pages/PropertyDetailsPage1/ReusuableMethods/NonlistedProperties'), [:], FailureHandling.STOP_ON_FAILURE)
	
	WebUI.callTestCase(findTestCase('Tester1_Old/Pages/PropertyDetailsPage2/PropertyDetailsPage2_NonListed'), [:], FailureHandling.STOP_ON_FAILURE)

	WebUI.callTestCase(findTestCase('Tester1_Old/Pages/PropertyDetailsPage3/PropertyDetailsPage3_NonListed'), [:], FailureHandling.STOP_ON_FAILURE)
	
}