import internal.GlobalVariable

import internal.GlobalVariable

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


Mobile.delay(5)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_Header'), 30)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

/*Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_button_Back'), 0)

Mobile.swipe(300, 300, 300, 900)

Boolean UserIsOnPendingApplicationPage = Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/PendingApplicationsPage_button_Continue Data Entry'),
		0, FailureHandling.OPTIONAL)
if(UserIsOnPendingApplicationPage == true) {
	
	Mobile.delay(3) 
	
	Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/PendingApplicationsPage_button_Continue Data Entry'),
			0)
}

Boolean UserIsOnDE5ConfirmationPage = Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5_Confirmation/DataEntryPage5_Confirmation_text_Final Loan Breakdown'),
		0, FailureHandling.OPTIONAL)
if(UserIsOnDE5ConfirmationPage == true) {

	Mobile.swipe(300, 900, 300, 300)

	Mobile.delay(3)
	
	Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5_Confirmation/DataEntryPage5_Confirmation_button_Confirm  Next'),
			0)
}

Mobile.delay(3)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_Header'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_button_Edit'), 0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_button_Edit'), 0)

Mobile.delay(3)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_button_Edit_Popup_Edit Data Entry'),
		0)


//Mobile.verifyElementText(findTestObject(''), 'You will need to reprocess the application resubmit the data entry and LO.\nAre you sure you want to proceed?')

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_button_Edit_Popup_No'), 0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_button_Edit'), 0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_button_Edit_Popup_Close'), 0)*/


/*Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_button_Close'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/PendingApplicationsPage_button_Continue Data Entry'),
		0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/PendingApplicationsPage_button_Continue Data Entry'),
		0)*/

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Loan Details'),
		'Loan Details')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Purpose of Loan'),
		'Purpose of Loan')

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Purpose of Loan_Result'),
		0)


if(GlobalVariable.Applicants_No == '1')

{
	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Is this applicant a Maybank employee'),
			'Is this applicant a Maybank employee / related to a Maybank employee?',FailureHandling.OPTIONAL)

	Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Is this applicant a Maybank employee_Result'),
			0,FailureHandling.OPTIONAL)

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Relationship with Maybank employee'),
			'Relationship with Maybank employee',FailureHandling.OPTIONAL)

	Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Relationship with Maybank employee_Result'),
			0,FailureHandling.OPTIONAL)

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Employee Name'),
			'Employee Name',FailureHandling.OPTIONAL)

	Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Employee Name_Result'),
			0,FailureHandling.OPTIONAL)

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Employee PF Number'),
			'Employee PF Number',FailureHandling.OPTIONAL)

	Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Employee PF Number_Result'),
			0,FailureHandling.OPTIONAL)

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Location of Staff'),
			'Location of Staff',FailureHandling.OPTIONAL)

	Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Location of Staff_Result'),
			0,FailureHandling.OPTIONAL)

	Mobile.swipe(300, 900, 300, 300)
}


Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Property Details'),
		'Property Details',FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Property Name'),
		'Property Name',FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Property Name_Result'),
		GlobalVariable.PropertyNameInputText,FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Unit Number'),
		'Unit Number',FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Unit Number_Result'),
		GlobalVariable.UnitNumberInputText,FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Title Code'),
		'Title Code',FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Title Code_Result'),
		'Strata',FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Title Number'),
		'Title Number',FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Title Number_Result'),
		'33232',FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Lot Number'),
		'Lot Number',FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Lot Number_Result'),
		GlobalVariable.UnitDetailsInputText,FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_BlockStreet'),
		'Block/Street',FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_BlockStreet_Result'),
		GlobalVariable.BlockStoreyDetailsInputText,FailureHandling.OPTIONAL)

Mobile.swipe(300, 900, 300, 300)

Mobile.scrollToText('Purchase Date',FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Purchase Date'),
		'Purchase Date',FailureHandling.OPTIONAL)

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Purchase Date_Result'),
		0,FailureHandling.OPTIONAL)

Mobile.swipe(300, 900, 300, 300)

Mobile.scrollToText('Built Up Area',FailureHandling.OPTIONAL)


Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Built Up Area'),
		'Built Up Area',FailureHandling.OPTIONAL)

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Built Up Area_Result'),
		0,FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Property Insured Amount'),
		'Property Insured Amount',FailureHandling.OPTIONAL)

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Property Insured Amount_Result'),
		0,FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Life Insurance'),
		'Life Insurance',FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Insurer'),
		'Insurer',FailureHandling.OPTIONAL)

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Insurer_Result'), 0,FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Product Type'),
		'Product Type',FailureHandling.OPTIONAL)

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Product Type_Result'),
		0,FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Insured Amount'),
		'Insured Amount',FailureHandling.OPTIONAL)

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Insured Amount_Result'),
		0,FailureHandling.OPTIONAL)

Mobile.swipe(300, 900, 300, 300)

Mobile.scrollToText('Insured Tenure',FailureHandling.OPTIONAL)


Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Insured Tenure'),
		'Insured Tenure',FailureHandling.OPTIONAL)

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Insured Tenure_Result'),
		0,FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Policy Type'),
		'Policy Type',FailureHandling.OPTIONAL)

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Policy Type_Result'),
	0,FailureHandling.OPTIONAL)



Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_BICC Period'),
		'BICC Period',FailureHandling.OPTIONAL)

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_BICC Period_Result'),
		0,FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Total Coverage'),
		'Total Coverage',FailureHandling.OPTIONAL)

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Total Coverage_Result'),
		0,FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Payment Method'),
		'Payment Method',FailureHandling.OPTIONAL)

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Payment Method_Result'),
		0,FailureHandling.OPTIONAL)

Mobile.swipe(300, 900, 300, 300)

Mobile.scrollToText('Premium',FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Premium'),
		'Premium',FailureHandling.OPTIONAL)

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Premium_Result'), 0,FailureHandling.OPTIONAL)



Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Within Auto Acceptance Limit (AAL)'),
		'Within Auto Acceptance Limit (AAL)?',FailureHandling.OPTIONAL)

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Within Auto Acceptance Limit (AAL)_Result'),
		0,FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Additional Fees'),
		'Additional Fees',FailureHandling.OPTIONAL)


Mobile.swipe(300, 900, 300, 300)

Mobile.scrollToText('Legal Fees',FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Legal Fees'),
		'Legal Fees',FailureHandling.OPTIONAL)

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Legal Fees_Result'),
		0,FailureHandling.OPTIONAL)



Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Capitalized'),
		'Capitalized',FailureHandling.OPTIONAL)

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Capitalized_Result'),
		0,FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Cash'), 'Cash',FailureHandling.OPTIONAL)

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Cash_Result'), 0,FailureHandling.OPTIONAL)



Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Loan'), 'Loan',FailureHandling.OPTIONAL)

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_text_Loan_Result'), 0,FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_button_Continue'), 0)


