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

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/txt_Confirmation'),
	'Confirmation')

Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/btn_Back_Confirmation'),
	0)

Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/btn_EditConfirmation'),
	0)

Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/btn_CloseButton'),
	0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/txt_FinalIncomeDetails'),
	'Final Income Details')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/txt_AppliedAmount'),
	'Applied Amount')
String financingAmount = 'RM '+GlobalVariable.FinancingAmountValue
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/txt_AppliedAmountValue'),
	financingAmount)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/txt_TotalMonthlyNetIncome'),
	'Total Monthly Net Income')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/txt_MonthlyNetIncomeValue'),
	GlobalVariable.TotalMonthlyNetIncomeValue2)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/txt_DebtServiceRatio'),
	'Debt Service Ratio (DSR)')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/txt_DebtServiceRatioValue'),
	GlobalVariable.DSR2)

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.50, 0.30)
////////////////////////////////////////////////////////////////////////////////////////////////validation for joint applicant
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/txt_MonthlyGrossIncome'),
	'Monthly Gross Income')

String txtDisplayMonthlyGrossIncomeActual = Mobile.getText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/txt_TotalMonthlyGrossIncome_2'), 0)

String txtDisplayMonthlyGrossIncomeExpected = GlobalVariable.TotalMonthlyGrossIncomeTotal
Mobile.verifyMatch(txtDisplayMonthlyGrossIncomeActual.substring(28), txtDisplayMonthlyGrossIncomeExpected, true)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_MainApplicant'), 'MAIN APPLICANT')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_JointApplicant'), 'JOINT APPLICANT')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/txt_Total_MonthlyGrossIncome'),
	'Total')
String
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/txt_Total_MonthlyGrossIncomeValue'), GlobalVariable.TotalMonthlyGrossIncome2)

WebUI.callTestCase(findTestCase('Tester01/Pages/IncomeAndCommitmentDetails/ReusableMethods/MonthlyGrossInComeValidationPage2ndApplicant'),
	[:], FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)
//CustomKeywords.'com.keywords.Scroll.scrollUp'(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_ASNBFundsDividends'),
//	findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_BasicGrossSalary'))

String OtherHirePurchse = 'RM '+GlobalVariable.OtherHirePurchase2

String OtherTermLoan = 'RM '+GlobalVariable.OtherTermLoan2

String OtherHousingLoan = 'RM '+GlobalVariable.OtherHousingLoan2

String OtherOverDraft = 'RM '+GlobalVariable.OtherOverdraft2

String CreditCard = 'RM '+GlobalVariable.CreditCard2

String NonBankCommitments = 'RM '+GlobalVariable.NonBankCommitments2

String TotalMonthlyCommitments = GlobalVariable.TotalMonthlyCommitments2

TotalMonthlyCommitments = TotalMonthlyCommitments.substring(7)

String EPF = 'RM '+GlobalVariable.EPF2

String SOCSO = 'RM '+GlobalVariable.Socso2

String IncomeTax = 'RM '+GlobalVariable.IncomeTax2

String Zakat = 'RM '+GlobalVariable.Zakat2

String TotalStatutoryDeduction = GlobalVariable.TotalStatutoryDeduction2

TotalStatutoryDeduction = TotalStatutoryDeduction.substring(7)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/txt_MonthlyCommitment'),
	'Monthly Commitment')

String txtDisplayMonthlyCommitmentActual = Mobile.getText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/txt_TotalMonthlyCommitment_2'), 0)

String txtDisplayMonthlyCommitmentExpected = GlobalVariable.TotalMonthlyCommitmentsTotal

