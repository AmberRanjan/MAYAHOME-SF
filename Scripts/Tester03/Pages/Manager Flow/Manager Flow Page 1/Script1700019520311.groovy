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

int TotalCases = Integer.parseInt(Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/ManagerMainPage_text_You currently have Cases awaiting your action'), 
    0).substring(19).replaceAll(' Cases awaiting your action.', ''))

CountDataEntryReview = Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/ManagerMainPage_count_DataEntryReview'), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/ManagerMainPage_text_Data entry review'), 0), 'Data entry review')

CountTransferRequest = Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/ManagerMainPage_count_Transfer requests'), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/ManagerMainPage_text_Transfer requests'), 0), 'Transfer requests')

CountCaseLimitRequest = Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/ManagerMainPage_count_Case limit request'), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/ManagerMainPage_text_Case limit request'), 0), 'Case limit request')

int TotalCount = Integer.parseInt(CountDataEntryReview) + Integer.parseInt(CountTransferRequest) + Integer.parseInt(CountCaseLimitRequest)

Mobile.verifyEqual(TotalCases, TotalCount)

Mobile.tap(findTestObject('Object Repository/Tester03/Manager Flow/ManagerMainPage_text_Data entry review'), 0)

