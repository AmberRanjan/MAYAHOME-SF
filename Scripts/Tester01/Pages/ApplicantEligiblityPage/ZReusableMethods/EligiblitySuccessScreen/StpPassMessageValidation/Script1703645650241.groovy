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

import ch.qos.logback.core.joran.conditional.ElseAction
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

String propertyType = GlobalVariable.PropertyType

String financingType = GlobalVariable.financingType

String noOfApplicants = GlobalVariable.Applicants_No

Mobile.verifyElementText(findTestObject('Tester01/ApplicationEligiblityPage/txt_STP'), 'STP')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_PASS'), 'PASS')

if (noOfApplicants.equalsIgnoreCase("1")) {
	
if (financingType.equalsIgnoreCase('Islamic Financing')) {
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_BauPassMessage1Islamic_Applicant1'), 'Great news, your applicant is eligible for this financing!')

	} else if (financingType.equalsIgnoreCase('Conventional Financing')) {
	
		Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_BauPassMessage1Conventional_Applicant1'), 'Great news, your applicant is eligible for this loan!')
	}

}else if (noOfApplicants.equalsIgnoreCase("2")) {
	
	if (financingType.equalsIgnoreCase('Islamic Financing')) {
		
		Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_BauPassMessage1Islamic_Applicant2'), 'Great news, your applicants are eligible for this financing!')
	
		} else if (financingType.equalsIgnoreCase('Conventional Financing')) {
		
			Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_BauPassMessage1Conventional_Applicant2'), 'Great news, your applicants are eligible for this loan!')
		}
}

Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_StpMessage2'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_BauPassMessage3'), 'Please find the details below:')
