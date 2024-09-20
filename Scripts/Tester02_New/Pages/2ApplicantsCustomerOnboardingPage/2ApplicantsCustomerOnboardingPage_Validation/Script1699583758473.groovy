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

//Mobile.startExistingApplication('com.maybank2u.salesforce.uatent')

/**Author: Vasudha
 * Data From Excel: Home2u_TestData
 * Sheet: SF_Scenarios_Data
 */

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/2ApplicantsCustomerOnboardingPage/2Applicants_CustomerOnboarding_Please select an applicant to start the onboarding process'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/2ApplicantsCustomerOnboardingPage/2Applicants_CustomerOnboarding_Please select an applicant to start the onboarding process'), 
    'Please select an applicant to start the onboarding process')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/2ApplicantsCustomerOnboardingPage/2Applicants_CustomerOnboarding_Main Applicant'), 
    'Main Applicant')

Mobile.getText(findTestObject('Object Repository/Tester02_New/2ApplicantsCustomerOnboardingPage/2Applicants_CustomerOnboarding_Main Applicant_Name'), 
    0)

Mobile.getText(findTestObject('Object Repository/Tester02_New/2ApplicantsCustomerOnboardingPage/2Applicants_CustomerOnboarding_Main Applicant_ 0 out of 5 steps completed'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/2ApplicantsCustomerOnboardingPage/2Applicants_CustomerOnboarding_Joint Applicant'), 'Joint Applicant')

Mobile.getText(findTestObject('Object Repository/Tester02_New/2ApplicantsCustomerOnboardingPage/2Applicants_CustomerOnboarding_Joint Applicant_Name'), 
    0)

Mobile.getText(findTestObject('Object Repository/Tester02_New/2ApplicantsCustomerOnboardingPage/2Applicants_CustomerOnboarding_Joint Applicant_0 out of 5 steps completed'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/2ApplicantsCustomerOnboardingPage/2Applicants_CustomerOnboarding_button_Back'), 
    0)


Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/2ApplicantsCustomerOnboardingPage/2Applicants_CustomerOnboarding_button_Close'), 
    0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/2ApplicantsCustomerOnboardingPage/2Applicants_CustomerOnboarding_Main Applicant'),10)

//Mobile.closeApplication()

