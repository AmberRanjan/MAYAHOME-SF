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

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_text_Step 5 of 6'),
		0)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage1/DataEntryPages_button_Back'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_text_Step 4 of 6'),
		0)

Mobile.swipe(300, 900, 300, 300)

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_button_SaveAndNext'),
		0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage1/DataEntryPages_button_Chat'),
		0)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage1/DataEntryPages_button_Close'),
		0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_text_Calculate Life Insurance'),
		'Calculate Life Insurance ')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_text_Policy Type'),
		'Policy Type')

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_dropDownText_Policy Type'),
		0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_dropDownArrow_Policy Type'),
		0)

/*
 Mobile.comment(GlobalVariable.DE4_PolicyType)
 Mobile.setText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_dropdownArrow_Alternate ID Type (Optional)_Search'),
 GlobalVariable.DE4_PolicyType, 0)
 Mobile.delay(5)
 Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_dropdownArrow_Alternate ID Type (Optional)_Search_Result',[('Variable') : GlobalVariable.DE4_PolicyType]),
 0)
 */
CustomKeywords.'methods_Tester02.dropdown_Search.dropDown_Search'(GlobalVariable.DE4_PolicyType)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_text_Insurer'),
		'Insurer')

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_dropDownText_Insurer'),
		0)

if ((GlobalVariable.DE4_Insurer == 'Other insurers') || (GlobalVariable.DE4_Insurer == 'Waiver')) {
	Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_dropDownArrow_Insurer'),
			0)

	//CustomKeywords.'methods_Tester02.dropdown_Search.dropDown_Search'(GlobalVariable.DE4_Insurer)

	Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_button_Generate Result'),
			0)

	Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/AmberPage_WOLOC_text_Process This Case'),
			0)

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/AmberPage_WOLOC_text_Please process the case in WOLOC to continue'),
			'Please process the case in WOLOC to continue')

	Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/AmberPage_WOLOC_button_Back'),
			0)

	Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/PendingApplicationPage_button_Continue Data Entry'),
			0)
}

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_dropDownArrow_Insurer'),
		0)

CustomKeywords.'methods_Tester02.dropdown_Search.dropDown_Search'(GlobalVariable.DE4_Insurer)


if((GlobalVariable.Applicants_No == '1' && GlobalVariable.DE4_PolicyType == 'Single Policy') || (GlobalVariable.Applicants_No == '2' && GlobalVariable.DE4_PolicyType == 'Joint Policy'))

{
	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_text_Insured Amount'),
			'Insured Amount', FailureHandling.OPTIONAL)

	def InsureAmount = Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_textBox_Insured Amount'),
			0)

	Mobile.setText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_textBox_Insured Amount'),
			'0', 0)

	Mobile.setText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_textBox_Insured Amount'),
			GlobalVariable.DE4_InsuredAmount, 0)

}



if(GlobalVariable.Applicants_No == '2' && GlobalVariable.DE4_PolicyType == 'Single Policy')

{
	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_2Applicats_text_Insured Amount (Main Applicant)'),
			'Insured Amount (Main Applicant)',FailureHandling.OPTIONAL)

	def InsureAmount_Main = Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_2Applicats_textBox_Insured Amount (Main Applicant)'),
			0)

	Mobile.setText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_2Applicats_textBox_Insured Amount (Main Applicant)'),
			'0',0)

	Mobile.setText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_2Applicats_textBox_Insured Amount (Main Applicant)'), '50000', 0)
		//	GlobalVariable.DE4_InsuredAmount_Main,0)

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_2Applicats_text_Insured Amount (Joint Applicant)'),
			'Insured Amount (Joint Applicant)')

	def InsureAmount_Joint = Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_2Applicats_textBox_Insured Amount (Joint Applicant)'),
			0)

	Mobile.setText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_2Applicats_textBox_Insured Amount (Joint Applicant)'),
			'0', 0)

	Mobile.setText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_2Applicats_textBox_Insured Amount (Joint Applicant)'), '50000', 0)
			//GlobalVariable.DE4_InsuredAmount_Joint, 0)

}

Mobile.swipe(300, 900, 300, 300)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_text_Insured Tenure'),
		'Insured Tenure')

/*Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_text_Insured Tenure_Years'),
 '5  years')
 */
Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_text_Insured Tenure_Years'),
		0)

/*
 Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_Insured Tenure_Scroll_Pin'),
 0)
 Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_Insured Tenure_Scroll_bar'),
 0)
 */
CustomKeywords.'methods_Tester02.InsuredTenure_ScrollBar.InsuredTenure_ScrollBar_Years'(35)

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_text_starting_Years'),
		0)

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_text_ending_Years'),
		0)

Mobile.swipe(300, 900, 300, 300)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_text_BICC Period'),
		'BICC Period')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_text_Total Coverage'),
		'Total Coverage')

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_textBox_BICC Period'),
		0)

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_textBox_Total Coverage'),
		0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_text_Payment Method'),
		'Payment Method')

/*
 Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_dropDownText_Payment Method'),
 'Select Option')
 */
Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_dropDownText_Payment Method'),
		0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_dropDownArrow_Payment Method'),
		0)

CustomKeywords.'methods_Tester02.dropdown_Search.dropDown_Search'(GlobalVariable.DE4_PaymentMethod)

//Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_button_Generate Result'),
//		0)

if((GlobalVariable.Applicants_No == '1' && GlobalVariable.DE4_PolicyType == 'Single Policy') || (GlobalVariable.Applicants_No == '2' && GlobalVariable.DE4_PolicyType == 'Joint Policy'))
{
	Mobile.setText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_textBox_Insured Amount'),
			'0', 0)

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_text_ERROR'),
			'ERROR [Missing mandatory field-insuredLoanAmount]', FailureHandling.OPTIONAL)

	Mobile.setText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_textBox_Insured Amount'),
			'900000000000000', 0)

	Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_button_Generate Result'),
			0)

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_text_ERROR'),
			'ERROR [ESB(200) ETIQA(0103) - Initial Sum Covered cannot be more than the Initial Financing Amount.]', FailureHandling.OPTIONAL)

	Mobile.setText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_textBox_Insured Amount'),
			'100', 0)

	Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_button_Generate Result'),
			0)

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_text_ERROR'),
			'ERROR [ESB(200) ETIQA(0103) - Min Initial Sum Covered is RM 10,000 & Max Initial Sum Covered is subject to underwriting.]',
			FailureHandling.OPTIONAL)

	Mobile.setText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_textBox_Insured Amount'),
			GlobalVariable.DE4_InsuredAmount, 0)

	Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_button_Generate Result'),
			0)
}

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_button_Generate Result'),
		0, FailureHandling.OPTIONAL)



