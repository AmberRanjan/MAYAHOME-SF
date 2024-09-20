import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import com.kms.katalon.core.model.FailureHandling

import com.kms.katalon.core.model.FailureHandling

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

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

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/SubmitToManager/txt_EDDSummary'), 'EDD Summary')

Mobile.tap(findTestObject('Object Repository/Tester01/SubmitToManager/btn_EddSummaryRightArrow'), 30, FailureHandling.CONTINUE_ON_FAILURE)
	
Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/SubmitToManager/txt_EDDSummary'), 30)

Mobile.takeScreenshot()

Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/SubmitToManager/btn_EddSummaryBack'), 30, FailureHandling.OPTIONAL)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 3/ReviewMitigationPage_text_Eligibility of Borrower'), 0), 'Eligibility of Borrower')

EligibilityofBorrowerEDDStatus = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 3/ReviewMitigationPage_text_EDDStatus', [('Verify') : 'Eligibility of Borrower']), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 3/ReviewMitigationPage_text_Credit Check'), 0), 'Credit Check')

CreditCheckEDDStatus = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 3/ReviewMitigationPage_text_EDDStatus', [('Verify') : 'Credit Check']), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 3/ReviewMitigationPage_text_MORDSR'), 0), 'MOR/DSR')

MORDSREDDStatus = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 3/ReviewMitigationPage_text_EDDStatus', [('Verify') : 'MOR/DSR']), 0)

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 3/ReviewMitigationPage_text_Collateral'), 0), 'Collateral')

CollateralEDDStatus = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 3/ReviewMitigationPage_text_EDDStatus', [('Verify') : 'Collateral']), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 3/ReviewMitigationPage_text_Product Features'), 0), 'Product Features')

ProductFeaturesEDDStatus = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 3/ReviewMitigationPage_text_EDDStatus', [('Verify') : 'Product Features']), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 3/ReviewMitigationPage_text_Credit Policies'), 0), 'Credit Policies')

CreditPoliciesEDDStatus = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 3/ReviewMitigationPage_text_EDDStatus', [('Verify') : 'Credit Policies']), 0)

Mobile.tap(findTestObject('Object Repository/Tester01/SubmitToManager/btn_EddSummaryBack'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/CaseProcessingPage_Title'), 30)

