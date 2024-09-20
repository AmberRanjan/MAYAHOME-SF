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

//validate financing plan details
Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage3/txt_FinancingDetails'), 'Financing Details')

// verify edit button is present
Mobile.verifyElementExist(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage2/txt_EditFinancingDetails'), 0)

// financing amount
Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage3/txt_FinancingAmount'), 'Financing Amount')

//Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage3/txt_FinancingAmountValue'), GlobalVariable.FinancingAmountValueValidation)

// financing period
Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage3/txt_FinancingPeriod'), 'Financing Period')

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage3/txt_FinancingPeriodValue'), GlobalVariable.FinancingPeriodYearsValidation)

