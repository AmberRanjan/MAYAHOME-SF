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

String Owner = GlobalVariable.Owner

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Data Entry']), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Step 1 of 6']), 'Step 1 of 6', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Main Chargor Details']), 'Main Chargor Details', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/DataEntry/btn_backDataEntry1'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/DataEntry/btn_ChatDataEntry1'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/DataEntry/btn_closeDataEntry1'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('Add additinal chargor details')

Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Add Additional Chargor']), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.comment('verify back button functionlaity')

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'To add additional chargor(s), please input their id number for us to check if their information is available in the system']),
	30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/DataEntry/btn_BackAdditionalChargor'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/DataEntry/btn_BackAdditionalChargor'), 30, FailureHandling.OPTIONAL)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Step 1 of 6']), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Add Additional Chargor']), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'To add additional chargor(s), please input their id number for us to check if their information is available in the system']),
	30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Additional Chargor']),
	'Additional Chargor', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'ID Type']), 'ID Type', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/input_ID Type'), 'New IC', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'ID Number']), 'ID Number', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('verify NTB chargor nric')

Mobile.setText(findTestObject('Object Repository/Tester01/DataEntry/input_IDNumber'), '930408146546', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/btn_Next'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/DataEntry/txt_NTBNric'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('verify Main or additinal chargor is not same as additional chargor')

if ((Owner.equalsIgnoreCase('Main Applicant, Joint Applicant and other person(s)')) || (Owner.equalsIgnoreCase('Joint Applicant and other person(s)')) ) {
	
Mobile.comment('verify mainapplicant is not the additional chargor')

Mobile.setText(findTestObject('Object Repository/Tester01/DataEntry/input_IDNumber'), GlobalVariable.ID_Number_MainApplicant, 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/btn_Next'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'This ID Number has been used for main applicant']),
	'This ID Number has been used for main applicant', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('verify joint applicant is not the additional chargor')

Mobile.setText(findTestObject('Object Repository/Tester01/DataEntry/input_IDNumber'), GlobalVariable.ID_Number_JointApplicant, 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/btn_Next'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'This ID Number has been used for joint applicant']),
	'This ID Number has been used for joint applicant', FailureHandling.CONTINUE_ON_FAILURE)

}else if (Owner.equalsIgnoreCase('Main Applicant and other person(s)')) {
	
Mobile.comment('verify mainapplicant is not the additional chargor')

Mobile.setText(findTestObject('Object Repository/Tester01/DataEntry/input_IDNumber'), GlobalVariable.ID_Number_MainApplicant, 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/btn_Next'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'This ID Number has been used for main applicant']),
	'This ID Number has been used for main applicant', FailureHandling.CONTINUE_ON_FAILURE)
}
Mobile.comment('Verify DRFT NRIC')
Mobile.setText(findTestObject('Object Repository/Tester01/DataEntry/input_IDNumber'), '820304086765', 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/btn_Next'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'We \'re unable to process applications that are not fully onboarded currently. Kindly complete customer onboarding in UCO.']),
	10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('Verify NO ACT NRIC')
Mobile.setText(findTestObject('Object Repository/Tester01/DataEntry/input_IDNumber'), '920326073791', 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/btn_Next'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'We \'re unable to process applications that are not fully onboarded currently. Kindly complete customer onboarding in UCO.']),
	10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('Verify NO FULL')
Mobile.setText(findTestObject('Object Repository/Tester01/DataEntry/input_IDNumber'), '860121012105', 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/btn_Next'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'We \'re unable to process applications that are not fully onboarded currently. Kindly complete customer onboarding in UCO.']),
	10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Tester01/DataEntry/input_IDNumber'), GlobalVariable.ChargorNric1, 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/btn_Next'), 30, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'To continue, please fill up the details below. If the chargor is an existing Maybank customer, their information will be pre-filled']),
	30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Additional Chargor Details']),
	'Additional Chargor Details', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('Add Additional chargor field validation')

