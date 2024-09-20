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

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Policies Page/MitigationCreditPoliciesPage_TitleText_Mitigation Credit Policies'),
	0)

Mobile.takeScreenshot()

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Policies Page/MitigationCreditPoliciesPage_TitleText_Mitigation Credit Policies'),
		0), 'Mitigation: Credit Policies')

MitigationCreditPolicies = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Policies Page/MitigationCreditPoliciesPage_TitleText_Mitigation Credit Policies'),
	0).substring(12)

Mobile.verifyEqual(CreditPolicies, MitigationCreditPolicies)

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

Mobile.scrollToText('Invalid relationship')

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

//Mobile.callTestCase(findTestCase('Tester03/Pages/EDD Summary Page/TwoThousandOneCharactersError'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Mitigation: Credit Policies')

Mobile.takeScreenshot() 

Mobile.clearText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
	0)

Mobile.takeScreenshot()

Mobile.scrollToText('Invalid relationship')

Mobile.takeScreenshot()

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Policies Page/MitigationCreditPoliciesPage_FieldText_RG below Cut Off Score'),
		0), 'RG below Cut Off Score')

Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'RG below Cut Off Score']), 0)

Mobile.takeScreenshot()

Mobile.scrollToText('Applicant is Foreign.')

Mobile.takeScreenshot()

RGbelowCutOffScore_Reason1_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Policies Page/MitigationCreditPoliciesPage_RGbelowCutOfScore_text_Applicant is a professional'),
	0)

Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Policies Page/MitigationCreditPoliciesPage_RGbelowCutOfScore_CopyIcon_Applicant is a professional'),
	0)

Mobile.takeScreenshot()

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
		0), 'Text copied')

Mobile.scrollToText('Mitigation: Credit Policies')

Mobile.takeScreenshot()

AppiumDriver<?> driver = MobileDriverFactory.getDriver()

String clipboard = driver.getClipboardText()

Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
	clipboard, 0)

Mobile.takeScreenshot()

RGbelowCutOffScore_Paste_Reason1_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
	0)

Mobile.verifyEqual(RGbelowCutOffScore_Reason1_AMBER, RGbelowCutOffScore_Paste_Reason1_AMBER)

