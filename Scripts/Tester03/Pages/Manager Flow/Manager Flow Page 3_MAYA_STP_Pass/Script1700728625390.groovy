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

Mobile.delay(10)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03/Manager Flow/MAYA Page/MAYAPage_text_ApplicantName'), 
    0)

Mobile.takeScreenshot()

ApplicantNameMAYA = Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/MAYA Page/MAYAPage_text_ApplicantName'), 
    0)

assert ApplicantNameMAYA.contains(ApplicantNamePendingRequest)

if (Mobile.verifyElementExist(findTestObject('Object Repository/Tester03/Manager Flow/MAYA Page/MAYAPage_text_CaseDetailsTimeLineStatusText_Pending Managers Approval'), 10, FailureHandling.OPTIONAL)) {
	
	Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03/Manager Flow/MAYA Page/MAYAPage_text_CaseDetailsTimeLineStatusText_Pending Managers Approval'),
		0)

	CaseDetailsTimeLineDate = Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/MAYA Page/MAYAPage_text_CaseDetailsTimeLineDate'),
	0).replaceAll('Updated: ', '')
	
	if(CaseDetailsTimeLineDate.contains('PM')) {
		CaseDetailsTimeLineDate_New = CaseDetailsTimeLineDate.replaceFirst('PM', ' PM')
		
	}else {
		CaseDetailsTimeLineDate_New = CaseDetailsTimeLineDate.replaceFirst('AM', ' AM')
	}
	
	Mobile.takeScreenshot()
} else {
	
	Mobile.tap(findTestObject('Object Repository/Tester03/Manager Flow/MAYA Page/MAYAPage_button_DropDownArrow'), 0)
	
	Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03/Manager Flow/MAYA Page/MAYAPage_text_DraftListItemDetailStatusShortStatus_1'),
		0)
	
	Mobile.takeScreenshot()

	DraftListItemDetailStatusDate = Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/MAYA Page/MAYAPage_text_DraftListItemDetailStatusDate'),
	0)
	
	Mobile.tap(findTestObject('Object Repository/Tester03/Manager Flow/MAYA Page/MAYAPage_text_DraftListItemDetailStatusUpArrow'),
		0)
	
	Mobile.takeScreenshot()
	
}

CaseDetailsSTP = Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/MAYA Page/MAYAPage_text_CaseDetailsSTP'), 
    0).replace('STP ID: ', '')

CaseDetailsAANumber = Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/MAYA Page/MAYAPage_text_CaseDetailsAANumber'), 0)

Mobile.swipe(300, 900, 300, 300)

//Mobile.callTestCase(findTestCase('Tester03/Pages/Manager Flow/Manager Flow Page_Documents And Files'), [:], FailureHandling.OPTIONAL)

//Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Tester03/Manager Flow/MAYA Page/MAYAPage_button_Review Data Entry  LO'), 0)

Mobile.delay(10)

return CaseDetailsTimeLineDate_New