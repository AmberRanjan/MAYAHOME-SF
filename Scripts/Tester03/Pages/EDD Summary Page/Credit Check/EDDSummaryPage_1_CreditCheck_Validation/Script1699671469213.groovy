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

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 3/ReviewMitigationPage_text_Credit Check'), 
        0), 'Credit Check')

CreditCheck = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 3/ReviewMitigationPage_text_Credit Check'), 
    0)

//Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/EDDSummaryPage_CreditCheck_text_GREEN', [('Verify') : 'Credit Check']), 0)
//
//Mobile.delay(5)
//'Credit Checkr Current Status: GREEN'
//GreenNoMitigateButton = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_Dynamicbutton_Mitigate', 
//        [('Verify') : 'Credit Check']), 0)
//
//GreenNoEditMitigationButton = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_Dynamicbutton_Edit Mitigation', 
//        [('Verify') : 'Credit Check']), 0)
//
//Mobile.verifyMatch(GreenNoMitigateButton, GreenNoEditMitigationButton, true)
//
//Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 2/EDDSummaryPage_CreditCheck_text_AMBER', [('Verify') : 'Credit Check']), 0)

'Checking if Credit Check Current Status: AMBER or RED'

if (Mobile.verifyElementExist(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_Dynamicbutton_Mitigate',
	[('Verify') : 'Credit Check']), 15, FailureHandling.OPTIONAL)) {

//Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_Dynamicbutton_Edit Mitigation',
//        [('Verify') : 'Credit Check']), 0)

Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_Dynamicbutton_Mitigate',
	[('Verify') : 'Credit Check']), 0)

Mobile.callTestCase(findTestCase('Test Cases/Tester03/Pages/EDD Summary Page/Credit Check/EDDSummaryPage_2_CreditCheck_Validation'), 
    [('CreditCheck') : CreditCheck], FailureHandling.STOP_ON_FAILURE)
}
//Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_Dynamicbutton_Edit Mitigation', 
//        [('Verify') : 'Credit Check']), 0)


