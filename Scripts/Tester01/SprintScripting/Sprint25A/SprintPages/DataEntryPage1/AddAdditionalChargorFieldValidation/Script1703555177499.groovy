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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

Mobile.comment('verify and add additinal chargor details')

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.50)

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.50)

Mobile.clearText(findTestObject('Object Repository/Tester01/DataEntry/input_PhoneNumber'), 30, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.00)

Mobile.clearText(findTestObject('Object Repository/Tester01/DataEntry/input_CorrespondenceAddress1'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.clearText(findTestObject('Object Repository/Tester01/DataEntry/input_CorrespondenceAddress2'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.clearText(findTestObject('Object Repository/Tester01/DataEntry/input_City'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.clearText(findTestObject('Object Repository/Tester01/DataEntry/input_Postcode'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/btn_Next'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/DataEntry/PhNumber_MandatoryField'), 30, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)

Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/DataEntry/CorresponseAddLine1_MandatoryField'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/DataEntry/CorresponseAddLine2_MandatoryField'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/DataEntry/City_MandatoryField'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/DataEntry/Postcode_MandatoryField'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Tester01/DataEntry/input_Postcode'), '580001', 30, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/btn_Next'), 30, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.takeScreenshot(FailureHandling.OPTIONAL)

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)

Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/DataEntry/Postcode_Invalid'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Tester01/DataEntry/input_Postcode'), '81200', 30, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/btn_Next'), 30, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.takeScreenshot(FailureHandling.OPTIONAL)

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)

Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/DataEntry/PostcodeState_MandatoryField'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Tester01/DataEntry/btn_BackAdditionalChargor'), 30, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Additional Chargor']),
	30, FailureHandling.CONTINUE_ON_FAILURE)
