import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.main.CustomKeywordDelegatingMetaClass
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable

import org.eclipse.jdt.internal.compiler.flow.ExceptionHandlingFlowContext
import org.openqa.selenium.Keys as Keys


/**Author: Vasudha
 * Data From Excel: Home2u_TestData
 * Sheet: SF_Scenarios_Data
 int Row_Number = 1
 def sheet = 'SF_Scenarios_Data'
 'DataFile'
 def Applicants_No = findTestData(sheet).getValue('Applicants_No', Row_Number)
 def ID_Type = findTestData(sheet).getValue('ID_Type', Row_Number)
 def CustomerName_MainApplicant = findTestData(sheet).getValue('CustomerName_MainApplicant', Row_Number)
 def CustomerName_JointApplicant = findTestData(sheet).getValue('CustomerName_JointApplicant', Row_Number)
 def Alternative_IDType = findTestData(sheet).getValue('Alternative_IDType', Row_Number)
 def Alternative_IDNumber = findTestData(sheet).getValue('Alternative_IDNumber', Row_Number)
 def CustomerGroup = findTestData(sheet).getValue('CustomerGroup', Row_Number)
 def Religion = findTestData(sheet).getValue('Religion', Row_Number)
 def Salutation = findTestData(sheet).getValue('Salutation', Row_Number)
 def Gender = findTestData(sheet).getValue('Gender', Row_Number)
 def Education = findTestData(sheet).getValue('Education', Row_Number)
 def MaritalStatus = findTestData(sheet).getValue('MaritalStatus', Row_Number)
 def SpouseMonthlyIncome =  findTestData(sheet).getValue('SpouseMonthlyIncome', Row_Number)
 def PhoneNumber = findTestData(sheet).getValue('PhoneNumber', Row_Number)
 def Resident_Status = findTestData(sheet).getValue('Resident_Status', Row_Number)
 def Employment_Status = findTestData(sheet).getValue('Employment_Status', Row_Number)
 def Business_Type = findTestData(sheet).getValue('Business_Type', Row_Number)
 */

Mobile.comment('Validate Customer Onboarding page 1')


Mobile.hideKeyboard(FailureHandling.OPTIONAL)

Mobile.swipe(300, 300, 300, 1700)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage_Header'),
		0,FailureHandling.OPTIONAL)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

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

	if(UserIsOnJointApplicantFlow == 'true')
	{

		Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_SwitchFromMainApplicant/CustomerOnboarding_text_JointApplicant_Name'),
				0)

		Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_SwitchFromMainApplicant/CustomerOnboarding_linkText_Switch Applicant'),
				0)

	}




}


Mobile.delay(3)

Mobile.comment('Validate Customer Onboarding page 1 -- Back -- Button')

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_text_Name'),10,FailureHandling.OPTIONAL)



Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_button_Back'), 0 )

Boolean UserIsOn_ExistingCustomersDetectedPage = Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/ExistingCustomersDetectedPage/ExistingCustomersDetectedPage_Header'),
		10,FailureHandling.OPTIONAL)

Boolean UserIsOn_ExistingCustomerDetectedPage = Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/ExistingCustomerDetectedPage/ExistingCustomerDetectedPage_Header'),
		10,FailureHandling.OPTIONAL)

if(UserIsOn_ExistingCustomersDetectedPage == true || UserIsOn_ExistingCustomerDetectedPage == true) {

	Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/ExistingCustomersDetectedPage/ExistingCustomersDetectedPage_Header'),
			10,FailureHandling.OPTIONAL)

	Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/ExistingCustomerDetectedPage/ExistingCustomerDetectedPage_Header'),
			10,FailureHandling.OPTIONAL)

	Mobile.tap(findTestObject('Object Repository/Tester02_New/ExistingCustomersDetectedPage/ExistingCustomersDetectedPage_button_Create Application'),0)

}

Boolean UserIsOn_2ApplicantsCustomerOnboardingPage = Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/2ApplicantsCustomerOnboardingPage/2Applicants_CustomerOnboarding_Please select an applicant to start the onboarding process'),
		10,FailureHandling.OPTIONAL)

