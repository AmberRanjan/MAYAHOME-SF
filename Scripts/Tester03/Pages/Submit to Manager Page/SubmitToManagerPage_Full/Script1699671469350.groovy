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

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/CaseProcessingPage_Title'), 
    0)

Mobile.takeScreenshot()

/*Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/CaseProcessingPage_text_Please ensure_BAU'), 
        0), 'Please ensure all the documents are correct and complete before submitting to your manager. If there’s any missing document, please upload it via EDMS.')

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/CaseProcessingPage_text_Data Entry'), 
        0), 'Data Entry')

Mobile.takeScreenshot()


/////////////////////////////////////////////////////////////////
Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/DataEntryReviewPage_button_Done'), 
    0)

Mobile.tap(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/DataEntryReviewPage_button_Done'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/DataEntryCompletedPage_button_Back to Case'), 
    0)

Mobile.takeScreenshot()

Mobile.callTestCase(findTestCase('Tester03/Pages/LOTermsAndConditionsPage/LOTermsAndConditionPage_Full'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/CaseProcessingPage_Title'), 
    0)

Mobile.takeScreenshot()*/




Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/CaseProcessingPage_text_Letter of Offer'), 
        0), 'Letter of Offer')

//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/CaseProcessingPage_text_Message (Optional)'),
//	0), 'Message (Optional)')
//
//Mobile.setText(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/CaseProcessingPage_edit_message'), 'automation',
//	0)
Mobile.tap(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/CaseProcessingPage_ClickableImage_Letter of Offer'), 
    0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/LOTermsConditionsSummaryPage_Header'), 
    0)

Mobile.takeScreenshot()

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/LOTermsConditionsSummaryPage_Header'), 
        0), 'LO Terms & Conditions')

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/LOTermsConditionsSummaryPage_Header_Summary'), 
        0), 'Summary')

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/LOTermsConditionsSummaryPage_text_PropertyTakaful'), 
        0), 'Property Takaful')

HouseownerExtrasPolicy = Mobile.getText(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/LOTermsConditionsSummaryPage_text_Houseowner Xtras Policy'), 
    0)

HouseownersPolicy = Mobile.getText(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/LOTermsConditionsSummaryPage_text_Houseowners Policy'), 
    0)

FireTakaful = Mobile.getText(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/LOTermsConditionsSummaryPage_text_Fire Takaful'), 
    0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/LOTermsConditionsSummaryPage_text_View Full Letter of Offer'), 
        0), 'View Full Letter of Offer')

Mobile.tap(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/LOTermsandConditionsSummaryPage_ClickableImage_Pencil'),
	0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/LOTermsConditionsSummaryPage_text_PropertyTakaful'), 
    0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/AfterClickPencil_Button_Back'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/LOTermsConditionsSummaryPage_Header'),
	0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/LOTermsandConditionsSummaryPage_ClickableImage_Pencil'),
	0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/LOTermsConditionsSummaryPage_text_PropertyTakaful'),
	0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Tester03_old/LOTermsAndConditionPage_1/LOTermsConditionsPage_bullet_Fire Takaful'), 
    0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Tester03_old/LOTermsAndConditionPage_1/LOTermsConditionsPage_button_Generate LO'), 
    0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/LOTermsAndConditionPage_2/LetterofOfferPage_header_Letter of Offer'), 
    0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Tester03_old/LOTermsAndConditionPage_2/LetterofOfferPage_button_Confirm'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/LOTermsAndConditionPage_3/LetterofOfferCompletedPage_Header_Letter of Offer Completed'), 
    0)

Mobile.takeScreenshot()

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/LOTermsAndConditionPage_3/LetterofOfferCompletedPage_text_You can now proceed'), 
        0), 'You can now proceed to submit the Letter of Offer to your manager')

Mobile.tap(findTestObject('Object Repository/Tester03_old/LOTermsAndConditionPage_3/LetterofOfferCompletedPage_button_SubmittoManager'), 
    0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/CaseProcessingPage_Title'), 
    0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Tester03_old/LOTermsAndConditionPage_2/LetterofOfferPage_button_Back'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/LOTermsConditionsSummaryPage_text_View Full Letter of Offer'), 
    0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/LOTermsConditionsSummaryPage_text_View Full Letter of Offer'), 
    0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/LOTermsAndConditionPage_2/LetterofOfferPage_header_Letter of Offer'), 
    0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/LetterofOfferPage_button_Back to Case Processing'), 
    0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/PendingProcessingPage_button_Submit to Manager'), 
    0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/PendingProcessingPage_button_Submit to Manager'), 
    0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/CaseProcessingPage_button_Submit Now'), 
    0)

Mobile.takeScreenshot()

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/CaseProcessingPage_text_Message (Optional)'), 
        0), 'Message (Optional)')

Mobile.setText(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/CaseProcessingPage_edit_message'), 'automation', 
    0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/CaseProcessingPage_button_Submit Now'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/SubmittedtoManagerPage_Title_Submitted to Manager'), 
    0)

Mobile.getText(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/SubmittedtoManagerPage_text_Your manager will'), 
    0)

Mobile.tap(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/SubmittedtoManagerPage_button_Back to Case'), 
    0)

