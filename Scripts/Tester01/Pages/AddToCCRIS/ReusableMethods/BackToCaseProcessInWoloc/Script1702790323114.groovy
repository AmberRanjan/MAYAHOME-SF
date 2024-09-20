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


Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CaseDetailsTimelinetext'), 'Pending Ref Index Creation in WoLOC', FailureHandling.CONTINUE_ON_FAILURE)
// Expand to verify the previous status of Add to CCRIS
Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_DownArrow'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_FullStatus'), 'Pending creation of Ref Index in WoLOC.', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CCRIS_0'), 'Pending Ref Index Creation in WoLOC', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CCRIS_1'), 'Unsatisfactory AIP', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_UpArrow'), 30, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_UpArrow'), 30, FailureHandling.OPTIONAL)