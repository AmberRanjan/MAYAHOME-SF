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


Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation MOR DSR/MitigationMORDSRPage_TitleText_Mitigation MORDSR'),
	0)

Mobile.takeScreenshot()

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation MOR DSR/MitigationMORDSRPage_TitleText_Mitigation MORDSR'),
		0), 'Mitigation: MOR/DSR')

MitigationCollateral = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation MOR DSR/MitigationMORDSRPage_TitleText_Mitigation MORDSR'),
	0).substring(12)

//Mobile.verifyEqual(CreditCheck, MitigationCreditCheck)

//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/DataEntryCompletedEDDSummaryPage/MitigationEligibilityofBorrowerPage_text_Please review'),
//		0), 'Please review the policy breaches and enter the mitigation notes below')
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/DataEntryCompletedEDDSummaryPage/MitigationPage_EditTextBox_Write the details'),
//		0), 'Write the details of the mitigation')

//Mobile.getText(findTestObject('Object Repository/Tester03_old/DataEntryCompletedEDDSummaryPage/MitigationPage_EditTextBox_Write the details'),
//    0)
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/DataEntryCompletedEDDSummaryPage/Mitigation_wordsCount_02000'),
//		0), '0/2000')

//CustomKeywords.'methods.ValidateTextBox.ValidateText_Alpha_Max'(findTestObject('Object Repository/Tester03_old/DataEntryCompletedEDDSummaryPage/MitigationPage_EditTextBox_Write the details'),
//    2000)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_text_Mitigation Template'),
		0), 'Mitigation Template')

'Mitigation Template: Collateral Icon Info'
//Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_InfoButton_Mitigation'),
//	0)
//
//Mobile.delay(5)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupTitle_Mitigation Template'),
//		0), 'Mitigation Template')
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibililtyofBorrower_PopupText_Template provided'),
//		0, FailureHandling.OPTIONAL), 'Template provided are examples only. If they apply to your case, copy it by clicking the ❐ icon and paste it into the mitigation note to be edited as needed.\n\nIf these examples do not apply to your case, do not copy and use them.')
//
//Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_button_Close'),
//	0)

Mobile.takeScreenshot()

//Mobile.callTestCase(findTestCase('Tester03/Pages/EDD Summary Page/TwoThousandOneCharactersError'), [:], FailureHandling.STOP_ON_FAILURE)



Mobile.scrollToText('Mitigation: MOR/DSR')

Mobile.takeScreenshot()

Mobile.clearText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
	0)



Mobile.scrollToText('DSR exceeded')


Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation MOR DSR/MitigationMORDSR_fieldtext_DSR exceeded'),
		0), 'DSR exceeded')

Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'DSR exceeded']), 0)

DSRexceeded_Reason1_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation MOR DSR/MigitationMORDSR_DSRexceeded_text_High proportionate'),
	0)

Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation MOR DSR/MigitationMORDSR_DSRexceeded_CopyIcon_High proportionate'),
	0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
		0), 'Text copied')

Mobile.scrollToText('Mitigation: MOR/DSR')

AppiumDriver<?> driver = MobileDriverFactory.getDriver()

String clipboard = driver.getClipboardText()

Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
	clipboard, 0)

Mobile.takeScreenshot()

DSRexceeded_Paste_Reason1_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
	0)

Mobile.verifyEqual(DSRexceeded_Reason1_AMBER, DSRexceeded_Paste_Reason1_AMBER)

