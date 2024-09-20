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

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/MAYA Page/MAYAPage_text_WoLOC Notes'), 0), 'WoLOC Notes')

Mobile.tap(findTestObject('Object Repository/Tester03/Manager Flow/MAYA Page/MAYAPage_text_WoLOC Notes'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03/Manager Flow/WoLOC Notes Page/WoLOCPage_TitleText_WoLOC Notes'), 0)

WoLOCNotesSTPID = Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/WoLOC Notes Page/WoLOCPage_text_STP ID'), 0).replace('STP ID:  ', '')

Mobile.verifyEqual(CaseDetailsSTP, WoLOCNotesSTPID)

WoLOCNotesAANo = Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/WoLOC Notes Page/WoLOCPage_text_AA No'), 0)

Mobile.verifyEqual(CaseDetailsAANumber, WoLOCNotesAANo)

Mobile.tap(findTestObject('Object Repository/Tester03/Manager Flow/WoLOC Notes Page/WoLOCPage_button_Back'), 0)