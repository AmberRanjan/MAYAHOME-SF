import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileAbstractKeyword
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
 def Occupation = findTestData(sheet).getValue('Occupation',Row_Number)
 def Occupation_Sector = findTestData(sheet).getValue('Occupation_Sector',Row_Number)
 def NameOfEmployer = findTestData(sheet).getValue('NameOfEmployer',Row_Number)
 def DurationOfService_Year  = findTestData(sheet).getValue('DurationOfService_Year', Row_Number)
 def DurationOfService_Month  = findTestData(sheet).getValue('DurationOfService_Month', Row_Number)
 def OfficeAddress_Country  = findTestData(sheet).getValue('OfficeAddress_Country', Row_Number)
 def OfficeAddressLine1  = findTestData(sheet).getValue('OfficeAddressLine1', Row_Number)
 def OfficeAddressLine2  = findTestData(sheet).getValue('OfficeAddressLine2', Row_Number)
 def OfficeAddressLine3  = findTestData(sheet).getValue('OfficeAddressLine3', Row_Number)
 def OfficeAddress_City   = findTestData(sheet).getValue('OfficeAddress_City', Row_Number)
 def OfficeAddress_Postcode   = findTestData(sheet).getValue('OfficeAddress_Postcode', Row_Number)
 def Invalid_OfficeAddress_State   = findTestData(sheet).getValue('Invalid_OfficeAddress_State', Row_Number)
 //def Invalid_OfficeAddress_State   = findTestData(sheet).getValue('Invalid_OfficeAddress_State', Row_Number)
 def OfficeAddress_State   = findTestData(sheet).getValue('OfficeAddress_State', Row_Number)
 def OfficeAddress_CountryCode   = findTestData(sheet).getValue('OfficeAddress_CountryCode', Row_Number)
 def OfficeContactNumber   = findTestData(sheet).getValue('OfficeContactNumber', Row_Number)
 */
//Mobile.startExistingApplication('com.maybank2u.salesforce.uatent')

Mobile.comment('Validate Customer Onboarding page 3')

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

Mobile.swipe(300, 300, 300, 1700)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_text_Step 3 of 5'),
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



Mobile.comment('Validate Customer Onboarding page 3  -  back -- button')


Mobile.delay(5)

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

Mobile.swipe(300, 300, 300, 1700)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_button_Back'),
		0,FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_button_Back'),
	0,FailureHandling.OPTIONAL)

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

Mobile.swipe(300, 300, 300, 1700)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_text_Step 2 of 5'),
		0)

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

Mobile.swipe(300, 300, 300, 1700)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_button_SaveAndNext'),
		0)

Mobile.delay(3)

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

Mobile.swipe(300, 300, 300, 1700)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_text_Step 3 of 5'),
		0)


Mobile.comment('Validate Customer Onboarding page 3  -  close -- button')

Mobile.delay(5)


Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_button_Close'),
		0)

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

CustomKeywords.'methods_Tester02.CustomerOnboardingPage_Close_Button_Validation.closeButton'('CustomerOnboardingPage3')

Mobile.comment('Validate Customer Onboarding page 3 -- text')


Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_text_Employment Details'),
		'Employment Details')

Mobile.comment('Validate Customer Onboarding page 3 -- Occupation -- Dropdown')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_text_Occupation'),
		'Occupation')

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_dropDownText_Occupation'),
		0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_dropDownArrow_Occupation'),
		0)

CustomKeywords.'methods_Tester02.dropdown_Search.dropDown_Search'(GlobalVariable.Occupation_JointApplicant)

Mobile.comment('Validate Customer Onboarding page 3 -- Occupation Sector -- Dropdown')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_text_Occupation Sector'),
		'Occupation Sector')

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_dropDownText_OccupationSector'),
		0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_dropDownArrow_OccupationSector'),
		0)

