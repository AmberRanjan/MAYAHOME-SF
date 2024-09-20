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

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03/Manager Flow/Review Data Entry and LO Page/ReviewDataEntryandLOPage_TitleText_Review Data Entry and LO'), 
    10)

Mobile.delay(10)

Mobile.takeScreenshot()

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/Review Data Entry and LO Page/ReviewDataEntryandLOPage_text_Please read'), 
        0), ' Please read the documents thoroughly and ensure the details are accurate before approving.')

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/Review Application Page/ReviewApplicationPage_Field_Data Entry'), 
        0), 'Data Entry')

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/Review Data Entry and LO Page/ReviewDataEntryandLOPage_text_Letter of Offer'), 
        0), 'Letter of Offer')

'First Review Option'
Mobile.tap(findTestObject('Object Repository/Tester03/Manager Flow/Review Application Page/ReviewApplicationPage_DataEntry_Icon_RightArrow'), 
    0)

Mobile.callTestCase(findTestCase('Test Cases/Tester03/Pages/Manager Flow/Manager Flow Page 5_Data Entry_STP_SoftFail_TwoApplicants'), [:], FailureHandling.OPTIONAL)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_button_Done'),0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03/Manager Flow/Review Data Entry and LO Page/ReviewDataEntryandLOPage_TitleText_Review Data Entry and LO'), 
    10)

'Second Review Option'
Mobile.tap(findTestObject('Object Repository/Tester03/Manager Flow/Review Data Entry and LO Page/ReviewDataEntryandLOPage_button_ManReviewLO_ArrowIcon'), 
    0)

Mobile.callTestCase(findTestCase('Test Cases/Tester03/Pages/Manager Flow/Manager Flow Page_Letter of Offer'), [:], FailureHandling.CONTINUE_ON_FAILURE)

if (Mobile.verifyElementExist(findTestObject('Object Repository/Tester03/Manager Flow/Review Application Page/ReviewApplicationPage_FieldText_Property Insurance'), 
    10, FailureHandling.OPTIONAL)) {
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

Mobile.verifyEqual(CaseDetailsTimeLineDate, DateAndTime)

Messagefrom = Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/Review Application Page/ReviewApplicationPage_text_Message from'), 
    0)

MessageStatus = Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/Review Application Page/ReviewApplicationPage_text_MessageStatus'), 
    0)

//Mobile.takeScreenshot()
//
//Mobile.swipe(300, 900, 300, 300)
Mobile.takeScreenshot()

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/Review Data Entry and LO Page/ReviewDataEntryandLOPage_text_Message (Mandatory for Rejection)'), 
        0), 'Message (Mandatory for Rejection)')

Mobile.takeScreenshot()

Mobile.clearText(findTestObject('Object Repository/Tester03/Manager Flow/Review Data Entry and LO Page/ReviewDataEntryandLOPage_EditText_MessageOptionalInput'), 
    0)

Mobile.takeScreenshot()

Mobile.setText(findTestObject('Object Repository/Tester03/Manager Flow/Review Data Entry and LO Page/ReviewDataEntryandLOPage_EditText_MessageOptionalInput'), 
    'Automation', 0)

Mobile.takeScreenshot()

Mobile.verifyElementExist(findTestObject('Object Repository/Tester03/Manager Flow/Review Data Entry and LO Page/ReviewDataEntryandLOPage_button_Approve'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/Tester03/Manager Flow/Review Data Entry and LO Page/ReviewDataEntryandLOPage_button_Reject'), 
    0)

Mobile.tap(findTestObject('Object Repository/Tester03/Manager Flow/Review Data Entry and LO Page/ReviewDataEntryandLOPage_button_Approve'), 
    0)

Mobile.delay(5)

Mobile.takeScreenshot()

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/Pending Requests Page/PendingRequestPage_ManagerSTPresult_text_Case approved'), 0), 'Case approved.')