import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import javax.xml.bind.annotation.XmlElementDecl.GLOBAL as GLOBAL
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

/*
Mobile.callTestCase(findTestCase('Tester02_New/Pages/Login/ReusableMethods_Login/Method_Login'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(30)
*/

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnboardingPage_Confirmation_Header'),
		10)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.delay(3)

Mobile.swipe(300, 300, 300, 1700)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnboardingPage_Confirmation_button_Back'),
		0)

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

Mobile.swipe(300, 300, 300, 1700)

Boolean UserIsOnCofirmationPage = Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_5/CustomerOnboardingPage5_text_Step 5 of 5'),
		0)

if (UserIsOnCofirmationPage == true) {
	Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_5/CustomerOnboardingPage5_button_SaveAndNext'),
			0)
}

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnboardingPage_Confirmation_Header'),
		10)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_Button_Edit'),
		0)

String CustomerName_MainApplicant_Actual = Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Name'),
		0, FailureHandling.OPTIONAL)

Mobile.verifyMatch(CustomerName_MainApplicant_Actual, GlobalVariable.CustomerName_MainApplicant,true, FailureHandling.OPTIONAL)

String ID_Type_Actual = Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_IDType'),
		0, FailureHandling.OPTIONAL)

Mobile.verifyMatch(ID_Type_Actual, GlobalVariable.ID_Type,true, FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Name'),
		'Name', FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_ID Type'),
		'ID Type', FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_ID Number'),
		'ID Number', FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Alternate ID Type'),
		'Alternate ID Type', FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Alternate ID Number'),
		'Alternate ID Number', FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Religion'),
		'Religion', FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Customer Group'),
		'Customer Group', FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Salutation'),
		'Salutation', FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Gender'),
		'Gender', FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Education'),
		'Education', FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Marital Status'),
		'Marital Status', FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Spouses Monthly Gross Income'),
		'Spouse\'s Monthly Gross Income', FailureHandling.OPTIONAL)

String ID_Number_MainApplicant_Actual = Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_ID Number'),
		0, FailureHandling.OPTIONAL)

Mobile.verifyMatch(ID_Number_MainApplicant_Actual, GlobalVariable.ID_Number_MainApplicant,true, FailureHandling.OPTIONAL)

String Alternative_IDType_Actual = Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Alternative ID Type'),
		0, FailureHandling.OPTIONAL)

Mobile.verifyMatch(Alternative_IDType_Actual, GlobalVariable.Alternative_IDType,true, FailureHandling.OPTIONAL)

String Alternative_IDNumber_Actual = Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Alternate ID Number'),
		0, FailureHandling.OPTIONAL)

Mobile.verifyMatch(Alternative_IDNumber_Actual, GlobalVariable.Alternative_IDNumber,true, FailureHandling.OPTIONAL)

String Religion_Actual = Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Religion'),
		0, FailureHandling.OPTIONAL)

Mobile.verifyMatch(Religion_Actual, GlobalVariable.Religion,true, FailureHandling.OPTIONAL)

String CustomerGroup_Actual = Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Customer Group'),
		0, FailureHandling.OPTIONAL)

Mobile.verifyMatch(CustomerGroup_Actual, GlobalVariable.CustomerGroup,true, FailureHandling.OPTIONAL)

String Salutation_Actual = Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Salutation'),
		0, FailureHandling.OPTIONAL)

Mobile.verifyMatch(Salutation_Actual, GlobalVariable.Salutation,true, FailureHandling.OPTIONAL)

String Gender_Actual = Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Gender'),
		0, FailureHandling.OPTIONAL)

Mobile.verifyMatch(Gender_Actual, GlobalVariable.Gender,true, FailureHandling.OPTIONAL)

String Education_Actual = Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Education'),
		0, FailureHandling.OPTIONAL)

Mobile.verifyMatch(Education_Actual, GlobalVariable.Education,true, FailureHandling.OPTIONAL)

String MaritalStatus_Actual = Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Marital Status'),
		0, FailureHandling.OPTIONAL)

Mobile.verifyMatch(MaritalStatus_Actual, GlobalVariable.MaritalStatus,true, FailureHandling.OPTIONAL)

String SpouseMonthlyIncome_Actual = Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Spouses Monthly Gross Income'),
		0, FailureHandling.OPTIONAL)

Mobile.verifyMatch(SpouseMonthlyIncome_Actual, GlobalVariable.SpouseMonthlyIncome,true, FailureHandling.OPTIONAL)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.swipe(300, 1000, 300, 300)

Mobile.scrollToText('Phone Number', FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Phone Number'),
		'Phone Number', FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Resident Status'),
		'Resident Status', FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Employment Status'),
		'Employment Status', FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Business Type'),
		'Business Type', FailureHandling.OPTIONAL)

String PhoneNumber_Actual = Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Phone Number'),
		0, FailureHandling.OPTIONAL)

