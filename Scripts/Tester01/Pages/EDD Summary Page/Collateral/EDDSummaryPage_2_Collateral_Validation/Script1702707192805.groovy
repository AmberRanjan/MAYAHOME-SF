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

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_TitleText_Mitigation Collateral'),
	0)

Mobile.takeScreenshot()

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_TitleText_Mitigation Collateral'),
		0), 'Mitigation: Collateral')

MitigationCollateral = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_TitleText_Mitigation Collateral'),
	0).substring(12)

Mobile.verifyEqual(Collateral, MitigationCollateral)

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

'Mitigation Template: Collateral Icon Info'
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

Mobile.scrollToText('Mitigation: Collateral')

Mobile.takeScreenshot() 

Mobile.clearText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
	0)

Mobile.takeScreenshot()

Mobile.scrollToText('No EF line')

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_FieldText_No EF line'),
		0), 'No EF line')

Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'No EF line']), 0)

Mobile.takeScreenshot()

NoEFline_Reason1_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_NoEFline_text_Project at XX stage'),
	0)

Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_NoEFline_CopyIcon_Project at XX stage'),
	0)

Mobile.takeScreenshot()

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
		0), 'Text copied')

Mobile.scrollToText('Mitigation: Collateral')

Mobile.takeScreenshot()

AppiumDriver<?> driver = MobileDriverFactory.getDriver()

String clipboard = driver.getClipboardText()

Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
	clipboard, 0)

Mobile.takeScreenshot()

NoEFline_Paste_Reason1_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
	0)

Mobile.verifyEqual(NoEFline_Reason1_AMBER, NoEFline_Paste_Reason1_AMBER)

