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

/**Author: Vasudha
 * Data From Excel: Home2u_TestData
 * Sheet: SF_Scenarios_Data
 */
/*
 int Row_Number = 1
 def sheet = 'SF_Scenarios_Data'
 'DataFile'
 def Country = findTestData(sheet).getValue('Country', Row_Number)
 def HomeAddressLine1 = findTestData(sheet).getValue('HomeAddressLine1', Row_Number)
 def HomeAddressLine2 = findTestData(sheet).getValue('HomeAddressLine2', Row_Number)
 def HomeAddressLine3 = findTestData(sheet).getValue('HomeAddressLine3', Row_Number)
 def City = findTestData(sheet).getValue('City', Row_Number)
 def Postcode = findTestData(sheet).getValue('Postcode', Row_Number)
 def State = findTestData(sheet).getValue('State', Row_Number)
 def MailingAddress = findTestData(sheet).getValue('MailingAddress', Row_Number)
 def Mailing_Country = findTestData(sheet).getValue('Mailing_Country', Row_Number)
 def MailingAddressLine1 = findTestData(sheet).getValue('MailingAddressLine1', Row_Number)
 def MailingAddressLine2 = findTestData(sheet).getValue('MailingAddressLine2', Row_Number)
 def MailingAddressLine3 = findTestData(sheet).getValue('MailingAddressLine3', Row_Number)
 def Mailing_City = findTestData(sheet).getValue('Mailing_City', Row_Number)
 def Mailing_Postcode = findTestData(sheet).getValue('Mailing_Postcode', Row_Number)
 def Mailing_State = findTestData(sheet).getValue('Mailing_State', Row_Number)
 */
//

Mobile.comment('Validate Customer Onboarding page 2')

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.swipe(300, 300, 300, 1700)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_text_Step 2 of 5'),
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


Mobile.comment('Validate Customer Onboarding page 2 -- Back -- Button')

Mobile.delay(3)


Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_button_Back'),
		0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_button_Back'),
	5,FailureHandling.OPTIONAL)

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

Mobile.swipe(300, 300, 300, 1700)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_text_Step 1 of 5'),0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_button_SaveAndNext'),
		0)

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

Mobile.swipe(300, 300, 300, 1700)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_text_Step 2 of 5'),
		0)

Mobile.comment('Validate Customer Onboarding page 2 -- Close -- Button')

Mobile.delay(3)

CustomKeywords.'methods_Tester02.CustomerOnboardingPage_Close_Button_Validation.closeButton'('CustomerOnboardingPage2')

Mobile.comment('Validate Customer Onboarding page 2 -- text')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_text_Home Address'),
		'Home Address')

Mobile.comment('Validate Customer Onboarding page 2 -- Country -- Dropdown')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_text_Country'),
		'Country')

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_dropdownText_Country'),
		0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_dropdownArrow_Country'),
		0)

CustomKeywords.'methods_Tester02.dropdown_Search.dropDown_Search'(GlobalVariable.Country)

Mobile.comment('Validate Customer Onboarding page 2 -- Home Address Line 1 -- textBox')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_text_Home Address Line 1'),
		'Home Address Line 1')

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_textBox_Home Address Line 1'),
		0)

Mobile.clearText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_textBox_Home Address Line 1'),
		0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_button_SaveAndNext'),
		0)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.swipe(300, 300, 300, 900)

Mobile.scrollToText('Home Address Line 2', FailureHandling.OPTIONAL)

CustomKeywords.'methods_Tester02.ValidateTextBox.ValidateText_Alpha_Max'(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_textBox_Home Address Line 1'),40)

Mobile.setText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_textBox_Home Address Line 1'), GlobalVariable.HomeAddressLine2 , 0)

Mobile.comment('Validate Customer Onboarding page 2 -- Home Address Line 2 -- textBox')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_text_Home Address Line 2'),
		'Home Address Line 2')

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_textBox_Home Address Line 2'),
		0)

