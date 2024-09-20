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
import com.kms.katalon.entity.global.GlobalVariableEntity

import ch.qos.logback.core.joran.conditional.ElseAction
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_IncomeAndCommitment'), 
    'Income and Commitment')

	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_Step4of6'), 'Step 4 of 6')
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_JointApplicant'), 'Joint Applicant')
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_JointApplicantName'), GlobalVariable.CustomerName_JointApplicant)
	

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_topMessage'), 'To proceed, please add any additional income details that are relevant to the applicant.')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_Income'), 'Income')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_BasicGrossSalary'), 'Basic Gross Salary')

Mobile.verifyElementText(findTestObject('Tester01/PropertyDetailsPage2/txt_RM'), 'RM')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/input_BasicGrossSalaryValue'), 
    GlobalVariable.GrossSalary2)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_BonusContractual'), 'Bonus - Contractual')

Mobile.verifyElementText(findTestObject('Tester01/PropertyDetailsPage2/txt_RM'), 'RM')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/input_BonusContractualValue'), 
    GlobalVariable.BonusContracatualDefaultValue)

Mobile.setText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/input_BonusContractualValue'), GlobalVariable.BonusContracatualInputValue2, 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_BonusNonContractual'), 
    'Bonus - Non Contractual')

Mobile.verifyElementText(findTestObject('Tester01/PropertyDetailsPage2/txt_RM'), 'RM')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/input_BonusNonContractualValue'), 
    GlobalVariable.BonusNonContracatualDefaultValue)

Mobile.setText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/input_BonusNonContractualValue'), GlobalVariable.BonusNonContracatualInputValue2, 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_AllowancesFixed'), 'Allowances - Fixed')

Mobile.verifyElementText(findTestObject('Tester01/PropertyDetailsPage2/txt_RM'), 'RM')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/input_AllowancesFixedValue'), 
    GlobalVariable.BonusAllowancesFixedDefaultvalue)

Mobile.setText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/input_AllowancesFixedValue'), GlobalVariable.BonusAllowancesFixedInputvalue2, 
    0)

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_AllowancesVariable'), 'Allowances - Variable')

//CustomKeywords.'com.keywords.Scroll.scrollUp'(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/input_AllowancesVariableValue'), (findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_BonusContractual')))

Mobile.verifyElementText(findTestObject('Tester01/PropertyDetailsPage2/txt_RM'), 'RM')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/input_AllowancesVariableValue'), 
    GlobalVariable.BonusAllowancesVariableDefaultvalue)

Mobile.setText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/input_AllowancesVariableValue'), GlobalVariable.BonusAllowancesVariableInputvalue2, 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_RentalExisting'), 'Rental - Existing')

Mobile.verifyElementText(findTestObject('Tester01/PropertyDetailsPage2/txt_RM'), 'RM')

//Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/input_RentalExistingValue'), 
  //  GlobalVariable.RentalExistingDefaultvalue)

Mobile.setText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/input_RentalExistingValue'), GlobalVariable.RentalExistingInputvalue2, 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_Pension'), 'Pension')

Mobile.verifyElementText(findTestObject('Tester01/PropertyDetailsPage2/txt_RM'), 'RM')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/input_PensionValue'), GlobalVariable.PensionDefaultvalue)

Mobile.setText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/input_PensionValue'), GlobalVariable.PensionInputvalue2, 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_FixedDepositInterest'), 
    'Fixed Deposit Interest')

Mobile.verifyElementText(findTestObject('Tester01/PropertyDetailsPage2/txt_RM'), 'RM')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/input_FixedDepositInterestValue'), 
    GlobalVariable.FixedDepositDefaultValue)

Mobile.setText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/input_FixedDepositInterestValue'), GlobalVariable.FixedDepositInputValue2, 
    0)

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_Commission'), 'Commission')

Mobile.verifyElementText(findTestObject('Tester01/PropertyDetailsPage2/txt_RM'), 'RM')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/input_CommissionValue'), GlobalVariable.ComissionDefaultValue)

Mobile.setText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/input_CommissionValue'), GlobalVariable.CommissionInputValue2, 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_Overtime'), 'Overtime')

Mobile.verifyElementText(findTestObject('Tester01/PropertyDetailsPage2/txt_RM'), 'RM')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/input_OvertimeValue'), GlobalVariable.OverTimeDefaultValue)