//NoEFline_Reason2_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_NoEFline_text_Condition disbursement'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_NoEFline_CopyIcon_Condition disbursement'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Collateral')
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
//NoEFline_Paste_Reason2_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(NoEFline_Reason2_AMBER, NoEFline_Paste_Reason2_AMBER)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'No EF line']), 0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_FieldText_Negative Indicators'),
//	0), 'Negative Indicators')
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'Negative Indicators']), 0)
//
//Mobile.takeScreenshot()
//
//NegativeIndicators_Reason1_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_NegativeIndicators_text_Prime area'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_NegativeIndicators_CopyIcon_Prime area'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Collateral')
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
//NegativeIndicators_Paste_Reason1_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(NegativeIndicators_Reason1_AMBER, NegativeIndicators_Paste_Reason1_AMBER)
//
//NegativeIndicators_Reason2_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_NegativeIndicators_text_Strong 1st way out'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_NegativeIndicators_CopyIcon_Strong 1st way out'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Collateral')
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
//NegativeIndicators_Paste_Reason2_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(NegativeIndicators_Reason2_AMBER, NegativeIndicators_Paste_Reason2_AMBER)
//
//Mobile.scrollToText('Save')
//
//Mobile.takeScreenshot()
//
//NegativeIndicators_Reason3_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_NegativeIndicators_text_Low MOA'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_NegativeIndicators_CopyIcon_Low MOA'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Collateral')
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
//NegativeIndicators_Paste_Reason3_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(NegativeIndicators_Reason3_AMBER, NegativeIndicators_Paste_Reason3_AMBER)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'Negative Indicators']), 0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_FieldText_Abandoned, stalled, revived projects'),
//	0), 'Abandoned, stalled, revived projects')
//
//Mobile.scrollToText('Save')
//
//Mobile.takeScreenshot()
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'Abandoned, stalled, revived projects']), 0)
//
//Mobile.takeScreenshot()
//
//AbandonedStalledRevivedProjects_Reason1_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_Abandoned,stalled,revivedprojects_text_Revived project has valid EF'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_Abandoned,stalled,revivedprojects_CopyIcon_Revived project has valid EF'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Collateral')
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
//AbandonedStalledRevivedProjects_Paste_Reason1_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(AbandonedStalledRevivedProjects_Reason1_AMBER, AbandonedStalledRevivedProjects_Paste_Reason1_AMBER)
//
//Mobile.scrollToText('Save')
//
//Mobile.takeScreenshot()
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'Abandoned, stalled, revived projects']), 0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_FieldText_Multiple units to be financed at one time'),
//	0), 'Multiple units to be financed at one time')
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'Multiple units to be financed at one time']), 0)
//
//Mobile.takeScreenshot()
//
//MultipleUnitstobefinancedatonetime_Reason1_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_Multipleunitstobefinancedatonetime_text_Originator to provide an acceptable reason'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_Multipleunitstobefinancedatonetime_CopyIcon_Originator to provide an acceptable reason'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Collateral')
//
//Mobile.takeScreenshot()
//
//clipboard = driver.getClipboardText()
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	clipboard, 0)
//
//MultipleUnitstobefinancedatonetime_Paste_Reason1_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(MultipleUnitstobefinancedatonetime_Reason1_AMBER, MultipleUnitstobefinancedatonetime_Paste_Reason1_AMBER)
//
//Mobile.scrollToText('Save')
//
//Mobile.takeScreenshot()
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'Multiple units to be financed at one time']), 0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_FieldText_Transfer and assignment by way of Love and Affection'),
//	0), 'Transfer and assignment by way of “Love and Affection”')
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'Transfer and assignment by way of “Love and Affection”']), 0)
//
//Mobile.takeScreenshot()
//
//TransferandassignmentbywayofLoveandAffection_Reason1_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_Transferandassignment_text_Transfer to be perfected'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_Transferandassignment_CopyIcon_Transfer to be perfected'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Collateral')
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
//TransferandassignmentbywayofLoveandAffection_Paste_Reason1_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(TransferandassignmentbywayofLoveandAffection_Reason1_AMBER, TransferandassignmentbywayofLoveandAffection_Paste_Reason1_AMBER)
//
//Mobile.scrollToText('Save')
//
//Mobile.takeScreenshot()
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'Transfer and assignment by way of “Love and Affection”']), 0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_FieldText_Cross Border Financing'),
//	0), 'Cross Border Financing')
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'Cross Border Financing']), 0)
//
//Mobile.takeScreenshot()
//
//CrossBorderFinancing_Reason1_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_CrossBorderFinancing_text_Cross border financing'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_CrossBorderFinancing_CopyIcon_Cross border financing'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Collateral')
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
//CrossBorderFinancing_Paste_Reason1_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(CrossBorderFinancing_Reason1_AMBER, CrossBorderFinancing_Paste_Reason1_AMBER)
//
//Mobile.scrollToText('Save')
//
//Mobile.takeScreenshot()
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'Cross Border Financing']), 0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_FieldText_Unsold Unit'),
//	0), 'Unsold Unit')
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'Unsold Unit']), 0)
//
//Mobile.takeScreenshot()
//
//UnsoldUnit_Reason1_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_UnsoldUnit_text_Vebal valuation obtained from Grade A valuer'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_UnsoldUnit_CopyIcon_Vebal valuation obtained from Grade A valuer'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Collateral')
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
//UnsoldUnit_Paste_Reason1_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(UnsoldUnit_Reason1_AMBER, UnsoldUnit_Paste_Reason1_AMBER)
//
//Mobile.scrollToText('Save')
//
//Mobile.takeScreenshot()
//
//UnsoldUnit_Reason2_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_UnsoldUnit_text_Site visit confirmed'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_UnsoldUnit_CopyIcon_Site visit confirmed'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Collateral')
//
//Mobile.takeScreenshot()
//
//clipboard = driver.getClipboardText()
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	clipboard, 0)
//
//UnsoldUnit_Paste_Reason2_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(UnsoldUnit_Reason2_AMBER, UnsoldUnit_Paste_Reason2_AMBER)
//
//Mobile.scrollToText('Save')
//
//Mobile.takeScreenshot()
//
//UnsoldUnit_Reason3_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_UnsoldUnit_text_Site is under stable areaprime area'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_UnsoldUnit_CopyIcon_Site is under stable areaprime area'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Collateral')
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
//UnsoldUnit_Paste_Reason3_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(UnsoldUnit_Reason3_AMBER, UnsoldUnit_Paste_Reason3_AMBER)
//
//Mobile.scrollToText('Save')
//
//Mobile.takeScreenshot()
//
//UnsoldUnit_Reason4_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_UnsoldUnit_text_XX of unsold units'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_UnsoldUnit_CopyIcon_XX of unsold units'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Collateral')
//
//Mobile.takeScreenshot()
//
//clipboard = driver.getClipboardText()
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	clipboard, 0)
//
//UnsoldUnit_Paste_Reason4_AMBER = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(UnsoldUnit_Reason4_AMBER, UnsoldUnit_Paste_Reason4_AMBER)

Mobile.scrollToText('Save')

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_button_Save'),
	0)

Mobile.takeScreenshot()

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/EDDSummaryPage_PopupText_Mitigation note saved'),
		0), 'Mitigation note saved. You can still edit the details later if needed.')

Mobile.takeScreenshot()

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_Dynamicbutton_Edit Mitigation',
	[('Verify') : 'Collateral']), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_Dynamicbutton_Edit Mitigation',
	[('Verify') : 'Collateral']), 0), 'Edit Mitigation')

