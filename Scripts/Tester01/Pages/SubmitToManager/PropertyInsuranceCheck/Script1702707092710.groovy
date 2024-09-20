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


Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/SubmitToManager/txt_PropertyInsurance'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/SubmitToManager/txt_PropertyInsuranceRightArroow'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/SubmitToManager/txt_PropertyInsurance'), 30)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'The following property insurance was selected:']), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/SubmitToManager/txt_PropertyInsuranceChoosen'), GlobalVariable.PropertyInsurance)

Mobile.tap(findTestObject('Object Repository/Tester01/SubmitToManager/btn_Back'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/CaseProcessingPage_Title'), 30)

