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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/DataEntryCompletedEDDSummaryPage/MitigationEligibilityofBorrowerPage_text_Mitigation Eligibility of Borrower'), 
    0)

Mobile.takeScreenshot()

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/DataEntryCompletedEDDSummaryPage/MitigationEligibilityofBorrowerPage_text_Mitigation Eligibility of Borrower'), 
        0), 'Mitigation: Eligibility of Borrower')

MitigationEligibilityofBorrower = Mobile.getText(findTestObject('Object Repository/Tester03_old/DataEntryCompletedEDDSummaryPage/MitigationEligibilityofBorrowerPage_text_Mitigation Eligibility of Borrower'), 
    0).substring(12)

Mobile.verifyEqual(EligibilityofBorrower, MitigationEligibilityofBorrower)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/DataEntryCompletedEDDSummaryPage/MitigationEligibilityofBorrowerPage_text_Please review'), 
        0), 'Please review the policy breaches and enter the mitigation notes below')

Mobile.clearText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'), 
    0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/DataEntryCompletedEDDSummaryPage/MitigationPage_EditTextBox_Write the details'), 
        0), 'Write the details of the mitigation')

//Mobile.getText(findTestObject('Object Repository/Tester03_old/DataEntryCompletedEDDSummaryPage/MitigationPage_EditTextBox_Write the details'), 
//    0)
Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/DataEntryCompletedEDDSummaryPage/Mitigation_wordsCount_02000'), 
        0), '0/2000')

//CustomKeywords.'methods.ValidateTextBox.ValidateText_Alpha_Max'(findTestObject('Object Repository/Tester03_old/DataEntryCompletedEDDSummaryPage/MitigationPage_EditTextBox_Write the details'), 
//    2000)
Mobile.scrollToText('Save')

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_button_Save'), 
    0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_text_Mitigation Template'), 
        0), 'Mitigation Template')

'Mitigation Template: Eligibility of Borrower Icon Info'
//Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_InfoButton_Mitigation'), 
//    0)
//
//Mobile.verifyElementText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupTitle_Mitigation Template'), 
//    'Mitigation Template')
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupTitle_Mitigation Template'), 
//        0), 'Mitigation Template')
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibililtyofBorrower_PopupText_Template provided'), 
//        0), 'Template provided are examples only. If they apply to your case, copy it by clicking the ❐ icon and paste it into the mitigation note to be edited as needed.\n\nIf these examples do not apply to your case, do not copy and use them.')
//
//Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_button_Close'), 
//    0)

Mobile.takeScreenshot()

Mobile.callTestCase(findTestCase('Tester03/Pages/EDD Summary Page/TwoThousandOneCharactersError'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Employment tenure is too short')

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_text_Employment tenure is too short'), 
        0), 'Employment tenure is too short')

Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_Icon_DropDown'), 
    0)

EmploymentTenureTooShort_Reason1_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_DropdownText_Applicant has been'), 
    0)

Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_IconNo1_Copy'), 
    0)

Mobile.takeScreenshot()

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'), 
        0), 'Text copied')

Mobile.scrollToText('Mitigation: Eligibility of Borrower')

AppiumDriver<?> driver = MobileDriverFactory.getDriver()

String clipboard = driver.getClipboardText()

Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'), 
    clipboard, 0)

Mobile.takeScreenshot()

EmploymentTenureTooShort_Paste_Reason1_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'), 
    0)

Mobile.verifyEqual(EmploymentTenureTooShort_Reason1_AMBER, EmploymentTenureTooShort_Paste_Reason1_AMBER)

//Mobile.clearText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'), 
//    0)
//
//EmploymentTenureTooShort_Reason2_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_text_Better offer'), 
//    0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_IconNo2_Copy'), 
//    0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'), 
//        0), 'Text copied')
//
//clipboard = driver.getClipboardText()
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'), 
//    clipboard, 0)
//
//Mobile.takeScreenshot()
//
//EmploymentTenureTooShort_Paste_Reason2_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'), 
//    0)
//
//Mobile.verifyEqual(EmploymentTenureTooShort_Reason2_AMBER, EmploymentTenureTooShort_Paste_Reason2_AMBER)
//
//Mobile.clearText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'), 
//    0)
//
//Mobile.scrollToText('Save')
//
//Mobile.takeScreenshot()
//
//EmploymentTenureTooShort_Reason3_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_text_Applicant is under'), 
//    0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_IconNo3_Copy'), 
//    0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'), 
//        0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Eligibility of Borrower')
//
//clipboard = driver.getClipboardText()
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'), 
//    clipboard, 0)
//
//Mobile.takeScreenshot()
//
//EmploymentTenureTooShort_Paste_Reason3_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'), 
//    0)
//
//Mobile.verifyEqual(EmploymentTenureTooShort_Reason3_AMBER, EmploymentTenureTooShort_Paste_Reason3_AMBER)

Mobile.scrollToText('Save')

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_button_Save'), 
    0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/EDDSummaryPage_PopupText_Mitigation note saved'), 
        0), 'Mitigation note saved. You can still edit the details later if needed.')

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_Dynamicbutton_Edit Mitigation', 
        [('Verify') : 'Eligibility of Borrower']), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_Dynamicbutton_Edit Mitigation', 
        [('Verify') : 'Eligibility of Borrower']), 0), 'Edit Mitigation')


Mobile.takeScreenshot()

//Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/EDDSummaryPage_CreditCheck_text_RED'), 0)
//
//'Eligibility of Borrower Current Status: RED'
//Mobile.verifyElementExist(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_Dynamicbutton_Edit Mitigation', 
//        [('Verify') : 'Eligibility of Borrower']), 0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_Dynamicbutton_Edit Mitigation',
//		[('Verify') : 'Eligibility of Borrower']), 0)
//
//Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/DataEntryCompletedEDDSummaryPage/MitigationEligibilityofBorrowerPage_text_Mitigation Eligibility of Borrower'), 
//    0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/DataEntryCompletedEDDSummaryPage/MitigationEligibilityofBorrowerPage_text_Mitigation Eligibility of Borrower'), 
//        0), 'Mitigation: Eligibility of Borrower')
//
//MitigationEligibilityofBorrower = Mobile.getText(findTestObject('Object Repository/Tester03_old/DataEntryCompletedEDDSummaryPage/MitigationEligibilityofBorrowerPage_text_Mitigation Eligibility of Borrower'), 
//    0).substring(12)
//
//Mobile.verifyEqual(EligibilityofBorrower, MitigationEligibilityofBorrower)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/DataEntryCompletedEDDSummaryPage/MitigationEligibilityofBorrowerPage_text_Please review'), 
//        0), 'Please review the policy breaches and enter the mitigation notes below')
//
//Mobile.clearText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'), 
//    0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/DataEntryCompletedEDDSummaryPage/MitigationPage_EditTextBox_Write the details'), 
//        0), 'Write the details of the mitigation')
//
////Mobile.getText(findTestObject('Object Repository/Tester03_old/DataEntryCompletedEDDSummaryPage/MitigationPage_EditTextBox_Write the details'), 
////    0)
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/DataEntryCompletedEDDSummaryPage/Mitigation_wordsCount_02000'), 
//        0), '0/2000')
//
////CustomKeywords.'methods.ValidateTextBox.ValidateText_Alpha_Max'(findTestObject('Object Repository/Tester03_old/DataEntryCompletedEDDSummaryPage/MitigationPage_EditTextBox_Write the details'), 
////    2000)
//Mobile.scrollToText('Save')
//
//Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_button_Save'), 
//    0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_text_Mitigation Template'), 
//        0), 'Mitigation Template')
//
//'Mitigation Template: Eligibility of Borrower Icon Info'
//Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_InfoButton_Mitigation'), 
//    0)
//
//Mobile.verifyElementText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupTitle_Mitigation Template'), 
//    'Mitigation Template')
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupTitle_Mitigation Template'), 
//        0), 'Mitigation Template')
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibililtyofBorrower_PopupText_Template provided'), 
//        0), 'Template provided are examples only. If they apply to your case, copy it by clicking the ❐ icon and paste it into the mitigation note to be edited as needed.\n\nIf these examples do not apply to your case, do not copy and use them.')
//
//Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_button_Close'), 
//    0)
//
//Mobile.callTestCase(findTestCase('Tester03/Pages/EDD Summary Page/TwoThousandOneCharactersError'), [:], FailureHandling.STOP_ON_FAILURE)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_text_Employment tenure is too short'), 
//        0), 'Employment tenure is too short')
//
//Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_Icon_DropDown'), 
//    0)
//
//EmploymentTenureTooShort_Reason1_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_DropdownText_Applicant has been'), 
//    0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_IconNo1_Copy'), 
//    0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'), 
//        0), 'Text copied')
//
//clipboard = driver.getClipboardText()
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'), 
//    clipboard, 0)
//
//EmploymentTenureTooShort_Paste_Reason1_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'), 
//    0)
//
//Mobile.verifyEqual(EmploymentTenureTooShort_Reason1_RED, EmploymentTenureTooShort_Paste_Reason1_RED)
//
//Mobile.clearText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'), 
//    0)
//
//EmploymentTenureTooShort_Reason2_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_text_Better offer'), 
//    0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_IconNo2_Copy'), 
//    0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'), 
//        0), 'Text copied')
//
//clipboard = driver.getClipboardText()
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'), 
//    clipboard, 0)
//
//EmploymentTenureTooShort_Paste_Reason2_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'), 
//    0)
//
//Mobile.verifyEqual(EmploymentTenureTooShort_Reason2_RED, EmploymentTenureTooShort_Paste_Reason2_RED)
//
//Mobile.clearText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'), 
//    0)
//
//Mobile.scrollToText('Save')
//
//EmploymentTenureTooShort_Reason3_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_text_Applicant is under'), 
//    0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_IconNo3_Copy'), 
//    0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'), 
//        0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Eligibility of Borrower')
//
//clipboard = driver.getClipboardText()
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'), 
//    clipboard, 0)
//
//EmploymentTenureTooShort_Paste_Reason3_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'), 
//    0)
//
//Mobile.verifyEqual(EmploymentTenureTooShort_Reason3_RED, EmploymentTenureTooShort_Paste_Reason3_RED)
//
//Mobile.scrollToText('Save')
//
//Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_button_Save'), 
//    0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/EDDSummaryPage_PopupText_Mitigation note saved'), 
//        0), 'Mitigation note saved. You can still edit the details later if needed.')
//
//Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_Dynamicbutton_Edit Mitigation', 
//        [('Verify') : 'Eligibility of Borrower']), 0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/EDDSummaryPage_CreditCheck_text_GREEN'), 0)
//
//Mobile.closeApplication()

