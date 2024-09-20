import internal.GlobalVariable

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

CustomKeywords.'com.keywords.LinkText.clickLinkText'(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_ViewBauReasons'), 310, 50)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Confidential Data']), 'Confidential Data', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_COnfidentialDataDescription'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Confirm']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(4)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : '1. JOINTAPPRELATIONSHIP']), '1. JOINTAPPRELATIONSHIP', FailureHandling.CONTINUE_ON_FAILURE)

mainApplicant = '['+GlobalVariable.CustomerName_MainApplicant+' - '+GlobalVariable.ID_Number_MainApplicant+']'

String jointApplicant = '['+GlobalVariable.CustomerName_JointApplicant+' - '+GlobalVariable.ID_Number_JointApplicant+']'

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : mainApplicant]), mainApplicant, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Applicants are not immediate family']), 'Applicants are not immediate family', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/downArroow_AppicantsNotImmediateFamily_1'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Value1 :  Others']), 'Value1 :  Others', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : jointApplicant]), jointApplicant, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_2', [('variable') : 'Applicants are not immediate family']), 'Applicants are not immediate family', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/downArroow_AppicantsNotImmediateFamily_2'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Value1 :  Others']), 'Value1 :  Others', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

