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

String financingType = GlobalVariable.financingType

String propertyType = GlobalVariable.PropertyType

String noOfAplicants =GlobalVariable.Applicants_No

String testFlow = GlobalVariable.testFlow

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

if (propertyType.equalsIgnoreCase('ListedProperty')) {
	// if listed display property name
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_DeveloperNameValidation'),
		GlobalVariable.PropertyNameInputText, FailureHandling.CONTINUE_ON_FAILURE)
} else if (propertyType.equalsIgnoreCase('NonListedProperty')) {
	// if non listed display property name
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_DeveloperNameValidation'),
		GlobalVariable.DevelopmentNameInputText, FailureHandling.CONTINUE_ON_FAILURE)
}

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_ApplicantNameValidation'),
	GlobalVariable.CustomerName_MainApplicant, FailureHandling.CONTINUE_ON_FAILURE)

GlobalVariable.StpId = Mobile.getText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_STPValidation'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/arrow_ConfidentialData'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Check DSR is less than 60%'
Mobile.tap(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/arrow_ConfidentialData'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_Confirm'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_IncomeAndCommitment'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_DSRDescription'), 0, FailureHandling.CONTINUE_ON_FAILURE)

String DSRvalue = Mobile.getText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_DSRvalue'), 0, FailureHandling.CONTINUE_ON_FAILURE).replace("%", "")

float DSR = Float.parseFloat(DSRvalue.replace(" ", ""))

Mobile.verifyLessThan(DSR, 60.00, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_IncomeAndCommitment'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify product details'
Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/txt_Application'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/txt_ProductDetails'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Financing Type']), 'Financing Type', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1', [('variable') : 'Financing Plan']), 'Financing Plan', FailureHandling.CONTINUE_ON_FAILURE)

String financingTypeConfirmationValidation = GlobalVariable.financingType	
financingTypeConfirmationValidation = financingTypeConfirmationValidation.replace(" ", "").replace("Financing","")
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/txt_FinancingTypeValue'),
	financingType, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/txt_FinancingPlanValue'),
	GlobalVariable.FinancingPlan, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/txt_ProductDetails'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_ConfidentialData'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Tester01/Pages/ApplicantEligiblityPage/ZReusableMethods/PropertyPrice'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Tester01/Pages/ApplicantEligiblityPage/ZReusableMethods/FinancingAmount'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Tester01/Pages/ApplicantEligiblityPage/ZReusableMethods/FinancingPeriod'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Tester01/Pages/ApplicantEligiblityPage/ZReusableMethods/Downpayment'), [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)

WebUI.callTestCase(findTestCase('Tester01/Pages/ApplicantEligiblityPage/ZReusableMethods/InterestRate'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Tester01/Pages/ApplicantEligiblityPage/ZReusableMethods/MonthlyInstalment'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Tester01/Pages/ApplicantEligiblityPage/ZReusableMethods/BankSellingPrice'), [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)

if (noOfAplicants.equalsIgnoreCase('2')) {

	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_JointApplicant'), 'Joint Applicant', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_JointApplicantName'), GlobalVariable.CustomerName_JointApplicant,FailureHandling.CONTINUE_ON_FAILURE)
	
}else if (noOfAplicants.equalsIgnoreCase('1')) {
	Mobile.verifyElementNotExist(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_JointApplicant'), 0, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementNotExist(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_JointApplicantName'), 0, FailureHandling.CONTINUE_ON_FAILURE)
}

