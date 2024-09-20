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
import com.sun.org.apache.bcel.internal.classfile.LocalVariable
import bsh.Variable
import internal.GlobalVariable
import org.junit.After
import org.openqa.selenium.Keys as Keys

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.30, 0.70)
CustomKeywords.'com.keywords.ScrollAction.scroll'(0.30, 0.70)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_Header'), 30,FailureHandling.CONTINUE_ON_FAILURE)

String Owner = GlobalVariable.Owner
Mobile.takeScreenshot(FailureHandling.OPTIONAL)
if (Owner.equalsIgnoreCase('Main Applicant, Joint Applicant and other person(s)') || Owner.equalsIgnoreCase('Both Main Applicant and Joint Applicant are owners') ) {
	
	//verify main applicant chargor details
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Name']), 'Name', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_NameValue_MainApp'), GlobalVariable.CustomerName_MainApplicant, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'ID Type']), 'ID Type', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_IDTypeValue_MainApp'), GlobalVariable.ID_Type, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'ID Number']), 'ID Number', FailureHandling.CONTINUE_ON_FAILURE)
	
	String idNumber_Main = Mobile.getText(findTestObject('Object Repository/Tester01/DataEntry/txt_IDNumberValue_MainApp'), 30, FailureHandling.CONTINUE_ON_FAILURE).replace("-", "")
	
	Mobile.verifyMatch(GlobalVariable.ID_Number_MainApplicant, idNumber_Main, true, FailureHandling.CONTINUE_ON_FAILURE)
		
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'OCISS Status']), 'OCISS Status', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_OCISSValue_MainApp'), 'Normal', FailureHandling.CONTINUE_ON_FAILURE)
	
	//verify joint applicant chargor details
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_2', [('variable') : 'Name']), 'Name', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_NameValue_JointApp'), GlobalVariable.CustomerName_JointApplicant, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_2', [('variable') : 'ID Type']), 'ID Type', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_IDTypeValue_JointApp'), GlobalVariable.ID_Type, FailureHandling.CONTINUE_ON_FAILURE)
		
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_2', [('variable') : 'ID Number']), 'ID Number', FailureHandling.CONTINUE_ON_FAILURE)
	
	String idNumber_Joint = Mobile.getText(findTestObject('Object Repository/Tester01/DataEntry/txt_IDNumberValue_JointApp'), 30, FailureHandling.CONTINUE_ON_FAILURE).replace("-", "")
	
	Mobile.verifyMatch(GlobalVariable.ID_Number_JointApplicant, idNumber_Joint, true, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_2', [('variable') : 'OCISS Status']), 'OCISS Status', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_OCISSValue_JointApp'), 'Normal', FailureHandling.CONTINUE_ON_FAILURE)
	
	CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)
	
} else if (Owner.equalsIgnoreCase('Main Applicant and other person(s)') || Owner.equalsIgnoreCase('Main Applicant is the sole owner')) {
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Name']), 'Name', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_NameValue_MainApp'), GlobalVariable.CustomerName_MainApplicant, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'ID Type']), 'ID Type', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_IDTypeValue_MainApp'), GlobalVariable.ID_Type, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'ID Number']), 'ID Number', FailureHandling.CONTINUE_ON_FAILURE)
	
	String idNumber_Main = Mobile.getText(findTestObject('Object Repository/Tester01/DataEntry/txt_IDNumberValue_MainApp'), 30, FailureHandling.CONTINUE_ON_FAILURE).replace("-", "")
	
	Mobile.verifyMatch(GlobalVariable.ID_Number_MainApplicant, idNumber_Main, true, FailureHandling.CONTINUE_ON_FAILURE)
		
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'OCISS Status']), 'OCISS Status', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_OCISSValue_MainApp'), 'Normal', FailureHandling.CONTINUE_ON_FAILURE)
	
	CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.45)
	
}else  if (Owner.equalsIgnoreCase('Joint Applicant and other person(s)') || Owner.equalsIgnoreCase('Joint Applicant is the sole owner')) {
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Name']), 'Name', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_NameValue_MainApp'), GlobalVariable.CustomerName_JointApplicant, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'ID Type']), 'ID Type', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_IDTypeValue_MainApp'), GlobalVariable.ID_Type, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'ID Number']), 'ID Number', FailureHandling.CONTINUE_ON_FAILURE)
	
	String idNumber_Joint = Mobile.getText(findTestObject('Object Repository/Tester01/DataEntry/txt_IDNumberValue_MainApp'), 30, FailureHandling.CONTINUE_ON_FAILURE).replace("-", "")
	
	Mobile.verifyMatch(GlobalVariable.ID_Number_JointApplicant, idNumber_Joint, true, FailureHandling.CONTINUE_ON_FAILURE)
		
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_2', [('variable') : 'OCISS Status']), 'OCISS Status', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_OCISSValue_JointApp'), 'Normal', FailureHandling.CONTINUE_ON_FAILURE)
	

	CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.45)
}

String AdditionalChargor_ReviewPage = GlobalVariable.AdditionalChargorReviewPage

if(AdditionalChargor_ReviewPage.equalsIgnoreCase('2') || AdditionalChargor_ReviewPage.equalsIgnoreCase('1')) {
	Mobile.takeScreenshot(FailureHandling.OPTIONAL)
Mobile.comment('Verify Additionla chargor details 1')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Additional Chargor Details']), 'Additional Chargor Details', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Name']), 'Name', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_NameValue_MainApp'), GlobalVariable.ChargorName1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'ID Type']), 'ID Type', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_IDTypeValue_MainApp'), GlobalVariable.ID_Type, FailureHandling.CONTINUE_ON_FAILURE)

