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

String propertyPurchsedFromDeveloper = GlobalVariable.propertyPurchsedFromDeveloper
String PropertyType = GlobalVariable.PropertyType
String financingType = GlobalVariable.financingType

CustomKeywords.'com.keywrods.ScrollAction.scroll'(0.70, 0.30)

// validate financing plan details
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/txt_FinancingPlan'), 'Financing Plan')

//financng message diplay
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/txt_FinancingPlanMessageDisplay'), 
    'A recommended financing plan has been auto-selected for you.')

// choose financing type
//Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/txt_FinancingType'), 'Financing Type')
if (financingType.equalsIgnoreCase('Conventional Financing')) {
    // select conventional financing financing type
    Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/rdo_ConventionalFinancing'), 0)

    Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/txt_FinancingPlan_text2'), 'Financing Plan')

    Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_PleaseSelect'), 10)

    CustomKeywords.'com.keywrods.DropDownValidation.drpDown_Invalidsearch'()

    Mobile.setText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/input_Search'), 'Maxi Home', 10)

    Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/drpDownOption_FinancingPlan', [('FinancingPlan') : 'Maxi Home']), 
        10 // select islamin financing financing type
        )
} else if (financingType.equalsIgnoreCase('Islamic Financing')) {
    Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/rdo_islamicFinancing'), 0)

    Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/txt_FinancingPlan_text2'), 'Financing Plan')

    Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_PleaseSelect'), 10)

    CustomKeywords.'com.keywrods.DropDownValidation.drpDown_Invalidsearch'()

    Mobile.setText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/input_Search'), 'Commodity Murabahah Financing-i', 
        10)

    Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/drpDownOption_FinancingPlan', [('FinancingPlan') : 'Commodity Murabahah Financing-i']), 
        10)
	
	CustomKeywords.'com.keywrods.ScrollAction.scroll'(0.30, 0.70)
	CustomKeywords.'com.keywrods.ScrollAction.scroll'(0.30, 0.70)
	
		Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/btn_Check Eligibility'), 0)
}


 if (propertyPurchsedFromDeveloper.equalsIgnoreCase('No') && PropertyType.equalsIgnoreCase('NonListedProperty')) {
	
    Mobile.tap(findTestObject('Tester01/CommonElements/btn_Next'), 0)
	
	//validate vendor details
    Mobile.verifyElementText(findTestObject('Tester01/PropertyDetailsPage3/txt_VendorDetails'), 'Vendor Details')

    Mobile.verifyElementText(findTestObject('Tester01/PropertyDetailsPage3/txt_AddVendor'), 'Add Vendor')

	// enter vendor name
    Mobile.verifyElementText(findTestObject('Tester01/PropertyDetailsPage3/txt_Name'), 'Name')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/input_VendorName'), GlobalVariable.VendorNameDefaultValue)
	
	Mobile.setText(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/input_VendorName'), GlobalVariable.VendorNameInputValue, 0)
	
	CustomKeywords.'com.keywrods.ScrollAction.scroll'(0.50, 0.30)
	
	//enter vendor ID Type
	Mobile.verifyElementText(findTestObject('Tester01/PropertyDetailsPage3/txt_IDType'), 'ID Type')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_PleaseSelect'), GlobalVariable.VendoeIDTypeDefaultvalue)
	
    Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_PleaseSelect'), 10)
	
	CustomKeywords.'com.keywrods.DropDownValidation.drpDown_Invalidsearch'()
		
	Mobile.setText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/input_Search'), GlobalVariable.VendorIDTypeInputValue , 10)
	
	Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/drpDown_Option', [('Variable') : GlobalVariable.VendorIDTypeInputValue]),
			10)
		
	//enter vendor id number
	Mobile.verifyElementText(findTestObject('Tester01/PropertyDetailsPage3/txt_IDNumber'), 'ID Number')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/input_IDNumber'), GlobalVariable.VendorIdNumberDefaultvalue)
	
	Mobile.setText(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/input_IDNumber'), GlobalVariable.VendorIDNumberInputValue, 0)

	//enter vendor alternate ID Type
	Mobile.verifyElementText(findTestObject('Tester01/PropertyDetailsPage3/txt_AlternateIDType'), 'Alternate ID Type (Optional)')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_PleaseSelect'), GlobalVariable.VendorAlternateIDTypeDefaultValue)
	
	Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_PleaseSelect'), 10)
	
	CustomKeywords.'com.keywrods.DropDownValidation.drpDown_Invalidsearch'()
		
	Mobile.setText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/input_Search'), GlobalVariable.VendorAlternateIDTypeInputValue , 10)
	
	Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/drpDown_Option', [('Variable') : GlobalVariable.VendorAlternateIDTypeInputValue]),
			10)
	
	//enter vendor alternate id number
	Mobile.verifyElementText(findTestObject('Tester01/PropertyDetailsPage3/txt_AlternateIDNumber'), 'Alternate ID Number')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/input_AlternateIDNumber'), GlobalVariable.VendorAlternateIDNumberDefaultValue)
	
	Mobile.setText(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/input_AlternateIDNumber'), GlobalVariable.VendorAlternateIDNumberInputValueValue, 0)

	Mobile.verifyElementExist('Object Repository/Tester1/PropertyDetailsPage3/btn_CheckVendorOCISS', 0)
		
	CustomKeywords.'com.keywrods.ScrollAction.scroll'(0.30, 0.70)
	CustomKeywords.'com.keywrods.ScrollAction.scroll'(0.30, 0.70)
	
	Mobile.tap('Object Repository/Tester1/PropertyDetailsPage3/btn_CheckVendorOCISS', 0)
	
}

Mobile.delay(5)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