WebUI.callTestCase(findTestCase('Test Cases/Tester01/SprintScripting/Sprint25A/SprintPages/DataEntryPage1/AddAdditionalChargorFieldValidation'), [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/btn_Next'), 30, FailureHandling.OPTIONAL)
Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/btn_Next'), 30, FailureHandling.OPTIONAL)

Mobile.comment('Add Additional chargor 1')

WebUI.callTestCase(findTestCase('Tester01/SprintScripting/Sprint25A/SprintPages/DataEntryPage1/AddAdditionalChargor1'), [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('Add Additional chargor 2')

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Step 1 of 6']),
	30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Add Additional Chargor']),
	30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Tester01/DataEntry/input_IDNumber'), GlobalVariable.ChargorNric1, 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/btn_Next'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'This ID number has been used for other additional chargors.']),
	30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Tester01/DataEntry/input_IDNumber'), GlobalVariable.ChargorNric2, 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/btn_Next'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('Tester01/SprintScripting/Sprint25A/SprintPages/DataEntryPage1/AddAdditionalChargor2'), [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('validate the data popupation for main chargor, joint chargor and additional chargors')

//validate the data popupation for main chargor, joint chargor and additional chargors
if (Owner.equalsIgnoreCase('Main Applicant, Joint Applicant and other person(s)')) {
	Mobile.takeScreenshot(FailureHandling.OPTIONAL)
	//verify main applicant chargor details
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Name']), 'Name', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_NameValue_MainApp'), GlobalVariable.CustomerName_MainApplicant, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'ID Type']), 'ID Type', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_IDTypeValue_MainApp'), GlobalVariable.ID_Type, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'ID Number']), 'ID Number', FailureHandling.CONTINUE_ON_FAILURE)
	
	String idNumber_Main = Mobile.getText(findTestObject('Object Repository/Tester01/DataEntry/txt_IDNumberValue_MainApp'), 30, FailureHandling.CONTINUE_ON_FAILURE).replace("-", "")
	
	Mobile.verifyMatch(GlobalVariable.ID_Number_MainApplicant, idNumber_Main, true, FailureHandling.CONTINUE_ON_FAILURE)
		
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'OCISS Status']), 'OCISS Status', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_OCISSValue_MainApp'), 'Normal', FailureHandling.CONTINUE_ON_FAILURE)
	
	//verify joint applicant chargor details
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_2', [('variable') : 'Name']), 'Name', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_NameValue_JointApp'), GlobalVariable.CustomerName_JointApplicant, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_2', [('variable') : 'ID Type']), 'ID Type', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_IDTypeValue_JointApp'), GlobalVariable.ID_Type, FailureHandling.CONTINUE_ON_FAILURE)
		
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_2', [('variable') : 'ID Number']), 'ID Number', FailureHandling.CONTINUE_ON_FAILURE)
	
	String idNumber_Joint = Mobile.getText(findTestObject('Object Repository/Tester01/DataEntry/txt_IDNumberValue_JointApp'), 30, FailureHandling.CONTINUE_ON_FAILURE).replace("-", "")
	
	Mobile.verifyMatch(GlobalVariable.ID_Number_JointApplicant, idNumber_Joint, true, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_2', [('variable') : 'OCISS Status']), 'OCISS Status', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_OCISSValue_JointApp'), 'Normal', FailureHandling.CONTINUE_ON_FAILURE)
	
	CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.45)
	
} else if (Owner.equalsIgnoreCase('Main Applicant and other person(s)')) {
	Mobile.takeScreenshot(FailureHandling.OPTIONAL)
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Name']), 'Name', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_NameValue_MainApp'), GlobalVariable.CustomerName_MainApplicant, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'ID Type']), 'ID Type', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_IDTypeValue_MainApp'), GlobalVariable.ID_Type, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'ID Number']), 'ID Number', FailureHandling.CONTINUE_ON_FAILURE)
	
	String idNumber_Main = Mobile.getText(findTestObject('Object Repository/Tester01/DataEntry/txt_IDNumberValue_MainApp'), 30, FailureHandling.CONTINUE_ON_FAILURE).replace("-", "")
	
	Mobile.verifyMatch(GlobalVariable.ID_Number_MainApplicant, idNumber_Main, true, FailureHandling.CONTINUE_ON_FAILURE)
		
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'OCISS Status']), 'OCISS Status', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_OCISSValue_MainApp'), 'Normal', FailureHandling.CONTINUE_ON_FAILURE)
	
	CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.55)
	
}else  if (Owner.equalsIgnoreCase('Joint Applicant and other person(s)')) {
	Mobile.takeScreenshot(FailureHandling.OPTIONAL)
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Name']), 'Name', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_NameValue_MainApp'), GlobalVariable.CustomerName_JointApplicant, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'ID Type']), 'ID Type', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_IDTypeValue_MainApp'), GlobalVariable.ID_Type, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'ID Number']), 'ID Number', FailureHandling.CONTINUE_ON_FAILURE)
	
	String idNumber_Joint = Mobile.getText(findTestObject('Object Repository/Tester01/DataEntry/txt_IDNumberValue_MainApp'), 30, FailureHandling.CONTINUE_ON_FAILURE).replace("-", "")
	
	Mobile.verifyMatch(GlobalVariable.ID_Number_JointApplicant, idNumber_Joint, true, FailureHandling.CONTINUE_ON_FAILURE)
		
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'OCISS Status']), 'OCISS Status', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_OCISSValue_MainApp'), 'Normal', FailureHandling.CONTINUE_ON_FAILURE)
	
	CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.55)
	
}

