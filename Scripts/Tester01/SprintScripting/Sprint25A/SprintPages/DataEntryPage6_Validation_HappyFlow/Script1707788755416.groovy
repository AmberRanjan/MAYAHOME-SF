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

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.30, 0.70)

if (((GlobalVariable.Owner == 'Main Applicant, Joint Applicant and other person(s)') || (GlobalVariable.Owner == 'Main Applicant and other person(s)')) || 
(GlobalVariable.Owner == 'Joint Applicant and other person(s)')) {
       Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1',[('variable') : 'Step 6 of 6']), 
        'Step 6 of 6')

}else {
	
	    Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1',[('variable') : 'Step 5 of 5']), 
        'Step 5 of 5')
    }

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_text_Loan Amount Details'), 
    'Loan Amount Details')
'Verify property loan value'
String PropertyLoanValue =GlobalVariable.PropertyLoanValue+'0'
String UpgradingLoanValue =GlobalVariable.UpgradingLoanValue+'0'
String RenovationLoanValue =GlobalVariable.RenovationLoanValue+'0'

Mobile.comment('verify value entered in page 3 is present displayed in property loan, upgrading loan and renovation loan')
Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_text_Property Loan'), 'Property Loan', FailureHandling.CONTINUE_ON_FAILURE)
String PropertyLoanValueLocal = Mobile.getText(findTestObject('Object Repository/Tester01/DataEntry/txt_PropertyLoanValue'), 0, FailureHandling.CONTINUE_ON_FAILURE)
PropertyLoanValueLocal = PropertyLoanValueLocal.replace(",", "")
Mobile.verifyMatch(PropertyLoanValueLocal, PropertyLoanValue, true, FailureHandling.CONTINUE_ON_FAILURE)

'Verify upgrading loan value'
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_Upgrading Loan'), 'Upgrading Loan', FailureHandling.CONTINUE_ON_FAILURE)
String UpgradingLoanValueLocal = Mobile.getText(findTestObject('Object Repository/Tester01/DataEntry/txt_UpgradingLoanValue'), 0, FailureHandling.CONTINUE_ON_FAILURE)
UpgradingLoanValueLocal = UpgradingLoanValueLocal.replace(",", "")
Mobile.verifyMatch(UpgradingLoanValueLocal, UpgradingLoanValue, true, FailureHandling.CONTINUE_ON_FAILURE)

'Verify renovation loan  value'
if (GlobalVariable.FinancingPlan =='SJKP Madani-i' || GlobalVariable.FinancingPlan =='SJKP Madani') {
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_Renovation Loan'), 'Renovation Loan', FailureHandling.CONTINUE_ON_FAILURE)
	String RenovationLoanValueLocal = Mobile.getText(findTestObject('Object Repository/Tester01/DataEntry/txt_Renovation Loan'), 0, FailureHandling.CONTINUE_ON_FAILURE)
	RenovationLoanValueLocal = RenovationLoanValueLocal.replace(",", "")
	Mobile.verifyMatch(RenovationLoanValue, RenovationLoanValueLocal, true, FailureHandling.CONTINUE_ON_FAILURE)
	
	
}else {
	
	Mobile.verifyElementNotVisible(findTestObject('Object Repository/Tester01/DataEntry/txt_Renovation Loan'), 5, FailureHandling.CONTINUE_ON_FAILURE)
	
}
Mobile.swipe(300, 900, 300, 300)


Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_button_Compute'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_button_Compute'), 0, FailureHandling.OPTIONAL)

Mobile.delay(15)

Mobile.swipe(300, 900, 300, 900)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5_Confirmation/DataEntryPage5_Confirmation_text_Final Loan Breakdown'),
	30)

Mobile.swipe(300, 900, 300, 300)

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5_Confirmation/DataEntryPage5_Confirmation_button_Confirm  Next'),
	0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5_Confirmation/DataEntryPage5_Confirmation_button_Confirm  Next'),
	0, FailureHandling.OPTIONAL)