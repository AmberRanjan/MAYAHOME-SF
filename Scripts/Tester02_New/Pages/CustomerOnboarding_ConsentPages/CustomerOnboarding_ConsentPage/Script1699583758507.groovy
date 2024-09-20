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

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/CustomerOnboarding_ConsentPages_text_Whats your applicants preferred method'), 
    'What\'s your applicant\'s preferred method to provide consent to the terms and conditions?')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/CustomerOnboarding_ConsentPages_text_Sign Electronically'), 
    ' Sign Electronically')

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/CustomerOnboarding_ConsentPages_button_Back'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/CustomerOnboarding_ConsentPages_button_Close'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/CustomerOnboarding_ConsentPages_text_Meet the applicant in person and sign'), 
    'Meet the applicant in person and sign the consent form directly on your tablet or phone.')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/CustomerOnboarding_ConsentPages_text_Generate Consent Form'), 
    'Generate Consent Form')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/CustomerOnboarding_ConsentPages_text_Automatically send the consent'), 
    'Automatically send the consent form to the applicant via email.')

//Mobile.verifyElementText(findTestObject(''), 'Automatically send the consent form to the applicant via email.')
Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/CustomerOnboarding_ConsentPages_text_Upload Application Form'), 
    'Upload Application Form')

//Mobile.verifyElementText(findTestObject(''), 'Upload Application Form')
Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/CustomerOnboarding_ConsentPages_text_Upload applicants mortgage applicationt'), 
    'Upload applicant\'s mortgage application form or simplified consent form.')

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/CustomerOnboarding_ConsentPages_button_Continue'), 
    0)

if (GlobalVariable.ConsentPages_radioButton == 'Sign Electrically') {
    Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/CustomerOnboarding_ConsentPages_radioButton_SignElectronically'), 
        0)

    Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/CustomerOnboarding_ConsentPages_button_Continue'), 
        0)
	
	if(GlobalVariable.Applicants_No == '1')
	{

    Mobile.callTestCase(findTestCase('Tester02_New/Pages/CustomerOnboarding_ConsentPages/Sign_Electrically'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	if(GlobalVariable.Applicants_No == '2')
		{
	
		Mobile.callTestCase(findTestCase('Tester02_New/Pages/CustomerOnboarding_ConsentPages/Sign_Electrically_JointApplicant'), [:], FailureHandling.STOP_ON_FAILURE)
		}
}

//Mobile.verifyElementVisible(findTestObject('Tester02_New/CustomerOnboarding_ConsentPages/CustomerOnboarding_ConsentPages_radioButton_SignElectronically'),  0)
if (GlobalVariable.ConsentPages_radioButton == 'Generate Consent Form') {
    Mobile.tap(findTestObject('Tester02_New/CustomerOnboarding_ConsentPages/CustomerOnboarding_ConsentPages_radioButton_GenerateConsentForm'), 
        0)

    Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/CustomerOnboarding_ConsentPages_button_Continue'), 
        0)
	
	Mobile.callTestCase(findTestCase('Tester02_New/Pages/CustomerOnboarding_ConsentPages/GenerateConsentForm'), [:], FailureHandling.STOP_ON_FAILURE)
}

if (GlobalVariable.ConsentPages_radioButton == 'Upload Application Form') {
    Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/CustomerOnboarding_ConsentPages_radioButton_UploadApplicationForm'), 
        0)

    Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/CustomerOnboarding_ConsentPages_button_Continue'), 
        0)
	
	Mobile.callTestCase(findTestCase('Tester02_New/Pages/CustomerOnboarding_ConsentPages/UploadApplicationForm'), [:], FailureHandling.STOP_ON_FAILURE)
}

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

