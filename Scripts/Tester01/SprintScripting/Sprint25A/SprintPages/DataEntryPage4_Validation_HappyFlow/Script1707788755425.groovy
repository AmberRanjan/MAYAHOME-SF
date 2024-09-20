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

import ch.qos.logback.core.joran.conditional.ElseAction
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.text.DecimalFormat
import java.io.*;


Mobile.swipe(300,300,300,900)

if (((GlobalVariable.Owner == 'Main Applicant, Joint Applicant and other person(s)') || (GlobalVariable.Owner == 'Main Applicant and other person(s)')) ||
(GlobalVariable.Owner == 'Joint Applicant and other person(s)')) {
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1',[('variable') : 'Step 4 of 6']),
		'Step 4 of 6', FailureHandling.CONTINUE_ON_FAILURE)

}else {
	
		Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1',[('variable') : 'Step 3 of 5']),
		'Step 3 of 5', FailureHandling.CONTINUE_ON_FAILURE)
	}

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_text_Loan Amount Details'),
	'Loan Amount Details', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_text_Property Price'),
	'Property Price', FailureHandling.CONTINUE_ON_FAILURE)

String propertyPrice = 'RM ' + GlobalVariable.PropertPriceInputText
Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_text_Property Price_Result'), propertyPrice, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_text_Total Approved Amount'),
	'Total Approved Amount', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_text_Other Related Expenses'),
	'Other Related Expenses', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_text_Property Loan'),
	'Property Loan', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_text_Total Approved Amount_Result'),30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_text_Other Related Expenses_Result'),
	0, FailureHandling.CONTINUE_ON_FAILURE)

String propertyLoanAmountS = Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_text_Property Loan_Result'),
	0, FailureHandling.CONTINUE_ON_FAILURE)

propertyLoanAmountS = propertyLoanAmountS.substring(3)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_text_Property Loan_Max'),
	'Property Loan')

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

String maxLoanAmountAllowedS = Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_text_Property Loan_Max_Result'),
	0).substring(8).replace(",", "").replace(")", "")
	
Mobile.comment('set the max loan amount value to validate in the case detail page retaing the comma in the value')
String maxLoanAmountAllowedGlobalS = Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_text_Property Loan_Max_Result'),  0).substring(6).replace(")", "")
	
	Mobile.comment(maxLoanAmountAllowedGlobalS)
	
GlobalVariable.FinancingAmountApplicantionEligiblityPage = maxLoanAmountAllowedGlobalS
	
Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_text_Property Loan_Input'),
	'Property Loan')

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_text_Other Related Expenses_Max'),
	'Other Related Expenses')

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_text_Other Related Expenses_Max_Result'),
	0)


Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_text_Legal Fees'),
	'Legal Fees')

Mobile.setText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_textBox_Legal Fees'),
	GlobalVariable.DE3_LegalFee_Input, 0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_text_Note'),
	'Note: We will calculate the life insurance premium as part of the other related expenses in the next step')
'if the owner is not others'

Mobile.takeScreenshot(FailureHandling.OPTIONAL)
//commented after the change in sprint 25 B for upgrading loan and renovationloan
/*if (((GlobalVariable.Owner == 'Main Applicant, Joint Applicant and other person(s)') || (GlobalVariable.Owner == 'Main Applicant and other person(s)')) ||
(GlobalVariable.Owner == 'Joint Applicant and other person(s)')) {*/
float maxLoanAmountAllowed = Float.parseFloat(maxLoanAmountAllowedS);

/*float propertyLoanAmount = Float.parseFloat(propertyLoanAmountS.replace(",", ""));
float difference = propertyLoanAmount - maxLoanAmountAllowed

float
if (difference != 0.0) {
	Mobile.setText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_textBox_Property Loan_Input'),  propertyLoanAmountS, 0)
	
	Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_button_SaveAndNext'),
		0)
	Mobile.takeScreenshot(FailureHandling.OPTIONAL)
	
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_text_Value cannot exceed the limit'),
		'Value cannot exceed the limit', FailureHandling.CONTINUE_ON_FAILURE)
	
} */

//def formatr = new DecimalFormat('0.00');
maxLoanAmountAllowed = maxLoanAmountAllowed+1.00

