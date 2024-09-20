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

Mobile.comment('Validate Customer Onboarding page 5 ')

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

Mobile.swipe(300, 300, 300, 1700)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_5/CustomerOnboardingPage5_text_Step 5 of 5'),
		0)

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


Mobile.comment('Validate Customer Onboarding page 5 -- back -- button')

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_5/CustomerOnboardingPage5_button_Back'),
		0)

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

Mobile.swipe(300, 300, 300, 1700)
//MobileElement e = findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_4/CustomerOnboardingPage4_text_Step 4 of 5')


Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_4/CustomerOnboardingPage4_text_Step 4 of 5'),0)

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_4/CustomerOnboardingPage4_button_SaveAndNext'),
		0)

Mobile.delay(3)

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

Mobile.swipe(300, 300, 300, 1700)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_5/CustomerOnboardingPage5_text_Step 5 of 5'),
		0)


Mobile.comment('Validate Customer Onboarding page 5 -- Close -- button')

Mobile.delay(3)


Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_5/CustomerOnboardingPage5_button_Close'),
		0)


CustomKeywords.'methods_Tester02.CustomerOnboardingPage_Close_Button_Validation.closeButton'('CustomerOnboardingPage5')

Mobile.comment('Validate Customer Onboarding page 5 -- text')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_5/CustomerOnboardingPage5_text_Additional Information'),
		'Additional Information')


Mobile.comment('Validate Customer Onboarding page 5 -- Primary Income')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_5/CustomerOnboardingPage5_text_Primary Income'),
		'Primary Income')

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_5/CustomerOnboardingPage5_dropdownText_PrimaryIncome'),
		0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_5/CustomerOnboardingPage5_dropdownArrow_PrimaryIncome'),
		0)

CustomKeywords.'methods_Tester02.dropdown_Search.dropDown_Search'(GlobalVariable.PrimaryIncome)


Mobile.comment('Validate Customer Onboarding page 5 -- Primary Source of Wealth')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_5/CustomerOnboardingPage5_text_Primary Source of Wealth'),
		'Primary Source of Wealth')

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_5/CustomerOnboardingPage5_dropdownText_Primary Source of Wealth'),
		0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_5/CustomerOnboardingPage5_dropdownArrow_Primary Source of Wealth'),
		0)

CustomKeywords.'methods_Tester02.dropdown_Search.dropDown_Search'(GlobalVariable.PrimarySourceOfWealth)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_5/CustomerOnboardingPage5_text_Is the applicant purchasing more than one property at this moment'),
		'Is the applicant purchasing more than one property at this moment?')

if(GlobalVariable.MoreThanOneProperty == 'Yes') {
	Mobile.comment('Validate Customer Onboarding page 5 -- Is the applicant purchasing more than one property at this moment? -- Yes')



	Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_5/CustomerOnboardingPage5_radioButton_MoreThanOneProperty_Yes'),
			0)
}

if(GlobalVariable.MoreThanOneProperty == 'No') {


	Mobile.comment('Validate Customer Onboarding page 5 -- Is the applicant purchasing more than one property at this moment? -- No')

	Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_5/CustomerOnboardingPage5_radioButton_MoreThanOneProperty_No'),
			0)
}


Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_5/android.widget.TextView - Does the applicant have any other pending applications for this property with other banks'),
		'Does the applicant have any other pending applications for this property with other banks?')

if(GlobalVariable.PendingApplicationsOnOtherBank == 'Yes') {
	Mobile.comment('Validate Customer Onboarding page 5 -- Does the applicant have any other pending applications for this property with other banks? -- Yes')


	Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_5/CustomerOnboardingPage5_radioButton_OtherBankPendingApplications_Yes'),
			0)

}

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.swipe(300, 600, 300, 300)


if(GlobalVariable.PendingApplicationsOnOtherBank == 'No') {
	Mobile.comment('Validate Customer Onboarding page 5 -- Does the applicant have any other pending applications for this property with other banks? -- No')

	Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_5/CustomerOnboardingPage5_radioButton_OtherBankPendingApplications_No'),
			0)
}


Mobile.scrollToText('Who will be the owner(s) of the property?', FailureHandling.OPTIONAL)

Mobile.comment('Validate Customer Onboarding page 5 -- Who will be the owner(s) of the property? ')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_5/CustomerOnboardingPage5_text_Who will be the owner(s) of the property'),
		'Who will be the owner(s) of the property?')

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_5/CustomerOnboardingPage5_dropdownText_Owner'),
		0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_5/CustomerOnboardingPage5_dropdownArrow_Owner'),
		0)

CustomKeywords.'methods_Tester02.dropdown_Search.dropDown_Search'(GlobalVariable.Owner)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_5/CustomerOnboardingPage5_button_SaveAndNext'),
		0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_5/CustomerOnboardingPage5_text_Does the applicant want to apply for credit card'),
		0)
Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_5/CustomerOnboardingPage5_text_If yes, their information will be automatically onboarded in UCO for a credit card application'),
		'If yes, their information will be automatically onboarded in UCO for a credit card application')



if(GlobalVariable.CreditCard_UCO =='Yes') {
	Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_5/CustomerOnboardingPage5_text_CreditCard_RadioButton_Yes'),
		0)
}


if(GlobalVariable.CreditCard_UCO =='No') {
	Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_5/CustomerOnboardingPage5_text_CreditCard_RadioButton_No'),
		0)
}

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_5/CustomerOnboardingPage5_button_SaveAndNext'),
		0)


//Mobile.closeApplication()

