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

Mobile.startExistingApplication('com.maybank2u.salesforce.uatent')

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/IncomeAndCommitmentStep1/txt_Income'), 'Income')

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/IncomeAndCommitmentStep1/txt_BasicGrossSalary'), 'Basic Gross Salary')

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/IncomeAndCommitmentStep1/txt_BasicGrossSalaryValue'), )

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/IncomeAndCommitmentStep1/txt_BonusContractual'), 'Bonus - Contractual')

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/IncomeAndCommitmentStep1/txt_BonusContractualValue'), )

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/IncomeAndCommitmentStep1/txt_BonusNonContractual'), 'Bonus - Non Contractual')

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/IncomeAndCommitmentStep1/txt_BonusNonContractualValue'), )

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/IncomeAndCommitmentStep1/txt_AllowancesFixed'), 'Allowances - Fixed')

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/IncomeAndCommitmentStep1/txt_AllowancesFixedValue'), )

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/IncomeAndCommitmentStep1/txt_AllowancesVariable'), 'Allowances - Variable')

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/IncomeAndCommitmentStep1/txt_AllowancesVariableValue'), )

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/IncomeAndCommitmentStep1/txt_RentalExisting'), 'Rental - Existing')

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/IncomeAndCommitmentStep1/txt_RentalExistingValue'), )

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/IncomeAndCommitmentStep1/txt_Pension'), 'Pension')

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/IncomeAndCommitmentStep1/txt_PensionValue'), )

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/IncomeAndCommitmentStep1/txt_FixedDepositInterest'), 
    'Fixed Deposit Interest')

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/IncomeAndCommitmentStep1/txt_FixedDepositInterestValue'), )

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/IncomeAndCommitmentStep1/txt_Commission'), 'Commission')

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/IncomeAndCommitmentStep1/txt_CommissionValue'), )

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/IncomeAndCommitmentStep1/txt_Overtime'), 'Overtime')

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/IncomeAndCommitmentStep1/txt_OvertimeValue'), )

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/IncomeAndCommitmentStep1/txt_Service Points'), 'Service Points')

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/IncomeAndCommitmentStep1/txt_ServicePointsValue'), )

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/IncomeAndCommitmentStep1/txt_EPFDividends'), 'EPF Dividends')

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/IncomeAndCommitmentStep1/txt_EPFDividendsValue'), )

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/IncomeAndCommitmentStep1/txt_TabungHajiDividends'), 'Tabung Haji Dividends')

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/IncomeAndCommitmentStep1/txt_TabungHajiDividendsValue'), )

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/IncomeAndCommitmentStep1/txt_ASNBFundsDividends'), 'ASNB Funds Dividends')

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/IncomeAndCommitmentStep1/txt_ASNBFundsDividendsValue'), )

Mobile.tap(findTestObject('Object Repository/Tester1_old/IncomeAndCommitmentStep1/btn_CalculateGrossIncome'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Tester1_old/IncomeAndCommitmentStep1/btn_back'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Tester1_old/IncomeAndCommitmentStep1/btn_Close'), 0)
//////////////////////////////////////////////////////////////

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/IncomeAndCommitmentStep1/txt_GrossIncome'), 'Gross Income')

Mobile.verifyElementExist(findTestObject('Object Repository/Tester1_old/IncomeAndCommitmentStep1/btn_Edit'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/IncomeAndCommitmentStep1/txt_Total'), 'Total0')

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/IncomeAndCommitmentStep1/txt_QuestionSymbol'), '')

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/IncomeAndCommitmentStep1/txt_TotalValue'), 'RM 20,000.00')

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/IncomeAndCommitmentStep1/txt_BasicGrossSalary (1)'), 
    'Basic Gross Salary')

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/IncomeAndCommitmentStep1/txt_BasicGrossSalaryValue'), 
    'RM 20,000.00')

Mobile.tap(findTestObject('Object Repository/Tester1_old/IncomeAndCommitmentStep1/btn_ConfirmNext'), 0)

Mobile.closeApplication()

