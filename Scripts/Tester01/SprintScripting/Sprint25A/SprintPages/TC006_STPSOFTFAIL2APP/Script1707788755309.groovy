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


//Mobile.startExistingApplication('com.maybank2u.salesforce.uatent')

WebUI.callTestCase(findTestCase('Tester01/SprintScripting/Sprint25A/SprintPages/COBSingleApplicantHappyFlow'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Tester01/SprintScripting/Sprint25A/SprintPages/PropertyDetails'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/Tester01/Pages/ApplicantEligiblityPage/STPSoftFailPage_EligiblityPage'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Tester01/SprintScripting/Sprint25A/SprintPages/IncomeAndCommitmentHappyFlow'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/Tester01/Pages/ApplicantEligiblityPage/STPSoftFailPage_SuccessPage'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/Tester01/Pages/ApplicantEligiblityPage/ZReusableMethods/ProceedWithdataEntry'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Tester02_New/Pages/Results_Screens/STP_Pass/BrachNamePage'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Tester02_New/Pages/Results_Screens/STP_Pass/BranchName_SuccessPage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/Tester01/SprintScripting/Sprint25A/SprintPages/DataEntryPage1/DataEntryPage1_0Chargors'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Tester01/SprintScripting/Sprint25A/SprintPages/DataEntryPage2_Validation_Full'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Tester01/SprintScripting/Sprint25A/SprintPages/DataEntryPage3_Validation_HappyFlow'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Tester01/SprintScripting/Sprint25A/SprintPages/DataEntryPage4_Validation_HappyFlow'), [:],  FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Tester01/SprintScripting/Sprint25A/SprintPages/DataEntryPage5_Validation_HappyFlow'), [:],  FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Tester01/SprintScripting/Sprint25A/SprintPages/DataEntryPage6_Validation_HappyFlow'), [:],  FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Tester01/SprintScripting/Sprint25A/SprintPages/ReviewPage_Validation_HappyFlow'), [('Page') : 'DataEntry'],
	FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Tester02_New/Pages/DataEntryPages/DataEntryCompletedPage/DataEntryCompletedPage_Validation_Full'), [:], FailureHandling.CONTINUE_ON_FAILURE)
 
WebUI.callTestCase(findTestCase('Tester02_New/Pages/PropertyInsurancePage/PropertyInsurancePage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/Tester01/Pages/AddToCCRIS/ReusableMethods/LetterOfOffer'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/Tester01/Pages/SubmitToManager/SubmitToManager_STP'), [:], FailureHandling.STOP_ON_FAILURE)

//WebUI.callTestCase(findTestCase('Test Cases/Tester03/Pages/Manager Flow/Manager Flow_OneApplicant_STP_Pass_Approved_Full'), [:], FailureHandling.STOP_ON_FAILURE)
