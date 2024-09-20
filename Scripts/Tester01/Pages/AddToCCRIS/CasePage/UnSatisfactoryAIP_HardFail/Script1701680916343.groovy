import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileAbstractKeyword
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

String financingType = GlobalVariable.financingType

String noOfAplicants = GlobalVariable.Applicants_No

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_MAYA'), 45)

String stpId = Mobile.getText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_STPID'), 30)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_Home'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_OtherActionRequired'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_OtherActionRequired'), 0, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_OtherActionRequired_ViewGroup'), 0, FailureHandling.OPTIONAL)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_SearchBar'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_SearchBar'), stpId.substring(8), 30)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CaseListing0'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_MAYA'), 0)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

/*Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_BackArrow'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_ChatIcon'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_StarIcon'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_ThreeDots'), 0)*/

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CaseDetailsTimelinetext'), 'Pending Ref Index Creation in WoLOC', FailureHandling.CONTINUE_ON_FAILURE)
// Expand to verify the previous status of Add to CCRIS
Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_DownArrow'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_FullStatus'), 'Pending creation of Ref Index in WoLOC.', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CCRIS_0'), 'Pending Ref Index Creation in WoLOC', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CCRIS_1'), 'Unsatisfactory AIP', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_UpArrow'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_STPID'), stpId, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_PurchaseAmount'), 'Purchase Amount', FailureHandling.CONTINUE_ON_FAILURE)

String propertyPrice = 'RM '+GlobalVariable.PropertPriceInputText
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_PropertyAmountValue'), propertyPrice, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_MonthlyInstalment'), 'Monthly Instalment', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_MonthlyInstallmentValue'), 'RM 0.00', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_FinancingAmountValue'), 'RM 0.00', FailureHandling.CONTINUE_ON_FAILURE)

if (noOfAplicants.equalsIgnoreCase('2')) {
	
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_MainApplicantNameValue'), GlobalVariable.ID_Number_MainApplicant, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_JointApplicantNameValue'), GlobalVariable.ID_Number_JointApplicant, FailureHandling.CONTINUE_ON_FAILURE)

}else if (noOfAplicants.equalsIgnoreCase('1')) {

	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_MainApplicantNameValue'), GlobalVariable.MainApplicant, FailureHandling.CONTINUE_ON_FAILURE)
	
}


if (financingType.equalsIgnoreCase('Islamic Financing')) {
	
	//validate financing amount and intending financial amountvalue
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_FinancingAmount'), 'Financing Amount', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_ProfitRate'), 'Profit Rate', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_ProfitrateValue'), GlobalVariable.InterestrateAplicationEligiblityPage,  FailureHandling.CONTINUE_ON_FAILURE)
	   
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_BanksSellingPrice'), 'Bank\'s Selling Price', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_BankSellingPriceValue'), 'RM 0.00', FailureHandling.CONTINUE_ON_FAILURE)

	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_FinaningPeriod'), 'Financing Period', FailureHandling.CONTINUE_ON_FAILURE)
	
	String financingperiod = GlobalVariable.FinancingPeriodYears+ ' Years'
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_FinancingPeriodValue'), financingperiod, FailureHandling.CONTINUE_ON_FAILURE)
	
	} else if (financingType.equalsIgnoreCase('Conventional Financing')) {
	
	//validate financing amount and intending financial amountvalue
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_LoanAmount'), 'Loan Amount', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_InterestRate'), 'Interest Rate', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_InterestRateValue'), GlobalVariable.Interestrate, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_LoanPeriod'), 'Loan Period', FailureHandling.CONTINUE_ON_FAILURE)
	
	String financingperiod = GlobalVariable.FinancingPeriodYears + ' YEARS'
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_LoadPeriodValue'), financingperiod, FailureHandling.CONTINUE_ON_FAILURE)
	
	}
	CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)
	
	Mobile.takeScreenshot(FailureHandling.OPTIONAL)
	
	Mobile.closeApplication()