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

Mobile.comment('verify and add additinal chargor details')

//Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Additional Chargor Details']), 30, FailureHandling.STOP_ON_FAILURE)
Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Name']),
	'Name', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/input_Name'), GlobalVariable.ChargorName1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'ID Type']),
	'ID Type', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/input_ID Type'), 'New IC', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'ID Number']),
	'ID Number', FailureHandling.CONTINUE_ON_FAILURE)

String chargorNric1 = Mobile.getText(findTestObject('Object Repository/Tester01/DataEntry/input_IDNumber'), 30, FailureHandling.CONTINUE_ON_FAILURE).replace("-", "")

Mobile.verifyMatch(chargorNric1, GlobalVariable.ChargorNric1, true, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Alternate ID Type (Optional)']),
	'Alternate ID Type (Optional)', FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.50)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/input_AlternateIDType'), GlobalVariable.ChargorAlernateIDType1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Alternate ID Number']),
	'Alternate ID Number', FailureHandling.CONTINUE_ON_FAILURE)

String chargorAlternateID  =  Mobile.getText(findTestObject('Object Repository/Tester01/DataEntry/input_AlternateIDNumber'), 30, FailureHandling.CONTINUE_ON_FAILURE).replace("-", "")

Mobile.verifyMatch(chargorAlternateID, GlobalVariable.ChargorAlternativeIDNumber1, true, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Relationship with Main Chargor']),
	'Relationship with Main Chargor', FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'com.keywords.DropDownValidation.drpDown_TextSearch'('Object Repository/Tester01/DataEntry/drpDown_Relationship', 'Please Select', GlobalVariable.RelationshipwithChargor1)
	
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Existing Home Financing']),
	'Existing Home Financing', FailureHandling.CONTINUE_ON_FAILURE)

String ExistingHomeFinancingChargor1 = GlobalVariable.ExistingHomeFinancingChargor1

CustomKeywords.'com.keywords.DropDownValidation.drpDown_TextSearch'('Object Repository/Tester01/DataEntry/drpdown_ExisitingHome', 'Please Select', GlobalVariable.ExistingHomeFinancingChargor1)

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.50)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Country Code']),
	'Country Code', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Phone Number']),
	'Phone Number', FailureHandling.CONTINUE_ON_FAILURE)

String tempText = Mobile.getText(findTestObject('Object Repository/Tester01/DataEntry/input_PhoneNumber'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Tester01/DataEntry/input_PhoneNumber'), tempText, 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Correspondence Address Country']),
	'Correspondence Address Country', FailureHandling.CONTINUE_ON_FAILURE)

tempText = Mobile.getText(findTestObject('Object Repository/Tester01/DataEntry/input_CorrespondenceCountry'), 30, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'com.keywords.DropDownValidation.drpDown_TextSearch'('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', tempText, tempText)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Correspondence Address Line 1']),
	'Correspondence Address Line 1', FailureHandling.CONTINUE_ON_FAILURE)

tempText = Mobile.getText(findTestObject('Object Repository/Tester01/DataEntry/input_CorrespondenceAddress1'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Tester01/DataEntry/input_CorrespondenceAddress1'), tempText, 30, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.50)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Correspondence Address Line 2']),
	'Correspondence Address Line 2', FailureHandling.CONTINUE_ON_FAILURE)

tempText = Mobile.getText(findTestObject('Object Repository/Tester01/DataEntry/input_CorrespondenceAddress2'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Tester01/DataEntry/input_CorrespondenceAddress2'), tempText, 30, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'City']),
	'City', FailureHandling.CONTINUE_ON_FAILURE)

tempText = Mobile.getText(findTestObject('Object Repository/Tester01/DataEntry/input_City'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Tester01/DataEntry/input_City'), tempText, 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Postcode']),
	'Postcode', FailureHandling.CONTINUE_ON_FAILURE)

tempText = Mobile.getText(findTestObject('Object Repository/Tester01/DataEntry/input_Postcode'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Tester01/DataEntry/input_Postcode'), '58000', 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'State']),
	'State', FailureHandling.CONTINUE_ON_FAILURE)

tempText = Mobile.getText(findTestObject('Object Repository/Tester01/DataEntry/input_State'), 30, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'com.keywords.DropDownValidation.drpDown_TextSearch'('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', tempText, 'WP KUALA LUMPUR')

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/btn_Next'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)
