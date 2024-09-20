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
import ch.qos.logback.core.joran.conditional.ElseAction as ElseAction
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//Mobile.startExistingApplication('com.maybank2u.salesforce.uatent')
Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage1/DataEntryPages_Header'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage1/DataEntryPages_button_Back'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage1/DataEntryPages_button_Chat'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage1/DataEntryPages_button_Close'), 
    0)

if (((GlobalVariable.Owner == 'Main Applicant, Joint Applicant and other person(s)') || (GlobalVariable.Owner == 'Main Applicant and other person(s)')) || 
(GlobalVariable.Owner == 'Joint Applicant and other person(s)')) {
    Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1',[('variable') : 'Step 2 of 6']), 
        'Step 2 of 6')

}else {
	
	    Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1',[('variable') : 'Step 1 of 5']), 
        'Step 1 of 5')
    }


Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage1/DataEntryPage1_text_Loan Details'), 
    'Loan Details')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage1/DataEntryPage1_text_Purpose of Loan'), 
    'Purpose of Loan')

//Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage1/DataEntryPage1_text_Is this applicant a Maybank employee  related to a Maybank employee'),
//	'Is this applicant a Maybank employee / related to a Maybank employee?')
//Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage1/DataEntryPage1_button_SaveAndNext'),
//		0)
if (GlobalVariable.PurposeOfLoan == 'Own Occupation') {
    Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage1/DataEntryPage1_radioButton_Purpose of Loan_Own Occupation'), 
        0)
}

if (GlobalVariable.PurposeOfLoan == 'Investment') {
    Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage1/DataEntryPage1_radioButton_Purpose of Loan_Investment'), 
        0)
}

if (GlobalVariable.MaybankEmployee == 'No') {
    Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage1/DataEntryPage1_radioButton_MaybankEmployee_No'), 
        0)
}

if (GlobalVariable.MaybankEmployee == 'Yes') {
    Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage1/DataEntryPage1_radioButton_MaybankEmployee_Yes'), 
        0)

    Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage1/DataEntryPage1_text_Relationship with Maybank employee'), 
        'Relationship with Maybank employee')

    Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage1/DataEntryPage1_dropdownText_Relationship with Maybank employee'), 
        0)

    Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage1/DataEntryPage1_dropdownArrow_RelationshipWithMaybankEmployee'), 
        0)

    CustomKeywords.'methods_Tester02.dropdown_Search.dropDown_Search'(GlobalVariable.RelationshipWithMaybankEmployee)

    /*
	 Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage1/DataEntryPage1_dropdownArrow_RelationshipWithMaybankEmployee_Result_Director Related Personal'),
	 0)
	 */
    Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage1/DataEntryPage1_text_Employee Name'), 
        'Employee Name')

    Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage1/DataEntryPage1_textBox_Employee Name'), 
        'Enter employee name', FailureHandling.OPTIONAL)

    Mobile.setText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage1/DataEntryPage1_textBox_Employee Name'), 
        'Test', 0)

    Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage1/DataEntryPage1_text_Employee PF number'), 
        'Employee PF number', FailureHandling.OPTIONAL)

    Mobile.setText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage1/DataEntryPage1_textBox_Employee PF number'), 
        '0', 0)

    Mobile.hideKeyboard()

    Mobile.swipe(300, 900, 300, 300)

    Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage1/DataEntryPage1_text_Location of Staff'), 
        'Location of Staff')

    Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage1/DataEntryPage1_dropdownText_Location of Staff'), 
        0, FailureHandling.OPTIONAL)

    Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage1/DataEntryPage1_dropdownArrow_Location of Staff'), 
        0)

    CustomKeywords.'methods_Tester02.dropdown_Search.dropDown_Search'(GlobalVariable.LocationOfStaff)

    /*
	 Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage1/DataEntryPage1_dropdownArrow_Location of Staff_Result_Branch'),
	 0)
	 */
    Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage1/DataEntryPage1_button_SaveAndNext'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage1/DataEntryPage1_errorMessgae_Employee name must be more than 5 characters'), 
        0)

    CustomKeywords.'methods_Tester02.ValidateTextBox.ValidateText_Alpha_Max'(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage1/DataEntryPage1_textBox_Employee PF number'), 
        10)

    Mobile.setText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage1/DataEntryPage1_textBox_Employee Name'), 
        GlobalVariable.EmployeeName, 0)

    Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage1/DataEntryPage1_button_SaveAndNext'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage1/DataEntryPage1_errorMessgae_Please ensure that PF number consist of 8 digits'), 
        0)

    CustomKeywords.'methods_Tester02.ValidateTextBox_Num.ValidateText_Num_Max'(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage1/DataEntryPage1_textBox_Employee PF number'), 
        10)

    Mobile.setText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage1/DataEntryPage1_textBox_Employee PF number'), 
        GlobalVariable.EmployeePFNumber, 0)
}

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage1/DataEntryPage1_button_SaveAndNext'), 
    0)

