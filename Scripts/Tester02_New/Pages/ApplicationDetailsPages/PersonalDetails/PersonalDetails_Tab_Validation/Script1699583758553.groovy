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

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/ApplicationDetailsPages/PersonalDetails/ApplicationDetailsPage_PersonalDetails_text_Name'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/ApplicationDetailsPages/PersonalDetails/ApplicationDetailsPage_PersonalDetails_text_Name'), 
    'Name')

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/ApplicationDetailsPages/PersonalDetails/TextVisibilityValidation',[('Variable') : GlobalVariable.CustomerName_MainApplicant]), 
    0,FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/ApplicationDetailsPages/PersonalDetails/ApplicationDetailsPage_PersonalDetails_text_ID Type'), 
    'ID Type')

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/ApplicationDetailsPages/PersonalDetails/TextVisibilityValidation',[('Variable') : GlobalVariable.ID_Type]),
	0,FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/ApplicationDetailsPages/PersonalDetails/ApplicationDetailsPage_PersonalDetails_text_ID Number'), 
    'ID Number')

Expected_IDNumber = GlobalVariable.ID_Number_MainApplicant

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/ApplicationDetailsPages/PersonalDetails/TextVisibilityValidation',[('Variable') : Expected_IDNumber ]),
	0,FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/ApplicationDetailsPages/PersonalDetails/ApplicationDetailsPage_PersonalDetails_text_Alternate ID Type'), 
    'Alternate ID Type')

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/ApplicationDetailsPages/PersonalDetails/TextVisibilityValidation',[('Variable') : GlobalVariable.Alternative_IDType]),
	0,FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/ApplicationDetailsPages/PersonalDetails/ApplicationDetailsPage_PersonalDetails_text_Alternate ID Number'), 
    'Alternate ID Number')

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/ApplicationDetailsPages/PersonalDetails/TextVisibilityValidation',[('Variable') : GlobalVariable.Alternative_IDNumber]),
	0,FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/ApplicationDetailsPages/PersonalDetails/ApplicationDetailsPage_PersonalDetails_text_Religion'), 
    'Religion')

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/ApplicationDetailsPages/PersonalDetails/TextVisibilityValidation',[('Variable') : GlobalVariable.Religion]),
	0,FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/ApplicationDetailsPages/PersonalDetails/ApplicationDetailsPage_PersonalDetails_text_Customer Group'), 
    'Customer Group')

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/ApplicationDetailsPages/PersonalDetails/TextVisibilityValidation',[('Variable') : GlobalVariable.CustomerGroup]),
	0,FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/ApplicationDetailsPages/PersonalDetails/ApplicationDetailsPage_PersonalDetails_text_Salutation'), 
    'Salutation')

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/ApplicationDetailsPages/PersonalDetails/TextVisibilityValidation',[('Variable') : GlobalVariable.Salutation]),
	0,FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/ApplicationDetailsPages/PersonalDetails/ApplicationDetailsPage_PersonalDetails_text_Gender'), 
    'Gender')

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/ApplicationDetailsPages/PersonalDetails/TextVisibilityValidation',[('Variable') : GlobalVariable.Gender]),
	0,FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/ApplicationDetailsPages/PersonalDetails/ApplicationDetailsPage_PersonalDetails_text_Employment Status'), 
    'Employment Status')

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/ApplicationDetailsPages/PersonalDetails/TextVisibilityValidation',[('Variable') : GlobalVariable.Employment_Status]),
	0,FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/ApplicationDetailsPages/PersonalDetails/ApplicationDetailsPage_PersonalDetails_text_Business Type'), 
    'Business Type')

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/ApplicationDetailsPages/PersonalDetails/TextVisibilityValidation',[('Variable') : GlobalVariable.Business_Type]),
	0,FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/ApplicationDetailsPages/PersonalDetails/ApplicationDetailsPage_PersonalDetails_text_Education'), 
    'Education')

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/ApplicationDetailsPages/PersonalDetails/TextVisibilityValidation',[('Variable') : GlobalVariable.Education]),
	0,FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/ApplicationDetailsPages/PersonalDetails/ApplicationDetailsPage_PersonalDetails_text_Marital Status'), 
    'Marital Status')

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/ApplicationDetailsPages/PersonalDetails/TextVisibilityValidation',[('Variable') : GlobalVariable.MaritalStatus]),
	0,FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/ApplicationDetailsPages/PersonalDetails/ApplicationDetailsPage_PersonalDetails_text_Spouses Monthly Gross Income'), 
    'Spouse\'s Monthly Gross Income')



Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/ApplicationDetailsPages/PersonalDetails/TextVisibilityValidation',[('Variable') : GlobalVariable.SpouseMonthlyIncome]),
	0,FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/ApplicationDetailsPages/PersonalDetails/ApplicationDetailsPage_PersonalDetails_text_Phone Number'), 
    'Phone Number')

ExpectedMobileNumber = '+60 0' + GlobalVariable.PhoneNumber

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/ApplicationDetailsPages/PersonalDetails/TextVisibilityValidation',[('Variable') : ExpectedMobileNumber]),
	0,FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/ApplicationDetailsPages/PersonalDetails/ApplicationDetailsPage_PersonalDetails_text_Email Address'), 
    'Email Address')

Mobile.swipe(300, 400, 300, 300)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/ApplicationDetailsPages/PersonalDetails/TextVisibilityValidation',[('Variable') : GlobalVariable.EmailAddress_MainApplicant]),
	0,FailureHandling.OPTIONAL)