Mobile.clearText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_textBox_Home Address Line 2'),
		0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_button_SaveAndNext'),
		0)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.swipe(300, 300, 300, 900)

Mobile.scrollToText('Home Address Line 2', FailureHandling.OPTIONAL)

CustomKeywords.'methods_Tester02.ValidateTextBox.ValidateText_Alpha_Max'(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_textBox_Home Address Line 2'),40)

Mobile.setText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_textBox_Home Address Line 2'), GlobalVariable.HomeAddressLine2, 0)


Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.swipe(300, 900, 300, 300)

Mobile.scrollToText('Home Address Line 3', FailureHandling.OPTIONAL)

Mobile.comment('Validate Customer Onboarding page 2 -- Home Address Line 3 -- textBox')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_text_Home Address Line 3 (Optional)'),
		'Home Address Line 3 (Optional)')

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_textBox_Home Address Line 3 (Optional)'),
		0)

Mobile.clearText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_textBox_Home Address Line 3 (Optional)'),
		0)

CustomKeywords.'methods_Tester02.ValidateTextBox.ValidateText_Alpha_Max'(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_textBox_Home Address Line 3 (Optional)'),40)

Mobile.setText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_textBox_Home Address Line 3 (Optional)'), GlobalVariable.HomeAddressLine3, 0)

Mobile.comment('Validate Customer Onboarding page 2 -- City -- textBox')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_text_City'),
		'City')

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_textBox_City'),
		0)

Mobile.clearText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_textBox_City'),
		0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_button_SaveAndNext'),
		0)

CustomKeywords.'methods_Tester02.ValidateTextBox.ValidateText_Alpha_Max'(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_textBox_City'),40)

Mobile.setText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_textBox_City'), GlobalVariable.City, 0)

Mobile.comment('Validate Customer Onboarding page 2 -- Postcode -- textBox')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_text_Postcode'),
		'Postcode')

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_textBox_Postcode'),
		0)

Mobile.clearText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_textBox_Postcode'),
		0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_button_SaveAndNext'),
		0)

CustomKeywords.'methods_Tester02.ValidateTextBox.ValidateText_Alpha_Max'(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_textBox_Postcode'),40)

Mobile.setText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_textBox_Postcode'), GlobalVariable.Postcode, 0)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.swipe(300, 900, 300, 300)

Mobile.scrollToText('State', FailureHandling.OPTIONAL)

Mobile.comment('Validate Customer Onboarding page 2 -- State -- dropdown')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_text_State'),
		'State')

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_dropdownText_State'),
		0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_dropdownArrow_State'),
		0)

CustomKeywords.'methods_Tester02.dropdown_Search.dropDown_Search'(GlobalVariable.State)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_text_Mailing Address'),
		'Mailing Address')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_text_Mailing Address -Is the mailing address same as the home address'), 'Is the mailing address same as the home address?',FailureHandling.OPTIONAL)

if(GlobalVariable.MailingAddress == 'Yes') {

	Mobile.comment('Validate Customer Onboarding page 2 -- Mailing Address -- Yes')
	
	Mobile.takeScreenshot(FailureHandling.OPTIONAL)

	Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_radioButton_MailingAddress_Yes'),
			0)

}


