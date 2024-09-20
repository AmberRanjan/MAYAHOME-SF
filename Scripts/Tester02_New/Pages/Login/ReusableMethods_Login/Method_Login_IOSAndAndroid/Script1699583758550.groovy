import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
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

/*Author: Vasudha
 * Data From Excel: Home2u_TestData
 * Sheet: SF_Scenarios_Data
 */

Mobile.startExistingApplication(GlobalVariable.SF_ApplicationID)

//Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/LoginPage/LoginPage_text_Login to Sales Force'), 0, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.setText(findTestObject('Tester02_New/LoginPage/LoginPage_textBox_PF Number'), GlobalVariable.UserID,  5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Tester02_New/LoginPage/LoginPage_textBox_Password'), GlobalVariable.SF_Agent_Password,  5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester02_New/LoginPage/LoginPage_button_Login'),  5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester02_New/HomePage_text_Home'), 10, FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/HomePage_text_Hire Purchase'), 'Hire Purchase', FailureHandling.CONTINUE_ON_FAILURE)

