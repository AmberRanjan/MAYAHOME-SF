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

/*Author: Vasudha
 * Data From Excel: Home2u_TestData
 * Sheet: SF_Scenarios_Data
 */
int Row_Number = 1

def sheet = 'SF_Scenarios_Data'

'DataFile'
def Applicants_No = findTestData(sheet).getValue('Applicants_No', Row_Number)

def ID_Type = findTestData(sheet).getValue('ID_Type', Row_Number)

def NTB_ID_Number = '800909091222'

def ID_Number_MainApplicant = findTestData(sheet).getValue('ID_Number_MainApplicant', Row_Number)

def ID_Number_JointApplicant = findTestData(sheet).getValue('ID_Number_JointApplicant', Row_Number)

def FATCA_MainApplicant = findTestData(sheet).getValue('FATCA_MainApplicant', Row_Number)

def CRS_MainApplicant = findTestData(sheet).getValue('CRS_MainApplicant', Row_Number)

def FATCA_JointApplicant = findTestData(sheet).getValue('FATCA_JointApplicant', Row_Number)

def CRS_JointApplicant = findTestData(sheet).getValue('CRS_JointApplicant', Row_Number)

def JointApplicant_Relationship = findTestData(sheet).getValue('JointApplicant_Relationship', Row_Number)

//
//Mobile.startExistingApplication('com.maybank2u.salesforce.uatent')
//Mobile.callTestCase(findTestCase('Tester02_New/Pages/HomePage/HomePage_StartNewApplication'), [:], FailureHandling.STOP_ON_FAILURE)
Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/StartNewApplication/StartNewApplicationPage_text_To start a new application, please fill up the'),
		10)

Mobile.tap(findTestObject('Object Repository/Tester02_New/StartNewApplication/StartNewApplicationPage_button_Back'), 0)

Mobile.callTestCase(findTestCase('Tester02_New/Pages/HomePage/HomePage_StartNewApplication'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/StartNewApplication/StartNewApplicationPage_text_To start a new application, please fill up the'),
		10)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/StartNewApplication/StartNewApplicationPage_text_To start a new application, please fill up the'),
		'To start a new application, please fill up the')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/StartNewApplication/StartNewApplicationPage_text_details below'),
		'details below')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/StartNewApplication/StartNewApplicationPage_text_Number of Applicant'),
		'Number of Applicant')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/StartNewApplication/StartNewApplicationPage_text_How many applicants are there in total'),
		'How many applicants are there in total?')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/StartNewApplication/StartNewApplicationPage_text_1 Applicant'),
		'1 Applicant')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/StartNewApplication/StartNewApplicationPage_text_2 Applicants'),
		'2 Applicants')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/StartNewApplication/StartNewApplicationPage_buttonText_Next'),
		'Next')

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Tester02_New/StartNewApplication/StartNewApplicationPage_button_Next'), 0)

