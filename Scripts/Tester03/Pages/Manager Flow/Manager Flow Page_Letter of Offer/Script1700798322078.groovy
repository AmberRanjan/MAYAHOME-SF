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

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03/Manager Flow/Letter of Offer Page/ReviewDataEntryandLOPage_PropertyTakaful_text_Property Takaful'), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/Letter of Offer Page/ReviewDataEntryandLOPage_PropertyTakaful_text_Review Data Entry and LO'), 0), 'Review Data Entry and LO')

Mobile.takeScreenshot()

Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/Letter of Offer Page/ReviewDataEntryandLOPage_PropertyTakaful_text_Houseowner Xtras Policy'), 0)

Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/Letter of Offer Page/ReviewDataEntryandLOPage_PropertyTakaful_text_Houseowners Policy'), 0)

Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/Letter of Offer Page/ReviewDataEntryandLOPage_PropertyTakaful_text_Fire Takaful'), 0)

Mobile.tap(findTestObject('Object Repository/Tester03/Manager Flow/Letter of Offer Page/ReviewDataEntryandLOPage_PropertyTakaful_button_View Full Letter of Offer'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03/Manager Flow/Letter of Offer Page/LetterofOfferPage_TitleText_Letter of Offer'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Tester03/Manager Flow/Letter of Offer Page/LetterofOfferPage_button_Back'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/Tester03/Manager Flow/Letter of Offer Page/ReviewDataEntryandLOPage_PropertyTakaful_button_View Full Letter of Offer'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03/Manager Flow/Letter of Offer Page/LetterofOfferPage_TitleText_Letter of Offer'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Tester03/Manager Flow/Letter of Offer Page/LetterofOfferPage_text_Back to Summary'), 0)

Mobile.takeScreenshot()