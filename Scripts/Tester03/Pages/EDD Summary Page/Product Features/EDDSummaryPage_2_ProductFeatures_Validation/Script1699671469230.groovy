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

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Product Features/MitigationProductFeaturesPage_TitleText_Mitigation Product Features'),
	0)

Mobile.takeScreenshot()

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Product Features/MitigationProductFeaturesPage_TitleText_Mitigation Product Features'),
		0), 'Mitigation: Product Features')

MitigationProductFeatures = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Product Features/MitigationProductFeaturesPage_TitleText_Mitigation Product Features'),
	0).substring(12)

Mobile.verifyEqual(ProductFeatures, MitigationProductFeatures)

//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/DataEntryCompletedEDDSummaryPage/MitigationEligibilityofBorrowerPage_text_Please review'),
//		0), 'Please review the policy breaches and enter the mitigation notes below')
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/DataEntryCompletedEDDSummaryPage/MitigationPage_EditTextBox_Write the details'),
//		0), 'Write the details of the mitigation')
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/DataEntryCompletedEDDSummaryPage/Mitigation_wordsCount_02000'),
//		0), '0/2000')

//CustomKeywords.'methods.ValidateTextBox.ValidateText_Alpha_Max'(findTestObject('Object Repository/Tester03_old/DataEntryCompletedEDDSummaryPage/MitigationPage_EditTextBox_Write the details'),
//    2000)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_text_Mitigation Template'),
		0), 'Mitigation Template')

'Mitigation Template: Product Features Icon Info'
//Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_InfoButton_Mitigation'),
//	0)
//
//Mobile.takeScreenshot() 
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

Mobile.callTestCase(findTestCase('Tester03/Pages/EDD Summary Page/TwoThousandOneCharactersError'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Mitigation: Product Features')

Mobile.takeScreenshot() 

Mobile.clearText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
	0)

Mobile.takeScreenshot()

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Product Features/MitigationProductFeaturesPage_FieldText_High MOA'),
		0), 'High MOA')

Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'High MOA']), 0)

Mobile.takeScreenshot()

HighMOA_Reason1_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Product Features/MitigationProductFeaturesPage_HighMOA_text_Low DSR  DSR within guidelines'),
	0)

Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Product Features/MitigationProductFeaturesPage_HighMOA_CopyIcon_Low DSR  DSR within guidelines'),
	0)

Mobile.takeScreenshot()

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
		0), 'Text copied')

Mobile.scrollToText('Mitigation: Product Features')

Mobile.takeScreenshot()

AppiumDriver<?> driver = MobileDriverFactory.getDriver()

String clipboard = driver.getClipboardText()

Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
	clipboard, 0)

Mobile.takeScreenshot()

HighMOA_Paste_Reason1_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
	0)

Mobile.verifyEqual(HighMOA_Reason1_AMBER, HighMOA_Paste_Reason1_AMBER)

