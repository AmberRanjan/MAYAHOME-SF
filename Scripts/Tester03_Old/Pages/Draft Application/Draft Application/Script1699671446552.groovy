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

Mobile.startExistingApplication('com.maybank2u.salesforce.uatent')

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/Draft Application Page/HomePage_text_Draft Application'), 0), 'Draft Application: ')

DraftApplicationCount = Mobile.getText(findTestObject('Object Repository/Tester03_old/Draft Application Page/HomePage_count_Draft Application'), 
    0)

Mobile.tap(findTestObject('Object Repository/Tester03_old/Draft Application Page/HomePage_count_Draft Application'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/Draft Application Page/DraftPage_text_DraftNumber', 
        [('No') : '1']), 0)

Mobile.tap(findTestObject('Object Repository/Tester03_old/Draft Application Page/DraftPage_button_Back'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/Draft Application Page/HomePage_text_Draft Application'), 0)

Mobile.tap(findTestObject('Object Repository/Tester03_old/Draft Application Page/HomePage_count_Draft Application'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/Draft Application Page/DraftPage_text_DraftNumber',
	[('No') : '1']), 0)

Mobile.tap(findTestObject('Object Repository/Tester03_old/Draft Application Page/HomePage_count_Draft Application'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/Draft Application Page/DraftPage_text_DraftNumber',
	[('No') : '1']), 0)

DraftCount = Mobile.getText(findTestObject('Object Repository/Tester03_old/Draft Application Page/DraftPage_text_DraftNumber',
	[('No') : '1']), 0).substring(7).replaceAll('[)]', '')

Mobile.verifyEqual(DraftApplicationCount, DraftCount)

DraftListItemName = Mobile.getText(findTestObject('Object Repository/Tester03_old/Draft Application Page/DraftPage_text_DraftListItemName',
	[('No') : '1']), 0)

DraftListItemSTP = Mobile.getText(findTestObject('Object Repository/Tester03_old/Draft Application Page/DraftPage_text_DraftListItemSTP',
	[('No') : '1']), 0).substring(8)

Mobile.tap(findTestObject('Object Repository/Tester03_old/Draft Application Page/DraftPage_textbox_Search for applicant name or STP ID'),
0)

Mobile.setText(findTestObject('Object Repository/Tester03_old/Draft Application Page/DraftPage_textbox_Search for applicant name or STP ID'),
DraftListItemName, 0)

Mobile.setText(findTestObject('Object Repository/Tester03_old/Draft Application Page/DraftPage_textbox_Search for applicant name or STP ID'),
DraftListItemSTP, 0)

//TotalDraftApplicationsAvailable = Mobile.getText(findTestObject('Object Repository/Tester03_old/Draft Application Page/YourcasesPage_text_draft applications available'),
//	0).replaceAll(' draft applications available', '')
//	
//Mobile.verifyEqual(DraftCount, TotalDraftApplicationsAvailable)
//
//Mobile.tap(findTestObject('Object Repository/Tester03_old/Draft Application Page/YourcasesPage_text_draft applications available'), 0)
//
//Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/Draft Application Page/DraftPage_text_DraftNumber', 
//        [('No') : '1']), 0)

