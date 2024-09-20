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

Mobile.startExistingApplication('com.maybank2u.salesforce.uatent')

Mobile.delay(10)

Mobile.setText(findTestObject('Object Repository/Tester01/CommonElements/input_PFNumber'), '80008113', 0)

Mobile.setText(findTestObject('Object Repository/Tester01/CommonElements/input_Password'), 'Tester1', 0)

Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/btn_Login'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_Mortgage'), 'Mortgage')

Mobile.delay(60)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_DeclineOfferAppeal'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_DeclineOfferAppeal'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_DeclineOfferAppealDescription'), 'Please select a reason to decline and indicate whether the applicant wants to appeal')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_ReasonToDecline'), 'Reason to Decline')

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_PleaseSelect'), 30)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_DeclineReason'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_IstheApplicantAppealing'), 'Is the applicant appealing?')

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_ApplicantAppealReason'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_EnterTheReasonForAppealing'), 'Enter the reason for appealing:')

Mobile.setText(findTestObject('Object Repository/Tester01/AddToCCRIS/input_EnterTheReason'), 'Tenure', 0)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_Confirm'), 0)