//HighMOA_Reason2_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Product Features/MitigationProductFeaturesPage_HighMOA_text_Professional  HNW Affluent customer'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Product Features/MitigationProductFeaturesPage_HighMOA_CopyIcon_Professional  HNW Affluent customer'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Product Features')
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
//HighMOA_Paste_Reason2_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(HighMOA_Reason2_AMBER, HighMOA_Paste_Reason2_AMBER)
//
//HighMOA_Reason3_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Product Features/MitigationProductFeaturesPage_HighMOA_text_Development is in prime area'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Product Features/MitigationProductFeaturesPage_HighMOA_CopyIcon_Development is in prime area'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Product Features')
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
//HighMOA_Paste_Reason3_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(HighMOA_Reason3_AMBER, HighMOA_Paste_Reason3_AMBER)
//
//Mobile.scrollToText('Save')
//
//HighMOA_Reason4_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Product Features/MitigationProductFeaturesPage_HighMOA_text_Reputable developer'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Product Features/MitigationProductFeaturesPage_HighMOA_CopyIcon_Reputable developer'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Product Features')
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
//HighMOA_Paste_Reason4_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(HighMOA_Reason4_AMBER, HighMOA_Paste_Reason4_AMBER)
//
//Mobile.scrollToText('Save')
//
//HighMOA_Reason5_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Product Features/MitigationProductFeaturesPage_HighMOA_text_Strong financial buffer'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Product Features/MitigationProductFeaturesPage_HighMOA_CopyIcon_Strong financial buffer'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Product Features')
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
//HighMOA_Paste_Reason5_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(HighMOA_Reason5_AMBER, HighMOA_Paste_Reason5_AMBER)
//
//Mobile.scrollToText('Save')
//
//HighMOA_Reason6_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Product Features/MitigationProductFeaturesPage_HighMOA_text_Good  prompt repayment'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Product Features/MitigationProductFeaturesPage_HighMOA_CopyIcon_Good  prompt repayment'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Product Features')
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
//HighMOA_Paste_Reason6_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(HighMOA_Reason6_AMBER, HighMOA_Paste_Reason6_AMBER)
//
//Mobile.scrollToText('Save')
//
//HighMOA_Reason7_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Product Features/MitigationProductFeaturesPage_HighMOA_text_Strong company ac with our Bank (AMD)'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Product Features/MitigationProductFeaturesPage_HighMOA_CopyIcon_Strong company ac with our Bank (AMD)'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Product Features')
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
//HighMOA_Paste_Reason7_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(HighMOA_Reason7_AMBER, HighMOA_Paste_Reason7_AMBER)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'High MOA']), 0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Product Features/MitigationProductFeaturesPage_FieldText_Longer loan tenure'),
//	0), 'Longer loan tenure')
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'Longer loan tenure']), 0)
//
//Mobile.takeScreenshot()
//
//Mobile.scrollToText('Save')
//
//Mobile.takeScreenshot()
//
//Longerloantenure_Reason1_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Product Features/MitigationProductFeaturesPage_Longerloantenure_text_Applicant not subject to retirement age'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Product Features/MitigationProductFeaturesPage_Longerloantenure_CopyIcon_Applicant not subject to retirement age'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Product Features')
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
//Longerloantenure_Paste_Reason1_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(Longerloantenure_Reason1_AMBER, Longerloantenure_Paste_Reason1_AMBER)
//
//Mobile.scrollToText('Save')
//
//Longerloantenure_Reason2_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Product Features/MitigationProductFeaturesPage_Longerloantenure_text_Applicant is self-employed'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Product Features/MitigationProductFeaturesPage_Longerloantenure_CopyIcon_Applicant is self-employed'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Product Features')
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
//Longerloantenure_Paste_Reason2_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(Longerloantenure_Reason2_AMBER, Longerloantenure_Paste_Reason2_AMBER)
//
//Mobile.scrollToText('Save')
//
//Mobile.takeScreenshot()
//
//Longerloantenure_Reason3_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Product Features/MitigationProductFeaturesPage_Longerloantenure_text_Applicant has substantial savingsFDREPF as reserve'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Product Features/MitigationProductFeaturesPage_Longerloantenure_CopyIcon_Applicant has substantial savingsFDREPF as reserve'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Product Features')
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
//Longerloantenure_Paste_Reason3_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(Longerloantenure_Reason3_AMBER, Longerloantenure_Paste_Reason3_AMBER)

Mobile.scrollToText('Save')

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_button_Save'),
	0)

Mobile.takeScreenshot()

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/EDDSummaryPage_PopupText_Mitigation note saved'),
		0), 'Mitigation note saved. You can still edit the details later if needed.')

Mobile.scrollToText('Proceed')

Mobile.takeScreenshot()

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_Dynamicbutton_Edit Mitigation',
	[('Verify') : 'Product Features']), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_Dynamicbutton_Edit Mitigation',
	[('Verify') : 'Product Features']), 0), 'Edit Mitigation')

Mobile.takeScreenshot()



