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

/**Author:: Vasudha
 */

//Mobile.startExistingApplication('com.maybank2u.salesforce.uatent')


/**Author: Vasudha
 * Data From Excel: Home2u_TestData
 * Sheet: SF_Scenarios_Data
 */
/*
 int Row_Number = 1
 def sheet = 'SF_Scenarios_Data'
 'DataFile'
 def Mothly_Gross_Income = findTestData(sheet).getValue('Mothly_Gross_Income',Row_Number)
 def FirstTimePurchase = findTestData(sheet).getValue('FirstTimePurchase',Row_Number)
 def ExistingHomeFinancing = findTestData(sheet).getValue('ExistingHomeFinancing',Row_Number)
 def NonBankCommitments = findTestData(sheet).getValue('NonBankCommitments',Row_Number)
 */
//

Mobile.comment('Validate Customer Onboarding page 4')

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.swipe(300, 300, 300, 1700)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_4/CustomerOnboardingPage4_text_Step 4 of 5'), 0)

if(GlobalVariable.Applicants_No == '2') {

	Boolean UserIsOnMainApplicantFlow = Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_SwitchFromMainApplicant/CustomerOnboarding_text_Main Applicant'), 10,FailureHandling.OPTIONAL)

	if(UserIsOnMainApplicantFlow == 'true')
	{

		Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_SwitchFromMainApplicant/CustomerOnboarding_text_MainApplicant_Name'),
				0)

		Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_SwitchFromMainApplicant/CustomerOnboarding_linkText_Switch Applicant'),
				0)

	}



	Boolean UserIsOnJointApplicantFlow = Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_SwitchFromMainApplicant/CustomerOnboarding_text_Joint Applicant'), 10,FailureHandling.OPTIONAL)

	if(UserIsOnMainApplicantFlow == 'true')
	{

		Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_SwitchFromMainApplicant/CustomerOnboarding_text_JointApplicant_Name'),
				0)

		Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_SwitchFromMainApplicant/CustomerOnboarding_linkText_Switch Applicant'),
				0)

	}


}


Mobile.comment('Validate Customer Onboarding page 4 - back button')

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_4/CustomerOnboardingPage4_button_Back'),
		0)

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

Mobile.swipe(300, 300, 300, 1700)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_text_Step 3 of 5'),
		0)


Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_button_SaveAndNext'),
		0)

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

Mobile.swipe(300, 300, 300, 1700)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_4/CustomerOnboardingPage4_text_Step 4 of 5'),0)

Mobile.comment('Validate Customer Onboarding page 4 - close button')

Mobile.delay(3)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_4/CustomerOnboardingPage4_button_Close'),
		0)

CustomKeywords.'methods_Tester02.CustomerOnboardingPage_Close_Button_Validation.closeButton'('CustomerOnboardingPage4')

Mobile.comment('Validate Customer Onboarding page 4 - text')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_4/CustomerOnboardingPage4_text_Income and Commitment Details'),
		'Income and Commitment Details')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_4/CustomerOnboardingPage4_text_Monthly Gross Income'),
		'Monthly Gross Income')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_4/CustomerOnboardingPage4_text_RM_MonthlyGrossIncome'),
		'RM')

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_4/CustomerOnboardingPage4_textBox_MonthlyGrossIncome'),
		0)

Mobile.comment('Validate Customer Onboarding page 4 - Enter Monthly Gross Income')

CustomKeywords.'methods_Tester02.ValidateTextBox_Num.ValidateText_Num_Max'(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_4/CustomerOnboardingPage4_textBox_MonthlyGrossIncome'), 0)

Mobile.setText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_4/CustomerOnboardingPage4_textBox_MonthlyGrossIncome'),GlobalVariable.Mothly_Gross_Income_JointApplicant,
		0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_4/CustomerOnboardingPage4_text_Is this your applicants first time purchasing or owning a home'),
		'Is this your applicant\'s first time purchasing or owning a home?')


Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_4/CustomerOnboardingPage4_button_SaveAndNext'),
		0)



if(GlobalVariable.FirstTimePurchase_JointApplicant == 'Yes') {
	Mobile.comment('Validate Customer Onboarding page 4 - Is this your applicants first time purchasing  -- Yes')

	Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_4/CustomerOnboardingPage4_Is this your applicants first time purchasing_radiobutton_Yes'),0)

}

if(GlobalVariable.FirstTimePurchase_JointApplicant == 'No') {
	Mobile.comment('Validate Customer Onboarding page 4 - Is this your applicants first time purchasing  -- No')

	Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_4/CustomerOnboardingPage4_Is this your applicants first time purchasing_radiobutton_No'),
			0)

	Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_4/CustomerOnboardingPage4_button_SaveAndNext'),
			0)

	Mobile.comment('Validate Customer Onboarding page 4 - Is this your applicants first time purchasing  -- No -- Existing Home Financing')
	
	Mobile.swipe(300, 900, 300, 300)
	
	Mobile.scrollToText('Existing Home Financing', FailureHandling.OPTIONAL)

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_4/CustomerOnboardingPage4_text_Existing Home Financing'),
			'Existing Home Financing')

	Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_4/CustomerOnboardingPage4_dropdownText_Existing Home Financing'),
			0)

	Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_4/CustomerOnboardingPage4_dropdownArrow_Existing Home Financing'),
			0)

	CustomKeywords.'methods_Tester02.dropdown_Search.dropDown_Search'(GlobalVariable.ExistingHomeFinancing_JointApplicant)
}


Mobile.comment('Validate Customer Onboarding page 4 - Non-bank commitments (Optional)')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_4/CustomerOnboardingPage4_text_Non-bank commitments (Optional)'),
		'Non-bank commitments (Optional)')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_4/CustomerOnboardingPage4_text_RM_NonBankingCommitments'),
		'RM')

CustomKeywords.'methods_Tester02.ValidateTextBox_Num.ValidateText_Num_Max'(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_4/CustomerOnboardingPage4_textBox_RM_NonBankingCommitments'), 0)

Mobile.setText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_4/CustomerOnboardingPage4_textBox_RM_NonBankingCommitments'),
		GlobalVariable.NonBankCommitments_JointApplicant , 0)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.delay(5)


Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_4/CustomerOnboardingPage4_button_SaveAndNext'),
		0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_4/CustomerOnboardingPage4_button_SaveAndNext'),
	0,FailureHandling.OPTIONAL)

//Mobile.closeApplication()

