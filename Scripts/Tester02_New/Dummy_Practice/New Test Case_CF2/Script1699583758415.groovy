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

Mobile.verifyElementText(findTestObject(''), 'Is this your applicant\'s first time purchasing or owning a home?')

Mobile.getText(findTestObject(''), 0)

Mobile.swipe(300, 1000, 300, 300)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Non-bank Commitments'), 
    'Non-bank Commitments')

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Non-bank Commitments'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Additional Information'), 
    'Additional Information')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Primary Income'), 
    'Primary Income')

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Primary Income'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Primary Source of Wealth'), 
    'Primary Source of Wealth')

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Primary Source of Wealth'), 
    0)

Mobile.verifyElementText(findTestObject(''), 'Is the applicant purchasing more than one property at this moment?')

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_Additional Information_button_Edit'), 
    0)

Mobile.swipe(300, 1000, 300, 300)

Mobile.getText(findTestObject(''), 0)

Mobile.verifyElementText(findTestObject(''), 'Does the applicant have any other pending applications for this property with other banks?')

Mobile.getText(findTestObject(''), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Who will be the owner(s) of the property'), 
    'Who will be the owner(s) of the property?')

Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Who will be the owner(s) of the property'), 
    0)

Mobile.closeApplication()