if(UserIsOn_2ApplicantsCustomerOnboardingPage == true) {
	Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/2ApplicantsCustomerOnboardingPage/2Applicants_CustomerOnboarding_Please select an applicant to start the onboarding process'),
			10,FailureHandling.OPTIONAL)

	Mobile.tap(findTestObject('Object Repository/Tester02_New/2ApplicantsCustomerOnboardingPage/2Applicants_CustomerOnboarding_Joint Applicant'),10)

}

Boolean UserIsOnConfirmationPage = Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnboardingPage_Confirmation_Header'),
		10,FailureHandling.OPTIONAL)

if(UserIsOnConfirmationPage == 'true')
{
	
	Mobile.delay(3)

	Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnboardingPage_Confirmation_button_ConfirmAndContinue'),
			0, FailureHandling.OPTIONAL)

}

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

Mobile.swipe(300, 300, 300, 1700)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage_Header'),
		0)

Mobile.comment('Validate Customer Onboarding page 1 -- Close -- Button')

Mobile.delay(3)

CustomKeywords.'methods_Tester02.CustomerOnboardingPage_Close_Button_Validation.closeButton'('CustomerOnboardingPage1')

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.comment('Validate Customer Onboarding page 1 -- text')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_text_Step 1 of 5'),
		'Step 1 of 5')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_text_Personal Details'),
		'Personal Details')

Mobile.comment('Validate Customer Onboarding page 1 -- Name')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_text_Name'),
		'Name')

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_textBox_Name'),
		0)

Mobile.clearText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_textBox_Name'),
		0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_button_SaveAndNext'),
		0)


Mobile.swipe(300, 300, 300, 1700)

CustomKeywords.'methods_Tester02.ValidateTextBox.ValidateText_Alpha_Max'(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_textBox_Name'), 40)

Mobile.setText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_textBox_Name'),GlobalVariable.CustomerName_JointApplicant,
		0)


Mobile.comment('Validate Customer Onboarding page 1 -- ID Type -- Dropdown')

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_text_ID Type'),
		0)

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_dropdownText_ID Type'),
		0)

Mobile.comment('Validate Customer Onboarding page 1 -- ID Number -- TextBox')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_text_ID Number'),
		'ID Number')

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_textBox_ID Number'),
		0)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.swipe(300, 900, 300, 300)

Mobile.comment('Validate Customer Onboarding page 1 -- Alternate ID Type (Optional) -- Dropdown')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_text_Alternate ID Type (Optional)'),
		'Alternate ID Type (Optional)')

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_dropdownText_Alternate ID Type (Optional)'),
		0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_dropdownArrow_Alternate ID Type (Optional)'),
		0)

CustomKeywords.'methods_Tester02.dropdown_Search.dropDown_Search'(GlobalVariable.Alternative_IDType_JointApplicant)

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.45)

Mobile.comment('Validate Customer Onboarding page 1 -- Alternate ID Number -- Textbox')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_text_Alternate ID Number'),
		'Alternate ID Number')

CustomKeywords.'methods_Tester02.ValidateTextBox_Num.ValidateText_Num_Max'(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_textBox_Alternate ID Number'), 10)

Mobile.setText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_textBox_Alternate ID Number'),
		GlobalVariable.Alternative_IDNumber_JointApplicant, 0)

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_textBox_Alternate ID Number'),
		0)

Mobile.comment('Validate Customer Onboarding page 1 -- Customer Group -- Dropdown')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_text_Customer Group'),
		'Customer Group')

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_dropdownText_Customer Group'),
		0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_dropdownArrow_Customer Group'),
		0)

CustomKeywords.'methods_Tester02.dropdown_Search.dropDown_Search'(GlobalVariable.CustomerGroup_JointApplicant)

Mobile.comment('Validate Customer Onboarding page 1 -- Religion -- Dropdown')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_text_Religion'),
		'Religion')

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_dropdownText_Religion'),
		0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_dropdownArrow_Religion'),
		0)

CustomKeywords.'methods_Tester02.dropdown_Search.dropDown_Search'(GlobalVariable.Religion_JointApplicant)


Mobile.comment('Validate Customer Onboarding page 1 -- Salutation -- Dropdown')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_text_Salutation'),
		'Salutation')

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_dropdownText_Salutation'),
		0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_dropdownArrow_Salutation'),
		0)

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)

