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

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)

//validate financing plan details
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/txt_FinancingDetails'), 'Financing Details', FailureHandling.CONTINUE_ON_FAILURE)

// financing amount
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/txt_FinancingAmount'), 'Financing Amount', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage2/txt_RM'), 'RM 0.00', FailureHandling.CONTINUE_ON_FAILURE)

String propertyPriceString = GlobalVariable.PropertPriceInputText

float propertyPrice = Float.parseFloat(propertyPriceString.replace(",", ""));
float propertyPriceminValue = propertyPrice*0.49;

String financingAmountMin = String.valueOf(propertyPriceminValue)
//validate the minimum financing amount shd be 50% 0f the loan amount
Mobile.setText(findTestObject('Tester01/PropertyDetailsPage2/input_FinancingAmountValue'), financingAmountMin, 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/btn_Next'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/PropertyDetailsPage2/txt_MinFinancingAmountValueErrorMessage'), 0, FailureHandling.CONTINUE_ON_FAILURE)

//validate the maximum amount shd not be graeter than loan amount
Mobile.clearText(findTestObject('Tester01/PropertyDetailsPage2/input_FinancingAmountValue'), 0, FailureHandling.CONTINUE_ON_FAILURE)
propertyPrice = Float.parseFloat(propertyPriceString.replace(",", ""));
float propertyPricemaxValue = propertyPrice+1000.00;

String financingAmountMax = String.valueOf(propertyPricemaxValue)
Mobile.setText(findTestObject('Tester01/PropertyDetailsPage2/input_FinancingAmountValue'), financingAmountMax, 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/btn_Next'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/PropertyDetailsPage2/txt_MaxFinancingAmountValueErrorMessage'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

//Actual Financing Amount Value
Mobile.setText(findTestObject('Tester01/PropertyDetailsPage2/input_FinancingAmountValue'), GlobalVariable.FinancingAmountValue, 0, FailureHandling.CONTINUE_ON_FAILURE)

// financing period
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/txt_FinancingPeriod'), 'Financing Period', FailureHandling.CONTINUE_ON_FAILURE)

// financing period years
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage2/txt_FinancingDetails'), 'Financing Details', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage2/txt_FinancingAmount'), 'Financing Amount', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/txt_FinancingPeriod'), 'Financing Period', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage2/txt_FinancingPeriodMinYear'), '5 Years', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage2/txt_FinancingPeriodMaxYear'), '35 Years', FailureHandling.CONTINUE_ON_FAILURE)

int financingPeriod = Integer.parseInt(GlobalVariable.FinancingPeriodYears)
CustomKeywords.'methods_Tester02.FinancingPeriod_ScrollBar.FinancingPeriod_ScrollBar_Years'(financingPeriod)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.delay(10)

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.30, 0.70)

Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/btn_Next'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/btn_Next'), 0, FailureHandling.OPTIONAL)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

