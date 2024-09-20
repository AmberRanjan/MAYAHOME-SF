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

Mobile.startExistingApplication('com.maybank2u.salesforce.uatent')

Mobile.delay(10)

/*Mobile.setText(findTestObject('Object Repository/Tester01/CommonElements/input_PFNumber'), '80008113', 0)

Mobile.setText(findTestObject('Object Repository/Tester01/CommonElements/input_Password'), 'Tester1', 0)

Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/btn_Login'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_Mortgage'), 'Mortgage')

Mobile.delay(30)*/

String noOfApplicants = GlobalVariable.Applicants_No

/*WebUI.callTestCase(findTestCase('Tester01/Pages/PropertyDetailsPage1/PropertyDetailsPage1'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	
WebUI.callTestCase(findTestCase('Test Cases/Tester01/Pages/ApplicantEligiblityPage/StpPassStage_SuccessPage'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/Tester01/Pages/ApplicantEligiblityPage/ZReusableMethods/ProceedWithdataEntry'), [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.callTestCase(findTestCase('Tester02_New/Pages/Results_Screens/STP_Pass/BrachNamePage'), [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.callTestCase(findTestCase('Tester02_New/Pages/Results_Screens/STP_Pass/BranchName_SuccessPage'), [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.callTestCase(findTestCase('Tester02_New/Pages/DataEntryPages/DataEntryPage2/DataEntryPage2_Validation_Full'), [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.callTestCase(findTestCase('Tester02_New/Pages/DataEntryPages/DataEntryPage3/DataEntryPage3_Validation_Full'), [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.callTestCase(findTestCase('Tester02_New/Pages/DataEntryPages/DataEntryPage4/DataEntryPage4_Validation_Full'), [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.callTestCase(findTestCase('Tester02_New/Pages/DataEntryPages/DataEntryPage5/DataEntryPage5_Validation_Full'), [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.callTestCase(findTestCase('Tester02_New/Pages/DataEntryPages/DataEntryPage5/DataEntryPage5_Confirmation_Validation_Full'), [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.callTestCase(findTestCase('Tester02_New/Pages/DataEntryPages/DataEntryPage6/DataEntryPage6_Validation_Full'), [:],
FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Tester02_New/Pages/DataEntryPages/DataEntryPage6/DataEntryPage6_Confirmation_Validation_Full'),
		[:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Tester02_New/Pages/DataEntryPages/ReviewPage/ReviewPage_Validation_Full'), [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.callTestCase(findTestCase('Tester02_New/Pages/DataEntryPages/DataEntryCompletedPage/DataEntryCompletedPage_Validation_Full'), [:], FailureHandling.STOP_ON_FAILURE)*/
	
WebUI.callTestCase(findTestCase('Tester02_New/Pages/PropertyInsurancePage/PropertyInsurancePage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/Tester01/Pages/AddToCCRIS/ReusableMethods/LetterOfOffer'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/Tester01/Pages/SubmitToManager/SubmitToManager_STP'), [:], FailureHandling.STOP_ON_FAILURE)

//WebUI.callTestCase(findTestCase('Test Cases/Tester03/Pages/Manager Flow/Manager Flow_OneApplicant_STP_Pass_Approved_Full'), [:], FailureHandling.STOP_ON_FAILURE)