String idNumber1= Mobile.getText(findTestObject('Object Repository/Tester01/DataEntry/txt_IDValue'), 30, FailureHandling.CONTINUE_ON_FAILURE).replace("-", "")

Mobile.verifyMatch(GlobalVariable.ChargorNric1, idNumber1, true, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Alternate ID Type']), 'Alternate ID Type', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_AlternateIDTypeValue'), GlobalVariable.ChargorAlernateIDType1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Alternate ID Number']),
	'Alternate ID Number', FailureHandling.CONTINUE_ON_FAILURE)

String chargorAlternateID  =  Mobile.getText(findTestObject('Object Repository/Tester01/DataEntry/txt_AlternateIDValue'), 30, FailureHandling.CONTINUE_ON_FAILURE).replace("-", "")

Mobile.verifyMatch(chargorAlternateID, GlobalVariable.ChargorAlternativeIDNumber1, true, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Relationship with Main Chargor']),
	'Relationship with Main Chargor', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_RelationshipValue'), GlobalVariable.RelationshipwithChargor1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Existing Home Financing']),
	'Existing Home Financing', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_ExisitingHomeValue'),
	GlobalVariable.ExistingHomeFinancingChargor1, FailureHandling.CONTINUE_ON_FAILURE)

	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'OCISS Status']), 'OCISS Status', FailureHandling.CONTINUE_ON_FAILURE)
	
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'View OCISS Record']), 'View OCISS Record', FailureHandling.CONTINUE_ON_FAILURE)
	
Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'View OCISS Record']), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'OCISS Adverse Checking']), 'OCISS Adverse Checking', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Close']), 0, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)
}

if(AdditionalChargor_ReviewPage.equalsIgnoreCase('2')) {

Mobile.comment('Verify Additionla chargor details 2')

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Name']), 'Name', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_NameValue_MainApp'), GlobalVariable.ChargorName2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'ID Type']), 'ID Type', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_IDTypeValue_MainApp'), GlobalVariable.ID_Type, FailureHandling.CONTINUE_ON_FAILURE)

String idNumber2 = Mobile.getText(findTestObject('Object Repository/Tester01/DataEntry/txt_IDValue'), 30, FailureHandling.CONTINUE_ON_FAILURE).replace("-", "")

Mobile.verifyMatch(GlobalVariable.ChargorNric2, idNumber2, true, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Alternate ID Type']), 'Alternate ID Type', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_AlternateIDTypeValue'), GlobalVariable.ChargorAlernateIDType2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Alternate ID Number']),
	'Alternate ID Number', FailureHandling.CONTINUE_ON_FAILURE)

String IdNumberAlternate2 = Mobile.getText(findTestObject('Object Repository/Tester01/DataEntry/txt_AlternateIDValue'), 30, FailureHandling.CONTINUE_ON_FAILURE).replace("-", "")

Mobile.verifyMatch(GlobalVariable.ChargorAlternativeIDNumber2, IdNumberAlternate2, true, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Relationship with Main Chargor']),
	'Relationship with Main Chargor', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_RelationshipValue'),
	GlobalVariable.RelationshipwithChargor2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Existing Home Financing']),
	'Existing Home Financing', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_ExisitingHomeValue'), GlobalVariable.ExistingHomeFinancingChargor2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'OCISS Status']), 'OCISS Status', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_OCISSValue_MainApp'), 'Normal', FailureHandling.CONTINUE_ON_FAILURE)

}

//String pageIn = LocalVariable.Page

String pageIn = Page
if (pageIn.equalsIgnoreCase('DataEntry')) {
	
	for (i=0; i<=10; i++) {
		
	if (Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/DataEntry/txt_Additional Fees'), 0, FailureHandling.OPTIONAL)) {
		
		Mobile.comment('verify value entered in review page is displayed in property loan, upgrading loan and renovation loan')
		//commented to use in 
		//Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_text_Property Loan'), 'Property Loan', FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_Loan'), 'Loan', FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_PropertyLoanValue'), GlobalVariable.PropertyLoanValue, FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_Upgrading Loan'), 'Upgrading Loan', FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_UpgradingLoanValue'), GlobalVariable.UpgradingLoanValue, FailureHandling.CONTINUE_ON_FAILURE)
		
		if (GlobalVariable.FinancingPlan =='SJKP Madani-i' || GlobalVariable.FinancingPlan =='SJKP Madani') {
			
			Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_Renovation Loan'), 'Renovation Loan', FailureHandling.CONTINUE_ON_FAILURE)
			Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_Renovation Loan'), GlobalVariable.RenovationLoanValue, FailureHandling.CONTINUE_ON_FAILURE)
			
		}else {
			
			Mobile.verifyElementNotVisible(findTestObject('Object Repository/Tester01/DataEntry/txt_Renovation Loan'), 5, FailureHandling.CONTINUE_ON_FAILURE)
			
		}
		
		/*Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_Loan'), 'Loan', FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_LoanValue'), GlobalVariable.FinancingAmountApplicantionEligiblityPage, FailureHandling.CONTINUE_ON_FAILURE)*/
		
		Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/ReviewPage/ReviewPage_button_Continue'), 0)
		break;
		
	} else {
	CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)
	CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)
	CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)
	
	}
	
	}
}else if (pageIn.equalsIgnoreCase('ManagerAndSubmitToManager')){
	
	CustomKeywords.'com.keywords.ScrollAction.scroll'(0.30, 0.70)
	CustomKeywords.'com.keywords.ScrollAction.scroll'(0.30, 0.70)
	Mobile.tap(findTestObject('Object Repository/Tester01/SubmitToManager/btn_backDataEntryPageReviewPage'), 0, FailureHandling.CONTINUE_ON_FAILURE)

}


