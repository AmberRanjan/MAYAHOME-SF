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

Mobile.comment('Log in to applictaion')
Mobile.callTestCase(findTestCase('Tester02_New/Pages/Login/ReusableMethods_Login/Method_Login'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Tester02_New/Pages/HomePage/HomePage_StartNewApplication'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.comment('Start new application')
Mobile.callTestCase(findTestCase('Tester02_New/Pages/StartNewApplicationPage/StartNewAppliucation_Page_Validation'), [:],
	FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

if (GlobalVariable.Applicants_No == '2') {
	WebUI.callTestCase(findTestCase('Tester02_New/Pages/2ApplicantsCustomerOnboardingPage/2ApplicantsCustomerOnboardingPage_Validation'),
		[:], FailureHandling.STOP_ON_FAILURE)
}

Mobile.delay(3)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.comment('COB Spet 1 of 5')

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_text_Step 1 of 5'), 45, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_textBox_Name'),GlobalVariable.CustomerName_MainApplicant, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_button_SaveAndNext'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('COB Spet 2 of 5')

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_text_Step 2 of 5'), 0, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_radioButton_MailingAddress_Yes'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_button_SaveAndNext'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('COB Spet 3 of 5')

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_text_Step 3 of 5'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/drpDown_Durationyears'), 10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/drpDown_Durationyears'), 10, FailureHandling.OPTIONAL)

CustomKeywords.'methods_Tester02.dropdown_Search.dropDown_Search'(GlobalVariable.DurationOfService_Year)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/drpDown_Durationmonths'), 10, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'methods_Tester02.dropdown_Search.dropDown_Search'(GlobalVariable.DurationOfService_Month)

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_button_SaveAndNext'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('COB Spet 4 of 5')

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_4/CustomerOnboardingPage4_text_Step 4 of 5'), 0)

Mobile.setText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_4/CustomerOnboardingPage4_textBox_MonthlyGrossIncome'), GlobalVariable.Mothly_Gross_Income, 0)

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

if(GlobalVariable.FirstTimePurchase == 'Yes') {
	
	Mobile.comment('Validate Customer Onboarding page 4 - Is this your applicants first time purchasing  -- Yes')

	Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_4/CustomerOnboardingPage4_Is this your applicants first time purchasing_radiobutton_Yes'),0)
	Mobile.hideKeyboard(FailureHandling.OPTIONAL)
	
	}

if(GlobalVariable.FirstTimePurchase == 'No') {
	
	Mobile.comment('Validate Customer Onboarding page 4 - Is this your applicants first time purchasing  -- No')

	Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_4/CustomerOnboardingPage4_Is this your applicants first time purchasing_radiobutton_No'),
			0)

	Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_4/CustomerOnboardingPage4_button_SaveAndNext'),
			0)

	Mobile.hideKeyboard(FailureHandling.OPTIONAL)
	
	Mobile.comment('Validate Customer Onboarding page 4 - Is this your applicants first time purchasing  -- No -- Existing Home Financing')
	
	Mobile.swipe(300, 900, 300, 300)
	
	Mobile.scrollToText('Existing Home Financing', FailureHandling.OPTIONAL)

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_4/CustomerOnboardingPage4_text_Existing Home Financing'),
			'Existing Home Financing')

	Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_4/CustomerOnboardingPage4_dropdownText_Existing Home Financing'),
			0)

	Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_4/CustomerOnboardingPage4_dropdownArrow_Existing Home Financing'),
			0)

	CustomKeywords.'methods_Tester02.dropdown_Search.dropDown_Search'(GlobalVariable.ExistingHomeFinancing)
}

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_4/CustomerOnboardingPage4_button_SaveAndNext'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('COB Step 5 of 5')
Mobile.hideKeyboard(FailureHandling.OPTIONAL)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_5/CustomerOnboardingPage5_text_Step 5 of 5'), 0)

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

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)

if(GlobalVariable.PendingApplicationsOnOtherBank == 'Yes') {
	Mobile.comment('Validate Customer Onboarding page 5 -- Does the applicant have any other pending applications for this property with other banks? -- Yes')


	Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_5/CustomerOnboardingPage5_radioButton_OtherBankPendingApplications_Yes'),
			0)
}

