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

String testFlow = GlobalVariable.testFlow

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryCompletedPage/DataEntryCompletedPage_Header_Data Entry Completed'), 30)


Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryCompletedPage/DataEntryCompletedPage_text_You can now proceed to generate the Letter of Offer'),
		'You can now proceed to generate the Letter of Offer.', FailureHandling.OPTIONAL)

if (testFlow.equalsIgnoreCase('StpPass') || testFlow.equalsIgnoreCase('StpSoftfail')) {

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryCompletedPage/DataEntryCompletedPage_button_SelectLOTermsConditions'),
		0, FailureHandling.OPTIONAL)

}else if (testFlow.equalsIgnoreCase('BauPass') || testFlow.equalsIgnoreCase('BauSoftfail')) {

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryCompletedPage/DataEntryCompletedPage_button_SelectPropertyInsurance'),	0, FailureHandling.OPTIONAL)
}

