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

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_Button_Edit'), 
    0)

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Name'), 
    0)

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_IDType'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Name'), 
    'Name')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_ID Type'), 
    'ID Type')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_ID Number'), 
    'ID Number')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Alternate ID Type'), 
    'Alternate ID Type')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Alternate ID Number'), 
    'Alternate ID Number')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Religion'), 
    'Religion')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Customer Group'), 
    'Customer Group')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Salutation'), 
    'Salutation')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Gender'), 
    'Gender')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Education'), 
    'Education')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Marital Status'), 
    'Marital Status')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Spouses Monthly Gross Income'), 
    'Spouse\'s Monthly Gross Income')

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_ID Number'), 
    0)

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Alternative ID Type'), 
    0)

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Alternate ID Number'), 
    0)

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Religion'), 
    0)

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Customer Group'), 
    0)

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Salutation'), 
    0)

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Gender'), 
    0)

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Education'), 
    0)

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Marital Status'), 
    0)

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Spouses Monthly Gross Income'), 
    0)

Mobile.swipe(300, 1000, 300, 300)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Phone Number'), 
    'Phone Number')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Resident Status'), 
    'Resident Status')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Employment Status'), 
    'Employment Status')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Business Type'), 
    'Business Type')

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Phone Number'), 
    0)

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Resident Status'), 
    0)

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Emplyment Status'), 
    0)

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Business Type'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Home and Mailing Address'), 
    'Home and Mailing Address')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Country'), 
    'Country')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Home Address'), 
    'Home Address')

Mobile.verifyElementVisible(findTestObject(''), 0)

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Country'), 
    0)

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Home Address'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_HomeAndMailingAddress_Button_Edit'), 
    0)

Mobile.swipe(300, 1000, 300, 300)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Mailing Address Country'), 
    'Mailing Address Country')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Mailing Address'), 
    'Mailing Address')

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Mailing Address Country'), 
    0)

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Mailing Address'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Employment Details'), 
    'Employment Details')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Occupation'), 
    'Occupation')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Occupation Sector'), 
    'Occupation Sector')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Name of Employer'), 
    'Name of Employer')

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_EmploymentDetails_Button_Edit'), 
    0)

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Occupation'), 
    0)

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Occupation Sector'), 
    0)

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Name Of Employer'), 
    0)

Mobile.swipe(300, 1000, 300, 300)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Duration of Service'), 
    'Duration of Service')

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Duration Of Service'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Office Country'), 
    'Country')

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Office Country'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Office Address'), 
    'Office Address')

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Office Address'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Office Contact Number'), 
    'Office Contact Number')

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Office Contact Number'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Income and Commitment Details'), 
    'Income and Commitment Details')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Source of Income'), 
    'Source of Income')

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Source of Income'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_IncomeAndCommitmentDetails_Button_Edit'), 
    0)

