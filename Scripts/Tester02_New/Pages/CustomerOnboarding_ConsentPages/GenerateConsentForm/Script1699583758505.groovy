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
/**Author:: Vasudha
 */

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/GenerateConsentForm/GenerateConsentForm_ConsentFormPage_Header'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/GenerateConsentForm/GenerateConsentForm_ConsentFormPage_button_Back'), 
    0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/GenerateConsentForm/GenerateConsentForm_ConsentFormPage_button_Share document'), 
    0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/GenerateConsentForm/GenerateConsentForm_ConsentFormPage_Share_text_Share a copy via email to'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/GenerateConsentForm/GenerateConsentForm_ConsentFormPage_Share_button_Main Applicant'), 
    'Main Applicant')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/GenerateConsentForm/GenerateConsentForm_ConsentFormPage_Share_button_Myself'), 
    'Myself')

if(GlobalVariable.GenerateConsentForm_Share == 'Main Applicant') {
	Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/GenerateConsentForm/GenerateConsentForm_ConsentFormPage_Share_button_Main Applicant'),
		0)
}

if(GlobalVariable.GenerateConsentForm_Share == 'Myself') {
	Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/GenerateConsentForm/GenerateConsentForm_ConsentFormPage_Share_button_Myself'),
		0)
}

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/GenerateConsentForm/GenerateConsentForm_ConsentFormPage_button_Share document'), 
    0)

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/GenerateConsentForm/GenerateConsentForm_ConsentFormPage_Share_PopUp_Are you sure you want to proceed'), 
    0)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/GenerateConsentForm/GenerateConsentForm_ConsentFormPage_Share_PopUp_button_Cancel'), 
    0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/GenerateConsentForm/GenerateConsentForm_ConsentFormPage_Share_PopUp_button_Confirm'), 
    0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/GenerateConsentForm/GenerateConsentForm_ConsentFormPage_Share_PopUp_Header_Share Document'), 
    0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/GenerateConsentForm/GenerateConsentForm_SuccessfullySharedPage_Header'), 
    0)

//Mobile.verifyElementText(findTestObject(''), 'The consent form has been sent to: ')

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/GenerateConsentForm/GenerateConsentForm_SuccessfullySharedPage_text_mailID'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/GenerateConsentForm/GenerateConsentForm_SuccessfullySharedPage_text_Once the consent'), 
    'Once the consent form has been signed by the applicant, kindly upload it into the system.')

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/GenerateConsentForm/GenerateConsentForm_SuccessfullySharedPage_button_BackToCase'), 
    0)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