Mobile.takeScreenshot()



//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/EDDSummaryPage_text_RED', [('Verify') : 'Collateral']), 0)
//
//Mobile.takeScreenshot()
//
//Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_Dynamicbutton_Mitigate',
//[('Verify') : 'Collateral']), 0)
//
//Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_TitleText_Mitigation Collateral'),
//	0)
//
//Mobile.takeScreenshot()
//
//'Mitigation Template: Collateral Icon Info'
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
//Mobile.scrollToText('Mitigation: Collateral')
//
//Mobile.takeScreenshot()
//
//Mobile.clearText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_FieldText_No EF line'),
//		0), 'No EF line')
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'No EF line']), 0)
//
//Mobile.takeScreenshot()
//
//NoEFline_Reason1_RED = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_NoEFline_text_Project at XX stage'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_NoEFline_CopyIcon_Project at XX stage'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Collateral')
//
//Mobile.takeScreenshot()
//
//AppiumDriver<?> driver = MobileDriverFactory.getDriver()
//
//String clipboard = driver.getClipboardText()
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	clipboard, 0)
//
//Mobile.takeScreenshot()
//
//NoEFline_Paste_Reason1_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(NoEFline_Reason1_RED, NoEFline_Paste_Reason1_RED)
//
//NoEFline_Reason2_RED = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_NoEFline_text_Condition disbursement'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_NoEFline_CopyIcon_Condition disbursement'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Collateral')
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
//NoEFline_Paste_Reason2_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(NoEFline_Reason2_RED, NoEFline_Paste_Reason2_RED)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'No EF line']), 0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_FieldText_Negative Indicators'),
//	0), 'Negative Indicators')
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'Negative Indicators']), 0)
//
//Mobile.takeScreenshot()
//
//NegativeIndicators_Reason1_RED = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_NegativeIndicators_text_Prime area'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_NegativeIndicators_CopyIcon_Prime area'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Collateral')
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
//NegativeIndicators_Paste_Reason1_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(NegativeIndicators_Reason1_RED, NegativeIndicators_Paste_Reason1_RED)
//
//NegativeIndicators_Reason2_RED = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_NegativeIndicators_text_Strong 1st way out'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_NegativeIndicators_CopyIcon_Strong 1st way out'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Collateral')
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
//NegativeIndicators_Paste_Reason2_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(NegativeIndicators_Reason2_RED, NegativeIndicators_Paste_Reason2_RED)
//
//Mobile.scrollToText('Save')
//
//Mobile.takeScreenshot()
//
//NegativeIndicators_Reason3_RED = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_NegativeIndicators_text_Low MOA'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_NegativeIndicators_CopyIcon_Low MOA'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Collateral')
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
//NegativeIndicators_Paste_Reason3_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(NegativeIndicators_Reason3_RED, NegativeIndicators_Paste_Reason3_RED)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'Negative Indicators']), 0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_FieldText_Abandoned, stalled, revived projects'),
//	0), 'Abandoned, stalled, revived projects')
//
//Mobile.scrollToText('Save')
//
//Mobile.takeScreenshot()
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'Abandoned, stalled, revived projects']), 0)
//
//Mobile.takeScreenshot()
//
//AbandonedStalledRevivedProjects_Reason1_RED = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_Abandoned,stalled,revivedprojects_text_Revived project has valid EF'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_Abandoned,stalled,revivedprojects_CopyIcon_Revived project has valid EF'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Collateral')
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
//AbandonedStalledRevivedProjects_Paste_Reason1_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(AbandonedStalledRevivedProjects_Reason1_RED, AbandonedStalledRevivedProjects_Paste_Reason1_RED)
//
//Mobile.scrollToText('Save')
//
//Mobile.takeScreenshot()
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'Abandoned, stalled, revived projects']), 0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_FieldText_Multiple units to be financed at one time'),
//	0), 'Multiple units to be financed at one time')
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'Multiple units to be financed at one time']), 0)
//
//Mobile.takeScreenshot()
//
//MultipleUnitstobefinancedatonetime_Reason1_RED = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_Multipleunitstobefinancedatonetime_text_Originator to provide an acceptable reason'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_Multipleunitstobefinancedatonetime_CopyIcon_Originator to provide an acceptable reason'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Collateral')
//
//Mobile.takeScreenshot()
//
//clipboard = driver.getClipboardText()
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	clipboard, 0)
//
//MultipleUnitstobefinancedatonetime_Paste_Reason1_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(MultipleUnitstobefinancedatonetime_Reason1_RED, MultipleUnitstobefinancedatonetime_Paste_Reason1_RED)
//
//Mobile.scrollToText('Save')
//
//Mobile.takeScreenshot()
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'Multiple units to be financed at one time']), 0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_FieldText_Transfer and assignment by way of Love and Affection'),
//	0), 'Transfer and assignment by way of “Love and Affection”')
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'Transfer and assignment by way of “Love and Affection”']), 0)
//
//Mobile.takeScreenshot()
//
//TransferandassignmentbywayofLoveandAffection_Reason1_RED = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_Transferandassignment_text_Transfer to be perfected'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_Transferandassignment_CopyIcon_Transfer to be perfected'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Collateral')
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
//TransferandassignmentbywayofLoveandAffection_Paste_Reason1_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(TransferandassignmentbywayofLoveandAffection_Reason1_RED, TransferandassignmentbywayofLoveandAffection_Paste_Reason1_RED)
//
//Mobile.scrollToText('Save')
//
//Mobile.takeScreenshot()
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'Transfer and assignment by way of “Love and Affection”']), 0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_FieldText_Cross Border Financing'),
//	0), 'Cross Border Financing')
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'Cross Border Financing']), 0)
//
//Mobile.takeScreenshot()
//
//CrossBorderFinancing_Reason1_RED = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_CrossBorderFinancing_text_Cross border financing'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_CrossBorderFinancing_CopyIcon_Cross border financing'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Collateral')
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
//CrossBorderFinancing_Paste_Reason1_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(CrossBorderFinancing_Reason1_RED, CrossBorderFinancing_Paste_Reason1_RED)
//
//Mobile.scrollToText('Save')
//
//Mobile.takeScreenshot()
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'Cross Border Financing']), 0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_FieldText_Unsold Unit'),
//	0), 'Unsold Unit')
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Credit Check Page/MitigationCreditCheckPage_Icon_BigDropDown', [('Verify') : 'Unsold Unit']), 0)
//
//Mobile.takeScreenshot()
//
//UnsoldUnit_Reason1_RED = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_UnsoldUnit_text_Vebal valuation obtained from Grade A valuer'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_UnsoldUnit_CopyIcon_Vebal valuation obtained from Grade A valuer'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Collateral')
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
//UnsoldUnit_Paste_Reason1_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(UnsoldUnit_Reason1_RED, UnsoldUnit_Paste_Reason1_RED)
//
//Mobile.scrollToText('Save')
//
//Mobile.takeScreenshot()
//
//UnsoldUnit_Reason2_RED = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_UnsoldUnit_text_Site visit confirmed'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_UnsoldUnit_CopyIcon_Site visit confirmed'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Collateral')
//
//Mobile.takeScreenshot()
//
//clipboard = driver.getClipboardText()
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	clipboard, 0)
//
//UnsoldUnit_Paste_Reason2_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(UnsoldUnit_Reason2_RED, UnsoldUnit_Paste_Reason2_RED)
//
//Mobile.scrollToText('Save')
//
//Mobile.takeScreenshot()
//
//UnsoldUnit_Reason3_RED = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_UnsoldUnit_text_Site is under stable areaprime area'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_UnsoldUnit_CopyIcon_Site is under stable areaprime area'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Collateral')
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
//UnsoldUnit_Paste_Reason3_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(UnsoldUnit_Reason3_RED, UnsoldUnit_Paste_Reason3_RED)
//
//Mobile.scrollToText('Save')
//
//Mobile.takeScreenshot()
//
//UnsoldUnit_Reason4_RED = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_UnsoldUnit_text_XX of unsold units'),
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/Mitigation Collateral Page/MitigationCollateralPage_UnsoldUnit_CopyIcon_XX of unsold units'),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrower_PopupText_Text copied'),
//		0), 'Text copied')
//
//Mobile.scrollToText('Mitigation: Collateral')
//
//Mobile.takeScreenshot()
//
//clipboard = driver.getClipboardText()
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	clipboard, 0)
//
//UnsoldUnit_Paste_Reason4_RED = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/MitigationEligibilityofBorrowerPage_EditText_Box'),
//	0)
//
//Mobile.verifyEqual(UnsoldUnit_Reason4_RED, UnsoldUnit_Paste_Reason4_RED)
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
//Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_title_EDD Summary'),
//	0)
//
//Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_Dynamicbutton_Edit Mitigation',
//	[('Verify') : 'Collateral']), 0)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_Dynamicbutton_Edit Mitigation',
//	[('Verify') : 'Collateral']), 0), 'Edit Mitigation')
//
//Mobile.takeScreenshot()