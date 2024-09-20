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

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/Data Entry Completed Page/DataEntryCompletedPage_Header_Data Entry Completed'), 0)

Mobile.takeScreenshot()

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/Data Entry Completed Page/DataEntryCompletedPage_text_You can'), 0), 'You can now proceed to generate the Letter of Offer.')

Mobile.tap(findTestObject('Object Repository/Tester03_old/Data Entry Completed Page/DataEntryCompletedPage_button_SelectLOTermsConditions'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/LOTermsAndConditionPage_1/LOTermsConditionsPage_Title_LOTermsandCondition'), 
    0)

Mobile.takeScreenshot()

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/LOTermsAndConditionPage_1/LOTermsConditionsPage_text_Please select'), 
    0), 'Please select the one that apply:')

Mobile.getText(findTestObject('Object Repository/Tester03_old/LOTermsAndConditionPage_1/LOTermsConditionsPage_text_PropertyTakaful'), 
    0)

Mobile.takeScreenshot()

HouseownerXtrasPolicy = Mobile.getText(findTestObject('Object Repository/Tester03_old/LOTermsAndConditionPage_1/LOTermsConditionsPage_bullet_Houseowner Xtras Policy'), 0)

Mobile.tap(findTestObject('Object Repository/Tester03_old/LOTermsAndConditionPage_1/LOTermsConditionsPage_bullet_Houseowner Xtras Policy'), 0)

Mobile.takeScreenshot()

HouseownersPolicy = Mobile.getText(findTestObject('Object Repository/Tester03_old/LOTermsAndConditionPage_1/LOTermsConditionsPage_bullet_Houseowners Policy'),
	0)

Mobile.tap(findTestObject('Object Repository/Tester03_old/LOTermsAndConditionPage_1/LOTermsConditionsPage_bullet_Houseowners Policy'),
	0)

Mobile.takeScreenshot()

FireTakaful = Mobile.getText(findTestObject('Object Repository/Tester03_old/LOTermsAndConditionPage_1/LOTermsConditionsPage_bullet_Fire Takaful'), 0)

Mobile.tap(findTestObject('Object Repository/Tester03_old/LOTermsAndConditionPage_1/LOTermsConditionsPage_bullet_Fire Takaful'),
	0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Tester03_old/LOTermsAndConditionPage_1/LOTermsAndConditions_button_Back'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/Data Entry Completed Page/DataEntryCompletedPage_Header_Data Entry Completed'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Tester03_old/Data Entry Completed Page/DataEntryCompletedPage_button_SelectLOTermsConditions'), 0)

Mobile.takeScreenshot()

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/LOTermsAndConditionPage_1/LOTermsConditionsPage_Title_LOTermsandCondition'),
	0)

Mobile.tap(findTestObject('Object Repository/Tester03_old/LOTermsAndConditionPage_1/LOTermsConditionsPage_bullet_Houseowner Xtras Policy'),
	0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Tester03_old/LOTermsAndConditionPage_1/LOTermsConditionsPage_button_Generate LO'),
	0)

