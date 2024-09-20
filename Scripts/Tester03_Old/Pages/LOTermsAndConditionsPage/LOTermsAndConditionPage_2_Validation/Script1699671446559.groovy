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

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/LOTermsAndConditionPage_2/LetterofOfferPage_header_Letter of Offer'), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/LOTermsAndConditionPage_2/LetterofOfferPage_header_Letter of Offer'), 0), 'Letter of Offer')

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Tester03_old/LOTermsAndConditionPage_2/LetterofOfferPage_button_Back'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/LOTermsAndConditionPage_1/LOTermsConditionsPage_Title_LOTermsandCondition'),
	0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Tester03_old/LOTermsAndConditionPage_1/LOTermsConditionsPage_bullet_Houseowners Policy'),
	0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Tester03_old/LOTermsAndConditionPage_1/LOTermsConditionsPage_button_Generate LO'),
	0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/LOTermsAndConditionPage_2/LetterofOfferPage_header_Letter of Offer'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Tester03_old/LOTermsAndConditionPage_2/LetterofOfferPage_button_Confirm'), 0)