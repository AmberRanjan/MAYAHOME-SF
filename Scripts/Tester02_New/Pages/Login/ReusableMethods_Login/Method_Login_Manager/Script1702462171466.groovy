import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable


/**Author: Vasudha
 * Data From Excel: Home2u_TestData
 * Sheet: SF_Scenarios_Data

int Row_Number = 1
def sheet = 'SF_Scenarios_Data'

'DataFile'
GlobalVariable.SF_ApplicationID = findTestData(sheet).getValue('SF_Application_ID', Row_Number)
GlobalVariable.SF_Agent_PF_ID = findTestData(sheet).getValue('SF_Agent_PF_ID', Row_Number)
GlobalVariable.SF_Agent_Password = findTestData(sheet).getValue('SF_Agent_Password', Row_Number)
 */

//Mobile.comment('Launch SF Application')

//Mobile.startExistingApplication(GlobalVariable.SF_ApplicationID)


Boolean userIsOnLoginPage = Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/LoginPage/LoginPage_text_Login to Sales Force'), 
    10, FailureHandling.OPTIONAL)


if (userIsOnLoginPage == true) {
	
	Mobile.comment('open and close LOGS')
	
	Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/LoginPage/LoginPage_Logs'), 10,FailureHandling.OPTIONAL)
	
	Mobile.tap(findTestObject('Object Repository/Tester02_New/LoginPage/LoginPage_Logs'), 10,FailureHandling.OPTIONAL)
	
	Mobile.delay(2)
	
	Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/LoginPage/LoginPage_Logs_Close'), 10,FailureHandling.OPTIONAL)
	
	Mobile.tap(findTestObject('Object Repository/Tester02_New/LoginPage/LoginPage_Logs_Close'),10,FailureHandling.OPTIONAL)
	
	Mobile.delay(3)
	
    Mobile.setText(findTestObject('Tester02_New/LoginPage/LoginPage_textBox_PF Number'), GlobalVariable.SF_Manager_PF_ID, 0)

    Mobile.setText(findTestObject('Tester02_New/LoginPage/LoginPage_textBox_Password'), GlobalVariable.SF_Manager_Password, 0)

    Mobile.tap(findTestObject('Object Repository/Tester02_New/LoginPage/LoginPage_button_Login'), 0)

    Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/HomePage/HomePage_text_Mortgage'), 'Mortgage', 
        FailureHandling.CONTINUE_ON_FAILURE)
}
/*
Boolean userIsOnHomePage = Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/HomePage/HomePage_text_Mortgage'), 
    10, FailureHandling.OPTIONAL)

if (userIsOnHomePage == true) {
   // Mobile.tap(findTestObject('Object Repository/Tester02_New/HomePage/HomePage_button_Home'), 10, FailureHandling.OPTIONAL)
	
	Mobile.comment('User is on Hoome2u Application Home page')
}
else {
	Mobile.comment('User is unable to launch the Home2u Application ')
}

*/