Mobile.verifyMatch(PhoneNumber_Actual, GlobalVariable.PhoneNumber,true, FailureHandling.OPTIONAL)

String Resident_Status_Actual = Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Resident Status'),
		0, FailureHandling.OPTIONAL)

Mobile.verifyMatch(Resident_Status_Actual, GlobalVariable.Resident_Status,true, FailureHandling.OPTIONAL)

String Employment_Status_Actual = Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Emplyment Status'),
		0, FailureHandling.OPTIONAL)

Mobile.verifyMatch(Employment_Status_Actual, GlobalVariable.Employment_Status,true, FailureHandling.OPTIONAL)

String Business_Type_Actual = Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Business Type'),
		0, FailureHandling.OPTIONAL)

Mobile.verifyMatch(Business_Type_Actual, GlobalVariable.Business_Type,true, FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Home and Mailing Address'),
		'Home and Mailing Address', FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Country'),
		'Country', FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Home Address'),
		'Home Address', FailureHandling.OPTIONAL)

//Mobile.verifyElementVisible(findTestObject(''), 0, FailureHandling.OPTIONAL)
String Country_Actual = Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Country'),
		0, FailureHandling.OPTIONAL)

Mobile.verifyMatch(Country_Actual, GlobalVariable.Country,true, FailureHandling.OPTIONAL)

String HomeAddress_Actual = Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Home Address'),
		0, FailureHandling.OPTIONAL)

//String HomeAddress_Expected = '9314 TAMAN GURU MELAYU TAMAN INDAH Test KUALA LUMPUR 50150 WP KUALA LUMPUR'
String HomeAddress_Expected = (((((((((GlobalVariable.HomeAddressLine2 + ' ') + GlobalVariable.HomeAddressLine2) + ' ') +
		GlobalVariable.HomeAddressLine3) + ' ') + GlobalVariable.City) + ' ') + GlobalVariable.Postcode) + ' ') + GlobalVariable.State

Mobile.verifyMatch(HomeAddress_Actual, HomeAddress_Expected,true, FailureHandling.OPTIONAL)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_HomeAndMailingAddress_Button_Edit'),
		0, FailureHandling.OPTIONAL)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.swipe(300, 1000, 300, 300)

Mobile.scrollToText('Mailing Address Country', FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Mailing Address Country'),
		'Mailing Address Country', FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Mailing Address'),
		'Mailing Address', FailureHandling.OPTIONAL)

if (GlobalVariable.MailingAddress == 'Yes') {
	String Mailing_Country_Actual = Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Mailing Address Country'),
			0, FailureHandling.OPTIONAL)

	Mobile.verifyMatch(Mailing_Country_Actual, Country_Actual,true, FailureHandling.OPTIONAL)

	String Mailing_Address_Actual = Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Mailing Address'),
			0, FailureHandling.OPTIONAL)

	Mobile.verifyMatch(Mailing_Address_Actual, HomeAddress_Expected,true, FailureHandling.OPTIONAL)
}

if (GlobalVariable.MailingAddress == 'No') {
	String Mailing_Country_Actual = Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Mailing Address Country'),
			0, FailureHandling.OPTIONAL)

	Mobile.verifyMatch(Mailing_Country_Actual, Country_Actual,true, FailureHandling.OPTIONAL)

	String Mailing_Address_Actual = Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Mailing Address'),
			0, FailureHandling.OPTIONAL)

	String Mailing_Address_Expected = (((((((((GlobalVariable.MailingAddressLine2 + ' ') + GlobalVariable.MailingAddressLine2) +
			' ') + GlobalVariable.MailingAddressLine3) + ' ') + GlobalVariable.Mailing_City) + ' ') + GlobalVariable.Mailing_Postcode) +
			' ') + GlobalVariable.Mailing_State

	Mobile.verifyMatch(Mailing_Address_Actual, Mailing_Address_Expected,true, FailureHandling.OPTIONAL)
}

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Employment Details'),
		'Employment Details', FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Occupation'),
		'Occupation', FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Occupation Sector'),
		'Occupation Sector', FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Name of Employer'),
		'Name of Employer', FailureHandling.OPTIONAL)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_EmploymentDetails_Button_Edit'),
		0, FailureHandling.OPTIONAL)

String Occupation_Actual = Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Occupation'),
		0, FailureHandling.OPTIONAL)

Mobile.verifyMatch(Occupation_Actual, GlobalVariable.Occupation,true, FailureHandling.OPTIONAL)

String Occupation_Sector_Actual = Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Occupation Sector'),
		0, FailureHandling.OPTIONAL)

Mobile.verifyMatch(Occupation_Sector_Actual, GlobalVariable.Occupation_Sector,true, FailureHandling.OPTIONAL)

String NameOfEmployer_Actual = Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Name Of Employer'),
		0, FailureHandling.OPTIONAL)

