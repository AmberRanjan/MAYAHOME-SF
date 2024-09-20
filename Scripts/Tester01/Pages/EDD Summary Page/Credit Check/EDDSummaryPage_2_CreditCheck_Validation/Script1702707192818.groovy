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


Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_TitleText_Mitigation Credit Check'), 
    0)

Mobile.takeScreenshot()

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_TitleText_Mitigation Credit Check'), 
        0), 'Mitigation: Credit Check')

MitigationCreditCheck = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_TitleText_Mitigation Credit Check'), 
    0).substring(12)

//Mobile.verifyEqual(CreditCheck, MitigationCreditCheck)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/DataEntryCompletedEDDSummaryPage/MitigationEligibilityofBorrowerPage_text_Please review'), 
        0), 'Please review the policy breaches and enter the mitigation notes below')

//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/DataEntryCompletedEDDSummaryPage/MitigationPage_EditTextBox_Write the details'), 
//        0), 'Write the details of the mitigation')

//Mobile.getText(findTestObject('Object Repository/Tester03_old/DataEntryCompletedEDDSummaryPage/MitigationPage_EditTextBox_Write the details'), 
//    0)
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/DataEntryCompletedEDDSummaryPage/Mitigation_wordsCount_02000'), 
//        0), '0/2000')

//CustomKeywords.'methods.ValidateTextBox.ValidateText_Alpha_Max'(findTestObject('Object Repository/Tester03_old/DataEntryCompletedEDDSummaryPage/MitigationPage_EditTextBox_Write the details'), 
//    2000)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_text_Mitigation Template'), 
        0), 'Mitigation Template')

'Mitigation Template: Credit Check Icon Info'
//Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_InfoButton_Mitigation'), 
//    0)
//
//Mobile.takeScreenshot()
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

Mobile.scrollToText('Mitigation: Credit Check')

Mobile.clearText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
	0)

Mobile.scrollToText('Unsatisfactory CCRIS')

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_FieldText_Unsatisfactory OCISS'), 
        0), 'Unsatisfactory OCISS')

Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'Unsatisfactory OCISS']), 0)

Mobile.takeScreenshot()

UnsatisfactoryOCISS_Reason1_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_UnsatisfactoryOCISS_text_Adverse status'), 
    0)

Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_UnsatisfactoryOCISS_CopyIcon_Adverse status'), 
    0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'), 
        0), 'Text copied')

Mobile.scrollToText('Mitigation: Credit Check')

AppiumDriver<?> driver = MobileDriverFactory.getDriver()

String clipboard = driver.getClipboardText()

Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'), 
    clipboard, 0)

UnsatisfactoryOCISS_Paste_Reason1_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'), 
    0)

Mobile.verifyEqual(UnsatisfactoryOCISS_Reason1_AMBER, UnsatisfactoryOCISS_Paste_Reason1_AMBER)

