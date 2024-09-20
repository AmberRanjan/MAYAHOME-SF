import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
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

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/PropertyValuer/txt_Property Valuation'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/PropertyValuer/txt_Property Valuation'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyValuer/txt_Step 2 of 4'), 'Step 2 of 4', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyValuer/txt_Recommended Valuers'), 'Recommended Valuers', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyValuer/txt_RecomededValuersDescription'), 'Please select the valuer(s) you wish to request the property market price from.', FailureHandling.CONTINUE_ON_FAILURE)

/*Mobile.tap(findTestObject('Object Repository/Tester01/PropertyValuer/txt_Valuer1'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/PropertyValuer/txt_Valuer2'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/PropertyValuer/txt_Valuer3'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/PropertyValuer/txt_Valuer4'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/PropertyValuer/txt_Valuer5'), 0, FailureHandling.CONTINUE_ON_FAILURE)*/

Mobile.tap(findTestObject('Object Repository/Tester01/PropertyValuer/chkBox_Valuer1'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/PropertyValuer/chkBox_Valuer2'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/PropertyValuer/chkBox_Valuer3'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/PropertyValuer/chkBox_Valuer4'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/PropertyValuer/chkBox_Valuer5'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyValuer/txt_Maximum valuer Error Message'), 
	'Reached maximum number of selections. Please deselect one valuer to keep selecting.', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/PropertyValuer/chkBox_Valuer3UnCheck'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/PropertyValuer/chkBox_Valuer4UnCheck'), 0, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'com.keywords.ScrollAction.scrollUntillText'(0.60, 0.30, 'Object Repository/Tester01/PropertyValuer/txt_Confirm')

Mobile.tap(findTestObject('Object Repository/Tester01/PropertyValuer/btn_Request for Exception'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyValuer/txt_Exception Details'), 'Exception Details', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyValuer/txt_ExceptionDetailsDescription'), 'Please give a reason for exception. Some reasons might need approval from your manager.', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyValuer/txt_Panel Valuer'), 'Panel Valuer', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/PropertyValuer/drpDown_Panel Valuer'), 0, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'methods_Tester02.dropdown_Search.dropDown_Search'(GlobalVariable.PlanerValuerSearchText, GlobalVariable.PlanerValuerSelectText)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyValuer/txt_Reason for Exception'), 'Reason for Exception', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/PropertyValuer/drpDown_Reason for Exception'), 0, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'methods_Tester02.dropdown_Search.dropDown_Search'('Customer Request')

Mobile.tap(findTestObject('Object Repository/Tester01/PropertyValuer/txt_Confirm'), 0, FailureHandling.CONTINUE_ON_FAILURE)

//////////////////////////////

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/PropertyValuer/txt_Property Valuation'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/PropertyValuer/txt_Property Valuation'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyValuer/txt_Step 3 of 4'), 'Step 3 of 4', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyValuer/txt_PropertyValuationDescriotion'), 'Before we proceed, please fill in the property’s details for the valuer to quote its market value.', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyValuer/txt_Property Details'), 'Property Details', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyValuer/txt_Built Up Area'), 'Built Up Area', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Tester01/PropertyValuer/input_Enter built up area'), GlobalVariable.BuiltupArea, 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyValuer/txt_Land Area'), 'Land Area', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Tester01/PropertyValuer/input_Enter land area'), GlobalVariable.LandArea, 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyValuer/txt_Renovation'), 'Renovation', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/PropertyValuer/rdo_RenovationYes'), 0, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.60, 0.30)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyValuer/txt_Renovation with Approval Authority'),  'Renovation with Approval Authority', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/PropertyValuer/rdo_RenovationApprovaNo'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyValuer/txt_Property Type'), 'Property Type', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyValuer/txt_Land  Building'), 'Land Only', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyValuer/txt_Land Use Category'), 'Land Use Category', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyValuer/txt_Residential'), 'Residential', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyValuer/txt_Type of Building'), 'Type of Building', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/PropertyValuer/drpDown_Type of Building'), 0, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'methods_Tester02.dropdown_Search.dropDown_Search'(GlobalVariable.TypeofBuilding)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyValuer/txt_Unit Type'), 'Layout Type', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/PropertyValuer/drpDown_Unit Type'), 0, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'methods_Tester02.dropdown_Search.dropDown_Search'('End Lot')

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.60, 0.30)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyValuer/txt_Purchase PriceOMV'), 'Purchase Price/OMV', FailureHandling.CONTINUE_ON_FAILURE)

String propertyPrice = 'RM '+GlobalVariable.PropertPriceInputText

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyValuer/input_PurchasePrice'), propertyPrice, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyValuer/txt_No. Of FloorStoreyLevel'), 'No. Of Floor/Storey/Level', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/PropertyValuer/drpDown_No. Of FloorStoreyLevel'), 0, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'methods_Tester02.dropdown_Search.dropDown_Search'(GlobalVariable.FLoorOrStorey)

