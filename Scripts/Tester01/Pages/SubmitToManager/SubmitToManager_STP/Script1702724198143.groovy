import com.kms.katalon.core.model.FailureHandling

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

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/CaseProcessingPage_Title'), 30)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.verifyElementExist(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/CaseProcessingPage_text_Please ensure_STP'), 30, FailureHandling.CONTINUE_ON_FAILURE)
 
///Add data entry

//letter Of Offer
Mobile.callTestCase(findTestCase('Test Cases/Tester01/Pages/SubmitToManager/LetterOfOffer'), [:], FailureHandling.CONTINUE_ON_FAILURE)

//Submit the application

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/CaseProcessingPage_text_Message (Optional)'),
		0), 'Message (Optional)')

Mobile.setText(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/CaseProcessingPage_edit_message'), 'automation', 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/CaseProcessingPage_button_Submit Now'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/SubmittedtoManagerPage_Title_Submitted to Manager'), 30)

Mobile.verifyElementExist(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/SubmittedtoManagerPage_text_Your manager will'), 30)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/SubmittedtoManagerPage_button_Back to Case'), 30)

Mobile.tap(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/SubmittedtoManagerPage_button_Back to Case'), 30)

Mobile.takeScreenshot()
