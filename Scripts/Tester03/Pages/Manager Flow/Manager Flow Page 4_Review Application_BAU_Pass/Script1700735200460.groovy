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

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03/Manager Flow/Review Application Page/ReviewApplicationPage_Title_Review Application'), 
    10)

Mobile.delay(10)

Mobile.takeScreenshot()

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/Review Application Page/ReviewApplicationPage_text_Please ensure you verify'), 
        0), 'Please ensure you verify the contents in each of the following folders before recommending them to CLCC.')

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/Review Application Page/ReviewApplicationPage_Field_Data Entry'), 
        0), 'Data Entry')

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/Review Application Page/ReviewApplicationPage_Field_EDD Summary'), 
        0), 'EDD Summary')

'First Review Option'
/*Mobile.tap(findTestObject('Object Repository/Tester03/Manager Flow/Review Application Page/ReviewApplicationPage_DataEntry_Icon_RightArrow'), 
    0)

Mobile.callTestCase(findTestCase('Test Cases/Tester03/Pages/Manager Flow/Manager Flow Page 5_Data Entry_BAU Pass_TwoApplicants'), [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03/Manager Flow/Review Application Page/ReviewApplicationPage_Title_Review Application'),
	10)*/

EDDSummary_Status = Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/Review Application Page/ReviewApplicationPage_text_EDDSummary_Status'), 
    0)

'Second Review Option'
Mobile.tap(findTestObject('Object Repository/Tester03/Manager Flow/Review Application Page/ReviewApplicationPage_EDDSummary_Icon_RightArrow'), 
    0)

Mobile.callTestCase(findTestCase('Tester03/Pages/Manager Flow/Manager Flow Page 6_EDD Summary'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Sprint 24: ALL BAU Enhancement'
if(Mobile.verifyElementExist(findTestObject('Object Repository/Tester03/Manager Flow/Review Application Page/ReviewApplicationPage_FieldText_Property Insurance'), 10,FailureHandling.OPTIONAL))
	{
		Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/Review Application Page/ReviewApplicationPage_FieldText_Property Insurance'), 
        0), 'Property Insurance')

		'Third Review Option'
		Mobile.tap(findTestObject('Object Repository/Tester03/Manager Flow/Review Application Page/ReviewApplicationPage_PropertyInsurance_Icon_RightArrow'), 
    0)
	}

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/Review Application Page/ReviewApplicationPage_text_First Submitted On'), 
        0), 'First Submitted On')

DateAndTime = Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/Review Application Page/ReviewApplicationPage_text_DateAndTime'), 
    0)

Mobile.verifyEqual(DraftListItemDetailStatusDate, DateAndTime)

Messagefrom = Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/Review Application Page/ReviewApplicationPage_text_Message from'), 
    0)

MessageStatus = Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/Review Application Page/ReviewApplicationPage_text_MessageStatus'), 
    0)

Mobile.takeScreenshot()

Mobile.swipe(300, 900, 300, 300)

Mobile.takeScreenshot()

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/Review Application Page/ReviewApplicationPage_text_Note to CLCC (Mandatory)'), 
        0), 'Note to CLCC (Mandatory)')

Mobile.takeScreenshot()

Mobile.clearText(findTestObject('Object Repository/Tester03/Manager Flow/Review Application Page/ReviewApplicationPage_EditText_Write a note'), 0)

Mobile.takeScreenshot()

Mobile.setText(findTestObject('Object Repository/Tester03/Manager Flow/Review Application Page/ReviewApplicationPage_EditText_Write a note'), 
    'Automation', 0)

'Option One'
//Mobile.tap(findTestObject('Object Repository/Tester03/Manager Flow/Review Application Page/ReviewApplicationPage_button_Send to Originator to Rework'), 
//    0)
//
//Mobile.delay(10)
//
//Mobile.takeScreenshot()
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/Review Application Page/ReviewApplicationPage_SendtoOriginatortoRework_text_Please add your comment on what to rework below'), 0), 'Please add your comment on what to rework below:')
//
//Mobile.setText(findTestObject('Object Repository/Tester03/Manager Flow/Review Application Page/ReviewApplicationPage_SendtoOriginatortoRework_TextBox_ReworkModal'), 'Automation', 0)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/Manager Flow/Review Application Page/ReviewApplicationPage_SendtoOriginatortoRework_Button_Send'), 0)
//
//Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03/Manager Flow/Review Application Page/ReviewApplicationPage_SendtoOriginatortoRework_text_Sent for rework'),
//	10, FailureHandling.CONTINUE_ON_FAILURE)
//
//Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/Review Application Page/ReviewApplicationPage_SendtoOriginatortoRework_text_Sent for rework'), 0), 'Sent for rework.')

'Option Two'

Mobile.tap(findTestObject('Object Repository/Tester03/Manager Flow/Review Application Page/ReviewApplicationPage_button_Add Data to CCRIS'), 
    0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Tester03/Manager Flow/Review Application Page/ReviewApplicationPage_button_Recommend to CLCC'),
	0)

Mobile.takeScreenshot()

Mobile.delay(5)

Mobile.takeScreenshot()