//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/EDDSummaryPage_text_RED', [('Verify') : 'Product Features']), 0)
//
//Mobile.takeScreenshot()
//
//Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_Dynamicbutton_Mitigate',
//[('Verify') : 'Product Features']), 0)
//
//
//
//Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Product Features/MitigationProductFeaturesPage_TitleText_Mitigation Product Features'),
//	0)
//
//Mobile.takeScreenshot()
//
//'Mitigation Template: Product Features Icon Info'
//Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_InfoButton_Mitigation'),
//	0)
//
//Mobile.takeScreenshot()
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
//Mobile.scrollToText('Mitigation: Product Features')
//
//Mobile.takeScreenshot()
//
//Mobile.clearText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Product Features/MitigationProductFeaturesPage_FieldText_High MOA'),
//		0), 'High MOA')
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'High MOA']), 0)
//
//Mobile.takeScreenshot()
//
//HighMOA_Reason1_RED = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Product Features/MitigationProductFeaturesPage_HighMOA_text_Low DSR  DSR within guidelines'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Product Features/MitigationProductFeaturesPage_HighMOA_CopyIcon_Low DSR  DSR within guidelines'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Product Features')
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
//HighMOA_Paste_Reason1_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(HighMOA_Reason1_RED, HighMOA_Paste_Reason1_RED)
//
//HighMOA_Reason2_RED = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Product Features/MitigationProductFeaturesPage_HighMOA_text_Professional  HNW Affluent customer'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Product Features/MitigationProductFeaturesPage_HighMOA_CopyIcon_Professional  HNW Affluent customer'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Product Features')
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
//HighMOA_Paste_Reason2_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(HighMOA_Reason2_RED, HighMOA_Paste_Reason2_RED)
//
//HighMOA_Reason3_RED = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Product Features/MitigationProductFeaturesPage_HighMOA_text_Development is in prime area'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Product Features/MitigationProductFeaturesPage_HighMOA_CopyIcon_Development is in prime area'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Product Features')
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
//HighMOA_Paste_Reason3_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(HighMOA_Reason3_RED, HighMOA_Paste_Reason3_RED)
//
//Mobile.scrollToText('Save')
//
//HighMOA_Reason4_RED = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Product Features/MitigationProductFeaturesPage_HighMOA_text_Reputable developer'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Product Features/MitigationProductFeaturesPage_HighMOA_CopyIcon_Reputable developer'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Product Features')
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
//HighMOA_Paste_Reason4_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(HighMOA_Reason4_RED, HighMOA_Paste_Reason4_RED)
//
//Mobile.scrollToText('Save')
//
//HighMOA_Reason5_RED = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Product Features/MitigationProductFeaturesPage_HighMOA_text_Strong financial buffer'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Product Features/MitigationProductFeaturesPage_HighMOA_CopyIcon_Strong financial buffer'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Product Features')
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
//HighMOA_Paste_Reason5_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(HighMOA_Reason5_RED, HighMOA_Paste_Reason5_RED)
//
//Mobile.scrollToText('Save')
//
//HighMOA_Reason6_RED = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Product Features/MitigationProductFeaturesPage_HighMOA_text_Good  prompt repayment'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Product Features/MitigationProductFeaturesPage_HighMOA_CopyIcon_Good  prompt repayment'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Product Features')
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
//HighMOA_Paste_Reason6_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(HighMOA_Reason6_RED, HighMOA_Paste_Reason6_RED)
//
//Mobile.scrollToText('Save')
//
//HighMOA_Reason7_RED = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Product Features/MitigationProductFeaturesPage_HighMOA_text_Strong company ac with our Bank (AMD)'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Product Features/MitigationProductFeaturesPage_HighMOA_CopyIcon_Strong company ac with our Bank (AMD)'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Product Features')
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
//HighMOA_Paste_Reason7_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(HighMOA_Reason7_RED, HighMOA_Paste_Reason7_RED)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'High MOA']), 0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Product Features/MitigationProductFeaturesPage_FieldText_Longer loan tenure'),
//	0), 'Longer loan tenure')
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'Longer loan tenure']), 0)
//
//Mobile.takeScreenshot()
//
//Mobile.scrollToText('Save')
//
//Mobile.takeScreenshot()
//
//Longerloantenure_Reason1_RED = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Product Features/MitigationProductFeaturesPage_Longerloantenure_text_Applicant not subject to retirement age'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Product Features/MitigationProductFeaturesPage_Longerloantenure_CopyIcon_Applicant not subject to retirement age'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Product Features')
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
//Longerloantenure_Paste_Reason1_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(Longerloantenure_Reason1_RED, Longerloantenure_Paste_Reason1_RED)
//
//Mobile.scrollToText('Save')
//
//Longerloantenure_Reason2_RED = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Product Features/MitigationProductFeaturesPage_Longerloantenure_text_Applicant is self-employed'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Product Features/MitigationProductFeaturesPage_Longerloantenure_CopyIcon_Applicant is self-employed'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Product Features')
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
//Longerloantenure_Paste_Reason2_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(Longerloantenure_Reason2_RED, Longerloantenure_Paste_Reason2_RED)
//
//Mobile.scrollToText('Save')
//
//Mobile.takeScreenshot()
//
//Longerloantenure_Reason3_RED = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Product Features/MitigationProductFeaturesPage_Longerloantenure_text_Applicant has substantial savingsFDREPF as reserve'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Product Features/MitigationProductFeaturesPage_Longerloantenure_CopyIcon_Applicant has substantial savingsFDREPF as reserve'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Product Features')
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
//Longerloantenure_Paste_Reason3_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(Longerloantenure_Reason3_RED, Longerloantenure_Paste_Reason3_RED)
//
//Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_button_Save'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/EDDSummaryPage_PopupText_Mitigation note saved'),
//		0), 'Mitigation note saved. You can still edit the details later if needed.')
//
//Mobile.takeScreenshot()
//
//Mobile.scrollToText('Save')
//
//Mobile.takeScreenshot()
//
//Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_Dynamicbutton_Edit Mitigation',
//	[('Verify') : 'Product Features']), 0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_Dynamicbutton_Edit Mitigation',
//	[('Verify') : 'Product Features']), 0), 'Edit Mitigation')
//
//Mobile.takeScreenshot()