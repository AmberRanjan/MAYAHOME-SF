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

/**Author:: Vasudha
 */



Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/HomePage/HomePage_text_You currently have'), 'You currently have ', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/HomePage/HomePage_text_awaiting your action'), 'awaiting your action.', FailureHandling.CONTINUE_ON_FAILURE)

def TotalCasesCount_Actual = Mobile.getText(findTestObject('Object Repository/Tester02_New/HomePage/HomePage_text_TotalCasesCount'), 10, FailureHandling.CONTINUE_ON_FAILURE).replaceAll("[^-?0-9]+", " ");

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/HomePage/HomePage_text_Pending signing of Letter of Offer'),
		'Pending signing of Letter of Offer', FailureHandling.CONTINUE_ON_FAILURE)

def PendingSigningOfLetterOfOffer_Count = Mobile.getText(findTestObject('Object Repository/Tester02_New/HomePage/HomePage_text_Pending signing of Letter of Offer_Count'),
		10, FailureHandling.CONTINUE_ON_FAILURE).replaceAll("[^-?0-9]+", " ");

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/HomePage/HomePage_text_Pending data entry  LO generation'),
		'Pending data entry / LO generation', FailureHandling.CONTINUE_ON_FAILURE)

def PendingDataEntryLOGeneration_Count = Mobile.getText(findTestObject('Object Repository/Tester02_New/HomePage/HomePage_text_Pending data entry  LO generation_Count'),
		10, FailureHandling.CONTINUE_ON_FAILURE).replaceAll("[^-?0-9]+", " ");

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/HomePage/HomePage_text_Pending assistance'), 'Pending assistance', FailureHandling.CONTINUE_ON_FAILURE)

def PendingAssistance_Count = Mobile.getText(findTestObject('Object Repository/Tester02_New/HomePage/HomePage_text_Pending assistance_Count'), 10, FailureHandling.CONTINUE_ON_FAILURE).replaceAll("[^-?0-9]+", " ");

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/HomePage/HomePage_text_Pending KYC'), 'Pending KYC', FailureHandling.CONTINUE_ON_FAILURE)

def PendingKYC_Count = Mobile.getText(findTestObject('Object Repository/Tester02_New/HomePage/HomePage_text_Pending KYC_Count'), 10, FailureHandling.CONTINUE_ON_FAILURE).replaceAll("[^-?0-9]+", " ");

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/HomePage/HomePage_text_Other action required'), 'Other action required', FailureHandling.CONTINUE_ON_FAILURE)

def OtherActionRequired_Count = Mobile.getText(findTestObject('Object Repository/Tester02_New/HomePage/HomePage_text_Other action required_Count'), 10, FailureHandling.CONTINUE_ON_FAILURE).replaceAll("[^-?0-9]+", " ");

Mobile.getText(findTestObject('Object Repository/Tester02_New/HomePage/HomePage_text_Draft Application'), 10, FailureHandling.CONTINUE_ON_FAILURE)

def DraftApplication_Count = Mobile.getText(findTestObject('Object Repository/Tester02_New/HomePage/HomePage_text_Draft Application_Count'), 10, FailureHandling.CONTINUE_ON_FAILURE).replaceAll("[^-?0-9]+", " ");

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/HomePage/HomePage_text_New leads available'), 'New leads available', FailureHandling.CONTINUE_ON_FAILURE)

def NewLeadsAvailable_Count = Mobile.getText(findTestObject('Object Repository/Tester02_New/HomePage/HomePage_text_New leads available_Count'), 10, FailureHandling.CONTINUE_ON_FAILURE).replaceAll("[^-?0-9]+", " ");

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/HomePage/HomePAge_text_Quick Actions'), 'Quick Actions', FailureHandling.CONTINUE_ON_FAILURE)

def TotalCasesCount_Expected = PendingSigningOfLetterOfOffer_Count + PendingDataEntryLOGeneration_Count + PendingAssistance_Count + PendingKYC_Count + OtherActionRequired_Count + DraftApplication_Count

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

//Mobile.verifyMatch(TotalCasesCount_Actual, TotalCasesCount_Expected , true)






