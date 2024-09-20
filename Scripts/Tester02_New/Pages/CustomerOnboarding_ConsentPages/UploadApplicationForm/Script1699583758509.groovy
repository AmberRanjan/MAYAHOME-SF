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

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/UploadApplicationForm/UploadApplicationForm_PDPAPage_Header'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/UploadApplicationForm/UploadApplicationForm_PDPAPage_text_Please confirm'), 
    'Please confirm which option the customer chose in their mortgage application form before making your selection')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/UploadApplicationForm/UploadApplicationForm_PDPAPage_text_Yes, IWe expressly agree to be contacted'), 
    'Yes, I/We expressly agree to be contacted')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/UploadApplicationForm/UploadApplicationForm_PDPAPage_text_No, IWe do not agree to be contacted'), 
    'No, I/We do not agree to be contacted')

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/UploadApplicationForm/UploadApplicationForm_PDPAPage_button_Back'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/UploadApplicationForm/UploadApplicationForm_PDPAPage_button_Close'), 
    0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/UploadApplicationForm/UploadApplicationForm_PDPAPage_button_Continue'), 
    0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/UploadApplicationForm/UploadApplicationForm_PDPAPage_radioButton_Yes'), 
    0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/UploadApplicationForm/UploadApplicationForm_PDPAPage_radioButton_No'), 
    0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/UploadApplicationForm/UploadApplicationForm_PDPAPage_button_Continue'), 
    0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/UploadApplicationForm/UploadApplicationForm_ApplicationFormPage_Header'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/UploadApplicationForm/UploadApplicationForm_ApplicationFormPage_button_Back'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/UploadApplicationForm/UploadApplicationForm_ApplicationFormPage_text_No Documents To Show'), 
    'No Documents To Show', FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/UploadApplicationForm/UploadApplicationForm_ApplicationFormPage_text_You have not uploaded any documents yet'), 
    'You have not uploaded any documents yet.', FailureHandling.OPTIONAL)

Mobile.callTestCase(findTestCase('Tester02_New/Reusable_Methods/Method_AddDoc_Allow_Permissions'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/UploadApplicationForm/UploadApplicationForm_ApplicationFormPage_button_AddDocument'), 
    0, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/UploadApplicationForm/UploadApplicationForm_ApplicationFormPage_button_AddDocument_Cancel'), 
    0, FailureHandling.OPTIONAL)

Mobile.callTestCase(findTestCase('Tester02_New/Reusable_Methods/Method_AddDoc_AddPhoto_Camera'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/UploadApplicationForm/UploadApplicationForm_ApplicationFormPage_text_Upload your application form here'), 
    'Upload your application form here for the consent submission. You can upload up to 15 files.', FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/UploadApplicationForm/UploadApplicationForm_ApplicationFormPage_button_Submit'), 
    0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/UploadApplicationForm/UploadApplicationForm_ApplicationFormPage_DocumentUpload_InProgress_Header'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/UploadApplicationForm/UploadApplicationForm_ApplicationFormPage_DocumentUpload_InProgress_text_Please wait'), 'Please wait as your documents are being verified and uploaded. This may take around 30 seconds to complete.')

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/UploadApplicationForm/UploadApplicationForm_ApplicationFormPage_DocumentUpload_InProgress_button_Back'), 
    0)

//Mobile.verifyElementVisible(findTestObject(''), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/UploadApplicationForm/UploadApplicationForm_ApplicationFormPage_DocumentUpload_Upload Completed_Header'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/UploadApplicationForm/UploadApplicationForm_ApplicationFormPage_DocumentUpload_Upload Completed_text'), 'You can now proceed with the eligiblity check or choose to do it at a later time.')

//Mobile.verifyElementVisible(findTestObject(''), 0)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConsentPages/UploadApplicationForm/UploadApplicationForm_ApplicationFormPage_DocumentUpload_Upload Completed_button_Continue'), 
    0)

