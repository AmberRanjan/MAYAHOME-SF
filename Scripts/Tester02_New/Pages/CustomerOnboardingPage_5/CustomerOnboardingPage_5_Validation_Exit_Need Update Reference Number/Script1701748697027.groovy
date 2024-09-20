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


Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_5/CustomerOnboardingPage5_button_Close'),
		0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_text_Save Your Progress'),
		0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_text_You can choose'),
		'You can choose to save your progress as a draft before leaving and pick-up from where you left off at a later time.')

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_button_Exit'),
		0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_5/CustomerOnboardingPage5_button_Close'),
		0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_text_Save Your Progress'),
		0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_button_close'),
		0)
Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_5/CustomerOnboardingPage5_button_Close'),
		0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_text_Save Your Progress'),
		0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_5/CustomerOnboardingPage5_text_contains', [('Variable') : 'Save Now']),
0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/LoginPage/LoginPage_Logs'), 10,FailureHandling.OPTIONAL)

Mobile.delay(2)



Mobile.tap(findTestObject('Object Repository/Tester02_New/LoginPage/LoginPage_Logs_Close'),10,FailureHandling.OPTIONAL)

