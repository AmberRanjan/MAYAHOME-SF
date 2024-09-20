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
import ch.qos.logback.core.joran.conditional.ElseAction as ElseAction
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

String PropertyType = GlobalVariable.PropertyType

String propertyPurchsedFromDeveloper = GlobalVariable.propertyPurchsedFromDeveloper

String propertyCompleted6MonthsAgo = GlobalVariable.propertyCompleted6MonthsAgo

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_Property Details'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/btn_Close'), 30)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)
//verify element text
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage2/txt_ApplicantEligiblity1'), 'Please fill up the following details to check your applicant’s eligibility', FailureHandling.CONTINUE_ON_FAILURE)

	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_Property Details'), 'Property Details', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_PropertyUnderConstruction'),
		'Is the property under construction?', FailureHandling.CONTINUE_ON_FAILURE)

	if (PropertyType.equalsIgnoreCase('ListedProperty')) {
		//enter property name and select desired proerty
		
	Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/rdo_PropertyUnderConstruction_Yes'), 10, FailureHandling.CONTINUE_ON_FAILURE)
	
		Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_Property Name'), 'Property Name', FailureHandling.CONTINUE_ON_FAILURE)
	
		Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/input_SearchforProperty'), 'Search for Property', FailureHandling.CONTINUE_ON_FAILURE)
		
		Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/input_SearchforProperty'), 10, FailureHandling.CONTINUE_ON_FAILURE)
	
		/*Mobile.setText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/input_SearchforProperty_NewPage'),'Invalid text search', 0, )
	
			Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_NoPropertyFound'),	'No Property Found', FailureHandling.CONTINUE_ON_FAILURE)
	
			Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/btn_CloseSearcforProperty'), 0)
			
				Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/input_SearchforProperty'), 10)*/
		
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
	
		Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage2/txt_RM'), 'RM 0.00', FailureHandling.CONTINUE_ON_FAILURE)
		
		Mobile.setText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/input_PropertyPrice'), GlobalVariable.PropertyPriceMinValue, 0)
		
		Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/btn_Next'), 0)
		
		Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_PropertyMinMaxErrorMessage'), 0)
		
		Mobile.takeScreenshot(FailureHandling.OPTIONAL)
		
		//validate the maximum amount shd not be graeter than loan amount
		Mobile.clearText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/input_PropertyPrice'), 0)
		
		Mobile.setText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/input_PropertyPrice'), GlobalVariable.PropertyPriceMaxValue, 0)
		
		Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/btn_Next'), 0)
				
		Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_PropertyMinMaxErrorMessage'), 0)
		
		Mobile.takeScreenshot(FailureHandling.OPTIONAL)
		
		Mobile.clearText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/input_PropertyPrice'), 0)
		
		Mobile.setText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/input_PropertyPrice'), GlobalVariable.PropertPriceInputText, 10)
	
		Mobile.takeScreenshot(FailureHandling.OPTIONAL)
		
		CustomKeywords.'com.keywords.ScrollAction.scroll'(0.30, 0.70)
		
		Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/btn_Next'), 10)
		
		// proceed to property details screen 2
		WebUI.callTestCase(findTestCase('Test Cases/Tester01/Pages/PropertyDetailsPage2/PropertyDetailsPage2_Listed'), [:], FailureHandling.CONTINUE_ON_FAILURE)

	WebUI.callTestCase(findTestCase('Test Cases/Tester01/Pages/PropertyDetailsPage3/PropertyDetailsPage3_Listed'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
} else if (PropertyType.equalsIgnoreCase('NonListedProperty')) {
    Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/rdo_PropertyUnderConstruction_No'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_PropertyPurchasedFromDeveloper'), 
        'Is the property purchased directly from a developer?', FailureHandling.CONTINUE_ON_FAILURE)

	// if property purchased from developer = yes
    if (propertyPurchsedFromDeveloper.equalsIgnoreCase('Yes')) {
        Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/rdo_PropertyPurchseFromDeveloper_Yes'), 
            0, FailureHandling.CONTINUE_ON_FAILURE)

        Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_PropertyCompleted 6MonthsAgo'), 
            'Was the property completed more than 6 months ago?', FailureHandling.CONTINUE_ON_FAILURE)

		// if property completed more than 6 months ago = yes
        if (propertyCompleted6MonthsAgo.equalsIgnoreCase('Yes')) {
            Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/rdo_PropertyCompleted6MonthsAgo_Yes'), 
                0, FailureHandling.CONTINUE_ON_FAILURE)
			
			// input unit details, storey details, city details, postcode details, development name, state, development type
			
            WebUI.callTestCase(findTestCase('Tester01/Pages/PropertyDetailsPage1/ReusuableMethods/NonlistedProperties'), [:], FailureHandling.CONTINUE_ON_FAILURE)
			
			WebUI.callTestCase(findTestCase('Tester01/Pages/PropertyDetailsPage2/PropertyDetailsPage2_NonListed'), [:], FailureHandling.CONTINUE_ON_FAILURE)
			
			WebUI.callTestCase(findTestCase('Tester01/Pages/PropertyDetailsPage3/PropertyDetailsPage3_NonListed'), [:], FailureHandling.CONTINUE_ON_FAILURE)
									
			// if property completed more than 6 months ago = No
        } else if (propertyCompleted6MonthsAgo.equalsIgnoreCase('No')) {
            Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/rdo_PropertyCompleted6MonthsAgo_No'), 
                0,FailureHandling.CONTINUE_ON_FAILURE)

			// input unit details, storey details, city details, postcode details, development name, state, development type
			
            WebUI.callTestCase(findTestCase('Tester01/Pages/PropertyDetailsPage1/ReusuableMethods/NonlistedProperties'), [:], FailureHandling.CONTINUE_ON_FAILURE)
			
			WebUI.callTestCase(findTestCase('Tester01/Pages/PropertyDetailsPage2/PropertyDetailsPage2_NonListed'), [:], FailureHandling.CONTINUE_ON_FAILURE)
			
			WebUI.callTestCase(findTestCase('Tester01/Pages/PropertyDetailsPage3/PropertyDetailsPage3_NonListed'), [:], FailureHandling.CONTINUE_ON_FAILURE)
						
			
        }
		//else if property under construction  = No
    } else if (propertyPurchsedFromDeveloper.equalsIgnoreCase('No')) {
        Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/rdo_PropertyPurchseFromDeveloper_No'), 
            0, FailureHandling.CONTINUE_ON_FAILURE)
		// input unit details, storey details, city details, postcode details, development name, state, development type
		
        WebUI.callTestCase(findTestCase('Tester01/Pages/PropertyDetailsPage1/ReusuableMethods/NonlistedProperties'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		
		WebUI.callTestCase(findTestCase('Tester01/Pages/PropertyDetailsPage2/PropertyDetailsPage2_NonListed'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
		WebUI.callTestCase(findTestCase('Tester01/Pages/PropertyDetailsPage3/PropertyDetailsPage3_NonListed'), [:], FailureHandling.CONTINUE_ON_FAILURE)
		
    }
}