String maxLoanAmountAllowedPlus1 = Float.toString(maxLoanAmountAllowed)
Mobile.comment('verify maxloanapproved+1 triggers error message')
Mobile.setText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_textBox_Property Loan_Input'),  maxLoanAmountAllowedPlus1, 0)
Mobile.takeScreenshot(FailureHandling.OPTIONAL)
Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_button_SaveAndNext'),
	0, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_button_SaveAndNext'),
	0, FailureHandling.OPTIONAL)
Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_text_Value cannot exceed the limit'),
	'Value cannot exceed the limit')
Mobile.comment('verify maxloanapproved +upgradinglan(10,000.00) more than max amount allowed  triggers error message')

Mobile.setText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_textBox_Property Loan_Input'),  maxLoanAmountAllowedS, 0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_Upgrading Loan'), 'Upgrading Loan', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Tester01/DataEntry/input_UpgradingLoan'),  '10000.00', 0, FailureHandling.CONTINUE_ON_FAILURE)

GlobalVariable.UpgradingLoanValue = 'RM 10000.00'

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_button_SaveAndNext'), 0, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_button_SaveAndNext'), 0, FailureHandling.OPTIONAL)
Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_text_Value cannot exceed the limit'),
	'Value cannot exceed the limit')

maxLoanAmountAllowed = maxLoanAmountAllowed-10001.0

maxLoanAmountAllowedS = maxLoanAmountAllowed.toString()
Mobile.comment('Minus 10,000 from maxloan allowed, should be able to save successfully')

Mobile.setText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_textBox_Property Loan_Input'),  maxLoanAmountAllowedS, 0)
GlobalVariable.PropertyLoanValue = 'RM '+maxLoanAmountAllowedS
//}

if (GlobalVariable.FinancingPlan == 'SJKP Madani-i' || GlobalVariable.FinancingPlan == 'SJKP Madani') {
	
	String maxRenovationLoanAmountAllowedS = Mobile.getText(findTestObject('Object Repository/Tester01/DataEntry/txt_MaxRenovationLoan'), 0).substring(9).replace(")", "").replace(",", "")
		Mobile.comment('maxRenovationLoanAmountAllowedS = '+maxRenovationLoanAmountAllowedS)
		float maxRenovationLoanAmountAllowed = Float.parseFloat(maxRenovationLoanAmountAllowedS);
		
		float maxRenovationLoanAmountAllowedPlus1 = maxRenovationLoanAmountAllowed+1.00
		float maxRenovationLoanAmountAllowedMinus10k= maxRenovationLoanAmountAllowed-10000.00
		String maxRenovationLoanAmountAllowedPlus1S = maxRenovationLoanAmountAllowedPlus1.toString();
		String maxRenovationLoanAmountAllowedMinusk10S =maxRenovationLoanAmountAllowedMinus10k.toString();
		Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_Renovation Loan'), 'Renovation Loan', FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.setText(findTestObject('Object Repository/Tester01/DataEntry/input_RenovationLoan'),  maxRenovationLoanAmountAllowedPlus1S, 0, FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_button_SaveAndNext'), 0, FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_text_Value cannot exceed the limit'),
			'Value cannot exceed the limit')
		Mobile.takeScreenshot(FailureHandling.OPTIONAL)
		
		Mobile.setText(findTestObject('Object Repository/Tester01/DataEntry/input_RenovationLoan'),  maxRenovationLoanAmountAllowedS, 0, FailureHandling.CONTINUE_ON_FAILURE)
		
		Mobile.delay(3);
		
		Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_button_SaveAndNext'),
			0, FailureHandling.CONTINUE_ON_FAILURE)
		
		Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_20PercentMaxRenovationLoan'), 'Renovation Loan and Other Related Expenses combined cannot exceed 20% of the property price.', FailureHandling.CONTINUE_ON_FAILURE)
		
		Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_button_SaveAndNext'),
			0, FailureHandling.OPTIONAL)
		
		Mobile.setText(findTestObject('Object Repository/Tester01/DataEntry/input_RenovationLoan'),  maxRenovationLoanAmountAllowedMinusk10S, 0, FailureHandling.CONTINUE_ON_FAILURE)
		GlobalVariable.RenovationLoanValue = maxRenovationLoanAmountAllowedMinusk10S
}else {
	Mobile.verifyElementNotVisible(findTestObject('Object Repository/Tester01/DataEntry/txt_Renovation Loan'), 5, FailureHandling.CONTINUE_ON_FAILURE)
	
}

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_button_SaveAndNext'),
	0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_button_SaveAndNext'),
	0, FailureHandling.OPTIONAL)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)