//Mobile.scrollToText('Financially strong with substantial savings/ FD/ ASNB/ EPF/rental income, etc as reserves and properties free from encumbrance.')
//
//DSRexceeded_Reason2_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation MOR DSR/MigitationMORDSR_DSRexceeded_text_Alternate income'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation MOR DSR/MigitationMORDSR_DSRexceeded_CopyIcon_Alternate income'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: MOR/DSR')
//
//clipboard = driver.getClipboardText()
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	clipboard, 0)
//
//Mobile.takeScreenshot()
//
//DSRexceeded_Paste_Reason2_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(DSRexceeded_Reason2_AMBER, DSRexceeded_Paste_Reason2_AMBER)
//
//Mobile.scrollToText('Financially strong with substantial savings/ FD/ ASNB/ EPF/rental income, etc as reserves and properties free from encumbrance.')
//
//Mobile.takeScreenshot()
//
//DSRexceeded_Reason3_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation MOR DSR/MigitationMORDSR_DSRexceeded_text_Permitted deviation'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation MOR DSR/MigitationMORDSR_DSRexceeded_CopyIcon_Permitted deviation'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: MOR/DSR')
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
//DSRexceeded_Paste_Reason3_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(DSRexceeded_Reason3_AMBER, DSRexceeded_Paste_Reason3_AMBER)
//
//Mobile.scrollToText('Good/ prompt repayment per CCRIS and with Maybank, existing loans successfully paid down substantially.')
//
//Mobile.takeScreenshot()
//
//DSRexceeded_Reason4_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation MOR DSR/MigitationMORDSR_DSRexceeded_text_Financially strong'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation MOR DSR/MigitationMORDSR_DSRexceeded_CopyIcon_Financially strong'),
//	0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: MOR/DSR')
//
//Mobile.takeScreenshot()
//
//clipboard = driver.getClipboardText()
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	clipboard, 0)
//
//DSRexceeded_Paste_Reason4_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(DSRexceeded_Reason4_AMBER, DSRexceeded_Paste_Reason4_AMBER)
//
//Mobile.scrollToText('Save')
//
//Mobile.takeScreenshot()
//
//DSRexceeded_Reason5_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation MOR DSR/MigitationMORDSR_DSRexceeded_text_Good prompt'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation MOR DSR/MigitationMORDSR_DSRexceeded_CopyIcon_Good prompt'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: MOR/DSR')
//
//clipboard = driver.getClipboardText()
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	clipboard, 0)
//
//Mobile.takeScreenshot()
//
//DSRexceeded_Paste_Reason5_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(DSRexceeded_Reason5_AMBER, DSRexceeded_Paste_Reason5_AMBER)
//
//Mobile.scrollToText('Save')
//
//Mobile.takeScreenshot()
//
//DSRexceeded_Reason6_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation MOR DSR/MigitationMORDSR_DSRexceeded_text_Professional reputable employer'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation MOR DSR/MigitationMORDSR_DSRexceeded_CopyIcon_Professional reputable employer'),
//	0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: MOR/DSR')
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
//DSRexceeded_Paste_Reason6_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(DSRexceeded_Reason6_AMBER, DSRexceeded_Paste_Reason6_AMBER)
//
//Mobile.scrollToText('Save')
//
//Mobile.takeScreenshot()
//
//DSRexceeded_Reason7_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation MOR DSR/MigitationMORDSR_DSRexceeded_text_Businessman, maintain'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation MOR DSR/MigitationMORDSR_DSRexceeded_CopyIcon_Businessman, maintain'),
//	0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: MOR/DSR')
//
//Mobile.takeScreenshot()
//
//clipboard = driver.getClipboardText()
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	clipboard, 0)
//
//DSRexceeded_Paste_Reason7_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(DSRexceeded_Reason7_AMBER, DSRexceeded_Paste_Reason7_AMBER)
//
//Mobile.scrollToText('Save')
//
//Mobile.takeScreenshot()
//
//DSRexceeded_Reason8_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation MOR DSR/MigitationMORDSR_DSRexceeded_text_Facility approaching'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation MOR DSR/MigitationMORDSR_DSRexceeded_CopyIcon_Facility approaching'),
//	0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: MOR/DSR')
//
//Mobile.takeScreenshot()
//
//clipboard = driver.getClipboardText()
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	clipboard, 0)
//
//DSRexceeded_Paste_Reason8_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(DSRexceeded_Reason8_AMBER, DSRexceeded_Paste_Reason8_AMBER)
//
//Mobile.scrollToText('Save')
//
//Mobile.takeScreenshot()
//
//DSRexceeded_Reason9_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation MOR DSR/MigitationMORDSR_DSRexceeded_text_Pledge FDRs'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation MOR DSR/MigitationMORDSR_DSRexceeded_CopyIcon_Pledge FDRs'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: MOR/DSR')
//
//clipboard = driver.getClipboardText()
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	clipboard, 0)
//
//Mobile.takeScreenshot()
//
//DSRexceeded_Paste_Reason9_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(DSRexceeded_Reason9_AMBER, DSRexceeded_Paste_Reason9_AMBER)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'DSR exceeded']), 0)
//
//Mobile.takeScreenshot()
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'Insufficient NDI']), 0)
//
//Mobile.takeScreenshot()
//
//InsufficientNDI_Reason1_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation MOR DSR/MigitationMORDSR_InsufficientNDI_text_To comment on'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation MOR DSR/MigitationMORDSR_InsufficientNDI_CopyIcon_To comment on'),
//	0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: MOR/DSR')
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
//InsufficientNDI_Paste_Reason1_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(InsufficientNDI_Reason1_AMBER, InsufficientNDI_Paste_Reason1_AMBER)

