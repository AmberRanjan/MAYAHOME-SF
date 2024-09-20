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

	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_Step5of6'), 'Step 5 of 6')
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_JointApplicant'), 'Joint Applicant')
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_JointApplicantName'), GlobalVariable.CustomerName_JointApplicant)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep2/txt_TopMessage1'), 'Please ensure the applicant’s information matches the CCRIS report. If it doesn’t match, edit it below.')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep2/txt_ViewCCRISReport'), 'View CCRIS Report')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep2/txt_MonthlyCommitment'), 'Monthly Commitment')

//OtherHirePurchse
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep2/txt_OtherHirePurchase'), 'Other Hire Purchase (Old/New)')

Mobile.setText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep2/input_OtherHirePurchase'), GlobalVariable.OtherHirePurchase2, 0)

//OtherterLoan
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep2/txt_OtherTermLoan'), 'Other Term Loan (Collateral/Clean)')

Mobile.setText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep2/input_OtherTermLoan'), GlobalVariable.OtherTermLoan2, 0)

//OtherHousingLoan
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep2/txt_OtherHousingLoan'), 'Other Housing Loan')

Mobile.setText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep2/input_OtherHousingLoan'), GlobalVariable.OtherHousingLoan2, 0)

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)

//OtherOverDraft
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep2/txt_OtherOverdraft'), 'Other Overdraft (Clean/Secured)')

Mobile.setText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep2/input_OtherOverdraft'), GlobalVariable.OtherOverdraft2, 0)

CustomKeywords.'com.keywords.Scroll.scrollUp'(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep2/input_OtherOverdraft'), findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep2/txt_OtherHirePurchase'))

//Credit Card
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep2/txt_CreditCard'), 'Credit Card')

Mobile.setText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep2/input_CreditCard'), GlobalVariable.CreditCard2, 0)

//Non bank commitments
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep2/txt_NonbankCommitments'), 'Non-bank Commitments')

Mobile.setText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep2/input_NonBankCommitments'), GlobalVariable.NonBankCommitments2, 0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep2/txt_TotalMontlyCommitment'), GlobalVariable.TotalMonthlyCommitments2)

Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/btn_SaveAndNext'), 0)
