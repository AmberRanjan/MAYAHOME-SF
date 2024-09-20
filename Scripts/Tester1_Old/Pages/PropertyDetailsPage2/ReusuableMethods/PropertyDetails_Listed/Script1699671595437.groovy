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


String EditPropertyDetails = 'False'

// verify Message displayed to ask cutomer to enter details and check elligiblity
Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage2/txt_ApplicantEligiblity1'), 'Please fill up the following details to check')

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage2/txt_ApplicantEligiblity2'), 'your applicant\'s eligibility')

//verify Property detail text
Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage2/txt_PropertyDetails'), 'Property Details')

// verify edit button is present
Mobile.verifyElementExist(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage2/txt_EditPropertyDetails'), 0)

// verify porperty name is displayed as entered in previous screen
Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage2/txt_PropertyName'), 'Property Name')

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage2/txt_PropertyNameValue'), GlobalVariable.PropertyNameInputText)

// verify porperty unit type is displayed as entered in previous screen
Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage2/txt_UnitType'), 'Unit Type')

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage2/txt_UnitTypeValue'), GlobalVariable.UnitTypeInputText)

// verify porperty unit number is displayed as entered in previous screen
Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage2/txt_UnitNumber'), 'Unit Number')

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage2/txt_UnitNumberValue'), GlobalVariable.UnitNumberInputText)

//verify property price details are displayed as entered in previous screen
Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage2/txt_PropertyPrice'), 'Property Price')

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage2/txt_PropertyPriceValue'), GlobalVariable.PropertPriceInputText_Validation)

// verify Message displayed to ask cutomer to enter details and check elligiblity
Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage2/txt_ApplicantEligiblity1'), 'Please fill up the following details to check')

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage2/txt_ApplicantEligiblity2'), 'your applicant\'s eligibility')

//verify Property detail text
Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage2/txt_PropertyDetails'), 'Property Details')

// verify edit button is present
Mobile.verifyElementExist(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage2/txt_EditPropertyDetails'), 0)

if (EditPropertyDetails.equalsIgnoreCase('True')) {
	
	/*WebUI.callTestCase(findTestCase('Test Cases/Tester1_Old/Pages/PropertyDetailsPage1/PropertyDetailsPage1'), [:], FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage2/txt_EditPropertyDetails'), 0)
	
	// verify porperty name is displayed as entered in previous screen
	Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage2/txt_PropertyName'), 'Property Name')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage2/txt_PropertyNameValue'), GlobalVariable.PropertyNameInputText)
	
	// verify porperty unit type is displayed as entered in previous screen
	Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage2/txt_UnitType'), 'Unit Type')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage2/txt_UnitTypeValue'), GlobalVariable.UnitTypeInputText)
	
	// verify porperty unit number is displayed as entered in previous screen
	Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage2/txt_UnitNumber'), 'Unit Number')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage2/txt_UnitNumberValue'), GlobalVariable.UnitNumberInputText)
	
	//verify property price details are displayed as entered in previous screen
	Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage2/txt_PropertyPrice'), 'Property Price')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage2/txt_PropertyPriceValue'), GlobalVariable.PropertPriceInputText_Validation)
	
	Mobile.tap(findTestObject('Object Repository/Tester1_old/CommonElements/btn_Next'), 10)*/
	
	
}