if(GlobalVariable.MailingAddress == 'No') {

	Mobile.comment('Validate Customer Onboarding page 2 -- Mailing Address -- No')

	Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_radioButton_MailingAddress_No'), 0)

	Mobile.delay(3)

	Mobile.swipe(300, 900, 300, 300)

	Mobile.comment('Validate Customer Onboarding page 2 -- Mailing Address -- Country -- Dropdown')

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_MailingAddress_text_Country'),
			'Country')

	Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_MailingAddress_dropdownText_Country'),
			0)

	Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_MailingAddress_dropdownArrow_Country'),
			0)

	CustomKeywords.'methods_Tester02.dropdown_Search.dropDown_Search'(GlobalVariable.Mailing_Country)

	Mobile.comment('Validate Customer Onboarding page 2 -- Mailing Address -- Line1 -- TextBox')

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_text_Mailing Address Line 1'),
			'Mailing Address Line 1')

	Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_textBox_Mailing Address Line 1'),
			0)

	Mobile.clearText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_textBox_Mailing Address Line 1'),
			0)

	Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_button_SaveAndNext'),
			0)

	CustomKeywords.'methods_Tester02.ValidateTextBox.ValidateText_Alpha_Max'(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_textBox_Mailing Address Line 1'),40)

	Mobile.setText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_textBox_Mailing Address Line 1'),
			GlobalVariable.MailingAddressLine2, 0)

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_text_Mailing Address Line 2'),
			'Mailing Address Line 2')

	Mobile.comment('Validate Customer Onboarding page 2 -- Mailing Address -- Line2 -- TextBox')

	Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_textBox_Mailing Address Line 2'),
			0)

	Mobile.clearText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_textBox_Mailing Address Line 2'),
			0)

	Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_button_SaveAndNext'),
			0)

	CustomKeywords.'methods_Tester02.ValidateTextBox.ValidateText_Alpha_Max'(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_textBox_Mailing Address Line 2'),40)

	Mobile.setText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_textBox_Mailing Address Line 2'), GlobalVariable.MailingAddressLine2, 0)

	Mobile.swipe(300, 900, 300, 300)

	Mobile.comment('Validate Customer Onboarding page 2 -- Mailing Address -- Line3 -- TextBox')

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_text_Mailing Address Line 3 (Optional)'),
			'Mailing Address Line 3 (Optional)')

	Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_textBox_Mailing Address Line 3'),
			0)

	Mobile.clearText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_textBox_Mailing Address Line 3'),
			0)

	CustomKeywords.'methods_Tester02.ValidateTextBox.ValidateText_Alpha_Max'(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_textBox_Mailing Address Line 3'),40)

	Mobile.setText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_textBox_Mailing Address Line 3'), GlobalVariable.MailingAddressLine3, 0)

	Mobile.comment('Validate Customer Onboarding page 2 -- Mailing Address -- City -- TextBox')

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_MailingAddress_text_City'),
			'City')

	Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_MailingAddress_textBox_City'),
			0)

	Mobile.clearText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_MailingAddress_textBox_City'),
			0)

	Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_button_SaveAndNext'),
			0)

	CustomKeywords.'methods_Tester02.ValidateTextBox.ValidateText_Alpha_Max'(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_MailingAddress_textBox_City'),40)

	Mobile.setText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_MailingAddress_textBox_City'), GlobalVariable.Mailing_City, 0)

	Mobile.comment('Validate Customer Onboarding page 2 -- Mailing Address -- Postcode -- TextBox')

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_MailingAddress_text_Postcode'),
			'Postcode')

	Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_MailingAddress_textBox_Postcode'),
			0)

	Mobile.clearText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_MailingAddress_textBox_Postcode'),
			0)

	Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_button_SaveAndNext'),
			0)

	CustomKeywords.'methods_Tester02.ValidateTextBox_Num.ValidateText_Num_Max'(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_MailingAddress_textBox_Postcode'),10)

	Mobile.setText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_MailingAddress_textBox_Postcode'), GlobalVariable.Mailing_Postcode, 0)

	Mobile.swipe(300, 900, 300, 300)

	Mobile.comment('Validate Customer Onboarding page 2 -- Mailing Address -- State -- Dropdown')

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_MailingAddress_text_State'),
			'State')

	Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_MailingAddress_dropdownText_State'),
			0)

	Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_MailingAddress_dropdownArrow_State'),
			0)

	CustomKeywords.'methods_Tester02.dropdown_Search.dropDown_Search'(GlobalVariable.Mailing_State)
	
	Mobile.takeScreenshot(FailureHandling.OPTIONAL)

}

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_button_SaveAndNext'), 0)
