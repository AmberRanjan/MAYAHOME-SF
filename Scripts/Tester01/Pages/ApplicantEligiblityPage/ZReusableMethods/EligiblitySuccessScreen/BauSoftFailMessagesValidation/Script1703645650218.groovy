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

String propertyType = GlobalVariable.PropertyType

String noOfApplicants = GlobalVariable.Applicants_No

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_BAU'), 0)
Mobile.takeScreenshot(FailureHandling.OPTIONAL)


Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_BAU'), 'BAU')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_SOFTFAIL'), 'SOFT FAIL')

if (noOfApplicants.equalsIgnoreCase("1")) {
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_ApplicableForDiffAmountMessage1_1Applicant'),
		'Your applicant is eligible for a different amount')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_AgreeableMessage_Applicant1'), 
		'if your applicant is agreeable to this offer, you may proceed with the data entry and submit it to your manager for approval.')
	
}else if (noOfApplicants.equalsIgnoreCase("2")) {
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_ApplicableForDiffAmountMessage1_2Applicant'),
		'Your applicants are eligible for a different amount')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_AgreeableMessage_Applicant2'),
		'If your applicants are agreeable to this offer, you may proceed with the data entry and submit it to your manager for approval.')
}

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_ApplicableForDiffAmountMessage2'),
	'The amount suggested is different than the applied amount and period. View BAU Reasons')


if (propertyType.equalsIgnoreCase('ListedProperty')) {
	// if listed Message 4 should not exist
	Mobile.verifyElementNotExist(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_BauPassMessage4'),
		
		0) // if non listed Message 4 should exist
} else if (propertyType.equalsIgnoreCase('NonListedProperty')) {
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_BauPassMessage4'),
		'Note: This result is subject to the valuation of the property price declared.')
}

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

