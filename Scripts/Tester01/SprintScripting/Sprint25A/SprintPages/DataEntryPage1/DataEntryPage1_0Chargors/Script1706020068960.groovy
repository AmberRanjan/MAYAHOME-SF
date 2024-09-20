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

String Owner = GlobalVariable.Owner
if (Owner.equalsIgnoreCase('Main Applicant, Joint Applicant and other person(s)')) {
	
	//verify main applicant chargor details
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Name']), 'Name', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_NameValue_MainApp'), GlobalVariable.CustomerName_MainApplicant, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'ID Type']), 'ID Type', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_IDTypeValue_MainApp'), GlobalVariable.ID_Type, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'ID Number']), 'ID Number', FailureHandling.CONTINUE_ON_FAILURE)
	
	String idNumber_Main = Mobile.getText(findTestObject('Object Repository/Tester01/DataEntry/txt_IDNumberValue_MainApp'), 30, FailureHandling.CONTINUE_ON_FAILURE).replace("-", "")
	
	Mobile.verifyMatch(GlobalVariable.ID_Number_MainApplicant, idNumber_Main, true, FailureHandling.CONTINUE_ON_FAILURE)
		
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'OCISS Status']), 'OCISS Status', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_OCISSValue_MainApp'), 'Normal', FailureHandling.CONTINUE_ON_FAILURE)
	
	//verify joint applicant chargor details
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_2', [('variable') : 'Name']), 'Name', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_NameValue_JointApp'), GlobalVariable.CustomerName_JointApplicant, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_2', [('variable') : 'ID Type']), 'ID Type', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_IDTypeValue_JointApp'), GlobalVariable.ID_Type, FailureHandling.CONTINUE_ON_FAILURE)
		
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_2', [('variable') : 'ID Number']), 'ID Number', FailureHandling.CONTINUE_ON_FAILURE)
	
	String idNumber_Joint = Mobile.getText(findTestObject('Object Repository/Tester01/DataEntry/txt_IDNumberValue_JointApp'), 30, FailureHandling.CONTINUE_ON_FAILURE).replace("-", "")
	
	Mobile.verifyMatch(GlobalVariable.ID_Number_JointApplicant, idNumber_Joint, true, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_2', [('variable') : 'OCISS Status']), 'OCISS Status', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_OCISSValue_JointApp'), 'Normal', FailureHandling.CONTINUE_ON_FAILURE)
	
	CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.45)
	
} else if (Owner.equalsIgnoreCase('Main Applicant and other person(s)')) {
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Name']), 'Name', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_NameValue_MainApp'), GlobalVariable.CustomerName_MainApplicant, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'ID Type']), 'ID Type', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_IDTypeValue_MainApp'), GlobalVariable.ID_Type, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'ID Number']), 'ID Number', FailureHandling.CONTINUE_ON_FAILURE)
	
	String idNumber_Main = Mobile.getText(findTestObject('Object Repository/Tester01/DataEntry/txt_IDNumberValue_MainApp'), 30, FailureHandling.CONTINUE_ON_FAILURE).replace("-", "")
	
	Mobile.verifyMatch(GlobalVariable.ID_Number_MainApplicant, idNumber_Main, true, FailureHandling.CONTINUE_ON_FAILURE)
		
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'OCISS Status']), 'OCISS Status', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_OCISSValue_MainApp'), 'Normal', FailureHandling.CONTINUE_ON_FAILURE)
	
	CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.55)
	
}else  if (Owner.equalsIgnoreCase('Joint Applicant and other person(s)')) {
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Name']), 'Name', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_NameValue_MainApp'), GlobalVariable.CustomerName_JointApplicant, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'ID Type']), 'ID Type', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_IDTypeValue_MainApp'), GlobalVariable.ID_Type, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'ID Number']), 'ID Number', FailureHandling.CONTINUE_ON_FAILURE)
	
	String idNumber_Joint = Mobile.getText(findTestObject('Object Repository/Tester01/DataEntry/txt_IDNumberValue_MainApp'), 30, FailureHandling.CONTINUE_ON_FAILURE).replace("-", "")
	
	Mobile.verifyMatch(GlobalVariable.ID_Number_JointApplicant, idNumber_Joint, true, FailureHandling.CONTINUE_ON_FAILURE)
		
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'OCISS Status']), 'OCISS Status', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/DataEntry/txt_OCISSValue_MainApp'), 'Normal', FailureHandling.CONTINUE_ON_FAILURE)
	
	CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.55)
	
}


Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Tester01/DataEntry/btn_ConfirmAndNext'), 0)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

