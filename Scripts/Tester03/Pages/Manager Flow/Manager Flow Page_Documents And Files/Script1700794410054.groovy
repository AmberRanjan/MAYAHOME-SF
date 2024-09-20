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

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/MAYA Page/MAYAPage_text_DocumentsFiles'), 0), 'Documents & Files')

Mobile.tap(findTestObject('Object Repository/Tester03/Manager Flow/MAYA Page/MAYAPage_text_DocumentsFiles'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03/Manager Flow/Documents And Files Page/DocumentsPage_TitleText_Documents'), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/Documents And Files Page/DocumentsPage_TitleText_Documents'), 0), 'Documents & KYC')

Mobile.delay(10)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/Documents And Files Page/DocumentsPage_text_Letter of Offer'), 0), 'Letter of Offer')

Mobile.tap(findTestObject('Object Repository/Tester03/Manager Flow/Documents And Files Page/DocumentsPage_LetterOfOffer_button_RightArrow'), 0)

Mobile.delay(10)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Tester03/Manager Flow/Documents And Files Page/DocumentsPage_button_Back'), 0)

Mobile.delay(10)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03/Manager Flow/Documents And Files Page/DocumentsPage_TitleText_Documents'), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/Documents And Files Page/DocumentsPage_text_Application Form'), 0), 'Application Form')

Mobile.tap(findTestObject('Object Repository/Tester03/Manager Flow/Documents And Files Page/DocumentsPage_ApplicationForm_button_RightArrow'), 0)

Mobile.delay(10)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Tester03/Manager Flow/Documents And Files Page/DocumentsPage_button_Back'), 0)

Mobile.delay(10)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03/Manager Flow/Documents And Files Page/DocumentsPage_TitleText_Documents'), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/Documents And Files Page/DocumentsPage_text_Sales llustration'), 0), 'Sales llustration')

Mobile.tap(findTestObject('Object Repository/Tester03/Manager Flow/Documents And Files Page/DocumentsPage_SalesIllustration_button_RightArrow'), 0)

Mobile.delay(10)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Tester03/Manager Flow/Documents And Files Page/DocumentsPage_button_Back'), 0)

Mobile.delay(10)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03/Manager Flow/Documents And Files Page/DocumentsPage_TitleText_Documents'), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/Documents And Files Page/DocumentsPage_text_ProposalFormHealthDeclaration'), 0), 'Proposal Form & Health Declaration')

Mobile.tap(findTestObject('Object Repository/Tester03/Manager Flow/Documents And Files Page/DocumentsPage_ProposalFormHealthDeclaration_button_RightArrow'), 0)

Mobile.delay(10)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Tester03/Manager Flow/Documents And Files Page/DocumentsPage_button_Back'), 0)

Mobile.delay(10)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03/Manager Flow/Documents And Files Page/DocumentsPage_TitleText_Documents'), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/Documents And Files Page/DocumentsPage_text_Product Disclosure Sheet'), 0), 'Product Disclosure Sheet')

Mobile.tap(findTestObject('Object Repository/Tester03/Manager Flow/Documents And Files Page/DocumentsPage_ProductDisclosureSheet_button_RightArrow'), 0)

Mobile.delay(10)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Tester03/Manager Flow/Documents And Files Page/DocumentsPage_button_Back'), 0)

Mobile.delay(10)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03/Manager Flow/Documents And Files Page/DocumentsPage_TitleText_Documents'), 0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/Documents And Files Page/DocumentsPage_text_Chat Media'), 0), 'Chat Media')

Mobile.tap(findTestObject('Object Repository/Tester03/Manager Flow/Documents And Files Page/DocumentsPage_ChatMedia_button_RightArrow'), 0)

Mobile.delay(10)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Tester03/Manager Flow/Documents And Files Page/DocumentsPage_button_Back'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03/Manager Flow/Documents And Files Page/DocumentsPage_TitleText_Documents'), 0)

Mobile.tap(findTestObject('Object Repository/Tester03/Manager Flow/Documents And Files Page/DocumentsMainPage_button_Back'), 0)