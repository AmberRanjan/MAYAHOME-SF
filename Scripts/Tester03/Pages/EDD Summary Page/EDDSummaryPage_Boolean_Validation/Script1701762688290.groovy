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

Mobile.callTestCase(findTestCase('Test Cases/Tester03/Pages/EDD Summary Page/Eligibility of Borrower/EDDSummaryPage_1_EligibilityofBorrower_Validation'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.callTestCase(findTestCase('Tester03/Pages/EDD Summary Page/Credit Check/EDDSummaryPage_1_CreditCheck_Validation'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.callTestCase(findTestCase('Tester03/Pages/EDD Summary Page/MOR DSR/EDDSummaryPage_1_MORDSRValidation'), [:], FailureHandling.CONTINUE_ON_FAILURE)


Mobile.callTestCase(findTestCase('Tester03/Pages/EDD Summary Page/Collateral/EDDSummaryPage_1_Collateral_Validation'), [:], 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.callTestCase(findTestCase('Tester03/Pages/EDD Summary Page/Product Features/EDDSummaryPage_1_ProductFeatures_Validation'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.callTestCase(findTestCase('Tester03/Pages/EDD Summary Page/Credit Policies/EDDSummaryPage_1_CreditPolicies_Validation'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_Dynamicbutton_Edit Mitigation',
	[('Verify') : 'Credit Policies']), 0)

Mobile.callTestCase(findTestCase('Tester03/Pages/EDD Summary Page/Review Matigation Page'), [:], FailureHandling.CONTINUE_ON_FAILURE)

