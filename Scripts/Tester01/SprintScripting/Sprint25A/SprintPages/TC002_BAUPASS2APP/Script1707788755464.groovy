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

/*WebUI.callTestCase(findTestCase('Tester01/SprintScripting/Sprint25A/SprintPages/COBSingleApplicantHappyFlow'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Tester01/SprintScripting/Sprint25A/SprintPages/PropertyDetails'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/Tester01/Pages/ApplicantEligiblityPage/BauPassStage_EligiblityPage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Tester01/SprintScripting/Sprint25A/SprintPages/IncomeAndCommitmentHappyFlow'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/Tester01/Pages/ApplicantEligiblityPage/BauPassStage_SuccessPage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/Tester01/Pages/ApplicantEligiblityPage/ZReusableMethods/ProceedWithdataEntry'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Tester02_New/Pages/Results_Screens/STP_Pass/BrachNamePage'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Tester02_New/Pages/Results_Screens/STP_Pass/BranchName_SuccessPage'), [:], FailureHandling.STOP_ON_FAILURE)*/

WebUI.callTestCase(findTestCase('Test Cases/Tester02_New/Pages/DataEntryPages/DataEntryPage1/DataEntryPage1_ValidationFull'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Tester01/SprintScripting/Sprint25A/SprintPages/DataEntryPage2_Validation_Full'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Tester01/SprintScripting/Sprint25A/SprintPages/DataEntryPage3_Validation_HappyFlow'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Tester01/SprintScripting/Sprint25A/SprintPages/DataEntryPage4_Validation_HappyFlow'), [:],  FailureHandling.CONTINUE_ON_FAILURE)
//go back to step1 of 6
Mobile.comment('Back to Page 4')
Mobile.tap(findTestObject('Object Repository/Tester01/DataEntry/btn_backDataEntry1'), 30, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.30, 0.70)

Mobile.delay(5)

Mobile.comment('Back to Page 3')
Mobile.tap(findTestObject('Object Repository/Tester01/DataEntry/btn_backDataEntry1'), 30, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.30, 0.70)

Mobile.delay(5)

Mobile.comment('Back to Page 2')
Mobile.tap(findTestObject('Object Repository/Tester01/DataEntry/btn_backDataEntry1'), 30, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.30, 0.70)

Mobile.delay(5)

Mobile.comment('Back to Page 1')
Mobile.tap(findTestObject('Object Repository/Tester01/DataEntry/btn_backDataEntry1'), 30, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)
CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)

Mobile.delay(5)

Mobile.comment('remove additional chargor')

Mobile.tap(findTestObject('Object Repository/Tester01/DataEntry/btn_Remove'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/DataEntry/btn_Remove'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementNotExist(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Additional Chargor']), 5, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)

Mobile.comment('go to page 2')
Mobile.tap(findTestObject('Object Repository/Tester01/DataEntry/btn_ConfirmAndNext'), 30, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)

Mobile.comment('go to page 3')
Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_button_SaveAndNext'),
		0)
CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)

Mobile.comment('go to page 4')
CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage3/DataEntryPage3_button_SaveAndNext'),
	0)

WebUI.callTestCase(findTestCase('Tester01/SprintScripting/Sprint25A/SprintPages/DataEntryPage4_Validation_HappyFlow'), [:],  FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Tester01/SprintScripting/Sprint25A/SprintPages/DataEntryPage5_Validation_HappyFlow'), [:],  FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Tester01/SprintScripting/Sprint25A/SprintPages/DataEntryPage6_Validation_HappyFlow'), [:],  FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Tester01/SprintScripting/Sprint25A/SprintPages/ReviewPage_Validation_HappyFlow'), [('Page') : 'DataEntry'],
	FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Tester02_New/Pages/DataEntryPages/DataEntryCompletedPage/DataEntryCompletedPage_Validation_Full'), [:], FailureHandling.STOP_ON_FAILURE)
	
WebUI.callTestCase(findTestCase('Tester02_New/Pages/PropertyInsurancePage/PropertyInsurancePage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/Tester01/Pages/AddToCCRIS/ReusableMethods/PropertyInsuranceConfirmation'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Tester03/Pages/EDD Summary Page/EDDSummaryPage_Boolean_Validation'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/Tester01/Pages/SubmitToManager/SubmitToManager_BAU'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/Tester01/Pages/AddToCCRIS/CasePage/UnSatisfactoryAIP_SubmitToManager_SoftFail'), [:], FailureHandling.STOP_ON_FAILURE)