Mobile.verifyMatch(NameOfEmployer_Actual, GlobalVariable.NameOfEmployer,true, FailureHandling.OPTIONAL)


Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.swipe(300, 1000, 300, 300)

Mobile.scrollToText('Duration of Service', FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Duration of Service'),
		'Duration of Service', FailureHandling.OPTIONAL)

String Duration_Actual = Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Duration Of Service'),
		0, FailureHandling.OPTIONAL)

String Duration_Expected = (GlobalVariable.DurationOfService_Year + ' ') + GlobalVariable.DurationOfService_Month //0 year 1 month

Mobile.verifyMatch(Duration_Actual, Duration_Expected, true,FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Office Country'),
		'Country')

String OfficeAddress_Country_Actual = Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Office Country'),
		0)

Mobile.verifyMatch(OfficeAddress_Country_Actual, GlobalVariable.OfficeAddress_Country,true, FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Office Address'),
		'Office Address', FailureHandling.OPTIONAL)

String Office_Address_Actual = Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Office Address'),
		0, FailureHandling.OPTIONAL)

String Office_Address_Expected = GlobalVariable.OfficeAddressLine2 + ' ' + GlobalVariable.OfficeAddressLine2 +
		' ' + GlobalVariable.OfficeAddressLine3 + ' ' + GlobalVariable.OfficeAddress_City + ' ' + GlobalVariable.OfficeAddress_Postcode +
		' ' + GlobalVariable.OfficeAddress_State

Mobile.verifyMatch(Office_Address_Actual, Office_Address_Expected,true, FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Office Contact Number'),
		'Office Contact Number', FailureHandling.OPTIONAL)

String OfficeContactNumber_Actual = Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Office Contact Number'),
		0, FailureHandling.OPTIONAL)

String OfficeContactNumber_Expected = ('+60' + ' ') + GlobalVariable.OfficeContactNumber

Mobile.verifyMatch(OfficeContactNumber_Actual, OfficeContactNumber_Expected,true, FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Income and Commitment Details'),
		'Income and Commitment Details', FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Source of Income'),
		'Source of Income', FailureHandling.OPTIONAL)

String SourceOfIncome_Actual = Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Source of Income'),
		0, FailureHandling.OPTIONAL)

Mobile.verifyMatch(SourceOfIncome_Actual, GlobalVariable.SourceOfIncome,true, FailureHandling.OPTIONAL)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_IncomeAndCommitmentDetails_Button_Edit'),
		0)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.swipe(300, 1000, 300, 300)

Mobile.scrollToText('Non-bank Commitments', FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Non-bank Commitments'),
		'Non-bank Commitments', FailureHandling.OPTIONAL)

String NonBankCommitments_Actual = Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Non-bank Commitments'),
		0, FailureHandling.OPTIONAL)

//String NonBankCommitments_Expected = GlobalVariable.NonBankCommitments

Mobile.verifyMatch(NonBankCommitments_Actual, 'RM? ?[0-9]{1,3}(?:,[0-9]{3})*(?:.[0-9]{2})?', true)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Additional Information'),
		'Additional Information', FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Primary Income'),
		'Primary Income', FailureHandling.OPTIONAL)

String PrimaryIncome_Actual = Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Primary Income'),
		0, FailureHandling.OPTIONAL)

Mobile.verifyMatch(PrimaryIncome_Actual, GlobalVariable.PrimaryIncome,true, FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Primary Source of Wealth'),
		'Primary Source of Wealth', FailureHandling.OPTIONAL)

String PrimarySourceOfWealth_Actual = Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Primary Source of Wealth'),
		0, FailureHandling.OPTIONAL)

Mobile.verifyMatch(PrimarySourceOfWealth_Actual, GlobalVariable.PrimarySourceOfWealth,true, FailureHandling.OPTIONAL)

//Mobile.verifyElementText(findTestObject(''), 'Is the applicant purchasing more than one property at this moment?')
Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_Additional Information_button_Edit'),
		0, FailureHandling.OPTIONAL)


Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.swipe(300, 1000, 300, 300)

Mobile.scrollToText('Who will be the owner(s) of the property?', FailureHandling.OPTIONAL)

/*Mobile.getText(findTestObject(''), 0)
 Mobile.verifyElementText(findTestObject(''), 'Does the applicant have any other pending applications for this property with other banks?')
 Mobile.getText(findTestObject(''), 0)
 */
Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Who will be the owner(s) of the property'),
		'Who will be the owner(s) of the property?', FailureHandling.OPTIONAL)

String Owner_Actual = Mobile.getText(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnBoarding_ConfirmationPage_PersonalDetails_text_Result_Who will be the owner(s) of the property'),
		0, FailureHandling.OPTIONAL)

Mobile.verifyMatch(Owner_Actual, GlobalVariable.Owner,true, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboarding_ConfirmationPage/CustomerOnboardingPage_Confirmation_button_ConfirmAndContinue'),
		0, FailureHandling.OPTIONAL)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)