//Mobile.scrollToText('Save')
//
//Mobile.takeScreenshot()
//
//UnsatisfactoryOCISS_Reason2_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_UnsatisfactoryOCISS_text_Latest update indicates'), 
//    0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_IconNo2_Copy'), 
//    0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'), 
//        0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Credit Check')
//
//Mobile.takeScreenshot()
//
//clipboard = driver.getClipboardText()
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'), 
//    clipboard, 0)
//
//UnsatisfactoryOCISS_Paste_Reason2_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'), 
//    0)
//
//Mobile.verifyEqual(UnsatisfactoryOCISS_Reason2_AMBER, UnsatisfactoryOCISS_Paste_Reason2_AMBER)
//
//Mobile.scrollToText('Save')
//
//Mobile.takeScreenshot()
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'Unsatisfactory OCISS']), 0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_FieldText_Unsatisfactory CCRIS'),
//	0), 'Unsatisfactory CCRIS')
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'Unsatisfactory CCRIS']), 0)
//
//Mobile.takeScreenshot()
//
//UnsatisfactoryCCRIS_Reason1_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_UnsatisfactoryCCRIS_text_Applicant to obtain letter'), 
//    0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_UnsatisfactoryCCRIS_CopyIcon_Applicant to obtain letter'), 
//    0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'), 
//        0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Credit Check')
//
//Mobile.takeScreenshot()
//
//clipboard = driver.getClipboardText()
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'), 
//    clipboard, 0)
//
//UnsatisfactoryCCRIS_Paste_Reason1_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'), 
//    0)
//
//Mobile.verifyEqual(UnsatisfactoryCCRIS_Reason1_AMBER, UnsatisfactoryCCRIS_Paste_Reason1_AMBER)
//
//Mobile.scrollToText('Use deposits as a back-up (acceptable CASA).')
//
//Mobile.takeScreenshot()
//
//UnsatisfactoryCCRIS_Reason2_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_UnsatisfactoryCCRIS_text_Opt for fair risk'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_UnsatisfactoryCCRIS_CopyIcon_Opt for fair risk'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Credit Check')
//
//Mobile.takeScreenshot()
//
//clipboard = driver.getClipboardText()
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	clipboard, 0)
//
//UnsatisfactoryCCRIS_Paste_Reason2_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(UnsatisfactoryCCRIS_Reason2_AMBER, UnsatisfactoryCCRIS_Paste_Reason2_AMBER)
//
//Mobile.scrollToText('Save')
//
//Mobile.takeScreenshot()
//
//UnsatisfactoryCCRIS_Reason3_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_UnsatisfactoryCCRIS_text_Use deposits'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_UnsatisfactoryCCRIS_CopyIcon_Use deposits'),
//	0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Credit Check')
//
//Mobile.takeScreenshot()
//
//clipboard = driver.getClipboardText()
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	clipboard, 0)
//
//Mobile.takeScreenshot()
//
//UnsatisfactoryCCRIS_Paste_Reason3_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(UnsatisfactoryCCRIS_Reason3_AMBER, UnsatisfactoryCCRIS_Paste_Reason3_AMBER)
//
//Mobile.scrollToText('Save')
//
//Mobile.takeScreenshot()
//
//UnsatisfactoryCCRIS_Reason4_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_UnsatisfactoryCCRIS_text_Added joint applicant'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_UnsatisfactoryCCRIS_CopyIcon_Added joint applicant'),
//	0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Credit Check')
//
//clipboard = driver.getClipboardText()
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	clipboard, 0)
//
//Mobile.takeScreenshot()
//
//UnsatisfactoryCCRIS_Paste_Reason4_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(UnsatisfactoryCCRIS_Reason4_AMBER, UnsatisfactoryCCRIS_Paste_Reason4_AMBER)
//
//Mobile.scrollToText('Save')
//
//Mobile.takeScreenshot()
//
//UnsatisfactoryCCRIS_Reason5_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_UnsatisfactoryCCRIS_text_Originator to assess'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_UnsatisfactoryCCRIS_CopyIcon_Originator to assess'),
//	0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Credit Check')
//
//clipboard = driver.getClipboardText()
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	clipboard, 0)
//
//Mobile.takeScreenshot()
//
//UnsatisfactoryCCRIS_Paste_Reason5_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(UnsatisfactoryCCRIS_Reason5_AMBER, UnsatisfactoryCCRIS_Paste_Reason5_AMBER)
//
//Mobile.scrollToText('Save')
//
//Mobile.takeScreenshot()
//
//UnsatisfactoryCCRIS_Reason6_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_UnsatisfactoryCCRIS_text_Employment is stable'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_UnsatisfactoryCCRIS_CopyIcon_Employment is stable'),
//	0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Credit Check')
//
//Mobile.takeScreenshot()
//
//clipboard = driver.getClipboardText()
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	clipboard, 0)
//
//Mobile.takeScreenshot()
//
//UnsatisfactoryCCRIS_Paste_Reason6_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(UnsatisfactoryCCRIS_Reason6_AMBER, UnsatisfactoryCCRIS_Paste_Reason6_AMBER)
//
//Mobile.scrollToText('Save')
//
//Mobile.takeScreenshot()
//
//UnsatisfactoryCCRIS_Reason7_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_UnsatisfactoryCCRIS_text_Due to downside of risk- abandon project'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_UnsatisfactoryCCRIS_CopyIcon_Due to downside of risk- abandon project'),
//	0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Credit Check')
//
//Mobile.takeScreenshot()
//
//clipboard = driver.getClipboardText()
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	clipboard, 0)
//
//Mobile.takeScreenshot()
//
//UnsatisfactoryCCRIS_Paste_Reason7_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(UnsatisfactoryCCRIS_Reason7_AMBER, UnsatisfactoryCCRIS_Paste_Reason7_AMBER)
//
//Mobile.scrollToText('Applicant to obtain letter of regularization/ settlement.')
//
//Mobile.takeScreenshot()
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'Unsatisfactory CCRIS']), 0)
//
//Mobile.takeScreenshot()
//
//Mobile.scrollToText('Save')
//
//Mobile.takeScreenshot()
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'Adverse findings on Other credit checks']), 0)
//
//Mobile.takeScreenshot()
//
//AdversefindingsonOthercreditchecks_Reason1_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_AdversefindingsonOthercreditchecks_text_Attached documents'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_AdversefindingsonOthercreditchecks_CopyIcon_Attached documents'),
//	0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Credit Check')
//
//Mobile.takeScreenshot()
//
//clipboard = driver.getClipboardText()
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	clipboard, 0)
//
//Mobile.takeScreenshot()
//
//AdversefindingsonOthercreditchecks_Paste_Reason1_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(AdversefindingsonOthercreditchecks_Reason1_AMBER, AdversefindingsonOthercreditchecks_Paste_Reason1_AMBER)
//
//Mobile.scrollToText('Save')
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'Adverse findings on Other credit checks']), 0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'Multiple OCISS status']), 0)
//
//MultipleOCISSstatus_Reason1_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_MultipleOCISSstatus_text_Address has been checked accordingly'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_MultipleOCISSstatus_CopyIcon_Address has been checked accordingly'),
//	0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Credit Check')
//
//Mobile.takeScreenshot()
//
//clipboard = driver.getClipboardText()
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	clipboard, 0)
//
//MultipleOCISSstatus_Paste_Reason1_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(MultipleOCISSstatus_Reason1_AMBER, MultipleOCISSstatus_Paste_Reason1_AMBER)