CustomKeywords.'methods_Tester02.dropdown_Search.dropDown_Search'(GlobalVariable.Occupation_Sector_JointApplicant)


Mobile.comment('Validate Customer Onboarding page 3 -- Name of Employer -- Textbox')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_text_Name of Employer'),
		'Name of Employer')

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_textBox_Name of Employer'),
		0)

Mobile.clearText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_textBox_Name of Employer'),
		0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_button_SaveAndNext'),
		0)

//Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_text_Please enter input in String'),0,FailureHandling.OPTIONAL)

CustomKeywords.'methods_Tester02.ValidateTextBox.ValidateText_Alpha_Max'(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_textBox_Name of Employer'),40)

Mobile.setText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_textBox_Name of Employer'), GlobalVariable.NameOfEmployer_JointApplicant, 0)

Mobile.comment('Validate Customer Onboarding page 3 -- Duration of Service -- dropdown')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_text_Duration of Service'),
		'Duration of Service')

Mobile.swipe(300, 600, 300, 300)

Mobile.scrollToText('Duration of Service', FailureHandling.OPTIONAL)

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_dropdownText_DurationOfService_Years'),
		0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_dropdownArrow_DurationOfService_Years'),    0)


CustomKeywords.'methods_Tester02.dropdown_Search.dropDown_Search'(GlobalVariable.DurationOfService_Year_JointApplication)

//Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_dropdownArrow_DurationOfService_Years_SearchResult'), 0)

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_dropdownText_DurationOfService_Months'),
		0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_dropdownArrow_DurationOfService_Months'),
		0)

CustomKeywords.'methods_Tester02.dropdown_Search.dropDown_Search'(GlobalVariable.DurationOfService_Month_JointApplication)

//Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_dropdownArrow_DurationOfService_Months_SearchResult'), 0)

Mobile.swipe(300, 400, 300, 300)

Mobile.scrollToText('Office Address', FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_text_Office Address'),
		'Office Address')

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.swipe(300, 600, 300, 300)

Mobile.scrollToText('Country', FailureHandling.OPTIONAL)

Mobile.comment('Validate Customer Onboarding page 3 -- Country -- dropdown')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_text_Country'),
		'Country')

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_dropdownText_Country'),
		0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_dropdownArrow_Country'),
		0)

CustomKeywords.'methods_Tester02.dropdown_Search.dropDown_Search'(GlobalVariable.OfficeAddress_Country_JointApplication)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.swipe(300, 600, 300, 300)


Mobile.scrollToText('Office Address Line 1', FailureHandling.OPTIONAL)

Mobile.comment('Validate Customer Onboarding page 3 -- Office Address Line 1 -- textbox')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_text_Office Address Line 1'),
		'Office Address Line 1')

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_textBox_Office Address Line 1'),
		0)

Mobile.clearText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_textBox_Office Address Line 1'),
		0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_button_SaveAndNext'),
		0)

//Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_text_Please enter input in Address Line 1'),0,FailureHandling.OPTIONAL)

Mobile.scrollToText('Office Address Line 1', FailureHandling.OPTIONAL)

CustomKeywords.'methods_Tester02.ValidateTextBox.ValidateText_Alpha_Max'(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_textBox_Office Address Line 1'),40)

Mobile.setText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_textBox_Office Address Line 1'),GlobalVariable.OfficeAddressLine1_JointApplication, 0)


Mobile.comment('Validate Customer Onboarding page 3 -- Office Address Line 2 -- textbox')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_text_Office Address Line 2'),
		'Office Address Line 2')

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_textBox_Office Address Line 2'),
		0)


Mobile.clearText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_textBox_Office Address Line 2'),
		0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_button_SaveAndNext'),
		0)

//Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_text_Please enter input in Address Line 2'),0,FailureHandling.OPTIONAL)

