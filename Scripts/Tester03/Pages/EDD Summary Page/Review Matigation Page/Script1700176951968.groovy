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

Mobile.scrollToText('EDD Summary')

Mobile.delay(5)

//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/EDDSummaryPage_text_GREEN', [('Verify') : 'Eligibility of Borrower']),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.delay(5)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/EDDSummaryPage_text_GREEN', [('Verify') : 'Credit Check']),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.delay(10)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/EDDSummaryPage_text_GREEN', [('Verify') : 'MOR/DSR']),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.delay(5)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/EDDSummaryPage_text_GREEN', [('Verify') : 'Collateral']),
//	0)

Mobile.takeScreenshot()

Mobile.scrollToText('Proceed')

Mobile.delay(5)

//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/EDDSummaryPage_text_GREEN', [('Verify') : 'Product Features']),
//	0)
//
//Mobile.takeScreenshot()
//
//Mobile.delay(5)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/EDDSummaryPage_text_GREEN', [('Verify') : 'Credit Policies']),
//	0)

Mobile.takeScreenshot()

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_text_By proceeding'), 0), 'By proceeding, I hereby confirm that all information entered is correct at the point of application through provision of required basic and supporting documents, including employment status, and face to face interview with borrower(s)')

Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 1/EDDSummaryPage_button_Proceed'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03/EDD Summary Page 3/ReviewMitigationPage_TitleText_Review Mitigation'), 0)

Mobile.takeScreenshot()

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 3/ReviewMitigationPage_text_Eligibility of Borrower'), 0), 'Eligibility of Borrower')

EligibilityofBorrowerEDDStatus = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 3/ReviewMitigationPage_text_EDDStatus', [('Verify') : 'Eligibility of Borrower']), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 3/ReviewMitigationPage_text_Credit Check'), 0), 'Credit Check')

CreditCheckEDDStatus = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 3/ReviewMitigationPage_text_EDDStatus', [('Verify') : 'Credit Check']), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 3/ReviewMitigationPage_text_MORDSR'), 0), 'MOR/DSR')

MORDSREDDStatus = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 3/ReviewMitigationPage_text_EDDStatus', [('Verify') : 'MOR/DSR']), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 3/ReviewMitigationPage_text_Collateral'), 0), 'Collateral')

CollateralEDDStatus = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 3/ReviewMitigationPage_text_EDDStatus', [('Verify') : 'Collateral']), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 3/ReviewMitigationPage_text_Product Features'), 0), 'Product Features')

ProductFeaturesEDDStatus = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 3/ReviewMitigationPage_text_EDDStatus', [('Verify') : 'Product Features']), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 3/ReviewMitigationPage_text_Credit Policies'), 0), 'Credit Policies')

CreditPoliciesEDDStatus = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 3/ReviewMitigationPage_text_EDDStatus', [('Verify') : 'Credit Policies']), 0)

Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 3/ReviewMitigationPage_button_Confirm'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03/EDD Summary Page 3/EDDSummaryCompleted_TitleText_EDD Summary Completed'), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 3/EDDSummaryCompletedPage_text_You can now proceed'), 0),  'You can now proceed to submit the application to be reviewed by your manager. You may upload any supporting documents via EDMS.')

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 3/EDDSummaryCompletedPage_button_Submit to Manager'), 0), 'Submit to Manager')

Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 3/EDDSummaryCompletedPage_button_Submit to Manager'), 0)

 Mobile.takeScreenshot()