Mobile.setText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/input_OvertimeValue'), GlobalVariable.OverTimeInputValue2, 
    0)

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_Service Points'), 'Service Points')

Mobile.verifyElementText(findTestObject('Tester01/PropertyDetailsPage2/txt_RM'), 'RM')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/input_ServicePointsValue'), 
    GlobalVariable.ServicePointsDefaultValue)

Mobile.setText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/input_ServicePointsValue'), GlobalVariable.ServicePointsInputValue2, 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_EPFDividends'), 'EPF Dividends')

Mobile.verifyElementText(findTestObject('Tester01/PropertyDetailsPage2/txt_RM'), 'RM')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/input_EPFDividendsValue'), 
    GlobalVariable.EpfDefaultValue)

Mobile.setText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/input_EPFDividendsValue'), GlobalVariable.EpfInputValue2, 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_TabungHajiDividends'), 
    'Tabung Haji Dividends')

Mobile.verifyElementText(findTestObject('Tester01/PropertyDetailsPage2/txt_RM'), 'RM')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/input_TabungHajiDividendsValue'), 
    GlobalVariable.TabungDefaultValue)

Mobile.setText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/input_TabungHajiDividendsValue'), GlobalVariable.TabungInputValue2, 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_ASNBFundsDividends'), 'ASNB Funds Dividends')

Mobile.verifyElementText(findTestObject('Tester01/PropertyDetailsPage2/txt_RM'), 'RM')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/input_ASNBFundsDividendsValue'), 
    GlobalVariable.ASNBDefaultValue)

Mobile.setText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/input_ASNBFundsDividendsValue'), GlobalVariable.ASNBInputValue2, 
    0)

Mobile.tap(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/btn_CalculateGrossIncome'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/btn_back'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/btn_Close'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_IncomeAndCommitment'), 
    'Income and Commitment')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_Step4of6'), 'Step 4 of 6')
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_JointApplicant'), 'Joint Applicant')
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_JointApplicantName'), GlobalVariable.CustomerName_JointApplicant)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_GrossIncome'), 'Gross Income')

Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/btn_Edit'), 0)

//Boolean ComparisonStatus = CustomKeywords.'com.keywrods.coreMethods.AddFloatValues'(GlobalVariable.GrossSalary, GlobalVariable.BonusNonContracatualInputValue, GlobalVariable.BonusNonContracatualInputValue, GlobalVariable.BonusAllowancesFixedInputvalue, GlobalVariable.BonusAllowancesVariableInputvalue, GlobalVariable.RentalExistingInputvalue, GlobalVariable.PensionInputvalue, GlobalVariable.FixedDepositInputValue, GlobalVariable.CommissionInputValue, GlobalVariable.OverTimeInputValue, GlobalVariable.ServicePointsInputValue, GlobalVariable.EpfInputValue, GlobalVariable.TabungInputValue, GlobalVariable.ASNBInputValue)
//CustomKeywords.'com.keywrods.AddFloatValues.AddFloatValuesMethod'(GlobalVariable.GrossSalary, GlobalVariable.BonusNonContracatualInputValue, GlobalVariable.BonusNonContracatualInputValue, GlobalVariable.BonusAllowancesFixedInputvalue, GlobalVariable.BonusAllowancesVariableInputvalue, GlobalVariable.RentalExistingInputvalue, GlobalVariable.PensionInputvalue, GlobalVariable.FixedDepositInputValue, GlobalVariable.CommissionInputValue, GlobalVariable.OverTimeInputValue, GlobalVariable.ServicePointsInputValue, GlobalVariable.EpfInputValue, GlobalVariable.TabungInputValue, GlobalVariable.ASNBInputValue, GlobalVariable.Total)
//Mobile.verifyEqual(ComparisonStatus, 'true')

Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_Total'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/txt_TotalValue'), GlobalVariable.TotalMonthlyGrossIncome2)

WebUI.callTestCase(findTestCase('Test Cases/Tester01/Pages/IncomeAndCommitmentDetails/ReusableMethods/MonthlyGrossInComeValidationPage2ndApplicant'), 
    [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/IncomeAndCommitmentStep1/btn_ConfirmNext'), 0)



