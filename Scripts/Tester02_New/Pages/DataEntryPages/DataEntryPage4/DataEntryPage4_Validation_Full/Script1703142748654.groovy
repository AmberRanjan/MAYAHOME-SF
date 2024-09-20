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

Mobile.swipe(300,300,300,900)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_text_Step 4 of 6'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_text_Loan Amount Details'), 
    'Loan Amount Details')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_text_Property Price'), 
    'Property Price')

String propertyPrice = 'RM  ' + GlobalVariable.PropertPriceInputText + ' '
Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_text_Property Price_Result'), propertyPrice, FailureHandling.OPTIONAL)


Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_text_Total Approved Amount'), 
    'Total Approved Amount')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_text_Other Related Expenses'), 
    'Other Related Expenses')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_text_Property Loan'), 
    'Property Loan')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_text_Total Approved Amount_Result'), propertyPrice, FailureHandling.OPTIONAL)

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_text_Other Related Expenses_Result'), 
    0)

String loanAmount = Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_text_Property Loan_Result'), 
    0)
loanAmount = loanAmount.substring(4)
Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_text_Property Loan_Max'), 
    'Property Loan')

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_text_Property Loan_Max_Result'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_text_Property Loan_Input'), 
    'Property Loan')

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_textBox_Property Loan_Input'), 
    0)

Mobile.clearText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_textBox_Property Loan_Input'), 0)

Mobile.setText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_textBox_Property Loan_Input'), 
    '0', 0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_text_Other Related Expenses_Max'), 
    'Other Related Expenses')

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_text_Other Related Expenses_Max_Result'), 
    0)

Mobile.swipe(300, 900, 300, 300)

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_button_SaveAndNext'),
	0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_text_Legal Fees'), 
    'Legal Fees')

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_textBox_Legal Fees'), 
    0)

Mobile.setText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_textBox_Legal Fees'), 
    GlobalVariable.DE3_LegalFee_Input, 0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_text_Note'), 
    'Note: We will calculate the life insurance premium as part of the other related expenses in the next step')

/*
Mobile.setText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_textBox_Property Loan_Input'), 
    '0', 0)
    */

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_button_SaveAndNext'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_text_Property loan must be at least 50 of the property price'), 
    0, FailureHandling.OPTIONAL)

Mobile.clearText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_textBox_Property Loan_Input'), 0)

Mobile.setText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_textBox_Property Loan_Input'), 
    '90000000000', 0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_button_SaveAndNext'),
	0)


Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_text_Value cannot exceed the limit'), 
    0, FailureHandling.OPTIONAL)

Mobile.clearText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_textBox_Property Loan_Input'), 0)

Mobile.setText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_textBox_Property Loan_Input'), 
    loanAmount, 0)

Mobile.clearText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_textBox_Legal Fees'), 0)

Mobile.setText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_textBox_Legal Fees'), 
    '10000', 0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_button_SaveAndNext'),
	0)


Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_text_Value cannot exceed the limit'), 
    'Value cannot exceed the limit')

Mobile.clearText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_textBox_Legal Fees'), 0)

Mobile.setText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_textBox_Legal Fees'), GlobalVariable.DE3_LegalFee_Input, 0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_button_SaveAndNext'), 
    0)