if (testFlow.equalsIgnoreCase('StpPass')) {
	
	Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_ProceedWithDataEntry'),	0, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_SaveasDraft'), 0, FailureHandling.CONTINUE_ON_FAILURE)
	
	
}else if (testFlow.equalsIgnoreCase('StpSoftfail')) {
			
		if (financingType.equalsIgnoreCase('Islamic Financing')) {
			
			Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_EditFinancingDetails'),
				0, FailureHandling.CONTINUE_ON_FAILURE)
		} else if (financingType.equalsIgnoreCase('Conventional Financing')) {
			
			Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_EditLoanDetails'), 0, FailureHandling.CONTINUE_ON_FAILURE)
		}
		
		Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_Processmanually'),
			0, FailureHandling.CONTINUE_ON_FAILURE)
	
		if (GlobalVariable.SuccessPage =='yes') {
		Mobile.verifyElementNotExist(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_UpdateIncomeDetails'),
			0, FailureHandling.CONTINUE_ON_FAILURE)
		}else if (GlobalVariable.SuccessPage =='No') {
			Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_UpdateIncomeDetails'),
			0, FailureHandling.CONTINUE_ON_FAILURE)
		}
		
		Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_SaveasDraft'), 0, FailureHandling.CONTINUE_ON_FAILURE)
		
	    Mobile.verifyElementNotExist(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_ProceedwithApplication'),
				0, FailureHandling.CONTINUE_ON_FAILURE)
	    Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_ProceedWithDataEntry'),
				0, FailureHandling.CONTINUE_ON_FAILURE)
}else {

	//commented since non liste dproperties also follow listed page view
  //if (propertyType.equalsIgnoreCase('ListedProperty')) {
		
		if (financingType.equalsIgnoreCase('Islamic Financing')) {
			
			Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_EditFinancingDetails'),
				0, FailureHandling.CONTINUE_ON_FAILURE)
		} else if (financingType.equalsIgnoreCase('Conventional Financing')) {
			
			Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_EditLoanDetails'), 0, FailureHandling.CONTINUE_ON_FAILURE)
		}
		
		Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_Processmanually'),
			0, FailureHandling.CONTINUE_ON_FAILURE)
	
		Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_AlternativeMessage'),
			0, FailureHandling.CONTINUE_ON_FAILURE)
	
		Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_SaveasDraft'), 0, FailureHandling.CONTINUE_ON_FAILURE)
		
		if (GlobalVariable.SuccessPage =='yes') {
			Mobile.verifyElementNotExist(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_ProceedwithApplication'),
				0, FailureHandling.CONTINUE_ON_FAILURE)
			Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_ProceedWithDataEntry'),
				0, FailureHandling.CONTINUE_ON_FAILURE)
		}else if (GlobalVariable.SuccessPage =='No') {
			Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_ProceedwithApplication'),
				0, FailureHandling.CONTINUE_ON_FAILURE)
			Mobile.verifyElementNotExist(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_ProceedWithDataEntry'),
				0, FailureHandling.CONTINUE_ON_FAILURE)
		}
	
		//commented since non liste dproperties also follow listed page view
	/*} else if (propertyType.equalsIgnoreCase('NonListedProperty')) {
		
		if (financingType.equalsIgnoreCase('Islamic Financing')) {
			
			Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_EditFinancingDetails'),
				0, FailureHandling.CONTINUE_ON_FAILURE)
		} else if (financingType.equalsIgnoreCase('Conventional Financing')) {
			
			Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_EditLoanDetails'),
				0, FailureHandling.CONTINUE_ON_FAILURE)
		}
		
		Mobile.verifyElementNotExist(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_ProceedwithApplication'),
			0, FailureHandling.CONTINUE_ON_FAILURE)
	
		Mobile.verifyElementNotExist(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_ProceedwithDataEntry'),
			0, FailureHandling.CONTINUE_ON_FAILURE)
	
		Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_ProcessmanuallyInWoLoc'),
			0, FailureHandling.CONTINUE_ON_FAILURE)
	
		Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_SaveasDraft'), 0, FailureHandling.CONTINUE_ON_FAILURE)
	
		Mobile.verifyElementNotExist(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_AlternativeMessage'),
			0, FailureHandling.CONTINUE_ON_FAILURE)
	
		Mobile.verifyElementNotExist(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/btn_Processmanually'),
			0, FailureHandling.CONTINUE_ON_FAILURE)
	
		Mobile.delay(5)
	}*/
	
}

Mobile.takeScreenshot(FailureHandling.OPTIONAL)
