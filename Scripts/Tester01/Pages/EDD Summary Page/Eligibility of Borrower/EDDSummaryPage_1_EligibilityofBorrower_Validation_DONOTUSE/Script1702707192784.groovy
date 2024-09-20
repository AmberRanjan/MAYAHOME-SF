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
import com.kms.katalon.core.mobile.keyword.internal.MobileAbstractKeyword as MobileAbstractKeyword
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

Mobile.startExistingApplication('com.maybank2u.salesforce.uatent')

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/DataEntryCompletedEDDSummaryPage/DataEntryCompletedPage_Header_Data Entry Completed'), 
    0)

Mobile.takeScreenshot()

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/DataEntryCompletedEDDSummaryPage/DataEntryCompleted_text_You can now'), 
        0), 'You can now proceed to perform Educate Discipline Decision and complete the EDD Summary.')

Mobile.tap(findTestObject('Object Repository/Tester03_old/DataEntryCompletedEDDSummaryPage/DataEntryCompleted_button_Continue to EDD Summary'), 
    0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_title_EDD Summary'), 
    0)

Mobile.takeScreenshot()

//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_text_Policy breach detected'), 
//        0), 'Policy breach detected. Please adjust the risk levels as you perform Educate Discipline Decision')

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_field_Eligibility of Borrower'), 
        0), 'Eligibility of Borrower')

EligibilityofBorrower = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_field_Eligibility of Borrower'), 
    0)

Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/EDDSummaryPage_text_GREEN', [('Verify') : 'Eligibility of Borrower']), 
    0)

'Eligibility of Borrower Current Status: GREEN'
GreenNoMitigateButton = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 1/EDDSummaryPage_UniversalEDDSummary_text_GREEN', 
        [('Verify') : 'Eligibility of Borrower']), 0)

GreenNoEditMitigationButton = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 1/EDDSummaryPage_UniversalEDDSummary_text_GREEN', 
        [('Verify') : 'Eligibility of Borrower']), 0)

Mobile.verifyMatch(GreenNoMitigateButton, GreenNoEditMitigationButton, true)

Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/EDDSummaryPage_text_AMBER', [('Verify') : 'Eligibility of Borrower']), 
    0)

'Eligibility of Borrower Current Status: AMBER'
Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_Dynamicbutton_Edit Mitigation', 
        [('Verify') : 'Eligibility of Borrower']), 0)

//Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_Dynamicbutton_Mitigate',
//	[('Verify') : 'Eligibility of Borrower']), 0)



Mobile.callTestCase(findTestCase('Tester03/Pages/EDD Summary Page/Eligibility of Borrower/EDDSummaryPage_2_EligibilityofBorrower_Validation'), 
    [('EligibilityofBorrower') : EligibilityofBorrower], FailureHandling.STOP_ON_FAILURE)

