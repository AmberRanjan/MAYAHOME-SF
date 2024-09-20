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



int day = 4;
switch (day) {
	case 1:
		Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_text_Save Your Progress'),
		0)

		Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_text_You can choose'),
				'You can choose to save your progress as a draft before leaving and pick-up from where you left off at a later time.')

		Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_button_Exit'),
				0)

		Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_button_Save Now'),
				0)

		Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_button_close'),
				0)
		break;
	case 2:
		Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_text_Save Your Progress'),
		0)

		Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_text_You can choose'),
				'You can choose to save your progress as a draft before leaving and pick-up from where you left off at a later time.')

		Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_button_Exit'),
				0)

		Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_button_Save Now'),
				0)

		Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_button_close'),
				0)
		break;
	case 3:
		Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_text_Save Your Progress'),
		0)

		Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_text_You can choose'),
				'You can choose to save your progress as a draft before leaving and pick-up from where you left off at a later time.')

		Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_button_Exit'),
				0)

		Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_button_Save Now'),
				0)

		Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_button_close'),
				0)
		break;
	case 4:
		Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_text_Save Your Progress'),
		0)

		Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_text_You can choose'),
				'You can choose to save your progress as a draft before leaving and pick-up from where you left off at a later time.')

		Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_button_Exit'),
				0)

		Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_button_Save Now'),
				0)

		Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_button_close'),
				0)
		break;
	case 5:
		Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_text_Save Your Progress'),
		0)

		Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_text_You can choose'),
				'You can choose to save your progress as a draft before leaving and pick-up from where you left off at a later time.')

		Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_button_Exit'),
				0)

		Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_button_Save Now'),
				0)

		Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_button_close'),
				0)
		break;
}

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_text_Save Your Progress'),
		0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_text_You can choose'),
		'You can choose to save your progress as a draft before leaving and pick-up from where you left off at a later time.')

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_button_Exit'),
		0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_button_Save Now'),
		0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnborading_Close/CustomerOnBoarding_ClosePopUp_button_close'),
		0)