Mobile.verifyMatch(txtDisplayMonthlyCommitmentActual.substring(26), txtDisplayMonthlyCommitmentExpected, true)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_MainApplicant'),
	'MAIN APPLICANT')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_JointApplicant'),
	'JOINT APPLICANT')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/txt_TotalMonthlyCommitment'),
	'Total')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/txt_TotalMonthlyCommitmentValue'),
	TotalMonthlyCommitments)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep2/txt_OtherHirePurchase'), 'Other Hire Purchase (Old/New)')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep2/txt_OtherHirePurchaseValue'), OtherHirePurchse)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep2/txt_OtherTermLoan'), 'Other Term Loan (Collateral/Clean)')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep2/txt_OtherTermLoanValue'), OtherTermLoan)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep2/txt_OtherHousingLoan'), 'Other Housing Loan')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep2/txt_OtherHousingLoanValue'), OtherHousingLoan)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep2/txt_OtherOverdraft'), 'Other Overdraft (Clean/Secured)')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep2/txt_OtherOverdraftValue'), OtherOverDraft)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep2/txt_CreditCard'), 'Credit Card')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep2/txt_CreditCardValue'), CreditCard)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep2/txt_NonbankCommitments'), 'Non-bank Commitments')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep2/txt_NonbankCommitmentsValue'), NonBankCommitments)

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.50, 0.30)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/txt_MonthlyStatutoryDeduction'),
	'Monthly Statutory Deduction')

String txtDisplayMonthlyStatutoryActual = Mobile.getText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/txt_TotalMonthlyStatutoryDeduction_2'), 0)

String txtDisplayMonthlyStatutoryExpected = GlobalVariable.TotalStatutoryDeductionTotal

Mobile.verifyMatch(txtDisplayMonthlyStatutoryActual.substring(35), txtDisplayMonthlyStatutoryExpected, true)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_MainApplicant'),
	'MAIN APPLICANT')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_JointApplicant'),
	'JOINT APPLICANT')

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/txt_TotalMonthlyStatutoryDeduction'),
	'Total')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/txt_TotalMonthlyStatutoryDeductionValue'),
	TotalStatutoryDeduction)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep3/txt_EPF'), 'EPF')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep3/txt_EPFValue'), EPF)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep3/txt_SOCSO'), 'SOCSO & EIS')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep3/txt_SOCSOValue'), SOCSO)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep3/txt_IncomeTax'), 'Income Tax')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep3/txt_IncomeTaxValue'), IncomeTax)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep3/txt_Zakat'), 'Zakat')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep3/txt_ZakatValue'), Zakat)

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// validation for main applicant

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.30, 0.70)
CustomKeywords.'com.keywords.ScrollAction.scroll'(0.30, 0.70)
CustomKeywords.'com.keywords.ScrollAction.scroll'(0.50, 0.30)


Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/txt_MonthlyGrossIncome'),
	'Monthly Gross Income')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_MainApplicant'),
	'MAIN APPLICANT')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_JointApplicant'),
	'JOINT APPLICANT')

Mobile.tap(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_MainApplicant'), 0)

txtDisplayMonthlyGrossIncomeActual = Mobile.getText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/txt_TotalMonthlyGrossIncome_2'), 0)

txtDisplayMonthlyGrossIncomeExpected = GlobalVariable.TotalMonthlyGrossIncomeTotal
Mobile.verifyMatch(txtDisplayMonthlyGrossIncomeActual.substring(28), txtDisplayMonthlyGrossIncomeExpected, true)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/txt_Total_MonthlyGrossIncome'),
	'Total')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/txt_Total_MonthlyGrossIncomeValue'),
	GlobalVariable.TotalMonthlyGrossIncome1)