Mobile.scrollToText('Save')

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_button_Save'),
	0)

Mobile.takeScreenshot()

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/EDDSummaryPage_PopupText_Mitigation note saved'),
		0), 'Mitigation note saved. You can still edit the details later if needed.')

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_Dynamicbutton_Edit Mitigation',
	[('Verify') : 'MOR/DSR']), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_Dynamicbutton_Edit Mitigation',
	[('Verify') : 'MOR/DSR']), 0), 'Edit Mitigation')

Mobile.delay(5)

Mobile.takeScreenshot()

//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/EDDSummaryPage_text_RED', [('Verify') : 'MOR/DSR']), 0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_Dynamicbutton_Mitigate',
//[('Verify') : 'MOR/DSR']), 0)
//
//Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation MOR DSR/MitigationMORDSRPage_TitleText_Mitigation MORDSR'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation MOR DSR/MitigationMORDSRPage_TitleText_Mitigation MORDSR'),
//		0), 'Mitigation: MOR/DSR')
//
//MitigationMORDSR = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation MOR DSR/MitigationMORDSRPage_TitleText_Mitigation MORDSR'),
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
////'Mitigation Template: MOR/DSR Icon Info'
////Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_InfoButton_Mitigation'),
////	0)
////
////Mobile.verifyElementText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupTitle_Mitigation Template'),
////	'Mitigation Template')
////
////Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupTitle_Mitigation Template'),
////		0), 'Mitigation Template')
////
////Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibililtyofBorrower_PopupText_Template provided'),
////		0), 'Template provided are examples only. If they apply to your case, copy it by clicking the ❐ icon and paste it into the mitigation note to be edited as needed.\n\nIf these examples do not apply to your case, do not copy and use them.')
////
////Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_button_Close'),
////	0)
//
//Mobile.callTestCase(findTestCase('Tester03/Pages/EDD Summary Page/TwoThousandOneCharactersError'), [:], FailureHandling.STOP_ON_FAILURE)
//
//Mobile.scrollToText('Mitigation: MOR/DSR')
//
//Mobile.clearText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation MOR DSR/MitigationMORDSR_fieldtext_DSR exceeded'),
//		0), 'DSR exceeded')
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'DSR exceeded']), 0)
//
//DSRexceeded_Reason1_RED = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation MOR DSR/MigitationMORDSR_DSRexceeded_text_High proportionate'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation MOR DSR/MigitationMORDSR_DSRexceeded_CopyIcon_High proportionate'),
//	0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: MOR/DSR')
//
//AppiumDriver<?> driver = MobileDriverFactory.getDriver()
//
//String clipboard = driver.getClipboardText()
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	clipboard, 0)
//
//DSRexceeded_Paste_Reason1_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(DSRexceeded_Reason1_RED, DSRexceeded_Paste_Reason1_RED)
//
//DSRexceeded_Reason2_RED = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation MOR DSR/MigitationMORDSR_DSRexceeded_text_Alternate income'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation MOR DSR/MigitationMORDSR_DSRexceeded_CopyIcon_Alternate income'),
//	0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: MOR/DSR')
//
//clipboard = driver.getClipboardText()
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	clipboard, 0)
//
//DSRexceeded_Paste_Reason2_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(DSRexceeded_Reason2_RED, DSRexceeded_Paste_Reason2_RED)
//
//Mobile.scrollToText('Financially strong with substantial savings/ FD/ ASNB/ EPF/rental income, etc as reserves and properties free from encumbrance.')
//
//DSRexceeded_Reason3_RED = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation MOR DSR/MigitationMORDSR_DSRexceeded_text_Permitted deviation'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation MOR DSR/MigitationMORDSR_DSRexceeded_CopyIcon_Permitted deviation'),
//	0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: MOR/DSR')
//
//clipboard = driver.getClipboardText()
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	clipboard, 0)
//
//DSRexceeded_Paste_Reason3_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(DSRexceeded_Reason3_RED, DSRexceeded_Paste_Reason3_RED)
//
//Mobile.scrollToText('Good/ prompt repayment per CCRIS and with Maybank, existing loans successfully paid down substantially.')
//
//DSRexceeded_Reason4_RED = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation MOR DSR/MigitationMORDSR_DSRexceeded_text_Financially strong'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation MOR DSR/MigitationMORDSR_DSRexceeded_CopyIcon_Financially strong'),
//	0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: MOR/DSR')
//
//clipboard = driver.getClipboardText()
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	clipboard, 0)
//
//DSRexceeded_Paste_Reason4_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(DSRexceeded_Reason4_RED, DSRexceeded_Paste_Reason4_RED)
//
//Mobile.scrollToText('Save')
//
//DSRexceeded_Reason5_RED = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation MOR DSR/MigitationMORDSR_DSRexceeded_text_Good prompt'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation MOR DSR/MigitationMORDSR_DSRexceeded_CopyIcon_Good prompt'),
//	0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: MOR/DSR')
//
//clipboard = driver.getClipboardText()
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	clipboard, 0)
//
//DSRexceeded_Paste_Reason5_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(DSRexceeded_Reason5_RED, DSRexceeded_Paste_Reason5_RED)
//
//Mobile.scrollToText('Save')
//
//DSRexceeded_Reason6_RED = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation MOR DSR/MigitationMORDSR_DSRexceeded_text_Professional reputable employer'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation MOR DSR/MigitationMORDSR_DSRexceeded_CopyIcon_Professional reputable employer'),
//	0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: MOR/DSR')
//
//clipboard = driver.getClipboardText()
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	clipboard, 0)
//
//DSRexceeded_Paste_Reason6_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(DSRexceeded_Reason6_RED, DSRexceeded_Paste_Reason6_RED)
//
//Mobile.scrollToText('Save')
//
//DSRexceeded_Reason7_RED = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation MOR DSR/MigitationMORDSR_DSRexceeded_text_Businessman, maintain'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation MOR DSR/MigitationMORDSR_DSRexceeded_CopyIcon_Businessman, maintain'),
//	0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: MOR/DSR')
//
//clipboard = driver.getClipboardText()
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	clipboard, 0)
//
//DSRexceeded_Paste_Reason7_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(DSRexceeded_Reason7_RED, DSRexceeded_Paste_Reason7_RED)
//
//Mobile.scrollToText('Save')
//
//DSRexceeded_Reason8_RED = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation MOR DSR/MigitationMORDSR_DSRexceeded_text_Facility approaching'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation MOR DSR/MigitationMORDSR_DSRexceeded_CopyIcon_Facility approaching'),
//	0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: MOR/DSR')
//
//clipboard = driver.getClipboardText()
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	clipboard, 0)
//
//DSRexceeded_Paste_Reason8_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(DSRexceeded_Reason8_RED, DSRexceeded_Paste_Reason8_RED)
//
//Mobile.scrollToText('Save')
//
//DSRexceeded_Reason9_RED = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation MOR DSR/MigitationMORDSR_DSRexceeded_text_Pledge FDRs'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation MOR DSR/MigitationMORDSR_DSRexceeded_CopyIcon_Pledge FDRs'),
//	0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: MOR/DSR')
//
//clipboard = driver.getClipboardText()
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	clipboard, 0)
//
//DSRexceeded_Paste_Reason9_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(DSRexceeded_Reason9_RED, DSRexceeded_Paste_Reason9_RED)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'DSR exceeded']), 0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'Insufficient NDI']), 0)
//
//InsufficientNDI_Reason1_RED = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation MOR DSR/MigitationMORDSR_InsufficientNDI_text_To comment on'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation MOR DSR/MigitationMORDSR_InsufficientNDI_CopyIcon_To comment on'),
//	0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: MOR/DSR')
//
//clipboard = driver.getClipboardText()
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	clipboard, 0)
//
//InsufficientNDI_Paste_Reason1_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(InsufficientNDI_Reason1_RED, InsufficientNDI_Paste_Reason1_RED)
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
//	[('Verify') : 'MOR/DSR']), 0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_Dynamicbutton_Edit Mitigation',
//	[('Verify') : 'MOR/DSR']), 0), 'Edit Mitigation')
//
//Mobile.closeApplication()