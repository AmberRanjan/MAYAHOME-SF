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


Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 1/EDDSummaryPage_field_MORDSR'), 
        0), 'MOR/DSR')

MORDSR = Mobile.getText(findTestObject('Object Repository/Tester03/EDD Summary Page 1/EDDSummaryPage_field_MORDSR'), 0)

//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/EDDSummaryPage_text_GREEN', [('Verify') : 'MOR/DSR']), 
//    0)
//
//Mobile.delay(5)
//'MOR/DSR Current Status: GREEN'
//GreenNoMitigateButton = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_Dynamicbutton_Mitigate', 
//        [('Verify') : 'MOR/DSR']), 0)
//
//GreenNoEditMitigationButton = Mobile.getText(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_Dynamicbutton_Edit Mitigation', 
//        [('Verify') : 'MOR/DSR']), 0)
//
//Mobile.verifyMatch(GreenNoMitigateButton, GreenNoEditMitigationButton, true)
//
//Mobile.tap(findTestObject('Object Repository/Tester03/EDD Summary Page 2/EDDSummaryPage_text_AMBER', [('Verify') : 'MOR/DSR']), 
//    0)

//Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_Dynamicbutton_Edit Mitigation',
//        [('Verify') : 'Credit Check']), 0)

'Checking if MOR/DSR Current Status: AMBER or RED'

/*if (Mobile.verifyElementExist(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_Dynamicbutton_Mitigate',
	[('Verify') : 'MOR/DSR']), 15, FailureHandling.OPTIONAL)) {
	Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_Dynamicbutton_Mitigate', [('Verify') : 'MOR/DSR']), 
   0)*/


if (Mobile.verifyElementExist(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_Dynamicbutton_Edit Mitigation',
	[('Verify') : 'MOR/DSR']), 15, FailureHandling.OPTIONAL)) {

Mobile.tap(findTestObject('Object Repository/Tester03_old/EDD Summary Page 1/EDDSummaryPage_Dynamicbutton_Edit Mitigation',
        [('Verify') : 'MOR/DSR']), 0)


Mobile.callTestCase(findTestCase('Tester03/Pages/EDD Summary Page/MOR DSR/EDDSummaryPage_2_MORDSRValidation'), ['MORDSR':MORDSR], FailureHandling.CONTINUE_ON_FAILURE)
}