WebUI.callTestCase(findTestCase('Test Cases/Tester01/Pages/IncomeAndCommitmentDetails/ReusableMethods/MonthlyGrossInComeValidationPage1stApplicant'),
	[:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)

OtherHirePurchse = 'RM '+GlobalVariable.OtherHirePurchase1

OtherTermLoan = 'RM '+GlobalVariable.OtherTermLoan1

OtherHousingLoan = 'RM '+GlobalVariable.OtherHousingLoan1

OtherOverDraft = 'RM '+GlobalVariable.OtherOverdraft1

CreditCard = 'RM '+GlobalVariable.CreditCard1

NonBankCommitments = 'RM '+GlobalVariable.NonBankCommitments1

TotalMonthlyCommitments = GlobalVariable.TotalMonthlyCommitments1

TotalMonthlyCommitments = TotalMonthlyCommitments.substring(7)

EPF = 'RM '+GlobalVariable.EPF1

SOCSO = 'RM '+GlobalVariable.Socso1

IncomeTax = 'RM '+GlobalVariable.IncomeTax1

Zakat = 'RM '+GlobalVariable.Zakat1

TotalStatutoryDeduction = GlobalVariable.TotalStatutoryDeduction1

TotalStatutoryDeduction = TotalStatutoryDeduction.substring(7)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/txt_MonthlyCommitment'),
	'Monthly Commitment')

txtDisplayMonthlyCommitmentActual = Mobile.getText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/txt_TotalMonthlyCommitment_2'), 0)

txtDisplayMonthlyCommitmentExpected = GlobalVariable.TotalMonthlyCommitmentsTotal

Mobile.verifyMatch(txtDisplayMonthlyCommitmentActual.substring(26), txtDisplayMonthlyCommitmentExpected, true)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_MainApplicant'),
	'MAIN APPLICANT')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_JointApplicant'),
	'JOINT APPLICANT')

Mobile.tap(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_MainApplicant'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/txt_TotalMonthlyCommitment'),'Total')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/txt_TotalMonthlyCommitmentValue'),
	TotalMonthlyCommitments)

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep2/txt_OtherHirePurchase'), 'Other Hire Purchase (Old/New)')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep2/txt_OtherHirePurchaseValue'), OtherHirePurchse)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep2/txt_OtherTermLoan'), 'Other Term Loan (Collateral/Clean)')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep2/txt_OtherTermLoanValue'), OtherTermLoan)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep2/txt_OtherHousingLoan'), 'Other Housing Loan')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep2/txt_OtherHousingLoanValue'), OtherHousingLoan)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep2/txt_OtherOverdraft'), 'Other Overdraft (Clean/Secured)')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep2/txt_OtherOverdraftValue'), OtherOverDraft)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep2/txt_CreditCard'), 'Credit Card')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep2/txt_CreditCardValue'), CreditCard)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep2/txt_NonbankCommitments'), 'Non-bank Commitments')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep2/txt_NonbankCommitmentsValue'), NonBankCommitments)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/txt_MonthlyStatutoryDeduction'),
	'Monthly Statutory Deduction')

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.50, 0.30)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_MainApplicant'),
	'MAIN APPLICANT')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_JointApplicant'),
	'JOINT APPLICANT')

Mobile.tap(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_MainApplicant'), 0)

txtDisplayMonthlyStatutoryActual = Mobile.getText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/txt_TotalMonthlyStatutoryDeduction_2'), 0)

txtDisplayMonthlyStatutoryExpected = GlobalVariable.TotalStatutoryDeductionTotal

Mobile.verifyMatch(txtDisplayMonthlyStatutoryActual.substring(35), txtDisplayMonthlyStatutoryExpected, true)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/txt_TotalMonthlyStatutoryDeduction'),
	'Total')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/txt_TotalMonthlyStatutoryDeductionValue'),
	TotalStatutoryDeduction)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep3/txt_EPF'), 'EPF')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep3/txt_EPFValue'), EPF)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep3/txt_SOCSO'), 'SOCSO & EIS')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep3/txt_SOCSOValue'), SOCSO)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep3/txt_IncomeTax'), 'Income Tax')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep3/txt_IncomeTaxValue'), IncomeTax)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep3/txt_Zakat'), 'Zakat')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep3/txt_ZakatValue'), Zakat)

Mobile.tap(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/btn_ConfirmAndContinue'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/txt_ConfirmDetails'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/txt_ConfirmDetailsText'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/txt_Confirm'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/txt_Cancel'), 0)

Mobile.tap(findTestObject('Object Repository/Tester01/IncomeAndCommitmentConfirmation/txt_Confirm'), 0)