//Mobile.scrollToText('Applicant is Foreign.')
//
//Mobile.takeScreenshot()
//
//RGbelowCutOffScore_Reason2_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Policies Page/MitigationCreditPoliciesPage_RGbelowCutOfScore_text_Applicant is HNWAffluentEmerging'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Policies Page/MitigationCreditPoliciesPage_RGbelowCutOfScore_CopyIcon_Applicant is HNWAffluentEmerging'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Credit Policies')
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
//RGbelowCutOffScore_Paste_Reason2_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(RGbelowCutOffScore_Reason2_AMBER, RGbelowCutOffScore_Paste_Reason2_AMBER)
//
//Mobile.scrollToText('Invalid relationship')
//
//Mobile.takeScreenshot()
//
//RGbelowCutOffScore_Reason3_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Policies Page/MitigationCreditPoliciesPage_RGbelowCutOfScore_text_Applicant is Royalty'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Policies Page/MitigationCreditPoliciesPage_RGbelowCutOfScore_CopyIcon_Applicant is Royalty'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Credit Policies')
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
//RGbelowCutOffScore_Paste_Reason3_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(RGbelowCutOffScore_Reason3_AMBER, RGbelowCutOffScore_Paste_Reason3_AMBER)
//
//Mobile.scrollToText('Save')
//
//RGbelowCutOffScore_Reason4_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Policies Page/MitigationCreditPoliciesPage_RGbelowCutOfScore_text_Applicant is Foreign'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Policies Page/MitigationCreditPoliciesPage_RGbelowCutOfScore_CopyIcon_Applicant is Foreign'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Credit Policies')
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
//RGbelowCutOffScore_Paste_Reason4_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(RGbelowCutOffScore_Reason4_AMBER, RGbelowCutOffScore_Paste_Reason4_AMBER)
//
//Mobile.scrollToText('Save')
//
//RGbelowCutOffScore_Reason5_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Policies Page/MitigationCreditPoliciesPage_RGbelowCutOfScore_text_Applicant is Malaysian working overseas'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Policies Page/MitigationCreditPoliciesPage_RGbelowCutOfScore_CopyIcon_Applicant is Malaysian working overseas'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Credit Policies')
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
//RGbelowCutOffScore_Paste_Reason5_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(RGbelowCutOffScore_Reason5_AMBER, RGbelowCutOffScore_Paste_Reason5_AMBER)
//
//Mobile.scrollToText('Save')
//
//RGbelowCutOffScore_Reason6_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Policies Page/MitigationCreditPoliciesPage_RGbelowCutOfScore_text_Applicant has Staff Housing Loan'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Policies Page/MitigationCreditPoliciesPage_RGbelowCutOfScore_CopyIcon_Applicant has Staff Housing Loan'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Credit Policies')
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
//RGbelowCutOffScore_Paste_Reason6_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(RGbelowCutOffScore_Reason6_AMBER, RGbelowCutOffScore_Paste_Reason6_AMBER)
//
//Mobile.scrollToText('Applicant is Foreign.')
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'RG below Cut Off Score']), 0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Policies Page/MitigationCreditPoliciesPage_FieldText_BNM LTV  70 for 3rd HL onwards'),
//	0), 'BNM LTV @ 70% for 3rd HL onwards')
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'BNM LTV @ 70% for 3rd HL onwards']), 0)
//
//BNMLTV70for3rdHLonwards_Reason1_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Policies Page/MitigationCreditPoliciesPage_BNMLTV70for3rdHLonwards_text_Documentary evidence'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Policies Page/MitigationCreditPoliciesPage_BNMLTV70for3rdHLonwards_CopyIcon_Documentary evidence'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Credit Policies')
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
//BNMLTV70for3rdHLonwards_Paste_Reason1_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(BNMLTV70for3rdHLonwards_Reason1_AMBER, BNMLTV70for3rdHLonwards_Paste_Reason1_AMBER)
//
//Mobile.scrollToText('Save')
//
//Mobile.takeScreenshot()
//
//BNMLTV70for3rdHLonwards_Reason2_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Policies Page/MitigationCreditPoliciesPage_BNMLTV70for3rdHLonwards_text_Existing property financed'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Policies Page/MitigationCreditPoliciesPage_BNMLTV70for3rdHLonwards_CopyIcon_Existing property financed'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Credit Policies')
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
//BNMLTV70for3rdHLonwards_Paste_Reason2_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(BNMLTV70for3rdHLonwards_Reason2_AMBER, BNMLTV70for3rdHLonwards_Paste_Reason2_AMBER)
//
//Mobile.scrollToText('Save')
//
//BNMLTV70for3rdHLonwards_Reason3_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Policies Page/MitigationCreditPoliciesPage_BNMLTV70for3rdHLonwards_text_Pledge FDR'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Policies Page/MitigationCreditPoliciesPage_BNMLTV70for3rdHLonwards_CopyIcon_Pledge FDR'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Credit Policies')
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
//BNMLTV70for3rdHLonwards_Paste_Reason3_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(BNMLTV70for3rdHLonwards_Reason3_AMBER, BNMLTV70for3rdHLonwards_Paste_Reason3_AMBER)
//
//Mobile.scrollToText('Save')
//
//Mobile.takeScreenshot()
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'BNM LTV @ 70% for 3rd HL onwards']), 0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Policies Page/MitigationCreditPoliciesPage_FieldText_Invalid relationship'),
//	0), 'Invalid relationship')
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'Invalid relationship']), 0)
//
//Mobile.scrollToText('Save')
//
//Mobile.takeScreenshot()
//
//Invalidrelationship_Reason1_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Policies Page/MitigationCreditPoliciesPage_Invalidrelationship_text_Assessment on income sustainability'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Policies Page/MitigationCreditPoliciesPage_Invalidrelationship_CopyIcon_Assessment on income sustainability'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Credit Policies')
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
//Invalidrelationship_Paste_Reason1_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(Invalidrelationship_Reason1_AMBER, Invalidrelationship_Paste_Reason1_AMBER)
//
//Mobile.scrollToText('Save')
//
//Mobile.takeScreenshot()
//
//Invalidrelationship_Reason2_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Policies Page/MitigationCreditPoliciesPage_Invalidrelationship_text_Added relative to application'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Policies Page/MitigationCreditPoliciesPage_Invalidrelationship_CopyIcon_Added relative to application'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Credit Policies')
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
//Invalidrelationship_Paste_Reason2_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(Invalidrelationship_Reason2_AMBER, Invalidrelationship_Paste_Reason2_AMBER)
//
//Mobile.scrollToText('Save')
//
//Mobile.takeScreenshot()
//
//Invalidrelationship_Reason3_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Policies Page/MitigationCreditPoliciesPage_Invalidrelationship_text_Property is for own business'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Policies Page/MitigationCreditPoliciesPage_Invalidrelationship_CopyIcon_Property is for own business'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Credit Policies')
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
//Invalidrelationship_Paste_Reason3_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(Invalidrelationship_Reason3_AMBER, Invalidrelationship_Paste_Reason3_AMBER)
//
//Mobile.scrollToText('Save')
//
//Mobile.takeScreenshot()
//
//Invalidrelationship_Reason4_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Policies Page/MitigationCreditPoliciesPage_Invalidrelationship_text_Strong incomefinancial position'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Policies Page/MitigationCreditPoliciesPage_Invalidrelationship_CopyIcon_Strong incomefinancial position'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Credit Policies')
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
//Invalidrelationship_Paste_Reason4_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(Invalidrelationship_Reason4_AMBER, Invalidrelationship_Paste_Reason4_AMBER)
//
//Mobile.scrollToText('Save')
//
//Mobile.takeScreenshot()
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'Invalid relationship']), 0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Policies Page/MitigationCreditPoliciesPage_FieldText_Non-submission of Income document'),
//	0), 'Non-submission of Income document')
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'Non-submission of Income document']), 0)
//
//Mobile.scrollToText('Save')
//
//Mobile.takeScreenshot()
//
//NonsubmissionofIncomedocument_Reason1_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Policies Page/MitigationCreditPoliciesPage_Non-submissionofIncomedocument_text_Alternate income'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Policies Page/MitigationCreditPoliciesPage_Non-submissionofIncomedocument_CopyIcon_Alternate income'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Credit Policies')
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
//NonsubmissionofIncomedocument_Paste_Reason1_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(NonsubmissionofIncomedocument_Reason1_AMBER, NonsubmissionofIncomedocument_Paste_Reason1_AMBER)
//
//Mobile.scrollToText('Save')
//
//Mobile.takeScreenshot()
//
//NonsubmissionofIncomedocument_Reason2_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Policies Page/MitigationCreditPoliciesPage_Non-submissionofIncomedocument_text_Business is profitable'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Policies Page/MitigationCreditPoliciesPage_Non-submissionofIncomedocument_CopyIcon_Business is profitable'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Credit Policies')
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
//NonsubmissionofIncomedocument_Paste_Reason2_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(NonsubmissionofIncomedocument_Reason2_AMBER, NonsubmissionofIncomedocument_Paste_Reason2_AMBER)
//
//Mobile.scrollToText('Save')
//
//Mobile.takeScreenshot()
//
//NonsubmissionofIncomedocument_Reason3_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Policies Page/MitigationCreditPoliciesPage_Non-submissionofIncomedocument_text_Substantial deposits reserves'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Policies Page/MitigationCreditPoliciesPage_Non-submissionofIncomedocument_CopyIcon_Substantial deposits reserves'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Credit Policies')
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
//NonsubmissionofIncomedocument_Paste_Reason3_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(NonsubmissionofIncomedocument_Reason3_AMBER, NonsubmissionofIncomedocument_Paste_Reason3_AMBER)
//
//Mobile.scrollToText('Save')
//
//Mobile.takeScreenshot()
//
//NonsubmissionofIncomedocument_Reason4_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Policies Page/MitigationCreditPoliciesPage_Non-submissionofIncomedocument_text_Company maintains current'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Policies Page/MitigationCreditPoliciesPage_Non-submissionofIncomedocument_CopyIcon_Company maintains current'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Credit Policies')
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
//NonsubmissionofIncomedocument_Paste_Reason4_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(NonsubmissionofIncomedocument_Reason4_AMBER, NonsubmissionofIncomedocument_Paste_Reason4_AMBER)
//
//Mobile.scrollToText('Save')
//
//Mobile.takeScreenshot()
//
//NonsubmissionofIncomedocument_Reason5_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Policies Page/MitigationCreditPoliciesPage_Non-submissionofIncomedocument_text_Other proxy income'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Policies Page/MitigationCreditPoliciesPage_Non-submissionofIncomedocument_CopyIcon_Other proxy income'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Credit Policies')
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
//NonsubmissionofIncomedocument_Paste_Reason5_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(NonsubmissionofIncomedocument_Reason4_AMBER, NonsubmissionofIncomedocument_Paste_Reason4_AMBER)

Mobile.scrollToText('Save')

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_button_Save'),
	0)

Mobile.takeScreenshot()

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/EDDSummaryPage_PopupText_Mitigation note saved'),
		0), 'Mitigation note saved. You can still edit the details later if needed.')

Mobile.takeScreenshot()

Mobile.scrollToText('Proceed')

Mobile.takeScreenshot()

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_Dynamicbutton_Edit Mitigation',
	[('Verify') : 'Credit Policies']), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_Dynamicbutton_Edit Mitigation',
	[('Verify') : 'Credit Policies']), 0), 'Edit Mitigation')

Mobile.takeScreenshot()