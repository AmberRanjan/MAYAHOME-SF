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


if (((GlobalVariable.Owner == 'Main Applicant, Joint Applicant and other person(s)') || (GlobalVariable.Owner == 'Main Applicant and other person(s)')) || 
(GlobalVariable.Owner == 'Joint Applicant and other person(s)')) {
       Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1',[('variable') : 'Step 5 of 6']), 
        'Step 5 of 6')

}else {
	
	    Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1',[('variable') : 'Step 4 of 5']), 
        'Step 4 of 5')
    }

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage1/DataEntryPages_button_Chat'),
		0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage1/DataEntryPages_button_Close'),
		0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_text_Calculate Life Insurance'),
		'Calculate Life Insurance ')

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_dropDownArrow_Policy Type'),
	0)

CustomKeywords.'methods_Tester02.dropdown_Search.dropDown_Search'(GlobalVariable.DE4_PolicyType)


if((GlobalVariable.Applicants_No == '1' && GlobalVariable.DE4_PolicyType == 'Single Policy') || (GlobalVariable.Applicants_No == '2' && GlobalVariable.DE4_PolicyType == 'Joint Policy'))

{
	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_text_Insured Amount'),
			'Insured Amount', FailureHandling.OPTIONAL)

	Mobile.setText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_textBox_Insured Amount'),
			GlobalVariable.DE4_InsuredAmount, 0)
}

if(GlobalVariable.Applicants_No == '2' && GlobalVariable.DE4_PolicyType == 'Single Policy')

{
	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_2Applicats_text_Insured Amount (Main Applicant)'),
			'Insured Amount (Main Applicant)',FailureHandling.OPTIONAL)

	Mobile.setText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_textBox_Insured Amount'),
		'50000', 0)
    //Mobile.setText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_textBox_Insured Amount'), GlobalVariable.DE4_InsuredAmount_Main, 0)

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_2Applicats_text_Insured Amount (Joint Applicant)'),
			'Insured Amount (Joint Applicant)', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.setText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_2Applicats_textBox_Insured Amount (Joint Applicant)'), '50000', 0)
	
	//Mobile.setText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_2Applicats_textBox_Insured Amount (Joint Applicant)'), GlobalVariable.DE4_InsuredAmount_Joint, 0)
}

Mobile.swipe(300, 900, 300, 300)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_text_Insured Tenure'),
		'Insured Tenure')


Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_text_Insured Tenure_Years'),
		0)

CustomKeywords.'methods_Tester02.InsuredTenure_ScrollBar.InsuredTenure_ScrollBar_Years'(35)

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_text_starting_Years'),
		0)

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_text_ending_Years'),
		0)

Mobile.swipe(300, 900, 300, 300)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_text_Payment Method'),
		'Payment Method')

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_dropDownText_Payment Method'),
		0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_dropDownArrow_Payment Method'),
		0)

CustomKeywords.'methods_Tester02.dropdown_Search.dropDown_Search'(GlobalVariable.DE4_PaymentMethod)

//Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_button_Generate Result'),
//		0)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4/DataEntryPage4_button_Generate Result'),
		0, FailureHandling.OPTIONAL)

Mobile.swipe(300, 300, 300, 900, FailureHandling.OPTIONAL)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/DataEntryPage4_Confirm_text_Quick Quotation Results'),
	0)
Mobile.swipe(300, 900, 300, 300, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/android.widget.TextView - Confirm  Next'),
	0,FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage4_Confirmation/android.widget.TextView - Confirm  Next'),
0,FailureHandling.OPTIONAL)


