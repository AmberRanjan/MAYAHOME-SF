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

String noOfApplicants = GlobalVariable.Applicants_No

if (noOfApplicants.equalsIgnoreCase('1')) {
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep3/txt_Step3of3'), 'Step 3 of 3')
	
	
} else if (noOfApplicants.equalsIgnoreCase('2')) {

	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep3/txt_Step3of6'), 'Step 3 of 6')
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_MainApplicant'), 'Main Applicant')
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_MainApplicantName'), GlobalVariable.CustomerName_MainApplicant)
	
}


Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep3/txt_TopMessage1'), 
    'Please ensure the applicant’s information is accurate.')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep3/txt_StatutoryDeduction'), 
    'Statutory Deduction')

//Mobile.getText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep3/txt_TotalStatutoryDeduction'), 0)

//Set EPF value
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep3/txt_EPF'), 
    'EPF')

String EPF = Mobile.getText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep3/txt_EPFInput'),  0)

Mobile.setText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep3/txt_EPFInput'), GlobalVariable.EPF1, 0)

//Set Socso Vlaue
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep3/txt_SOCSO'), 'SOCSO & EIS')

Mobile.setText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep3/input_Socso'), GlobalVariable.Socso1, 0)

//set Income Tax
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep3/txt_IncomeTax'), 'Income Tax')

Mobile.setText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep3/input_IncomeTax'), GlobalVariable.IncomeTax1, 0)

//Set Zakat 
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep3/txt_Zakat'), 'Zakat')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep3/txt_MuslimapplicantsOnly'), ' (Muslim applicants only)')

Mobile.getText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep3/input_Zakat'), 0)

Mobile.setText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep3/input_Zakat'), GlobalVariable.Zakat1, 0)

//Vlaidate total Statutory Deduction
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep3/txt_TotalStatutoryDeduction'), GlobalVariable.TotalStatutoryDeduction1)

Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/btn_SaveAndNext'), 0)

