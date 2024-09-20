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

//Mobile.startExistingApplication('com.maybank2u.salesforce.uatent')

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/ResultsScreens/STP_Pass_Page/ResultsScreen_STP_button_Back'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/ResultsScreens/STP_Pass_Page/ResultsScreen_STP_button_Close'), 
    0)

Mobile.getText(findTestObject('Object Repository/Tester02_New/ResultsScreens/STP_Pass_Page/ResultsScreen_text_STP'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/ResultsScreens/STP_Pass_Page/ResultsScreen_text_PASS'), 
    'PASS')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/ResultsScreens/STP_Pass_Page/ResultsScreen_text_Great news, your applicant is eligible for this financing'), 
    'Great news, your applicant is eligible for this financing!')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/ResultsScreens/STP_Pass_Page/ResultsScreen_text_You may proceed with data entry and submit it to your manager for approval'), 
    'You may proceed with data entry and submit it to \nyour manager for approval.')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/ResultsScreens/STP_Pass_Page/ResultsScreen_text_Please find the details below'), 
    'Please find the details below:')

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/ResultsScreens/STP_Pass_Page/ResultsScreen_STP_text_PropertyName'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/ResultsScreens/STP_Pass_Page/ResultsScreen_STP_text_MainApplicantName'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/ResultsScreens/STP_Pass_Page/ResultsScreen_STP_text_STP ID MSF'), 
    0)

//STP ID: MSF231018120158351
String MSF_ID_FullText = Mobile.getText(findTestObject('Object Repository/Tester02_New/ResultsScreens/STP_Pass_Page/ResultsScreen_STP_text_STP ID MSF'),
	0)

String MSF_ID = MSF_ID_FullText.substring(8, 26)

Mobile.comment(MSF_ID)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/ResultsScreens/STP_Pass_Page/ResultsScreen_STP_arrow_ApplicantDetails'), 
    0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/ResultsScreens/STP_Pass_Page/ResultsScreen_STP_arrow_ApplicantDetails'), 
    0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/ResultsScreens/STP_Pass_Page/ResultsScreen_STP_arrow_ApplicantDetails_Popup_Header_Confidential Data'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/ResultsScreens/STP_Pass_Page/ResultsScreen_STP_arrow_ApplicantDetails_Popup_text_This page contains'), 
    'This page contains confidential information and is intended solely for the use of the Bank.\n\nYou may not share the information on this page in any way with your applicant.')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/ResultsScreens/STP_Pass_Page/ResultsScreen_STP_arrow_ApplicantDetails_Popup_button_Confirm'), 
    'Confirm')

Mobile.tap(findTestObject('Object Repository/Tester02_New/ResultsScreens/STP_Pass_Page/ResultsScreen_STP_arrow_ApplicantDetails_Popup_button_Cancel'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/ResultsScreens/STP_Pass_Page/ResultsScreen_STP_text_Property Price'), 
    'Property Price')

Mobile.swipe(300, 900, 300, 300)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/ResultsScreens/STP_Pass_Page/ResultsScreen_STP_text_Downpayment'), 
    'Downpayment')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/ResultsScreens/STP_Pass_Page/ResultsScreen_STP_text_Financing Amount'), 
    'Financing Amount')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/ResultsScreens/STP_Pass_Page/ResultsScreen_STP_text_Financing Period'), 
    'Financing Period')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/ResultsScreens/STP_Pass_Page/ResultsScreen_STP_text_Profit Rate'), 
    'Profit Rate')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/ResultsScreens/STP_Pass_Page/ResultsScreen_STP_text_Monthly Instalment'), 
    'Monthly Instalment')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/ResultsScreens/STP_Pass_Page/ResultsScreen_STP_text_Banks Selling Price'), 
    'Bank’s Selling Price')

Mobile.getText(findTestObject('Object Repository/Tester02_New/ResultsScreens/STP_Pass_Page/ResultsScreen_STP_text_Property Price_Result'), 
    0)

Mobile.getText(findTestObject('Object Repository/Tester02_New/ResultsScreens/STP_Pass_Page/ResultsScreen_STP_text_Downpayment_Result'), 
    0)

Mobile.getText(findTestObject('Object Repository/Tester02_New/ResultsScreens/STP_Pass_Page/ResultsScreen_STP_text_Financing Amount_Result'), 
    0)

Mobile.getText(findTestObject('Object Repository/Tester02_New/ResultsScreens/STP_Pass_Page/ResultsScreen_STP_text_Financing Period_Result'), 
    0)

Mobile.getText(findTestObject('Object Repository/Tester02_New/ResultsScreens/STP_Pass_Page/ResultsScreen_STP_text_Profit Rate_Result'), 
    0)

Mobile.getText(findTestObject('Object Repository/Tester02_New/ResultsScreens/STP_Pass_Page/ResultsScreen_STP_text_Monthly Instalment_Result'), 
    0)

Mobile.getText(findTestObject('Object Repository/Tester02_New/ResultsScreens/STP_Pass_Page/ResultsScreen_STP_text_Banks Selling Price_Result'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/ResultsScreens/STP_Pass_Page/ResultsScreen_STP_button_Save as Draft'), 
    0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/ResultsScreens/STP_Pass_Page/ResultsScreen_STP_button_ProceedWithDataEntry'), 
    0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/ResultsScreens/STP_Pass_Page/ResultsScreen_STP_button_ProceedWithDataEntry_Popup_Header_Data Entry'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/ResultsScreens/STP_Pass_Page/ResultsScreen_STP_button_ProceedWithDataEntry_Popup_text_When you proceed'), 
    'When you proceed with data entry, you will not be able to edit your applicant(s) financing information.\n\nOnce you start data entry and your applicant(s) are not agreeable to this offer, you\'ll need to create another application.\n\nAre you sure you want to proceed?')

Mobile.tap(findTestObject('Object Repository/Tester02_New/ResultsScreens/STP_Pass_Page/ResultsScreen_STP_button_ProceedWithDataEntry_Popup_button_Cancel'), 
    0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/ResultsScreens/STP_Pass_Page/ResultsScreen_STP_button_ProceedWithDataEntry'),
	0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/ResultsScreens/STP_Pass_Page/ResultsScreen_STP_button_ProceedWithDataEntry_Popup_Header_Data Entry'),
	0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/ResultsScreens/STP_Pass_Page/ResultsScreen_STP_button_ProceedWithDataEntry_Popup_button_Proceed'), 
    0)

//Mobile.closeApplication()

