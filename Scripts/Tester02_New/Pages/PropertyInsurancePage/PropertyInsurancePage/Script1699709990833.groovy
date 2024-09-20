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
String testFlow = GlobalVariable.testFlow

Mobile.delay(3)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

if (testFlow.equalsIgnoreCase('StpPass') || testFlow.equalsIgnoreCase('StpSoftfail')) {
	
	Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/PropertyInsurance/propertyInsurance_LoTerms'), 30)
	
	if (financingType.equalsIgnoreCase('Islamic Financing')) {
	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/PropertyInsurance/PropertyInsurancePage_text_Property Takaful_1'),
			'Property Takaful')
	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/PropertyInsurance/PropertyInsurancePage_text_Fire Takaful'),
		'Fire Takaful')
		
	}else if (financingType.equalsIgnoreCase('Conventional Financing')) {
	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/PropertyInsurance/txt_PropertyInsurance_1'), 'Property Insurance')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/SubmitToManager/txt_FireInsurance'), 'Fire Insurance')
	
	}


}else if (testFlow.equalsIgnoreCase('BauPass') || testFlow.equalsIgnoreCase('BauSoftfail')) {
	
	Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/PropertyInsurance/txt_PropertyInsurance_1'), 30)
	
	if (financingType.equalsIgnoreCase('Islamic Financing')) {
		Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/PropertyInsurance/PropertyInsurancePage_text_Property Takaful_1'),
				'Property Takaful')
		
		Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/PropertyInsurance/PropertyInsurancePage_text_Fire Takaful'),
			'Fire Takaful')
			
		}else if (financingType.equalsIgnoreCase('Conventional Financing')) {
		
		Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/PropertyInsurance/txt_PropertyInsurance_2'), 'Property Insurance')
		
		Mobile.verifyElementText(findTestObject('Object Repository/Tester01/SubmitToManager/txt_FireInsurance'), 'Fire Insurance')
		
		}
}

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/PropertyInsurance/PropertyInsurancePage_text_Please select the one that apply'),
		'Please select the one that apply:')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/PropertyInsurance/PropertyInsurancePage_text_Houseowner Xtras Policy'), 'Houseowner Xtra\'s Policy')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/PropertyInsurance/PropertyInsurancePage_text_Houseowners Policy'), 'Houseowner\'s Policy')


if(GlobalVariable.PropertyInsurance == 'Houseowner Xtra\'s Policy')
{
	Mobile.tap(findTestObject('Object Repository/Tester02_New/PropertyInsurance/PropertyInsurancePage_radioButton_Houseowner Xtras Policy'),
			0)
}
if(GlobalVariable.PropertyInsurance == 'Houseowner\'s Policy') {

	Mobile.tap(findTestObject('Object Repository/Tester02_New/PropertyInsurance/PropertyInsurancePage_radioButton_Houseowners Policy'),
			0)
}
if(GlobalVariable.PropertyInsurance == 'Fire Takaful')
{

	Mobile.tap(findTestObject('Object Repository/Tester02_New/PropertyInsurance/PropertyInsurancePage_radioButton_Fire Takaful'), 0)
	
}

if (testFlow.equalsIgnoreCase('StpPass') || testFlow.equalsIgnoreCase('StpSoftfail')) {
		
	Mobile.tap(findTestObject('Object Repository/Tester02_New/PropertyInsurance/PropertyInsurancePage_button_GenerateLO'), 0)
	Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/PropertyInsurance/PropertyInsurancePage_txt_LetterOfOffer'), 30, FailureHandling.OPTIONAL)
	
	Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/PropertyInsurance/PropertyInsurancePage_txt_LetterOfOffer'), 30, FailureHandling.OPTIONAL)
	
	Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/PropertyInsurance/PropertyInsurancePage_txt_Confirm'), 30, FailureHandling.OPTIONAL)
	
	Mobile.tap(findTestObject('Object Repository/Tester02_New/PropertyInsurance/PropertyInsurancePage_txt_Confirm'), 30)
	
}else if (testFlow.equalsIgnoreCase('BauPass') || testFlow.equalsIgnoreCase('BauSoftfail')) {
		
		Mobile.tap(findTestObject('Object Repository/Tester02_New/PropertyInsurance/PropertyInsurancePage_button_SaveContinue'), 30)


}



