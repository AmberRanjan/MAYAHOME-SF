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

Mobile.scrollToText('Proceed')

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 1/EDDSummaryPage_field_Product Features'),
		0), 'Product Features')

Mobile.takeScreenshot()

ProductFeatures = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 1/EDDSummaryPage_field_Product Features'), 0)

//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/EDDSummaryPage_text_GREEN', [('Verify') : 'Product Features']),
//	0)
//
//Mobile.takeScreenshot()
//
//'Product Features Current Status: GREEN'
//GreenNoMitigateButton = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_Dynamicbutton_Mitigate',
//		[('Verify') : 'Product Features']), 0)
//
//GreenNoEditMitigationButton = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_Dynamicbutton_Edit Mitigation',
//		[('Verify') : 'Product Features']), 0)
//
//Mobile.verifyMatch(GreenNoMitigateButton, GreenNoEditMitigationButton, true)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/EDDSummaryPage_text_AMBER', [('Verify') : 'Product Features']),
//	0)
//
//Mobile.takeScreenshot()

//Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_Dynamicbutton_Edit Mitigation',
//        [('Verify') : 'Product Features']), 0)

'Checking if Product Features Current Status: AMBER or RED'

if (Mobile.verifyElementExist(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_Dynamicbutton_Mitigate',
	[('Verify') : 'Product Features']), 15, FailureHandling.OPTIONAL)) {

//Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_Dynamicbutton_Edit Mitigation',
//       [('Verify') : 'Product Features']), 0)

Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_Dynamicbutton_Mitigate', [('Verify') : 'Product Features']),
	0)

Mobile.callTestCase(findTestCase('Tester03/Pages/EDD Summary Page/Product Features/EDDSummaryPage_2_ProductFeatures_Validation'), ['ProductFeatures':ProductFeatures], FailureHandling.STOP_ON_FAILURE)
}


