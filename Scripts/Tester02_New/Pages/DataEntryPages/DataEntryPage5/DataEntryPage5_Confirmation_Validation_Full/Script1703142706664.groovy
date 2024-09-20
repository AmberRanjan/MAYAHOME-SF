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

Mobile.swipe(300, 300, 300, 900)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirm_text_Quick Quotation Results'),
		0)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirm_linkText_Regenerate'),
		0)

Mobile.callTestCase(findTestCase('Tester02_New/Pages/DataEntryPages/DataEntryPage5/DataEntryPage5_Validation_Full'), [:],
FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_text_Calculate Life Insurance'),
		0, FailureHandling.OPTIONAL)

Mobile.swipe(300, 300, 300, 900)

if (((GlobalVariable.Applicants_No == '1') && (GlobalVariable.DE4_PolicyType == 'Single Policy')) || ((GlobalVariable.Applicants_No ==
'2') && (GlobalVariable.DE4_PolicyType == 'Joint Policy'))) {
	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirm_text_Premium'),
			'Premium')

	Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirm_text_Premium_Result'),
			0)

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirm_text_Within Auto Acceptance Limit (AAL)'),
			'Within Auto Acceptance Limit (AAL)?')

	Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirm_text_Within Auto Acceptance Limit (AAL)_Result'),
			0)

	Mobile.swipe(300, 900, 300, 300)

	Mobile.takeScreenshot(FailureHandling.OPTIONAL)

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirm_text_Life Insurance Details'),
			'Life Insurance Details')

	Mobile.verifyElementExist(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirm_text_Policy Type'),
			0)

	Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirm_text_Policy Type_Result'),
			0)

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirm_text_Insurer'),
			'Insurer')

	Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirm_text_Insurer_Result'),
			0)

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirm_text_Insured Amount'),
			'Insured Amount')

	Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirm_text_Insured Amount_Result'),
			0)

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirm_text_Insured Tenure'),
			'Insured Tenure')

	Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirm_text_Insured Tenure_Result'),
			0)

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirm_text_BICC Period'),
			'BICC Period')

	Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirm_text_BICC Period_Result'),
			0)

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirm_text_Total Coverage'),
			'Total Coverage')

	Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirm_text_Total Coverage_Result'),
			0)

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirm_text_Payment Method'),
			'Payment Method')

	Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirm_text_Payment Method_Result'),
			0)

	Mobile.takeScreenshot(FailureHandling.OPTIONAL)

	Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirm_button_Confirm  Next'),
			0)
}

if ((GlobalVariable.Applicants_No == '2') && (GlobalVariable.DE4_PolicyType == 'Single Policy')) {

	Mobile.swipe(300, 300, 300, 900)

	Mobile.takeScreenshot(FailureHandling.OPTIONAL)

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirmation_2Applicants_text_Quick Quotation Results'),
			'Quick Quotation Results',FailureHandling.OPTIONAL)

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirmation_2Applicants_text_Total Premium'),
			'Total Premium',FailureHandling.OPTIONAL)

	Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirmation_2Applicants_text_Total Premium_Result'),
			0,FailureHandling.OPTIONAL)

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirmation_2Applicants_text_Premium (Main Applicant)'),
			'Premium (Main Applicant)',FailureHandling.OPTIONAL)

	Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirmation_2Applicants_text_Premium (Main Applicant)_Result'),
			0,FailureHandling.OPTIONAL)

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirmation_2Applicants_text_Premium (Joint Applicant)'),
			'Premium (Joint Applicant)',FailureHandling.OPTIONAL)

	Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirmation_2Applicants_text_Premium (Joint Applicant)_Result'),
			0,FailureHandling.OPTIONAL)

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirmation_2Applicants_text_Main Applicant within Auto Acceptance Limit (AAL)'),
			'Main Applicant within Auto Acceptance Limit (AAL)?',FailureHandling.OPTIONAL)

	Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirmation_2Applicants_text_Main Applicant within Auto Acceptance Limit (AAL)_Result'),
			0,FailureHandling.OPTIONAL)

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirmation_2Applicants_text_Joint Applicant Within Auto Acceptance Limit (AAL)'),
			'Joint Applicant Within Auto Acceptance Limit (AAL)?',FailureHandling.OPTIONAL)

	Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirmation_2Applicants_text_Joint Applicant Within Auto Acceptance Limit (AAL)_Result'),
			0,FailureHandling.OPTIONAL)

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirmation_2Applicants_text_Life Insurance Details'),
			'Life Insurance Details',FailureHandling.OPTIONAL)

	//Mobile.verifyElementText(findTestObject(''), 'Policy Type')

	Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirmation_2Applicants_text_Policy Type_Result'),
			0,FailureHandling.OPTIONAL)

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirmation_2Applicants_text_Insurer'),
			'Insurer',FailureHandling.OPTIONAL)

	Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirmation_2Applicants_text_Insurer_Result'),
			0,FailureHandling.OPTIONAL)

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirmation_2Applicants_text_Insured Amount (Main Applicant)'),
			'Insured Amount (Main Applicant)',FailureHandling.OPTIONAL)

	Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirmation_2Applicants_text_Insured Amount (Main Applicant)_Result'),
			0,FailureHandling.OPTIONAL)

	Mobile.swipe(300, 900, 300, 300)

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirmation_2Applicants_text_Insured Amount (Joint Applicant)'),
			'Insured Amount (Joint Applicant)',FailureHandling.OPTIONAL)

	Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirmation_2Applicants_text_Insured Amount (Joint Applicant)_Result'),
			0,FailureHandling.OPTIONAL)

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirmation_2Applicants_text_Insured Tenure'),
			'Insured Tenure',FailureHandling.OPTIONAL)

	Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirmation_2Applicants_text_Insured Tenure_Result'),
			0,FailureHandling.OPTIONAL)

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirmation_2Applicants_text_BICC Period'),
			'BICC Period',FailureHandling.OPTIONAL)

	Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirmation_2Applicants_text_BICC Period_Result'),
			0,FailureHandling.OPTIONAL)

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirmation_2Applicants_text_Total Coverage'),
			'Total Coverage',FailureHandling.OPTIONAL)

	Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirmation_2Applicants_text_Total Coverage_Result'),
			0,FailureHandling.OPTIONAL)

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirmation_2Applicants_text_Payment Method'),
			'Payment Method',FailureHandling.OPTIONAL)

	Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirmation_2Applicants_text_Payment Method_Result'),
			0,FailureHandling.OPTIONAL)

	Mobile.takeScreenshot(FailureHandling.OPTIONAL)

	Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/android.widget.TextView - Confirm  Next'),
			0,FailureHandling.OPTIONAL)
	
	Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/android.widget.TextView - Confirm  Next'),
		0,FailureHandling.OPTIONAL)
}