Mobile.tap(findTestObject('Object Repository/Tester01/PropertyValuer/btn_Next'), 0, FailureHandling.CONTINUE_ON_FAILURE)

///////////////////

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/PropertyValuer/txt_Property Details Sent to Valuer'),
	30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyValuer/txt_Property Details Sent to Valuer Description'),
	'Once you have received the verbal valuation, you may proceed to select your preferred valuer', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/PropertyValuer/btn_Continue'), 0, FailureHandling.CONTINUE_ON_FAILURE)

///////////////
Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/PropertyValuer/txt_Property Valuation'),
	30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/PropertyValuer/txt_Property Valuation'),
	30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyValuer/txt_Step 4 of 4'), 'Step 4 of 4', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyValuer/txt_Select a Preferred Valuer'), 'Select a Preferred Valuer', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyValuer/txt_Select a Preferred Valuer Description'),
	'Please select a prefered valuer and fill in their details.', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/PropertyValuer/rdo_SelectValuer'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyValuer/txt_Valuer Contact Person'), 'Valuer Contact Person', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Tester01/PropertyValuer/txt_Contact Name'), GlobalVariable.ValuerContact, 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyValuer/txt_Market Value'), 'Market Value', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Tester01/PropertyValuer/input_Market Value'), GlobalVariable.MarkketValue, 0, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'com.keywords.ScrollAction.scrollUntillText'(0.60, 0.30, 'Object Repository/Tester01/PropertyValuer/txt_Confirm')

Mobile.tap(findTestObject('Object Repository/Tester01/PropertyValuer/btn_Confirm'), 0, FailureHandling.CONTINUE_ON_FAILURE)

//Check if market value is < than property value, if so then a new screen is to be validated and then select reselct valuer proceed the propert valuation process
String MarketValues = GlobalVariable.MarkketValue

Float MarketValuei = Float.parseFloat(MarketValues.replace(",", ""))

String PropertPriceInputText = GlobalVariable.PropertPriceInputText
Float PropertPriceInputTexti = Float.parseFloat(PropertPriceInputText.replace(",", ""))

if (MarketValuei < PropertPriceInputTexti) {

	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyValuer/txt_Valuation Lower Than Expected'),
		'Valuation Lower Than Expected', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyValuer/txt_ValueLowerDescription'),
		'Here’s what we can offer instead. Not satisfied?0', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.tap(findTestObject('Object Repository/Tester01/PropertyValuer/txt_ReselectValuer'), 0, FailureHandling.CONTINUE_ON_FAILURE)
	
	CustomKeywords.'com.keywords.ScrollAction.scroll'(0.30, 0.60)
	
   Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyValuer/txt_Step 2 of 4'), 'Step 2 of 4', FailureHandling.CONTINUE_ON_FAILURE)
	 
   Mobile.tap(findTestObject('Object Repository/Tester01/PropertyValuer/chkBox_Valuer1'), 0, FailureHandling.CONTINUE_ON_FAILURE)
   
    CustomKeywords.'com.keywords.ScrollAction.scrollUntillText'(0.60, 0.30, 'Object Repository/Tester01/PropertyValuer/txt_Confirm')
	
	Mobile.tap(findTestObject('Object Repository/Tester01/PropertyValuer/txt_Confirm'), 0, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyValuer/txt_Step 3 of 4'), 'Step 3 of 4', FailureHandling.CONTINUE_ON_FAILURE)

	CustomKeywords.'com.keywords.ScrollAction.scrollUntillText'(0.60, 0.30, 'Object Repository/Tester01/PropertyValuer/btn_Next')
	
    Mobile.tap(findTestObject('Object Repository/Tester01/PropertyValuer/btn_Next'), 0, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyValuer/txt_Step 4 of 4'), 'Step 4 of 4', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.tap(findTestObject('Object Repository/Tester01/PropertyValuer/btn_Confirm'), 0, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyValuer/txt_Proceed in WoLOC'),
		'Proceed in WoLOC', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyValuer/txt_ProceedInWolocPropertyvaluationDescription'),
		'You will need to select a valuer again from the MAE Intray if you choose to proceed.', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyValuer/btn_Proceed'),'Proceed', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.tap(findTestObject('Object Repository/Tester01/PropertyValuer/btn_Proceed With This Offer'),  0, FailureHandling.CONTINUE_ON_FAILURE)
		
}

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/PropertyValuer/txt_erbal Valuation Complete'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/PropertyValuer/txt_erbal Valuation Complete'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyValuer/txt_You may proceed with data entry'), 'You may proceed with data entry', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/PropertyValuer/btn_Continue'), 0, FailureHandling.CONTINUE_ON_FAILURE)

