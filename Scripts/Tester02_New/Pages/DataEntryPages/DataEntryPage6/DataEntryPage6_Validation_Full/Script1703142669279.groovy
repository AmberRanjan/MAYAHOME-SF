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

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_text_Step 6 of 6'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_text_Loan Amount Details'), 
    'Loan Amount Details')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_text_Property Price'), 
    'Property Price')

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_text_Property Price_Result'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_text_Total Approved Amount'), 
    'Total Approved Amount')

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_text_Total Approved Amount_Result'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_text_Other Related Expenses'), 
    'Other Related Expenses')

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_text_Other Related Expenses_Result'), 0)


Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_text_Property Loan'), 
    'Property Loan')

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_text_Property Loan_Result'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_text_Property Loan_Max'), 
    'Property Loan')

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_text_Property Loan_Max_Result'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_text_Property Loan_Amount'), 
    'Property Loan')

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_text_Property Loan_Amount_Result'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_text_Other Related Expenses_Max'), 
    'Other Related Expenses')

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_text_Other Related Expenses_Max_Result'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_text_Legal Fees'), 
    'Legal Fees')

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_text_Legal Fees_Result'), 
    0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_PropertyLoan_linkText_Edit'), 
    0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage3_text_Step 4 of 6'), 
    0)

Mobile.delay(3)

Mobile.swipe(300, 900, 300, 300)

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage3_button_Save  Next'), 
    0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage4_text_Step 5 of 6'), 
    0)

Mobile.delay(3)

Mobile.swipe(300, 900, 300, 300)
Mobile.swipe(300, 900, 300, 300)


Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage4_button_Generate Result'), 
    0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage4_Confirmation_text_Quick Quotation Results'), 
    0)

Mobile.delay(3)

Mobile.swipe(300, 900, 300, 300)

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage4_Confirmation_button_Confirm  Next'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_OtherRelatedExpenses_linkText_Edit'), 
    0)

Mobile.delay(3)

Mobile.swipe(300, 900, 300, 300)

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_text_Life Insurance Premium'), 
    0)

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_text_Life Insurance Premium_Result'), 
    0)

Mobile.swipe(300, 900, 300, 300)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_text_Capitalized'), 
    'Capitalized')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_text_Cash'), 
    'Cash')

def capitalized = Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_textBox_Capitalized'), 0)

def cash = Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_textBox_Cash'), 0)


//Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_button_Compute'), 0)


if(GlobalVariable.DE4_PaymentMethod == 'Capitalized') {
	
	Mobile.clearText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_textBox_Capitalized'), 0)
	
	Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_button_Compute'), 0)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_text_Invalid Amount'),
		'Invalid Amount')
	
	Mobile.setText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_textBox_Capitalized'),'0', 0)
	
	Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_button_Compute'), 0)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_text_Capitalised value should be greater than or equal to 1'),
		'Capitalised value should be greater than or equal to 1')
	
	Mobile.clearText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_textBox_Capitalized'), 0)
	
	Mobile.setText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_textBox_Capitalized'),'1', 0)
	
	Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_button_Compute'), 0)
	
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_text_Sum of capitalized amount  cash amount must be equal to life insurance premium amount'),
		'Sum of capitalized amount + cash amount must be equal to life insurance premium amount')
	
	Mobile.clearText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_textBox_Capitalized'), 0)
	
	Mobile.setText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_textBox_Capitalized'),'1000000', 0)
	
	Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_button_Compute'), 0)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_text_Value cannot exceed the limit'),
		'Value cannot exceed the limit')
	
	Mobile.clearText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_textBox_Capitalized'), 0)
	
	Mobile.setText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_textBox_Capitalized'),capitalized, 0)
	
	
}

if(GlobalVariable.DE4_PaymentMethod == 'Cash') {
	
	Mobile.clearText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_textBox_Cash'), 0)
	
	Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_button_Compute'), 0)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_text_Sum of capitalized amount  cash amount must be equal to life insurance premium amount'),
		'Sum of capitalized amount + cash amount must be equal to life insurance premium amount',FailureHandling.OPTIONAL)
	
	Mobile.setText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_textBox_Cash'),'0', 0)
	
	Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_button_Compute'), 0)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_text_Sum of capitalized amount  cash amount must be equal to life insurance premium amount'),
		'Sum of capitalized amount + cash amount must be equal to life insurance premium amount',FailureHandling.OPTIONAL)
	
	Mobile.clearText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_textBox_Cash'), 0)
	
	Mobile.setText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_textBox_Cash'),'100000000000', 0)
	
	Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_button_Compute'), 0)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_text_Value cannot exceed the limit'),
		'Value cannot exceed the limit',FailureHandling.OPTIONAL)
	
	Mobile.clearText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_textBox_Cash'), 0)
	
	Mobile.setText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_textBox_Cash'),cash, 0)

}

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage5/DataEntryPage5_button_Compute'), 0)