Mobile.scrollToText('Save')

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_button_Save'),
	0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/EDDSummaryPage_PopupText_Mitigation note saved'), 
        0), 'Mitigation note saved. You can still edit the details later if needed.')

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_Dynamicbutton_Edit Mitigation', 
        [('Verify') : 'Credit Check']), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_Dynamicbutton_Edit Mitigation', 
        [('Verify') : 'Credit Check']), 0), 'Edit Mitigation')

Mobile.takeScreenshot()

//Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/EDDSummaryPage_CreditCheck_text_RED', [('Verify') : 'Credit Check']), 0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_Dynamicbutton_Mitigate',
//	[('Verify') : 'Credit Check']), 0)
//
//Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_TitleText_Mitigation Credit Check'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_TitleText_Mitigation Credit Check'),
//		0), 'Mitigation: Credit Check')
//
//MitigationCreditCheck = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_TitleText_Mitigation Credit Check'),
//	0).substring(12)
//
////Mobile.verifyEqual(CreditCheck, MitigationCreditCheck)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/DataEntryCompletedEDDSummaryPage/MitigationEligibilityofBorrowerPage_text_Please review'),
//		0), 'Please review the policy breaches and enter the mitigation notes below')
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/DataEntryCompletedEDDSummaryPage/MitigationPage_EditTextBox_Write the details'),
//		0), 'Write the details of the mitigation')
//
////Mobile.getText(findTestObject('Object Repository/Tester03_old/DataEntryCompletedEDDSummaryPage/MitigationPage_EditTextBox_Write the details'),
////    0)
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/DataEntryCompletedEDDSummaryPage/Mitigation_wordsCount_02000'),
//		0), '0/2000')
//
////CustomKeywords.'methods.ValidateTextBox.ValidateText_Alpha_Max'(findTestObject('Object Repository/Tester03_old/DataEntryCompletedEDDSummaryPage/MitigationPage_EditTextBox_Write the details'),
////    2000)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_text_Mitigation Template'),
//		0), 'Mitigation Template')
//
//'Mitigation Template: Credit Check Icon Info'
//Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_InfoButton_Mitigation'),
//	0)
//
//Mobile.verifyElementText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupTitle_Mitigation Template'),
//	'Mitigation Template')
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupTitle_Mitigation Template'),
//		0), 'Mitigation Template')
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibililtyofBorrower_PopupText_Template provided'),
//		0), 'Template provided are examples only. If they apply to your case, copy it by clicking the ❐ icon and paste it into the mitigation note to be edited as needed.\n\nIf these examples do not apply to your case, do not copy and use them.')
//
//Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_button_Close'),
//	0)
//
//Mobile.callTestCase(findTestCase('Tester03/Pages/EDD Summary Page/TwoThousandOneCharactersError'), [:], FailureHandling.STOP_ON_FAILURE)
//
//Mobile.scrollToText('Mitigation: Credit Check')
//
//Mobile.clearText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.scrollToText('Unsatisfactory CCRIS')
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_FieldText_Unsatisfactory OCISS'),
//		0), 'Unsatisfactory OCISS')
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'Unsatisfactory OCISS']), 0)
//
//UnsatisfactoryOCISS_Reason1_RED = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_UnsatisfactoryOCISS_text_Adverse status'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_UnsatisfactoryOCISS_CopyIcon_Adverse status'),
//	0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Credit Check')
//
//clipboard = driver.getClipboardText()
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	clipboard, 0)
//
//UnsatisfactoryOCISS_Paste_Reason1_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(UnsatisfactoryOCISS_Reason1_RED, UnsatisfactoryOCISS_Paste_Reason1_RED)
//
//Mobile.scrollToText('Save')
//
//UnsatisfactoryOCISS_Reason2_RED = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_UnsatisfactoryOCISS_text_Latest update indicates'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_IconNo2_Copy'),
//	0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Credit Check')
//
//clipboard = driver.getClipboardText()
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	clipboard, 0)
//
//UnsatisfactoryOCISS_Paste_Reason2_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(UnsatisfactoryOCISS_Reason2_RED, UnsatisfactoryOCISS_Paste_Reason2_RED)
//
//Mobile.scrollToText('Save')
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'Unsatisfactory OCISS']), 0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_FieldText_Unsatisfactory CCRIS'),
//	0), 'Unsatisfactory CCRIS')
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'Unsatisfactory CCRIS']), 0)
//
//UnsatisfactoryCCRIS_Reason1_RED = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_UnsatisfactoryCCRIS_text_Applicant to obtain letter'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_UnsatisfactoryCCRIS_CopyIcon_Applicant to obtain letter'),
//	0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Credit Check')
//
//clipboard = driver.getClipboardText()
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	clipboard, 0)
//
//UnsatisfactoryCCRIS_Paste_Reason1_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(UnsatisfactoryCCRIS_Reason1_RED, UnsatisfactoryCCRIS_Paste_Reason1_RED)
//
//Mobile.scrollToText('Added joint applicant to strengthen the credit.')
//
//UnsatisfactoryCCRIS_Reason2_RED = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_UnsatisfactoryCCRIS_text_Opt for fair risk'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_UnsatisfactoryCCRIS_CopyIcon_Opt for fair risk'),
//	0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Credit Check')
//
//clipboard = driver.getClipboardText()
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	clipboard, 0)
//
//UnsatisfactoryCCRIS_Paste_Reason2_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(UnsatisfactoryCCRIS_Reason2_RED, UnsatisfactoryCCRIS_Paste_Reason2_RED)
//
//Mobile.scrollToText('Save')
//
//UnsatisfactoryCCRIS_Reason3_RED = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_UnsatisfactoryCCRIS_text_Use deposits'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_UnsatisfactoryCCRIS_CopyIcon_Use deposits'),
//	0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Credit Check')
//
//clipboard = driver.getClipboardText()
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	clipboard, 0)
//
//UnsatisfactoryCCRIS_Paste_Reason3_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(UnsatisfactoryCCRIS_Reason3_RED, UnsatisfactoryCCRIS_Paste_Reason3_RED)
//
//Mobile.scrollToText('Save')
//
//UnsatisfactoryCCRIS_Reason4_RED = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_UnsatisfactoryCCRIS_text_Added joint applicant'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_UnsatisfactoryCCRIS_CopyIcon_Added joint applicant'),
//	0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Credit Check')
//
//clipboard = driver.getClipboardText()
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	clipboard, 0)
//
//UnsatisfactoryCCRIS_Paste_Reason4_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(UnsatisfactoryCCRIS_Reason4_RED, UnsatisfactoryCCRIS_Paste_Reason4_RED)
//
//Mobile.scrollToText('Save')
//
//UnsatisfactoryCCRIS_Reason5_RED = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_UnsatisfactoryCCRIS_text_Originator to assess'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_UnsatisfactoryCCRIS_CopyIcon_Originator to assess'),
//	0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Credit Check')
//
//clipboard = driver.getClipboardText()
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	clipboard, 0)
//
//UnsatisfactoryCCRIS_Paste_Reason5_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(UnsatisfactoryCCRIS_Reason5_RED, UnsatisfactoryCCRIS_Paste_Reason5_RED)
//
//Mobile.scrollToText('Save')
//
//UnsatisfactoryCCRIS_Reason6_RED = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_UnsatisfactoryCCRIS_text_Employment is stable'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_UnsatisfactoryCCRIS_CopyIcon_Employment is stable'),
//	0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Credit Check')
//
//clipboard = driver.getClipboardText()
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	clipboard, 0)
//
//UnsatisfactoryCCRIS_Paste_Reason6_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(UnsatisfactoryCCRIS_Reason6_RED, UnsatisfactoryCCRIS_Paste_Reason6_RED)
//
//Mobile.scrollToText('Save')
//
//UnsatisfactoryCCRIS_Reason7_RED = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_UnsatisfactoryCCRIS_text_Due to downside of risk- abandon project'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_UnsatisfactoryCCRIS_CopyIcon_Due to downside of risk- abandon project'),
//	0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Credit Check')
//
//clipboard = driver.getClipboardText()
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	clipboard, 0)
//
//UnsatisfactoryCCRIS_Paste_Reason7_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(UnsatisfactoryCCRIS_Reason7_RED, UnsatisfactoryCCRIS_Paste_Reason7_RED)
//
//Mobile.scrollToText('Applicant to obtain letter of regularization/ settlement.')
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'Unsatisfactory CCRIS']), 0)
//
//Mobile.scrollToText('Save')
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'Adverse findings on Other credit checks']), 0)
//
//AdversefindingsonOthercreditchecks_Reason1_RED = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_AdversefindingsonOthercreditchecks_text_Attached documents'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_AdversefindingsonOthercreditchecks_CopyIcon_Attached documents'),
//	0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Credit Check')
//
//clipboard = driver.getClipboardText()
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	clipboard, 0)
//
//AdversefindingsonOthercreditchecks_Paste_Reason1_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(AdversefindingsonOthercreditchecks_Reason1_RED, AdversefindingsonOthercreditchecks_Paste_Reason1_RED)
//
//Mobile.scrollToText('Save')
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'Adverse findings on Other credit checks']), 0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'Multiple OCISS status']), 0)
//
//MultipleOCISSstatus_Reason1_RED = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_MultipleOCISSstatus_text_Address has been checked accordingly'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_MultipleOCISSstatus_CopyIcon_Address has been checked accordingly'),
//	0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Credit Check')
//
//clipboard = driver.getClipboardText()
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	clipboard, 0)
//
//MultipleOCISSstatus_Paste_Reason1_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(MultipleOCISSstatus_Reason1_RED, MultipleOCISSstatus_Paste_Reason1_RED)
//
//Mobile.scrollToText('Save')
//
//Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_button_Save'),
//	0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/EDDSummaryPage_PopupText_Mitigation note saved'),
//		0), 'Mitigation note saved. You can still edit the details later if needed.')
//
//Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_Dynamicbutton_Edit Mitigation',
//		[('Verify') : 'Credit Check']), 0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_Dynamicbutton_Edit Mitigation',
//		[('Verify') : 'Credit Check']), 0), 'Edit Mitigation')
//
//Mobile.closeApplication()

