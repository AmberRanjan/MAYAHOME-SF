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

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/Sign_Electrically/SignElectrically_TermConditionsPage_Header'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/Sign_Electrically/SignElectrically_TermConditionsPage_button_Back'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/Sign_Electrically/SignElectrically_TermConditionsPage_button_Close'), 
    0)

Mobile.swipe(300, 1700, 300, 300)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/Sign_Electrically/SignElectrically_TermConditionsPage_text_No, IWe do not agree to be contacted'), 
    'No, I/We do not agree to be contacted', FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/Sign_Electrically/SignElectrically_TermConditionsPage_text_Yes, IWe expressly agree to be contacted'), 
    'Yes, I/We expressly agree to be contacted', FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/Sign_Electrically/SignElectrically_TermConditionsPage_button_SignAndConsent'), 
    0)

if (GlobalVariable.SignElectrically_TermsConditions == 'Yes') {
    Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/Sign_Electrically/SignElectrically_TermConditionsPage_radioButton_Yes'), 
        0, FailureHandling.OPTIONAL)
}

if (GlobalVariable.SignElectrically_TermsConditions == 'No') {
    Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/Sign_Electrically/SignElectrically_TermConditionsPage_radioButton_No'), 
        0, FailureHandling.OPTIONAL)
}

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/Sign_Electrically/SignElectrically_TermConditionsPage_button_SignAndConsent'), 
    0)


Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/SignElectrically_2Applicants/2Applicants_SignAndConsentPage_Header'), 
    0,FailureHandling.OPTIONAL)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/SignElectrically_2Applicants/2Applicants_SignAndConsentPage_text_Main Applicant'), 
    0)

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/SignElectrically_2Applicants/2Applicants_SignAndConsentPage_text_MainApplicantName'), 
    0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/SignElectrically_2Applicants/2Applicants_SignAndConsentPage_link_Main Applicant_Sign'), 
    0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/Sign_Electrically/SignElectrically_SignConsentPage_SignaturePad'),
	0, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/Sign_Electrically/SignElectrically_SignConsentPage_button_Submit'),
	0, FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/SignElectrically_2Applicants/2Applicants_SignAndConsentPage_text_Joint Applicant'), 
    'Joint Applicant')

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/SignElectrically_2Applicants/2Applicants_SignAndConsentPage_text_JointApplicantName'), 
    0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/SignElectrically_2Applicants/2Applicants_SignAndConsentPage_link_JointApplicant_Sign'), 
    0)


Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/Sign_Electrically/SignElectrically_SignConsentPage_SignaturePad'),
	0)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

//Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/Sign_Electrically/SignElectrically_SignConsentPage_button_Submit'),
//	0, FailureHandling.OPTIONAL)
Mobile.tap(findTestObject('Object Repository/Tester01/DataEntry/btn_Continue_JointSig'),0, FailureHandling.CONTINUE_ON_FAILURE)


Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/SignElectrically_2Applicants/2Applicants_SignAndConsentPage_button_Submit'), 
    0)



Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/Sign_Electrically/SignElectrically_Thank you for your signaturePage_Header'),
		0)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

//Mobile.verifyElementText(findTestObject(''), 'You may now pass the device back to your sales representative to proceed with the application.')

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/Sign_Electrically/SignElectrically_Thank you for your signaturePage_button_Submit'),
		0)

//Mobile.closeApplication()

