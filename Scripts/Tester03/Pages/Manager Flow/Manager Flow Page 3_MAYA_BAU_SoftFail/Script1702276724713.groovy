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

String noOfAplicants = GlobalVariable.Applicants_No

String financingType = GlobalVariable.financingType


Mobile.delay(10)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03/Manager Flow/MAYA Page/MAYAPage_text_ApplicantName'), 
    0)

Mobile.takeScreenshot()

ApplicantNameMAYA = Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/MAYA Page/MAYAPage_text_ApplicantName'),  0)

assert ApplicantNameMAYA.contains(ApplicantNamePendingRequest)

if (noOfAplicants.equalsIgnoreCase('2')) {
	
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_MainApplicantNameValue'), GlobalVariable.MainApplicant, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_JointApplicantNameValue'), GlobalVariable.JointApplicant, FailureHandling.CONTINUE_ON_FAILURE)

}else if (noOfAplicants.equalsIgnoreCase('1')) {

	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_MainApplicantNameValue'), GlobalVariable.MainApplicant, FailureHandling.CONTINUE_ON_FAILURE)
	
}
//resource id yet to be added
//Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CaseDetailsDisplay'), GlobalVariable.PropertyNameInputTextApplicationPage)


Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CaseDetailsTimelinetext'), 'Pending Manager’s Approval', FailureHandling.CONTINUE_ON_FAILURE)
// Expand to verify the previous status of Add to CCRIS
Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_DownArrow'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_FullStatus'), 'Pending manager to complete data entry and EDD Summary review.', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CCRIS_0'), 'Pending Manager’s Approval', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CCRIS_1'), 'Pending Processing', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CCRIS_2'), 'Unsatisfactory AIP', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_UpArrow'), 30, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_UpArrow'), 30, FailureHandling.OPTIONAL)

String stpId = GlobalVariable.StpId
stpId = stpId.substring(8)
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_STPID'), stpId, FailureHandling.CONTINUE_ON_FAILURE)

if (Mobile.verifyElementExist(findTestObject('Object Repository/Tester03/Manager Flow/MAYA Page/MAYAPage_text_CaseDetailsTimeLineStatusText_Pending Managers Approval'), 
    10, FailureHandling.OPTIONAL)) {
    Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03/Manager Flow/MAYA Page/MAYAPage_text_CaseDetailsTimeLineStatusText_Pending Managers Approval'), 
        0)

    CaseDetailsTimeLineDate = Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/MAYA Page/MAYAPage_text_CaseDetailsTimeLineDate'), 
        0).replaceAll('Updated: ', '')

    Mobile.takeScreenshot()
	
	if(CaseDetailsTimeLineDate.contains('PM')) {
		CaseDetailsTimeLineDate_New = CaseDetailsTimeLineDate.replaceFirst('PM', ' PM')
		
	}else {
		CaseDetailsTimeLineDate_New = CaseDetailsTimeLineDate.replaceFirst('AM', ' AM')
	}
} else {
    Mobile.tap(findTestObject('Object Repository/Tester03/Manager Flow/MAYA Page/MAYAPage_button_DropDownArrow'), 0)

    Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03/Manager Flow/MAYA Page/MAYAPage_text_DraftListItemDetailStatusShortStatus_1'), 
        0)

    Mobile.takeScreenshot()

    DraftListItemDetailStatusDate = Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/MAYA Page/MAYAPage_text_DraftListItemDetailStatusDate'), 
        0)

    String a = DraftListItemDetailStatusDate

    if (a.contains('11')) {
        a = a.replace('11', 'Nov')
    }
    
    println(a)

    a = a.replaceFirst('/', ' ')

    println(a)

    a = a.replace('/', ' ')

    println(a)

    a = a.replace(' .', ',')

    println(a)

    DraftListItemDetailStatusDate_New = a

    Mobile.tap(findTestObject('Object Repository/Tester03/Manager Flow/MAYA Page/MAYAPage_text_DraftListItemDetailStatusUpArrow'), 
        0)

    Mobile.takeScreenshot()
}

CaseDetailsAANumber = Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/MAYA Page/MAYAPage_text_CaseDetailsAANumber'), 
    0)


Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_PurchaseAmount'), 'Purchase Amount', FailureHandling.CONTINUE_ON_FAILURE)

String propertyPrice = 'RM '+GlobalVariable.PropertPriceInputText
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_PropertyAmountValue'), propertyPrice, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_MonthlyInstalment'), 'Monthly Instalment', FailureHandling.CONTINUE_ON_FAILURE)

//Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_MonthlyInstallmentValue'), GlobalVariable.MonthlyInstallmentApplicationEligiblitypAge, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_MonthlyInstallmentValue'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_FinancingAmountValue'), GlobalVariable.FinancingAmountApplicantionEligiblityPage, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)

if (financingType.equalsIgnoreCase('Islamic Financing')) {
	
	//validate financing amount and intending financial amountvalue
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_FinancingAmount'), 'Financing Amount', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_ProfitRate'), 'Profit Rate', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_ProfitrateValue'), GlobalVariable.InterestrateAplicationEligiblityPage,  FailureHandling.CONTINUE_ON_FAILURE)
	   
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_BanksSellingPrice'), 'Bank\'s Selling Price', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_BankSellingPriceValue'), GlobalVariable.BankSellingPriceAllipacationEligiblityPage, FailureHandling.CONTINUE_ON_FAILURE)
				
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

Mobile.callTestCase(findTestCase('Tester03/Pages/Manager Flow/Manager Flow Page_Documents And Files'), [:], FailureHandling.OPTIONAL)

Mobile.callTestCase(findTestCase('Tester03/Pages/Manager Flow/Manager Flow Page_WoLOC Notes'), [('CaseDetailsSTP') : GlobalVariable.StpId
        , ('CaseDetailsAANumber') : CaseDetailsAANumber], FailureHandling.OPTIONAL)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Tester03/Manager Flow/MAYA Page/MAYAPage_button_Review Application'), 0)

Mobile.delay(10)

return CaseDetailsTimeLineDate_New

