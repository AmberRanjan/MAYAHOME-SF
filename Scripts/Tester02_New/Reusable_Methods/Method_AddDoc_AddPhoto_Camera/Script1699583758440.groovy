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

//Add Document -- Camera
Boolean userIsOnApplicantsIDPage_NoDocs = Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/UploadApplicationForm/UploadApplicationForm_ApplicationFormPage_text_No Documents To Show'), 
    5, FailureHandling.OPTIONAL)

if (userIsOnApplicantsIDPage_NoDocs == true) {
    Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/UploadApplicationForm/UploadApplicationForm_ApplicationFormPage_button_AddDocument'), 
        5, FailureHandling.CONTINUE_ON_FAILURE)
}

Boolean userIsOnApplicantsIDPage_AddAnotherDoc = Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/UploadApplicationForm/UploadApplicationForm_ApplicationFormPage_button_AddAnotherDocument'), 
    5, FailureHandling.OPTIONAL)

if (userIsOnApplicantsIDPage_AddAnotherDoc == true) {
    Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/UploadApplicationForm/UploadApplicationForm_ApplicationFormPage_button_AddAnotherDocument'), 
        5, FailureHandling.CONTINUE_ON_FAILURE)
}

Mobile.callTestCase(findTestCase('Tester02_New/Reusable_Methods/Method_AddDoc_Allow_Permissions'), [:], FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/UploadApplicationForm/UploadApplicationForm_ApplicationFormPage_button_AddDocument_Camera'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.callTestCase(findTestCase('Tester02_New/Reusable_Methods/Method_AddDoc_Allow_Permissions'), [:], FailureHandling.OPTIONAL)

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/UploadApplicationForm/UploadApplicationForm_ApplicationFormPage_button_AddDocument_Camera_Shutter'), 
    15, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/UploadApplicationForm/UploadApplicationForm_ApplicationFormPage_button_AddDocument_Camera_Done'), 
    15, FailureHandling.CONTINUE_ON_FAILURE)