if(GlobalVariable.PendingApplicationsOnOtherBank == 'No') {
	Mobile.comment('Validate Customer Onboarding page 5 -- Does the applicant have any other pending applications for this property with other banks? -- No')

	Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_5/CustomerOnboardingPage5_radioButton_OtherBankPendingApplications_No'),
			0)
}

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_5/CustomerOnboardingPage5_dropdownArrow_Owner'),
	0)

CustomKeywords.'methods_Tester02.dropdown_Search.dropDown_Search'(GlobalVariable.OwnerSearchText, GlobalVariable.Owner)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

if(GlobalVariable.CreditCard_UCO =='Yes') {
	Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_5/CustomerOnboardingPage5_text_CreditCard_RadioButton_Yes'),
		0)
}

if(GlobalVariable.CreditCard_UCO =='No') {
	Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_5/CustomerOnboardingPage5_text_CreditCard_RadioButton_No'),
		0)
}

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_5/CustomerOnboardingPage5_button_SaveAndNext'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('COB Confirmation Page')

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnboardingPage_Confirmation_Header'), 10)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnboardingPage_Confirmation_button_ConfirmAndContinue'),
	0, FailureHandling.OPTIONAL)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

if (GlobalVariable.Applicants_No == '2') {
	
	Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/2ApplicantsCustomerOnboardingPage/2Applicants_CustomerOnboarding_Please select an applicant to start the onboarding process'),
		10,FailureHandling.OPTIONAL)

	Mobile.tap(findTestObject('Object Repository/Tester02_New/2ApplicantsCustomerOnboardingPage/2Applicants_CustomerOnboarding_Joint Applicant'),10)

	Mobile.comment('COB Spet 1 of 5')
	
	Mobile.hideKeyboard(FailureHandling.OPTIONAL)
	
	Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_text_Step 1 of 5'), 45, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/2ApplicantsCustomerOnboardingPage/2Applicants_CustomerOnboarding_Joint Applicant'),'Joint Applicant', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : GlobalVariable.CustomerName_JointApplicant]),GlobalVariable.CustomerName_JointApplicant, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_textBox_Name'),GlobalVariable.CustomerName_JointApplicant, FailureHandling.CONTINUE_ON_FAILURE)
	
	CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)
	
	Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_button_SaveAndNext'), 30, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.comment('COB Spet 2 of 5')
	
	Mobile.hideKeyboard(FailureHandling.OPTIONAL)
	
	Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_text_Step 2 of 5'), 0, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/2ApplicantsCustomerOnboardingPage/2Applicants_CustomerOnboarding_Joint Applicant'),'Joint Applicant', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : GlobalVariable.CustomerName_JointApplicant]),GlobalVariable.CustomerName_JointApplicant, FailureHandling.CONTINUE_ON_FAILURE)
	
	CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)
	
	Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_radioButton_MailingAddress_Yes'), 0, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_2/CustomerOnboardingPage2_button_SaveAndNext'), 30, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.comment('COB Spet 3 of 5')
	
	Mobile.hideKeyboard(FailureHandling.OPTIONAL)
	
	Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_text_Step 3 of 5'), 0, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.hideKeyboard(FailureHandling.OPTIONAL)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/2ApplicantsCustomerOnboardingPage/2Applicants_CustomerOnboarding_Joint Applicant'),'Joint Applicant', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : GlobalVariable.CustomerName_JointApplicant]),GlobalVariable.CustomerName_JointApplicant, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/drpDown_Durationyears'), 10, FailureHandling.CONTINUE_ON_FAILURE)

	Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/drpDown_Durationyears'), 10, FailureHandling.OPTIONAL)

		CustomKeywords.'methods_Tester02.dropdown_Search.dropDown_Search'(GlobalVariable.DurationOfService_Year)

	Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/drpDown_Durationmonths'), 10, FailureHandling.CONTINUE_ON_FAILURE)
	
	CustomKeywords.'methods_Tester02.dropdown_Search.dropDown_Search'(GlobalVariable.DurationOfService_Month)
	
	CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)
	
	CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)
	
	Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_3/CustomerOnboardingPage3_button_SaveAndNext'), 0, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.comment('COB Spet 4 of 5')
	
	Mobile.hideKeyboard(FailureHandling.OPTIONAL)
	
	Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_4/CustomerOnboardingPage4_text_Step 4 of 5'),0)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/2ApplicantsCustomerOnboardingPage/2Applicants_CustomerOnboarding_Joint Applicant'),'Joint Applicant', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : GlobalVariable.CustomerName_JointApplicant]),GlobalVariable.CustomerName_JointApplicant, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.setText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_4/CustomerOnboardingPage4_textBox_MonthlyGrossIncome'), GlobalVariable.Mothly_Gross_Income_JointApplicant, 0)
	Mobile.hideKeyboard(FailureHandling.OPTIONAL)
	
	if(GlobalVariable.FirstTimePurchase == 'Yes') {
		
		Mobile.comment('Validate Customer Onboarding page 4 - Is this your applicants first time purchasing  -- Yes')
	
		Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_4/CustomerOnboardingPage4_Is this your applicants first time purchasing_radiobutton_Yes'),0)
		Mobile.hideKeyboard(FailureHandling.OPTIONAL)
		
	}
	
	if(GlobalVariable.FirstTimePurchase == 'No') {
		
		Mobile.comment('Validate Customer Onboarding page 4 - Is this your applicants first time purchasing  -- No')
	
		Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_4/CustomerOnboardingPage4_Is this your applicants first time purchasing_radiobutton_No'),
				0)
	
		Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_4/CustomerOnboardingPage4_button_SaveAndNext'),
				0)
		Mobile.hideKeyboard(FailureHandling.OPTIONAL)
		
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
	
	Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_4/CustomerOnboardingPage4_button_SaveAndNext'), 0, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.comment('COB Step 5 of 5')
	Mobile.hideKeyboard(FailureHandling.OPTIONAL)
	
	Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_5/CustomerOnboardingPage5_text_Step 5 of 5'), 0)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/2ApplicantsCustomerOnboardingPage/2Applicants_CustomerOnboarding_Joint Applicant'),'Joint Applicant', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : GlobalVariable.CustomerName_JointApplicant]),GlobalVariable.CustomerName_JointApplicant, FailureHandling.CONTINUE_ON_FAILURE)
	
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
	
	CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)
	
	if(GlobalVariable.PendingApplicationsOnOtherBank == 'Yes') {
		Mobile.comment('Validate Customer Onboarding page 5 -- Does the applicant have any other pending applications for this property with other banks? -- Yes')
	
	
		Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_5/CustomerOnboardingPage5_radioButton_OtherBankPendingApplications_Yes'),
				0)
	}
	
	if(GlobalVariable.PendingApplicationsOnOtherBank == 'No') {
		Mobile.comment('Validate Customer Onboarding page 5 -- Does the applicant have any other pending applications for this property with other banks? -- No')
	
		Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_5/CustomerOnboardingPage5_radioButton_OtherBankPendingApplications_No'),
				0)
	}
	
	Mobile.takeScreenshot(FailureHandling.OPTIONAL)
	
	if(GlobalVariable.CreditCard_UCO =='Yes') {
		Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_5/CustomerOnboardingPage5_text_CreditCard_RadioButton_Yes'),
			0)
	}
	
	if(GlobalVariable.CreditCard_UCO =='No') {
		Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_5/CustomerOnboardingPage5_text_CreditCard_RadioButton_No'),
			0)
	}
	
	Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_5/CustomerOnboardingPage5_button_SaveAndNext'), 0, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.comment('COB Confirmation Page')
	
	Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnboardingPage_Confirmation_Header'), 10)
	
	Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnboardingPage_Confirmation_button_ConfirmAndContinue'),
		0, FailureHandling.OPTIONAL)
	
	Mobile.takeScreenshot(FailureHandling.OPTIONAL)
		
}

/////////////////////////////////////////////////////////////////////////////////////////////

Mobile.comment('COB Consent Page')

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/CustomerOnboarding_ConsentPages_text_Sign Electronically'), 30)


if (GlobalVariable.ConsentPages_radioButton == 'Sign Electrically') {
	Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/CustomerOnboarding_ConsentPages_radioButton_SignElectronically'),
		0)

	Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/CustomerOnboarding_ConsentPages_button_Continue'),
		0)
	
	if(GlobalVariable.Applicants_No == '1')
	{

	Mobile.callTestCase(findTestCase('Tester02_New/Pages/CustomerOnboarding_ConsentPages/Sign_Electrically'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	if(GlobalVariable.Applicants_No == '2')
		{
	
		Mobile.callTestCase(findTestCase('Tester02_New/Pages/CustomerOnboarding_ConsentPages/Sign_Electrically_JointApplicant'), [:], FailureHandling.STOP_ON_FAILURE)
		}
}



