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

Mobile.startExistingApplication('com.maybank2u.salesforce.uatent')

Mobile.delay(10)

String noOfApplicants = GlobalVariable.Applicants_No

WebUI.callTestCase(findTestCase('Test Cases/Tester01/Pages/PropertyDetailsPage3/PropertyDetailsPage3_Listed'), [:], FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.callTestCase(findTestCase('Tester01/Pages/PropertyDetailsPage1/PropertyDetailsPage1'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
WebUI.callTestCase(findTestCase('Tester01/Pages/ApplicantEligiblityPage/STPSoftFailPage_EligiblityPage'), [:], FailureHandling.CONTINUE_ON_FAILURE)

if (noOfApplicants.equalsIgnoreCase('1')) {
	
WebUI.callTestCase(findTestCase('Tester01/Pages/IncomeAndCommitmentDetails/IncomeAndCommitmentDetails_1Applicant'), [:], FailureHandling.CONTINUE_ON_FAILURE)

}

else if (noOfApplicants.equalsIgnoreCase('2')) {
	
	WebUI.callTestCase(findTestCase('Tester01/Pages/IncomeAndCommitmentDetails/IncomeAndCommitmentDetails_2Applicants'), [:], FailureHandling.CONTINUE_ON_FAILURE)
}
WebUI.callTestCase(findTestCase('Test Cases/Tester01/Pages/ApplicantEligiblityPage/BauSoftFailStage_SuccessPage'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/Tester01/Pages/ApplicantEligiblityPage/ZReusableMethods/ProceedWithdataEntry'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.callTestCase(findTestCase('Tester02_New/Pages/Results_Screens/STP_Pass/BrachNamePage'), [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.callTestCase(findTestCase('Tester02_New/Pages/Results_Screens/STP_Pass/BranchName_SuccessPage'), [:], FailureHandling.CONTINUE_ON_FAILURE)

/*Mobile.callTestCase(findTestCase('Tester02_New/Pages/DataEntryPages/DataEntryPage2/DataEntryPage2_Validation_Full'), [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.callTestCase(findTestCase('Tester02_New/Pages/DataEntryPages/DataEntryPage3/DataEntryPage3_Validation_Full'), [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.callTestCase(findTestCase('Tester02_New/Pages/DataEntryPages/DataEntryPage4/DataEntryPage4_Validation_Full'), [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.callTestCase(findTestCase('Tester02_New/Pages/DataEntryPages/DataEntryPage5/DataEntryPage5_Validation_Full'), [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.callTestCase(findTestCase('Tester02_New/Pages/DataEntryPages/DataEntryPage5/DataEntryPage5_Confirmation_Validation_Full'), [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.callTestCase(findTestCase('Tester02_New/Pages/DataEntryPages/DataEntryPage6/DataEntryPage6_Validation_Full'), [:],
FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Tester02_New/Pages/DataEntryPages/DataEntryPage6/DataEntryPage6_Confirmation_Validation_Full'),
		[:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Tester02_New/Pages/DataEntryPages/ReviewPage/ReviewPage_Validation_Full'), [:], FailureHandling.CONTINUE_ON_FAILURE)*/

Mobile.delay(120)
Mobile.callTestCase(findTestCase('Tester02_New/Pages/DataEntryPages/DataEntryCompletedPage/DataEntryCompletedPage_Validation_Full'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Tester02_New/Pages/PropertyInsurancePage/PropertyInsurancePage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/Tester01/Pages/AddToCCRIS/ReusableMethods/PropertyInsuranceConfirmation'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Tester03/Pages/EDD Summary Page/EDDSummaryPage_Boolean_Validation'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/Tester01/Pages/SubmitToManager/SubmitToManager_BAU'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/Tester01/Pages/AddToCCRIS/CasePage/UnSatisfactoryAIP_SubmitToManager_SoftFail'), [:], FailureHandling.STOP_ON_FAILURE)


