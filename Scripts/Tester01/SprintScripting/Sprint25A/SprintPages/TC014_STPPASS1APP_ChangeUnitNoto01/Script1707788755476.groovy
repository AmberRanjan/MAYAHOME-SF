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

//Mobile.startExistingApplication('com.maybank2u.salesforce.uatent')

WebUI.callTestCase(findTestCase('Tester01/SprintScripting/Sprint25A/SprintPages/COBSingleApplicantHappyFlow'), [:], FailureHandling.STOP_ON_FAILURE)

String PropertyType = GlobalVariable.PropertyType

String propertyPurchsedFromDeveloper = GlobalVariable.propertyPurchsedFromDeveloper

String propertyCompleted6MonthsAgo = GlobalVariable.propertyCompleted6MonthsAgo

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_Property Details'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/btn_Close'), 30)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)
//verify element text
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage2/txt_ApplicantEligiblity1'), 'Please fill up the following details to check', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage2/txt_ApplicantEligiblity2'), 'your applicant\'s eligibility')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_Property Details'), 'Property Details')
	
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_PropertyUnderConstruction'),
		'Is the property under construction?')
	
	//Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_PropertyUnderConstruction'),
	//	'Select "No" if it /'s a completed property')
	//if property under construction  = yes
	
	if (PropertyType.equalsIgnoreCase('ListedProperty')) {
		//enter property name and select desired proerty
		
	Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/rdo_PropertyUnderConstruction_Yes'), 10)
	
		Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_Property Name'), 'Property Name')
	
		Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/input_SearchforProperty'), 'Search for Property')
		
		Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/input_SearchforProperty'), 10)
	
		Mobile.setText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/input_SearchforProperty_NewPage'),'Invalid text search', 0)
	
			Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_NoPropertyFound'),	'No Property Found')
	
			Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/btn_CloseSearcforProperty'), 0)
			
				Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/input_SearchforProperty'), 10)
		
		Mobile.setText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/input_SearchforProperty_NewPage'), GlobalVariable.PropertyNameInputText,
			10)
		
		Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/drpDownOption_PropertyName', [('PropertyName') : GlobalVariable.PropertyNameInputText]),
			10)
		
		//enter unit type and select desired unit type
		Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_UnitType'), 'Unit Type')
	
		Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_PleaseSelect'), 'Please Select')
	
		Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_PleaseSelect'), 10)
	
		CustomKeywords.'com.keywords.DropDownValidation.drpDown_Invalidsearch'()
		
		Mobile.setText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/input_Search'), GlobalVariable.UnitTypeInputText , 10)
	
		Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/drpDownOption_UnitType', [('UnitNumber') : GlobalVariable.UnitTypeInputText]),
			10)
	
		Mobile.takeScreenshot(FailureHandling.OPTIONAL)
		// swipe up the screen
		CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)
	
		// enter unit number
		Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_UnitNumber'), 'Unit Number')
	
		Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/input_UnitNumber'), 'Enter Unit Number')
	
		Mobile.setText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/input_UnitNumber'), GlobalVariable.UnitNumberInputText, 10)
	
		//enter property price
		Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_PropertyPrice'), 'Property Price')
	
		Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage2/txt_RM'), 'RM')
		
		Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/input_PropertyPrice'), '0.00')
		
		Mobile.setText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/input_PropertyPrice'), GlobalVariable.PropertPriceInputText, 0)
		
		Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/btn_Next'), 0) 
		
		Mobile.takeScreenshot(FailureHandling.OPTIONAL)
		
		Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Looks like this unit has already been booked. Please pick another unit.']), 'Looks like this unit has already been booked. Please pick another unit.', FailureHandling.CONTINUE_ON_FAILURE)
		
		Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/btn_Next'), 0)
		
		Mobile.takeScreenshot(FailureHandling.OPTIONAL)
				
	}