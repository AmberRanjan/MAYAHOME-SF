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

Mobile.verifyElementText(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/CaseProcessingPage_text_Letter of Offer'), 'Letter of Offer')

Mobile.tap(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/CaseProcessingPage_ClickableImage_Letter of Offer'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/LOTermsConditionsSummaryPage_Header'),  0)

Mobile.verifyElementExist(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/LOTermsandConditionsSummaryPage_ClickableImage_Pencil'), 30)

Mobile.verifyElementExist(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/AfterClickPencil_Button_Back'), 30)

Mobile.takeScreenshot()

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/LOTermsConditionsSummaryPage_Header'),
		0), 'LO Terms & Conditions')

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/LOTermsConditionsSummaryPage_Header_Summary'),
		0), 'Summary')

	if (financingType.equalsIgnoreCase('Islamic Financing')) {
	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/PropertyInsurance/PropertyInsurancePage_text_Property Takaful_1'),
			'Property Takaful')
	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/PropertyInsurance/PropertyInsurancePage_text_Fire Takaful'),
		'Fire Takaful')
		
	}else if (financingType.equalsIgnoreCase('Conventional Financing')) {
	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/PropertyInsurance/txt_PropertyInsurance_1'), 'Property Insurance')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/PropertyInsurance/PropertyInsurancePage_text_Fire Takaful'), 'Fire Insurance')
	
	}

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/PropertyInsurance/PropertyInsurancePage_text_Houseowner Xtras Policy'), 'Houseowner Xtra\'s Policy')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/PropertyInsurance/PropertyInsurancePage_text_Houseowners Policy'), 'Houseowner\'s Policy')
	
	Mobile.tap(findTestObject('Object Repository/Tester01/SubmitToManager/btn_ViewLetterOfOffer'), 0)
	
	Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/CaseProcessingPage_text_Letter of Offer'), 30)
	
	Mobile.tap(findTestObject('Object Repository/Tester01/SubmitToManager/btn_BackToCaseProcessing'), 0)
	
	Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_MAYA'), 45)
	
	Mobile.tap(findTestObject('Object Repository/Tester01/SubmitToManager/btn_SubmitToManager'), 0)
	
	Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03_old/Submit to Manager Page/CaseProcessingPage_Title'), 30)
	
	