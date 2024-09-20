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

String noOfApplicants = GlobalVariable.Applicants_No
	
if (noOfApplicants.equalsIgnoreCase('1')) {
	
	Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_Step1of3'), 30, FailureHandling.CONTINUE_ON_FAILURE)
	Mobile.takeScreenshot(FailureHandling.OPTIONAL)
	Mobile.tap(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/btn_CalculateGrossIncome'), 0, FailureHandling.OPTIONAL)
	Mobile.tap(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/btn_CalculateGrossIncome'), 0, FailureHandling.OPTIONAL)
	Mobile.tap(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/btn_ConfirmNext'), 0, FailureHandling.CONTINUE_ON_FAILURE)
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep2/txt_Step2of3'), 'Step 2 of 3', FailureHandling.CONTINUE_ON_FAILURE)
	Mobile.takeScreenshot(FailureHandling.OPTIONAL)
	Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/btn_SaveAndNext'), 0, FailureHandling.CONTINUE_ON_FAILURE)
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep3/txt_Step3of3'), 'Step 3 of 3', FailureHandling.CONTINUE_ON_FAILURE)
	Mobile.takeScreenshot(FailureHandling.OPTIONAL)
	Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/btn_SaveAndNext'), 0, FailureHandling.CONTINUE_ON_FAILURE)
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/txt_Confirmation'), 'Confirmation', FailureHandling.CONTINUE_ON_FAILURE)
	Mobile.takeScreenshot(FailureHandling.OPTIONAL)
	Mobile.tap(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/btn_ConfirmAndContinue'), 0, FailureHandling.CONTINUE_ON_FAILURE)
	Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/txt_ConfirmDetails'), 0, FailureHandling.CONTINUE_ON_FAILURE)
	Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/txt_ConfirmDetailsText'), 0, FailureHandling.CONTINUE_ON_FAILURE)
	Mobile.takeScreenshot(FailureHandling.OPTIONAL)
	Mobile.tap(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/txt_Confirm'), 0, FailureHandling.OPTIONAL)
	Mobile.tap(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/txt_Confirm'), 0, FailureHandling.OPTIONAL)
	
	
} else if (noOfApplicants.equalsIgnoreCase('2')) {

	Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_Step1of6'), 30, FailureHandling.CONTINUE_ON_FAILURE)
	Mobile.takeScreenshot(FailureHandling.OPTIONAL)

	Mobile.tap(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/btn_CalculateGrossIncome'), 0, FailureHandling.OPTIONAL)
	Mobile.tap(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/btn_CalculateGrossIncome'), 0, FailureHandling.OPTIONAL)
	Mobile.tap(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/btn_ConfirmNext'), 0, FailureHandling.CONTINUE_ON_FAILURE)
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep2/txt_Step2of6'), 'Step 2 of 6', FailureHandling.CONTINUE_ON_FAILURE)
	Mobile.takeScreenshot(FailureHandling.OPTIONAL)
	Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/btn_SaveAndNext'), 0, FailureHandling.CONTINUE_ON_FAILURE)
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep3/txt_Step3of6'), 'Step 3 of 6', FailureHandling.CONTINUE_ON_FAILURE)
	Mobile.takeScreenshot(FailureHandling.OPTIONAL)
	Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/btn_SaveAndNext'), 0)
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_Step4of6'), 'Step 4 of 6', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.takeScreenshot(FailureHandling.OPTIONAL)
	
	Mobile.tap(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/btn_CalculateGrossIncome'), 0, FailureHandling.OPTIONAL)
	Mobile.tap(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/btn_CalculateGrossIncome'), 0, FailureHandling.OPTIONAL)
	Mobile.tap(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/btn_ConfirmNext'), 0, FailureHandling.CONTINUE_ON_FAILURE)
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_Step5of6'), 'Step 5 of 6', FailureHandling.CONTINUE_ON_FAILURE)
	Mobile.takeScreenshot(FailureHandling.OPTIONAL)
	
	Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/btn_SaveAndNext'), 0, FailureHandling.CONTINUE_ON_FAILURE)
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_Step6of6'), 'Step 6 of 6', FailureHandling.CONTINUE_ON_FAILURE)
	Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/btn_SaveAndNext'), 0, FailureHandling.CONTINUE_ON_FAILURE)
	Mobile.takeScreenshot(FailureHandling.OPTIONAL)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/txt_Confirmation'), 'Confirmation', FailureHandling.CONTINUE_ON_FAILURE)
	Mobile.tap(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/btn_ConfirmAndContinue'), 0, FailureHandling.CONTINUE_ON_FAILURE)
	Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/txt_ConfirmDetails'), 0, FailureHandling.CONTINUE_ON_FAILURE)
	Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/txt_ConfirmDetailsText'), 0, FailureHandling.CONTINUE_ON_FAILURE)
	Mobile.takeScreenshot(FailureHandling.OPTIONAL)
	
	Mobile.tap(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/txt_Confirm'), 0, FailureHandling.OPTIONAL)
	Mobile.tap(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/txt_Confirm'), 0, FailureHandling.OPTIONAL)
	
	
}