if(GlobalVariable.Salutation_JointApplicant == 'Ms/ Cik')
{
	Mobile.setText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_dropdownArrow_Alternate ID Type (Optional)_Search'),
			'Ms', 0)

	Mobile.delay(5)

	Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_dropdownArrow_Alternate ID Type (Optional)_Search_Result',[('Variable') : GlobalVariable.Salutation_JointApplicant]),
	0)
}else {
	CustomKeywords.'methods_Tester02.dropdown_Search.dropDown_Search'(GlobalVariable.Salutation_JointApplicant)
}

Mobile.comment('Validate Customer Onboarding page 1 -- Gender -- Dropdown')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_text_Gender'),
		'Gender')

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_dropdownText_Gender'),
		0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_dropdownArrow_Gender'),
		0)

CustomKeywords.'methods_Tester02.dropdown_Search.dropDown_Search'(GlobalVariable.Gender_JointApplicant)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.swipe(300, 900, 300, 300)

Mobile.comment('Validate Customer Onboarding page 1 -- Education -- Dropdown')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_text_Education'),
		'Education')

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_dropdownText_Education'),
		0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_dropdownArrow_Education'),
		0)

CustomKeywords.'methods_Tester02.dropdown_Search.dropDown_Search'(GlobalVariable.Education_JointApplicant)

Mobile.comment('Validate Customer Onboarding page 1 -- Marital Status -- Dropdown')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_text_Marital Status'),
		'Marital Status')

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_dropdownText_Marital Status'),
		0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_dropdownArrow_Marital Status'),
		0)

CustomKeywords.'methods_Tester02.dropdown_Search.dropDown_Search'(GlobalVariable.MaritalStatus_JointApplicant)

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.45)

Mobile.comment('Validate Customer Onboarding page 1 -- PhoneNumber')


Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_text_Country Code'),
		'Country Code')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_text_Phone Number'),
		'Phone Number')

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_dropdownText_Country Code'),
		0)

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_textbox_Phone Number'),
		0)

Mobile.clearText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_textbox_Phone Number'),
		0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_button_SaveAndNext'),
		0)

CustomKeywords.'methods_Tester02.ValidateTextBox_Num.ValidateText_Num_Max'(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_textbox_Phone Number'),10)

Mobile.setText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_textbox_Phone Number'),GlobalVariable.PhoneNumber_JointApplicant,0)

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.60, 0.30)

Mobile.comment('Validate Customer Onboarding page 1 -- Resident Status -- Dropdown')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_text_Resident Status'),
		'Resident Status')

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_dropdownText_Resident Status'),
		0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_dropdownArrow_Resident Status'),
		0)

CustomKeywords.'methods_Tester02.dropdown_Search.dropDown_Search'(GlobalVariable.Resident_Status_JointApplicant)

Mobile.comment('Validate Customer Onboarding page 1 -- Employment Status -- Dropdown')


Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_text_Employment Status'),
		'Employment Status')

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_dropdownText_Employment Status'),
		0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_dropdownArrow_Employment Status'),
		0)

CustomKeywords.'methods_Tester02.dropdown_Search.dropDown_Search'(GlobalVariable.Employment_Status_JointApplicant)

Mobile.comment('Validate Customer Onboarding page 1 --  Business Type -- Dropdown')


Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_text_Business Type'),
		'Business Type')

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_dropdownText_Business Type'),
		0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_dropdownArrow_Business Type'),
		0)

if(GlobalVariable.Business_Type_JointApplicant == 'MNC / Public Listed')
{

	Mobile.setText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_dropdownArrow_Alternate ID Type (Optional)_Search'),
			'MNC', 0)

	Mobile.delay(5)

	Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_dropdownArrow_Alternate ID Type (Optional)_Search_Result',[('Variable') : GlobalVariable.Business_Type_JointApplicant]),
	0)

}else {
	CustomKeywords.'methods_Tester02.dropdown_Search.dropDown_Search'(GlobalVariable.Business_Type_JointApplicant)
}

Mobile.takeScreenshot(FailureHandling.OPTIONAL)


Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_button_SaveAndNext'),
		0)
