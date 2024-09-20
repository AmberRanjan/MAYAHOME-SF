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

String BasicgrossSalary = 'RM ' + GlobalVariable.GrossSalary1

String BonusContractual = 'RM ' + GlobalVariable.BonusContracatualInputValue1

String NonBonusContractual = 'RM ' + GlobalVariable.BonusNonContracatualInputValue1

String AllowencesFixed = 'RM ' + GlobalVariable.BonusAllowancesFixedInputvalue1

String AllowencesVariable = 'RM ' + GlobalVariable.BonusAllowancesVariableInputvalue1

String RentalExisting = 'RM ' + GlobalVariable.RentalExistingInputvalue1

String Pension = 'RM ' + GlobalVariable.PensionInputvalue1

String FixedDeposit = 'RM ' + GlobalVariable.FixedDepositInputValue1

String Commission = 'RM ' + GlobalVariable.CommissionInputValue1

String Overtime = 'RM ' + GlobalVariable.OverTimeInputValue1

String ServicePoints = 'RM ' + GlobalVariable.ServicePointsInputValue1

String EPFdividends = 'RM ' + GlobalVariable.EpfInputValue1

String TabungHajiDividends = 'RM ' + GlobalVariable.TabungInputValue1

String ASNBFundsDividends = 'RM ' + GlobalVariable.ASNBInputValue1

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_BasicGrossSalary'), 'Basic Gross Salary')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_BasicGrossSalaryValue'), BasicgrossSalary)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_BonusContractual'), 'Bonus - Contractual')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_BonusContractualValue'), BonusContractual)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_BonusNonContractual'), 'Bonus - Non Contractual')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_BonusNonContractualValue'), NonBonusContractual)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_AllowancesFixed'), 'Allowances - Fixed')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_AllowencesFixedValue'), AllowencesFixed)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_AllowancesVariable'), 'Allowances - Variable')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_AllowencesVariableValue'), AllowencesVariable)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_RentalExisting'), 'Rental - Existing')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_RentalExistingValue'), RentalExisting)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_Pension'), 'Pension')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_PensionValue'), Pension)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_FixedDepositInterest'), 'Fixed Deposit Interest')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_FixedDepositInterestValue'), FixedDeposit)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_Commission'), 'Commission')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_CommissionValue'), Commission)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_Overtime'), 'Overtime')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_OvertimeValue'), Overtime)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_Service Points'), 'Service Points')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_ServicePointsValue'), ServicePoints)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_EPFDividends'), 'EPF Dividends')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_EPFDividendsValue'), EPFdividends)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_TabungHajiDividends'), 'Tabung Haji Dividends')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_TabungHajiDividendsValue'), TabungHajiDividends)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_ASNBFundsDividends'), 'ASNB Funds Dividends')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_ASNBFundsDividendsValue'), ASNBFundsDividends)
