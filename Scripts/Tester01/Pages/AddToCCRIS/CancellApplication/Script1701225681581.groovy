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

Mobile.delay(30)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_OtherActionRequired'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_OtherActionRequired'), 0)

String stpId = GlobalVariable.StpId

Mobile.setText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_SearchBar'), stpId.substring(8), 0)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CaseListing0'), 0)

// validat main applicant name, joining applicant name, property details name and status of the Application
Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_MAYA'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_STPID'), GlobalVariable.StpId)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_CancelSubmission'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CancelSubmission'), 'Cancel Submission')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CancellSubmission'), 'You will need to reprocess this application.\n\n Are you sure you want to proceed?')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_No'), 'No')

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_Yes'), 0)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_ReprocessCase'), 0)