//Additinal chargor data verification
if(GlobalVariable.AdditionalChargor=='2') {
	
Mobile.comment('Verify Additionla chargor details 1')
Mobile.takeScreenshot(FailureHandling.OPTIONAL)
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Additional Chargor Details ']), 'Additional Chargor Details ', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Name']), 'Name', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_NameValue_MainApp'), GlobalVariable.ChargorName1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'ID Type']), 'ID Type', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_IDTypeValue_MainApp'), GlobalVariable.ID_Type, FailureHandling.CONTINUE_ON_FAILURE)

String idNumber1= Mobile.getText(findTestObject('Object Repository/Tester01/DataEntry/txt_IDValue'), 30, FailureHandling.CONTINUE_ON_FAILURE).replace("-", "")

Mobile.verifyMatch(GlobalVariable.ChargorNric1, idNumber1, true, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Alternate ID Type']), 'Alternate ID Type', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_AlternateIDTypeValue'), GlobalVariable.ChargorAlernateIDType1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Alternate ID Number']),
	'Alternate ID Number', FailureHandling.CONTINUE_ON_FAILURE)

String chargorAlternateID  =  Mobile.getText(findTestObject('Object Repository/Tester01/DataEntry/txt_AlternateIDValue'), 30, FailureHandling.CONTINUE_ON_FAILURE).replace("-", "")

Mobile.verifyMatch(chargorAlternateID, GlobalVariable.ChargorAlternativeIDNumber1, true, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Relationship with Main Chargor']),
	'Relationship with Main Chargor', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_RelationshipValue'), GlobalVariable.RelationshipwithChargor1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Existing Home Financing']),
	'Existing Home Financing', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_ExisitingHomeValue'),
	GlobalVariable.ExistingHomeFinancingChargor1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'OCISS Status']), 'OCISS Status', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'View OCISS Record']), 'View OCISS Record', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'View OCISS Record']), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : '[AMINAH BINTI AZALI - 900909025028]']), '[AMINAH BINTI AZALI - 900909025028]', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Value1 :  MEMBER’S VOLUNTARY']), 'Value1 :  MEMBER’S VOLUNTARY', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Close']), 30, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)

}

if(GlobalVariable.AdditionalChargor=='2' || GlobalVariable.AdditionalChargor=='1') {
	
Mobile.comment('Verify Additionla chargor details 2')
Mobile.takeScreenshot(FailureHandling.OPTIONAL)
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Additional Chargor Details (2)']), 'Additional Chargor Details (2)', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Name']), 'Name', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_NameValue_MainApp'), GlobalVariable.ChargorName2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'ID Type']), 'ID Type', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_IDTypeValue_MainApp'), GlobalVariable.ID_Type, FailureHandling.CONTINUE_ON_FAILURE)

String idNumber2 = Mobile.getText(findTestObject('Object Repository/Tester01/DataEntry/txt_IDValue'), 30, FailureHandling.CONTINUE_ON_FAILURE).replace("-", "")

Mobile.verifyMatch(GlobalVariable.ChargorNric2, idNumber2, true, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Alternate ID Type']), 'Alternate ID Type', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_AlternateIDTypeValue'), GlobalVariable.ChargorAlernateIDType2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Alternate ID Number']),
	'Alternate ID Number', FailureHandling.CONTINUE_ON_FAILURE)

String IdNumberAlternate2 = Mobile.getText(findTestObject('Object Repository/Tester01/DataEntry/txt_AlternateIDValue'), 30, FailureHandling.CONTINUE_ON_FAILURE).replace("-", "")

Mobile.verifyMatch(GlobalVariable.ChargorAlternativeIDNumber2, IdNumberAlternate2, true, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Relationship with Main Chargor']),
	'Relationship with Main Chargor', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_RelationshipValue'),
	GlobalVariable.RelationshipwithChargor2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Existing Home Financing']),
	'Existing Home Financing', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_ExisitingHomeValue'), GlobalVariable.ExistingHomeFinancingChargor2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'OCISS Status']), 'OCISS Status', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_OCISSValue_MainApp'), 'Normal', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Tester01/DataEntry/btn_ConfirmAndNext'), 0)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

}
