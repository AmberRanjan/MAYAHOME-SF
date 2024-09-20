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

Mobile.swipe(300, 300, 300, 900)

Mobile.swipe(300, 300, 300, 900)


Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5_Confirmation/DataEntryPage5_Confirmation_text_Final Loan Breakdown'), 
    30)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5_Confirmation/DataEntryPage5_Confirmation_text_Step 6 of 6'), 
    'Step 6 of 6')

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5_Confirmation/DataEntryPage5_Confirmation_linkText_Recompute'), 
    0)

Mobile.swipe(300, 300, 300, 900)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5_Confirmation/DataEntryPage5_Confirmation_text_Property Price'), 
    'Property Price')

Mobile.swipe(300, 900, 300, 300)

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_button_Compute'), 0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_button_Compute'), 0,FailureHandling.OPTIONAL)


Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5_Confirmation/DataEntryPage5_Confirmation_text_Propertry Price_Result'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5_Confirmation/DataEntryPage5_Confirmation_text_Final Loan Amount'), 
    'Final Loan Amount', FailureHandling.OPTIONAL)

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5_Confirmation/DataEntryPage5_Confirmation_text_Final Loan Amount_Result'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5_Confirmation/DataEntryPage5_Confirmation_text_Other Related Expenses'), 
    'Other Related Expenses')

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5_Confirmation/DataEntryPage5_Confirmation_text_Other Related Expenses_Result'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5_Confirmation/DataEntryPage5_Confirmation_text_Property Loan'), 
    'Property Loan')

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5_Confirmation/DataEntryPage5_Confirmation_text_Property Loan_Result'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5_Confirmation/DataEntryPage5_Confirmation_text_Property Loan_Max'), 
    'Property Loan')

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5_Confirmation/DataEntryPage5_Confirmation_text_Property Loan_Max_Result'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5_Confirmation/DataEntryPage5_Confirmation_text_Property Loan_Max_1'), 
    'Property Loan')

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5_Confirmation/DataEntryPage5_Confirmation_text_Property Loan_Max_1_Result'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5_Confirmation/DataEntryPage5_Confirmation_text_Other Related Expenses_Max'), 
    'Other Related Expenses')

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5_Confirmation/DataEntryPage5_Confirmation_text_Other Related Expenses_Max_Result'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5_Confirmation/DataEntryPage5_Confirmation_text_Legal Fees'), 
    'Legal Fees')

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5_Confirmation/DataEntryPage5_Confirmation_text_Legal Fees_Result'), 
    0)

Mobile.swipe(300, 900, 300, 300)

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5_Confirmation/DataEntryPage5_Confirmation_text_Life Insurance Premium'), 
    0)

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5_Confirmation/DataEntryPage5_Confirmation_text_Life Insurance Premium_Result'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5_Confirmation/DataEntryPage5_Confirmation_text_Capitalized'), 
    'Capitalized')

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5_Confirmation/DataEntryPage5_Confirmation_text_Capitalized_Result'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5_Confirmation/DataEntryPage5_Confirmation_text_Cash'), 
    'Cash')

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5_Confirmation/DataEntryPage5_Confirmation_text_Cash_Result'), 
    0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5_Confirmation/DataEntryPage5_Confirmation_button_Confirm  Next'), 
    0)