if (Applicants_No == '1') {
	Mobile.tap(findTestObject('Object Repository/Tester02_New/StartNewApplication/StartNewApplicationPage_radioButton_1Applicant'),
			0)

	Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/StartNewApplication/StartNewApplicationPage_text_Main Applicant'),
			0)

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/StartNewApplication/StartNewApplicationPage_text_ID Type'),
			'ID Type')

	Mobile.tap(findTestObject('Object Repository/Tester02_New/StartNewApplication/StartNewApplicationPage_IDType_dorpDown_arrow'),
			0)

	Mobile.setText(findTestObject('Object Repository/Tester02_New/StartNewApplication/StartNewApplicationPage_IDType_dorpDown_Search'),
			'NRIC', 0)

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/StartNewApplication/StartNewApplicationPage_IDType_dorpDown_No results found'),
			'No results found')

	Mobile.tap(findTestObject('Object Repository/Tester02_New/StartNewApplication/StartNewApplicationPage_IDType_dorpDown_Search_Close'),
			0)

	Mobile.tap(findTestObject('Object Repository/Tester02_New/StartNewApplication/StartNewApplicationPage_IDType_dorpDown_New IC',
			[('Variable') : ID_Type]), 0)

	Mobile.scrollToText('ID Number')

	Mobile.setText(findTestObject('Object Repository/Tester02_New/StartNewApplication/StartNewApplicationPage_textBox_IDNumber'),
			NTB_ID_Number, 0)

	Mobile.tap(findTestObject('Object Repository/Tester02_New/StartNewApplication/StartNewApplicationPage_text_ID Type'), 0)

	CustomKeywords.'scrollActions_Tester02.Scroll_action.scroll_action'('up')

	Mobile.scrollToText('FATCA (Foreign Account Tax Compliance)', FailureHandling.OPTIONAL)
	
	Mobile.takeScreenshot(FailureHandling.OPTIONAL)

	Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/StartNewApplication/StartNewApplicationPage_text_FATCA (Foreign Account Tax Compliance)'),
			10)

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/StartNewApplication/StartNewApplicationPage_text_FATCA (Foreign Account Tax Compliance)'),
			'FATCA (Foreign Account Tax Compliance)')

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/StartNewApplication/StartNewApplicationPage_text_Is the applicant a United States of America (US) person'),
			'Is the applicant a United States of America (US) person?')

	Mobile.tap(findTestObject('Object Repository/Tester02_New/StartNewApplication/StartNewApplicationPage_button_Next'), 0)

	Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/StartNewApplication/StartNewApplicationPage_text_CRS (Common Reporting Standard)'),
			0)

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/StartNewApplication/StartNewApplicationPage_text_Does the applicant pay taxes in countries other than Malaysia'),
			'Does the applicant pay taxes in countries other than Malaysia?')

	if ((FATCA_MainApplicant == 'Yes') && (CRS_MainApplicant == 'Yes')) {
		Mobile.tap(findTestObject('Object Repository/Tester02_New/StartNewApplication/StartNewApplication_MainApplicant_FATCA_radioButton_Yes'),
				0)

		Mobile.tap(findTestObject('Object Repository/Tester02_New/StartNewApplication/StartNewApplication_MainApplicant_CRS_radioButton_Yes'),
				0)

		Mobile.tap(findTestObject('Object Repository/Tester02_New/StartNewApplication/StartNewApplicationPage_button_Next'),
				0)

		Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/StartNewApplication/StartNewApplicationPage_textWere unable to process FATCA customers currently. Kindly create a new application in WoLOC'),
				'We\'re unable to process FATCA customers currently. Kindly create a new application in WoLOC.')
	}

	if ((FATCA_MainApplicant == 'No') && (CRS_MainApplicant == 'No')) {
		Mobile.tap(findTestObject('Object Repository/Tester02_New/StartNewApplication/StartNewApplication_MainApplicant_FATCA_radioButton_No'),
				0)

		Mobile.tap(findTestObject('Object Repository/Tester02_New/StartNewApplication/StartNewApplicationPage_MainApplicant_CRS_radioButton_No'),
				0)

		Mobile.tap(findTestObject('Object Repository/Tester02_New/StartNewApplication/StartNewApplicationPage_button_Next'),
				0)

		Mobile.verifyElementText(findTestObject('Tester02_New/StartNewApplication/StartNewApplicationPage_text_Were unable to process NTB customers currently. Kindly create a new application in WoLOC'),
				'We\'re unable to process NTB customers currently. Kindly create a new application in WoLOC.')

		Mobile.clearText(findTestObject('Object Repository/Tester02_New/StartNewApplication/StartNewApplicationPage_textBox_IDNumber'),
				0)

		Mobile.setText(findTestObject('Object Repository/Tester02_New/StartNewApplication/StartNewApplicationPage_textBox_IDNumber'),
				ID_Number_MainApplicant, 0)

		Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/ExistingCustomerDetectedPage/ExistingCustomerDetectedPage_Header'),
				'Existing Customer Detected')

		//Mobile.verifyElementText(findTestObject(''), 'The applicant is an existing Maybank customer. Their information will be pre-filled to help you speed up the application process.')
		Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/ExistingCustomerDetectedPage/ExistingCustomerDetectedPage_buttonText_Create Application'),
				'Create Application')
		
		Mobile.takeScreenshot(FailureHandling.OPTIONAL)

		Mobile.tap(findTestObject('Object Repository/Tester02_New/ExistingCustomerDetectedPage/ExistingCustomerDetectedPage_button_CreateApplication'),
				0)
	}

}
