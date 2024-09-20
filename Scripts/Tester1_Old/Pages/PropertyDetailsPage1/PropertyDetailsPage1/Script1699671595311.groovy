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
/*
Mobile.startExistingApplication('com.maybank2u.salesforce.uatent')

Mobile.delay(10)

Mobile.setText(findTestObject('Vasudha/LoginPage/LoginPage_textBox_PF Number'), '80008113', 0)

Mobile.setText(findTestObject('Vasudha/LoginPage/LoginPage_textBox_Password'), 'Tester1', 0)

Mobile.tap(findTestObject('Object Repository/Vasudha/LoginPage/LoginPage_button_Login'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Vasudha/HomePage/HomePage_text_Mortgage'), 'Mortgage')

Mobile.delay(25)
*/
//verify element text
Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/txt_Property Details'), 'Property Details')

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/txt_PropertyUnderConstruction'), 
    'Is the property under construction?')

//Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/txt_PropertyUnderConstruction'),
//	'Select "No" if it /'s a completed property')
//if property under construction  = yes

if (PropertyType.equalsIgnoreCase('Listed')) {
	//enter property name and select desired proerty
	Mobile.tap(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/rdo_PropertyUnderConstruction_Yes'), 10)

	Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/txt_Property Name'), 'Property Name')

	Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/input_SearchforProperty'), GlobalVariable.PropertyNameDefaultText)
	
	Mobile.tap(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/input_SearchforProperty'), 10)

	Mobile.setText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/input_SearchforProperty'),'Invalid text search', 0)

		Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/txt_NoPropertyFound'),	'No Property Found')

		Mobile.tap(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/btn_CloseSearcforProperty'), 0)
		
			Mobile.tap(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/input_SearchforProperty'), 10)
	
	Mobile.setText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/input_SearchforProperty_NewPage'), GlobalVariable.PropertyNameInputText,
		10)
	
	Mobile.tap(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/drpDownOption_PropertyName', [('PropertyName') : 'Eighty']),
		10)

	Mobile.delay(10)

	//enter unit type and select desired unit type
	Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/txt_UnitType'), 'Unit Type')

	Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/txt_PleaseSelect'), GlobalVariable.UnitTypeDefaultValue)

	Mobile.tap(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/txt_PleaseSelect'), 10)

	CustomKeywords.'com.keywrods.DropDownValidation.drpDown_Invalidsearch'()
	
	Mobile.setText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/input_Search'), GlobalVariable.UnitTypeInputText , 10)

	Mobile.tap(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/drpDownOption_UnitType', [('UnitNumber') : GlobalVariable.UnitTypeInputText]),
		10)

	// swipe up the screen
	CustomKeywords.'com.keywrods.ScrollAction.scroll'(0.70, 0.30)

	// enter unit number
	Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/txt_UnitNumber'), 'Unit Number')

	Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/input_UnitNumber'), GlobalVariable.UnitNumberDefaultvalue)

	Mobile.setText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/input_UnitNumber'), GlobalVariable.UnitNumberInputText, 10)

	//enter property price
	Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/txt_PropertyPrice'), 'Property Price')

	Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage2/txt_RM'), 'RM')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/input_PropertyPrice'), GlobalVariable.PropertyPriceDefaultValue)

	Mobile.setText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/input_PropertyPrice'), GlobalVariable.PropertPriceInputText, 10)

	CustomKeywords.'com.keywrods.ScrollAction.scroll'(0.30, 0.70)
	
	Mobile.tap(findTestObject('Object Repository/Tester1_old/CommonElements/btn_Next'), 10)
	
	Mobile.delay(5)
	// proceed to property details screen 2
	WebUI.callTestCase(findTestCase('Test Cases/Tester1_Old/Pages/PropertyDetailsPage2/PropertyDetailsPage2_Listed'), [:], FailureHandling.STOP_ON_FAILURE)

	WebUI.callTestCase(findTestCase('Test Cases/Tester1_Old/Pages/PropertyDetailsPage3/PropertyDetailsPage3_Listed'), [:], FailureHandling.STOP_ON_FAILURE)
	
} else if (PropertyType.equalsIgnoreCase('NonListed')) {
    Mobile.tap(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/rdo_PropertyUnderConstruction_No'), 0)

    Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/txt_PropertyPurchasedFromDeveloper'), 
        'Is the property purchased directly from a developer?')

	// if property purchased from developer = yes
    if (propertyPurchsedFromDeveloper.equalsIgnoreCase('Yes')) {
        Mobile.tap(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/rdo_PropertyPurchseFromDeveloper_Yes'), 
            0)

        Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/txt_PropertyCompleted 6MonthsAgo'), 
            'Was the property completed more than 6 months ago?')

		// if property completed more than 6 months ago = yes
        if (propertyCompleted6MonthsAgo.equalsIgnoreCase('Yes')) {
            Mobile.tap(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/rdo_PropertyCompleted6MonthsAgo_Yes'), 
                0)
			
			// input unit details, storey details, city details, postcode details, development name, state, development type
			
            WebUI.callTestCase(findTestCase('Tester1_Old/Pages/PropertyDetailsPage1/ReusuableMethods/NonlistedProperties'), [:], FailureHandling.STOP_ON_FAILURE)
			
			WebUI.callTestCase(findTestCase('Tester1_Old/Pages/PropertyDetailsPage2/PropertyDetailsPage2_NonListed'), [:], FailureHandling.STOP_ON_FAILURE)
			
			WebUI.callTestCase(findTestCase('Tester1_Old/Pages/PropertyDetailsPage3/PropertyDetailsPage3_NonListed'), [:], FailureHandling.STOP_ON_FAILURE)
									
			// if property completed more than 6 months ago = No
        } else if (propertyCompleted6MonthsAgo.equalsIgnoreCase('No')) {
            Mobile.tap(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/rdo_PropertyCompleted6MonthsAgo_No'), 
                0)

			// input unit details, storey details, city details, postcode details, development name, state, development type
			
            WebUI.callTestCase(findTestCase('Tester1_Old/Pages/PropertyDetailsPage1/ReusuableMethods/NonlistedProperties'), [:], FailureHandling.STOP_ON_FAILURE)
			
			WebUI.callTestCase(findTestCase('Tester1_Old/Pages/PropertyDetailsPage2/PropertyDetailsPage2_NonListed'), [:], FailureHandling.STOP_ON_FAILURE)
			
			WebUI.callTestCase(findTestCase('Tester1_Old/Pages/PropertyDetailsPage3/PropertyDetailsPage3_NonListed'), [:], FailureHandling.STOP_ON_FAILURE)
						
			
        }
		//else if property under construction  = No
    } else if (propertyPurchsedFromDeveloper.equalsIgnoreCase('No')) {
        Mobile.tap(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/rdo_PropertyPurchseFromDeveloper_No'), 
            0)
		// input unit details, storey details, city details, postcode details, development name, state, development type
		
        WebUI.callTestCase(findTestCase('Tester1_Old/Pages/PropertyDetailsPage1/ReusuableMethods/NonlistedProperties'), [:], FailureHandling.STOP_ON_FAILURE)
		
		WebUI.callTestCase(findTestCase('Tester1_Old/Pages/PropertyDetailsPage2/PropertyDetailsPage2_NonListed'), [:], FailureHandling.STOP_ON_FAILURE)
	
		WebUI.callTestCase(findTestCase('Tester1_Old/Pages/PropertyDetailsPage3/PropertyDetailsPage3_NonListed'), [:], FailureHandling.STOP_ON_FAILURE)
		
    }
}

