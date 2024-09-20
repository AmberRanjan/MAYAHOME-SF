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

String financingType = 'Ismalmin Financing'
String EditPropertyDetails = 'False'

Mobile.startExistingApplication('com.maybank2u.salesforce.uatent')

Mobile.delay(5)

Mobile.setText(findTestObject('null'), '80008113', 0)

Mobile.setText(findTestObject('null'), 'Tester1', 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.verifyElementText(findTestObject('null'), 'Mortgage')

Mobile.delay(20)

// verify Message displayed to ask cutomer to enter details and check elligiblity
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage2/txt_ApplicantEligiblity1'), 
    'Please fill up the following details to check')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage2/txt_ApplicantEligiblity2'), 
    'your applicant\'s eligibility')

//verify Property detail text
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage2/txt_PropertyDetails'), 
    'Property Details')

// verify edit button is present
Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/PropertyDetailsPage2/txt_EditPropertyDetails'), 0)

if (EditPropertyDetails.equalsIgnoreCase('True')) {
	
	Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage2/txt_EditPropertyDetails'), 0)
	
}

// verify porperty address is displayed as entered in orevious screen
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage2/txt_PropertyAddress'), 
    'Property Address')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage2/txt_PropertyAddressvalue'), 
    'LOT A, BLOCK A, ASSETK, KL, 58000 Kuala Lumpur')

//verify development type details are displayed as entered in previous screen
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_DevelopmentType'), 'Development Type')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage2/txt_DevelopmentTypeValue'), 'Apartment')

//verify Property Area details are displayed as entered in previous screen
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage2/txt_PropertyArea'), 'Property Area')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage2/txt_PropertyAreaValue'), 'Prime')

//verify lease type details are displayed as entered in previous screen
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage2/txt_LeaseType'), 'Type of Lease')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage2/txt_LeaseTypeValue'), 'Freehold')

//verify property price details are displayed as entered in previous screen
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage2/txt_PropertyPrice'), 
    'Property Price')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage2/txt_PropertyPriceValue'),
	'RM 300,000.00')

//validate financing plan details
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/txt_FinancingDetails'), 'Financing Details')

// verify edit button is present
Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/PropertyDetailsPage2/txt_EditFinancingDetails'), 0)

// financing amount
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/txt_FinancingAmount'), 'Financing Amount')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/txt_FinancingAmountValue'), 'RM 250,000.00')

// financing period
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/txt_FinancingPeriod'), 'Financing Period')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/txt_FinancingPeriodValue'), '5 Years')

//validate financing plan details
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/txt_FinancingDetails'), 'Financing Details')

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.60, 0.30)

// validate financing plan details
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/txt_FinancingPlan'), 'Financing Plan')

//financng message diplay
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/txt_FinancingPlanMessageDisplay'), 'A recommended financing plan has been auto-selected for you.')

// choose financing type
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/txt_FinancingType'), 'Financing Type')

if (financingType.equalsIgnoreCase('Conventional Financing')){
	
	// select conventional financing financing type
	Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/rdo_ConventionalFinancing'), 0)
	
}
else if (financingType.equalsIgnoreCase('Islaminc Financing')) {
	
	// select islamin financing financing type
	Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/rdo_islamicFinancing'), 0)
	
}

Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/txt_FinancingPlan_text2'), 0)
//// ////////////////////////////////add code for financing type rdo button, financing plan dropdown and click next

Mobile.closeApplication()


