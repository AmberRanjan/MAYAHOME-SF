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

String noOfApplicants = GlobalVariable.Applicants_No

String financingType = GlobalVariable.financingType

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

if (noOfApplicants.equalsIgnoreCase("1")) {
Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_Applicanteligiblity1'), 30)
Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_Applicanteligiblity2'), 
    'Based on their details, they\'re not eligible for this financing. View Reasons')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_Applicationeligiblity3'), 
    'You can prompt them to consider the following options to help improve their eligibility or process this case manually.')

Mobile.verifyElementNotExist(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_JointApplicant'), 0)

Mobile.verifyElementNotExist(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_JointApplicantName'), 0)

}else if (noOfApplicants.equalsIgnoreCase("2")) {
	
	Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_2APPDescription1'), 30)
	
Mobile.takeScreenshot(FailureHandling.OPTIONAL)

	Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_2APPDescription2'), 0)

	Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_2APPDescription3'), 0)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_JointApplicant'), 'Joint Applicant')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_JointApplicantName'), GlobalVariable.CustomerName_JointApplicant)
}	

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)
Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_UpdateIncomeDetails'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_Processmanually'), 0)
CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)

if (financingType.equalsIgnoreCase('Islamic Financing')) {
	
	Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_EditFinancingDetails'),
		0)
} else if (financingType.equalsIgnoreCase('Conventional Financing')) {
	Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_EditLoanDetails'),
		0)
}

Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_DeleteApplication'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_SaveasDraft'), 0)

WebUI.callTestCase(findTestCase('Test Cases/Tester01/Pages/ApplicantEligiblityPage/ZReusableMethods/EligiblitySuccessScreen/CustomerSelectionEligiblity'), [:], FailureHandling.STOP_ON_FAILURE)


