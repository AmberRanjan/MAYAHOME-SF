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
//Mobile.startExistingApplication(GlobalVariable.SF_ApplicationID)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/ApplicationDetailsPages/PersonalDetails/ApplicationDetailsPage_Header'), 
    0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/ApplicationDetailsPages/PersonalDetails/ApplicationDetailsPage_button_Back'), 
    0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/ApplicationDetailsPages/PersonalDetails/DraftApplication_DetailedPage_button_ViewApplicationDetails'), 
    0)

Boolean PersonalDetailsTabVisible = Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/ApplicationDetailsPages/PersonalDetails/ApplicationDetailsPage_button_Personal Details'), 
    10, FailureHandling.OPTIONAL)

if (PersonalDetailsTabVisible == true) {
    Mobile.tap(findTestObject('Object Repository/Tester02_New/ApplicationDetailsPages/PersonalDetails/ApplicationDetailsPage_button_Personal Details'), 
        0)

    Mobile.callTestCase(findTestCase('Tester02_New/Pages/ApplicationDetailsPages/PersonalDetails/PersonalDetails_Tab_Validation'), 
        [:], FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Object Repository/Tester02_New/ApplicationDetailsPages/PersonalDetails/ApplicationDetailsPage_button_Personal Details'), 
        0)
}

