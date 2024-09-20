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

String financingType = GlobalVariable.financingType

String noOfAplicants = GlobalVariable.Applicants_No

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_MAYA'), 45)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

String stpId = Mobile.getText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_STPID'), 30)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_Home'), 30)

Mobile.delay(10)
Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_OtherActionRequired'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_OtherActionRequired'), 0, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_OtherActionRequired_ViewGroup'), 0, FailureHandling.OPTIONAL)

Mobile.delay(5)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_SearchBar'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_SearchBar'), stpId.substring(8), 30)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CaseListing0'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CaseListing0'), 30, FailureHandling.OPTIONAL)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_MAYA'), 0)

/*Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_BackArrow'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_ChatIcon'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_StarIcon'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_ThreeDots'), 0)*/

//Mobile.comment("Print the banksellingpricevalidation Global====================================================================="+GlobalVariable.BankSellingPriceAllipacationEligiblityPage)

//println("Print the banksellingpricevalidation Global====================================================================="+GlobalVariable.BankSellingPriceAllipacationEligiblityPage)

Mobile.callTestCase(findTestCase('Test Cases/Tester01/Pages/AddToCCRIS/ReusableMethods/BackToCaseManagerSubmission'), [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_STPID'), stpId, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_PurchaseAmount'), 'Purchase Amount', FailureHandling.CONTINUE_ON_FAILURE)

String propertyPrice = 'RM '+GlobalVariable.PropertPriceInputText

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_PropertyAmountValue'), propertyPrice, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_MonthlyInstalment'), 'Monthly Instalment', FailureHandling.CONTINUE_ON_FAILURE)

//Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_MonthlyInstallmentValue'), GlobalVariable.MonthlyInstallmentApplicationEligiblitypAge, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_MonthlyInstallmentValue'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_FinancingAmountValue'), GlobalVariable.FinancingAmountApplicantionEligiblityPage, FailureHandling.CONTINUE_ON_FAILURE)

if (noOfAplicants.equalsIgnoreCase('2')) {
	
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_MainApplicantNameValue'), GlobalVariable.MainApplicant, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_JointApplicantNameValue'), GlobalVariable.JointApplicant, FailureHandling.CONTINUE_ON_FAILURE)

}else if (noOfAplicants.equalsIgnoreCase('1')) {

	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_MainApplicantNameValue'), GlobalVariable.MainApplicant, FailureHandling.CONTINUE_ON_FAILURE)
	
}

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)

if (financingType.equalsIgnoreCase('Islamic Financing')) {
	
	//validate financing amount and intending financial amountvalue
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_FinancingAmount'), 'Financing Amount', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_ProfitRate'), 'Profit Rate', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_ProfitrateValue'), GlobalVariable.InterestrateAplicationEligiblityPage,  FailureHandling.CONTINUE_ON_FAILURE)
	   
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_BanksSellingPrice'), 'Bank\'s Selling Price', FailureHandling.CONTINUE_ON_FAILURE)
	
	//Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_BankSellingPriceValue'), GlobalVariable.BankSellingPriceAllipacationEligiblityPage, FailureHandling.CONTINUE_ON_FAILURE)
				
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_FinaningPeriod'), 'Financing Period', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_FinancingPeriodValue'), GlobalVariable.FinancingPeriodApplicantionEligiblityPage , FailureHandling.CONTINUE_ON_FAILURE)
	
	} else if (financingType.equalsIgnoreCase('Conventional Financing')) {
	
	//validate financing amount and intending financial amountvalue
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_LoanAmount'), 'Loan Amount', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_InterestRate'), 'Interest Rate', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_InterestRateValue'), GlobalVariable.InterestrateAplicationEligiblityPage, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_LoanPeriod'), 'Loan Period', FailureHandling.CONTINUE_ON_FAILURE)
		
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_LoadPeriodValue'), GlobalVariable.FinancingPeriodApplicantionEligiblityPage , FailureHandling.CONTINUE_ON_FAILURE)
	
	}
	
	CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)
	
	Mobile.takeScreenshot(FailureHandling.OPTIONAL)
	
Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_Home'), 0)

Mobile.delay(15)

//Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/SubmitToManager/btn_3linesA'), 60)

//Mobile.tap(findTestObject('Object Repository/Tester01/SubmitToManager/btn_LogOut'), 0)
	