CustomKeywords.'methods_Tester02.ValidateTextBox.ValidateText_Alpha_Max'(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_textBox_Office Address Line 2'), 0)

Mobile.setText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_textBox_Office Address Line 2'),GlobalVariable.OfficeAddressLine2_JointApplication,
		0)


Mobile.comment('Validate Customer Onboarding page 3 -- Office Address Line 3 -- textbox')



Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_text_Office Address Line 3 (Optional)'),
		'Office Address Line 3 (Optional)')

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.swipe(300, 900, 300, 300)

Mobile.scrollToText('Office Address Line 3 (Optional)', FailureHandling.OPTIONAL)

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_textBox_Office Address Line 3 (Optional)'),
		0)

Mobile.clearText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_textBox_Office Address Line 3 (Optional)'),
		0)

CustomKeywords.'methods_Tester02.ValidateTextBox.ValidateText_Alpha_Max'(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_textBox_Office Address Line 3 (Optional)'),40)

Mobile.setText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_textBox_Office Address Line 3 (Optional)'),GlobalVariable.OfficeAddressLine3_JointApplication,
		0)

Mobile.comment('Validate Customer Onboarding page 3 -- City -- textbox')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_text_City'),
		'City')

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_textBox_City'),
		0)

Mobile.clearText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_textBox_City'),
		0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_button_SaveAndNext'),
		0)

//Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_text_Please enter a city'),'Please enter a city.',FailureHandling.OPTIONAL)

CustomKeywords.'methods_Tester02.ValidateTextBox.ValidateText_Alpha_Max'(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_textBox_City'),40)

Mobile.setText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_textBox_City'),GlobalVariable.OfficeAddress_City_JointApplication,
		0)


Mobile.comment('Validate Customer Onboarding page 3 -- Postcode -- textbox')

Mobile.verifyElementExist(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_text_Postcode'),
		0)

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_textBox_Postcode'),
		0)

Mobile.clearText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_textBox_Postcode'), 0)

CustomKeywords.'methods_Tester02.ValidateTextBox_Num.ValidateText_Num_Max'(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_textBox_Postcode'), 10)

Mobile.setText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_textBox_Postcode'),GlobalVariable.OfficeAddress_Postcode_JointApplication, 0)


Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_button_SaveAndNext'),
		0)

/*Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_text_Please enter your postcode'),'Please enter your postcode.',FailureHandling.OPTIONAL)
 Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_text_State and postcode entered does not match'),
 0,FailureHandling.OPTIONAL)
 */
Mobile.comment('Validate Customer Onboarding page 3 -- State -- dropdown')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_text_State'),
		'State')

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_DropdownText_State'),
		0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_DropdownArrow_State'),
		0)


CustomKeywords.'methods_Tester02.dropdown_Search.dropDown_Search'(GlobalVariable.Invalid_OfficeAddress_State_JointApplication)


Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_text_State and postcode entered does not match'),
		0,FailureHandling.OPTIONAL)


Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_DropdownArrow_State'),
		0)

CustomKeywords.'methods_Tester02.dropdown_Search.dropDown_Search'(GlobalVariable.OfficeAddress_State_JointApplication)


Mobile.comment('Validate Customer Onboarding page 3 -- Office Contact Number -- dropdown and textbox')


Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_text_Office Contact Number'),
		'Office Contact Number')

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_dropdownText_Office Contact Number'),
		0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_dropdownArrow_Office Contact Number'),
		0)

Mobile.setText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/android.widget.EditText - Search country or code'),
		GlobalVariable.OfficeAddress_CountryCode_JointApplication, 0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/android.widget.TextView - Malaysia'), 0)

/*Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_text_Office phone number you entered is invalid'),
 0,FailureHandling.OPTIONAL)
 */
Mobile.clearText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_textBox_Office Contact Number'), 0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_button_SaveAndNext'),
		0)

Mobile.setText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_textBox_Office Contact Number'),
		GlobalVariable.OfficeContactNumber_JointApplication, 0)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)


Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_button_SaveAndNext'),
		0)