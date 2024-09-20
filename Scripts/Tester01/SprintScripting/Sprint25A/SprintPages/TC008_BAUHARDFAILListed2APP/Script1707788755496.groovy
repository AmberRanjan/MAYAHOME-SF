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

WebUI.callTestCase(findTestCase('Tester01/SprintScripting/Sprint25A/SprintPages/COBSingleApplicantHappyFlow'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Tester01/SprintScripting/Sprint25A/SprintPages/PropertyDetails'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/Tester01/Pages/ApplicantEligiblityPage/BauHardFailStage_EligiblityPage'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Tester01/SprintScripting/Sprint25A/SprintPages/IncomeAndCommitmentHappyFlow'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/Tester01/Pages/ApplicantEligiblityPage/BauHardFailStage_SuccessPage'), [:], FailureHandling.CONTINUE_ON_FAILURE)

// Check after process to woloc, Business appeal button is appearing and Process to Woloc is not present

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_BacktoCase'), 60, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_BacktoCase'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_BacktoCase'), 30, FailureHandling.OPTIONAL)

Mobile.delay(10)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_MAYA'), 60, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_ThreeDot'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Business Appeal'] ), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementNotPresent(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Process in WoLOC'] ), 30, FailureHandling.CONTINUE_ON_FAILURE)
