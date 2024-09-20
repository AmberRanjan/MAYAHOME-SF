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

CustomKeywords.'com.keywrods.ScrollAction.scroll'(0.70, 0.30)

// validate financing plan details
Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage3/txt_FinancingPlan'), 'Financing Plan')

//financng message diplay
Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage3/txt_FinancingPlanMessageDisplay'), 'A recommended financing plan has been auto-selected for you.')

Mobile.delay(10)

CustomKeywords.'com.keywrods.ScrollAction.scroll'(0.30, 0.70)

Mobile.tap(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage3/btn_Check Eligibility'), 0)

Mobile.delay(10)

// choose financing type
//Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage3/txt_FinancingType'), 'Financing Type')

/*if (financingType.equalsIgnoreCase('Conventional Financing')){
	
	// select conventional financing financing type
	Mobile.tap(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage3/rdo_ConventionalFinancing'), 0)
	
}
else if (financingType.equalsIgnoreCase('Islaminc Financing')) {
	
	// select islamin financing financing type
	Mobile.tap(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage3/rdo_islamicFinancing'), 0)
	
}

Mobile.tap(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage3/txt_FinancingPlan_text2'), 0)

// code to add dropdown

Mobile.closeApplication()*/
