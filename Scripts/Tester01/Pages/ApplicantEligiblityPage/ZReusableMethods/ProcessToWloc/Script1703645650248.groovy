import internal.GlobalVariable

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

String CaseRouteToWoLOC = GlobalVariable.CaseRouteToWoLOC

String ProcessToWoLOCStatus = GlobalVariable.ProcessToWoLOCStatus

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_CaseRoutedtoWoLOC'), 'Case Routed to WoLOC')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_MessageDisplay1'), 'The case will be routed to WoLOC after selecting a branch to proceed.\n\nYou’ll find this case in the MAE in-tray in WoLOC and you’ll no longer be able to update this case in Sales2u.\n\nAre you sure you want to proceed?')

if (CaseRouteToWoLOC.equalsIgnoreCase('Cancel')) {
	
	Mobile.tap(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_Cancel'), 0)	
	
}else if(CaseRouteToWoLOC.equalsIgnoreCase('Proceed')) {
	
	Mobile.tap(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_Proceed'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_BranchnameHeading'), 'Branch name')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_ToProceedMsg'), 'To proceed, please assign a branch for your applicant')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_BranchnameDefaultValue'), 'Branch name')

Mobile.tap(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_BranchnameDefaultValue'), 0)

Mobile.setText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_EditText'), GlobalVariable.branchName, 0)

Mobile.tap(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/drpDownOption_BranchName', [('branchName') : GlobalVariable.branchName]), 0)

Mobile.tap(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_Submit'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_CaseCreationCompleted'),
	'Case Creation Completed')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_CaseCreationMessage'),
	'Please route the case to WoLOC to continue processing.')

if (ProcessToWoLOCStatus.equalsIgnoreCase('ProcessInWoLOC')) {
	
	Mobile.tap(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_ProcessinWoLOC'), 0)
	
	
} else if (ProcessToWoLOCStatus.equalsIgnoreCase('BackToCase')) {

	
	Mobile.tap(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_BacktoCase'), 0)
	
}

}
