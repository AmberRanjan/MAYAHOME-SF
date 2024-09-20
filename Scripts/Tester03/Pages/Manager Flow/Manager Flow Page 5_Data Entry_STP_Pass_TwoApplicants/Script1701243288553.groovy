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

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_BAU Pass/DataEntryPage_TitleText_Data Entry'), 
    0), 'Data Entry')

Mobile.delay(5)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_BAU Pass/DataEntryPage_button_Back'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03/Manager Flow/Review Data Entry and LO Page/ReviewDataEntryandLOPage_TitleText_Review Data Entry and LO'),
	0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Tester03/Manager Flow/Review Application Page/ReviewApplicationPage_Arrow_Data Entry'),
	0)

Mobile.delay(5)

Mobile.takeScreenshot()
Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_BAU Pass/DataEntryPage_TitleText_Data Entry'), 
    0)


'Determine whether is it One Applicant Case or Two Applicants Case'
if (Mobile.verifyElementExist(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_Is this applicant a Maybank'), 
    10, FailureHandling.OPTIONAL)) {
    Mobile.callTestCase(findTestCase('Tester03/Pages/Manager Flow/Manager Flow Page 5_Data Entry_STP_Pass'), [:], FailureHandling.STOP_ON_FAILURE)
} else {
    
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_fieldtext_Loan Details'),
		'Loan Details')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_Purpose of Loan'),
		'Purpose of Loan')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_DataEntryPurposeOfLoan'),
		GlobalVariable.PurposeOfLoan)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_Are any of the applicant a Maybank employee'), 
        'Are any of the applicant a Maybank employee / related to a Maybank employee? ')

    Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_DataEntryIsMaybankEmployee'), 
        GlobalVariable.AreAnyofTheApplicantAMaybankEmployeeRelatedToAMaybankEmployee)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_fieldtext_Property Details'),
		'Property Details')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_Property Name'),
		'Property Name')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_DataEntryStep2PropertyName'),
		GlobalVariable.PropertyName)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_Unit Number'),
		'Unit Number')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_DataEntryStep2UnitNumber'),
		GlobalVariable.UnitNumber)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_Title Code'),
		'Title Code')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_DataEntryStep2UnitTitleCode'),
		GlobalVariable.TitleCode)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_Title Number'),
		'Title Number')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_DataEntryStep2TitleNumber'),
		GlobalVariable.TitleNumber)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_Lot Number'),
		'Lot Number')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_DataEntryStep2LotNumber'),
		GlobalVariable.LotNumber)
	
	Mobile.takeScreenshot()
	
	Mobile.swipe(300, 900, 300, 300)
	
	Mobile.takeScreenshot()
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_BlockStreet'),
		'Block/Street')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_DataEntryStep2BlockStreet'),
		GlobalVariable.Block_Street)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_Purchase Date'),
		'Purchase Date')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_DataEntryStep2PurchaseDate'),
		GlobalVariable.PurchaseDate)
	
	Mobile.swipe(300, 900, 300, 300)
	
	Mobile.takeScreenshot()
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_Built Up Area'),
		'Built Up Area')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_DataEntryStep2BuiltUpArea'),
		GlobalVariable.BuiltUpArea)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_Property Insured Amount'),
		'Property Insured Amount')
	
	//Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_DataEntryStep2PropertyInsuredAmount'), GlobalVariable.PropertyInsuredAmount)
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_Fieldtext_Life Insurance'),
		'Life Insurance')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_Product Type'),
		'Product Type')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_ManagerDataEntryProductType'),
		GlobalVariable.ProductType)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_Policy Type'),
		'Policy Type')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_DataEntryStep4PolicyType'),
		GlobalVariable.PolicyType)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_Insurer'),
		'Insurer')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_DataEntryStep4Insurer'),
		GlobalVariable.Insurer)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_Insured Tenure'),
		'Insured Tenure')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_DataEntryStep4Tenure'),
		GlobalVariable.InsuredTenure)
	
	Mobile.swipe(300, 900, 300, 300)
	
	Mobile.takeScreenshot()
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_BICC Period'),
		'BICC Period')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_DataEntryStep4BICCPeriod'),
		GlobalVariable.BICCPeriod)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_Total Coverage'),
		'Total Coverage')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_DataEntryStep4TotalCoverage'),
		GlobalVariable.TotalCoverage)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_Payment Method'),
		'Payment Method')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_DataEntryStep4PaymentMethod'),
		GlobalVariable.PaymentMethod)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_FieldText_Main Applicant'),
		'Main Applicant')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_Insured Amount'),
		'Insured Amount')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_MainApplicant_DataEntryStep4InsuredAmount'),
		GlobalVariable.MainApplicant_InsuredAmount)
	
	Mobile.swipe(300, 900, 300, 300)
	
	Mobile.takeScreenshot()
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_Premium'),
		'Premium')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_MainApplicant_DataEntryStep4PremiumAmount'),
		GlobalVariable.MainApplicant_Premium)
	
	Mobile.swipe(300, 900, 300, 300)
	
	Mobile.takeScreenshot()
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_Within Auto Acceptance Limit (AAL)'),
		'Within Auto Acceptance Limit (AAL)?')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_MainApplicant_DataEntryStep4PremiumAmountJointAutoAcceptance'),
		GlobalVariable.MainApplicant_WithinAutoAcceptanceLimit)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_FieldText_Joint Applicant'),
		'Joint Applicant')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_Insured Amount'),
		'Insured Amount')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_JointApplicant_DataEntryStep4InsuredAmount'),
		GlobalVariable.JointApplicant_InsuredAmount)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_Premium'),
		'Premium')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_JointApplicant_DataEntryStep4PremiumAmount'),
		GlobalVariable.JointApplicant_Premium)
	
	Mobile.swipe(300, 900, 300, 300)
	
	Mobile.takeScreenshot()
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_Within Auto Acceptance Limit (AAL)'),
		'Within Auto Acceptance Limit (AAL)?')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_JointApplicant_DataEntryStep4PremiumAmountJointAutoAcceptance'),
		GlobalVariable.JointApplicant_WithinAutoAcceptanceLimit)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_Fieldtext_Additional Fees'),
		'Additional Fees')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_Legal Fees'),
		'Legal Fees')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_DataEntryStep5LegalFees'),
		GlobalVariable.LegalFees)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_Will Writing Fees (Main Applicant)'),
		'Will Writing Fees (Main Applicant)')
	
	WillWritingMain = Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_WillWritingMain'), 0)
	
	
	Mobile.verifyMatch(WillWritingMain, GlobalVariable.MainApplicant_WillWritingFees, false)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_Will Writing Fees (Joint Applicant)'),
		'Will Writing Fees (Joint Applicant)')
	
	WillWritingJoint = Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_WillWritingJoint'), 0)
	
	Mobile.verifyMatch(WillWritingJoint , GlobalVariable.JointApplicant_WillWritingFees, false)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_Capitalized Premium'),
		'Capitalized Premium')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_DataEntryStep5Capitalized'),
		GlobalVariable.CapitalizedPremium)
	
	Mobile.swipe(300, 900, 300, 300)
	
	Mobile.takeScreenshot()
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_Cash Premium'),
		'Cash Premium')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_DataEntryStep5Cash'),
		GlobalVariable.CashPremium)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_Property Loan'),
		'Property Loan')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester03/Manager Flow/Data Entry Page_STP/DataEntryPage_text_DataEntryStep5PropertyLoan'),
		GlobalVariable.PropertyLoan)
	
	Mobile.swipe(300, 900, 300, 300)
	
	Mobile.takeScreenshot()
	
}