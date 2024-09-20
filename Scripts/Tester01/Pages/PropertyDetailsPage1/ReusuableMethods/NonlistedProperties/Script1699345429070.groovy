import internal.GlobalVariable as GlobalVariable
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
import org.openqa.selenium.Keys as Keys

String typeOflease = GlobalVariable.TypeOfLease
//input Lot No,unit no unit details
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_UnitDetails'), 'Lot No/Dev Lot No/Unit No/Dev Unit No', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/input_UnitDetails'), 'e.g. Lot 1234', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/input_UnitDetails'), GlobalVariable.UnitDetailsInputText,  0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

//swipe up the screen
CustomKeywords.'com.keywords.ScrollAction.scroll'(0.50, 0.20)

// input block storey details
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_blockStoreyDetails'), 'Jalan/Lorong/Block/Storey', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/input_blockStoreyDetails'), 'e.g. Jalan Tengah', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/input_blockStoreyDetails'), GlobalVariable.BlockStoreyDetailsInputText, 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)
//input development name
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_Development Name'), 'Development Name', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/input_DevelopmentName'), 'e.g Taman Tengah', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/input_DevelopmentName'), GlobalVariable.DevelopmentNameInputText, 
    0, FailureHandling.CONTINUE_ON_FAILURE)

//input city details
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_City'), 'City', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/input_City'), 'Enter City Name', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/input_City'), GlobalVariable.CityInputText, 
    0, FailureHandling.CONTINUE_ON_FAILURE)

// input postcode details
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_Postcode'), 'Postcode', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/input_Postcode'), 'Enter Postcode', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/input_Postcode'), GlobalVariable.PostCodeInputText, 
    0, FailureHandling.CONTINUE_ON_FAILURE)

//swipe up the screen
CustomKeywords.'com.keywords.ScrollAction.scroll'(0.50, 0.30)

// Select State
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_State'), 'State', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_PleaseSelect'), 'Please Select', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_PleaseSelect'), 10, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'com.keywords.DropDownValidation.drpDown_Invalidsearch'()

Mobile.setText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/input_Search'), GlobalVariable.StateInputText, 
    10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/drpDownOption_State', [('State') : GlobalVariable.StateInputText]), 
    10, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.takeScreenshot(FailureHandling.OPTIONAL)

//Development Type
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_DevelopmentType'), 'Development Type', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_PleaseSelect'), 'Please Select', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_PleaseSelect'), 10, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'com.keywords.DropDownValidation.drpDown_Invalidsearch'()
Mobile.setText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/input_Search'), GlobalVariable.DevelopmentTypeInputText, 
    10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/drpDownOption_DevelopmentType', [('DevelopmentType') : GlobalVariable.DevelopmentTypeInputText]), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

//swipe up the screen
CustomKeywords.'com.keywords.ScrollAction.scroll'(0.50, 0.30)

//Type of building
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_TypeofBuilding'), 'Type of Building', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_Residential'), 'Residential', FailureHandling.CONTINUE_ON_FAILURE)

//Stage of construction
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_StageofConstruction'), 'Stage of Construction', FailureHandling.CONTINUE_ON_FAILURE)


Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_CompletedwithCCC'), 'Completed with CCC', FailureHandling.CONTINUE_ON_FAILURE)

// Select Property Area
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_PropertyArea'), 'Property Area', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/rdo_PropertyArea', [('PropertyArea') : GlobalVariable.PropertyArea_rdo]), 0, FailureHandling.CONTINUE_ON_FAILURE)

//swipe up the screen
CustomKeywords.'com.keywords.ScrollAction.scroll'(0.50, 0.30)

// Select Type of Lease 
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage2/txt_LeaseType'), 'Type of Lease', FailureHandling.CONTINUE_ON_FAILURE)

if (typeOflease.equalsIgnoreCase('Freehold')) {
	
	Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/rdo_TypeOfLease', [('TypeOfLease') : GlobalVariable.TypeOfLease_rdo]), 0, FailureHandling.CONTINUE_ON_FAILURE)
	
}else if (typeOflease.equalsIgnoreCase('Leasehold')){
	
	Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/rdo_TypeOfLease', [('TypeOfLease') : GlobalVariable.TypeOfLease_rdo]), 0, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_LeaseholdExpiryDate'), 'Leasehold Expiry Date', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.setText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/input_LeaseExpiryDate'), GlobalVariable.LeaseHoldExpirydate, 0, FailureHandling.CONTINUE_ON_FAILURE)
	
}
  
//enter property price
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_PropertyPrice'), 'Property Price', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/input_PropertyPrice'), GlobalVariable.PropertyPriceMinValue, 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/btn_Next'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_PropertyMinMaxErrorMessageNonListed'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/input_PropertyPrice'), GlobalVariable.PropertPriceInputText, 10, FailureHandling.CONTINUE_ON_FAILURE)

//swipe up the screen
CustomKeywords.'com.keywords.ScrollAction.scroll'(0.30, 0.70)

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.30, 0.70)

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.30, 0.70)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/btn_Next'), 0, FailureHandling.CONTINUE_ON_FAILURE)
