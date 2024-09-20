import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.text.NumberFormat

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


Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03/Manager Flow/EDD Summary Page/EDDSummaryPage_TitleText_EDD Summary'), 
    0)

Mobile.takeScreenshot() 

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/EDD Summary Page/EDDSummaryPage_text_Please review the mitigation'), 
        0), 'Please review the mitigation performed by the originator and edit if needed. If everything is good, please mark it as verified.')

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/EDD Summary Page/EDDSummaryPage_FieldText_Eligibility of Borrower'), 
        0), 'Eligibility of Borrower')

EligibilityofBorrower_EDDStatus = Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/EDD Summary Page/EDDSummaryPage_EligibilityofBorrower_text_EDDStatus'), 
    0)

int EDDStatus = 0

if (Mobile.verifyElementExist(findTestObject('Object Repository/Tester03/Manager Flow/EDD Summary Page/EDDSummaryPage_text_EDDStatus', [('Text') : 'Eligibility of Borrower', ('Verify') : 'AMBER']), 5, FailureHandling.OPTIONAL)
	|| Mobile.verifyElementExist(findTestObject('Object Repository/Tester03/Manager Flow/EDD Summary Page/EDDSummaryPage_text_EDDStatus', [('Text') : 'Eligibility of Borrower', ('Verify') : 'RED']), 5, FailureHandling.OPTIONAL)) 
{
	EDDStatus ++
	
}

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/EDD Summary Page/EDDSummaryPage_text_Mitigation Notes'),
	0), 'Mitigation Notes')

MitigationNotesDetails = Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/EDD Summary Page/EDDSummaryPage_MitigationNotes_text_Mitigation Notes_Detail'),
	0)


Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/EDD Summary Page/EDDSummaryPage_FieldText_Credit Check'), 
        0), 'Credit Check')

CreditCheck_EDDStatus = Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/EDD Summary Page/EDDSummaryPage_CreditCheck_text_EDDStatus'), 
    0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/EDD Summary Page/EDDSummaryPage_text_Mitigation Notes'), 
    0), 'Mitigation Notes') 

MitigationNotesDetails = Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/EDD Summary Page/EDDSummaryPage_MitigationNotes_text_Mitigation Notes_Detail'), 
    0)

if (Mobile.verifyElementExist(findTestObject('Object Repository/Tester03/Manager Flow/EDD Summary Page/EDDSummaryPage_text_EDDStatus', [('Text') : 'Credit Check', ('Verify') : 'AMBER']),  5, FailureHandling.OPTIONAL)
	|| Mobile.verifyElementExist(findTestObject('Object Repository/Tester03/Manager Flow/EDD Summary Page/EDDSummaryPage_text_EDDStatus', [('Text') : 'Credit Check', ('Verify') : 'RED']),  5, FailureHandling.OPTIONAL))
{
	EDDStatus ++
	
}

Mobile.takeScreenshot()

Mobile.swipe(300, 900, 300, 300)

Mobile.takeScreenshot()

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/EDD Summary Page/EDDSummaryPage_FieldText_MORDSR'), 
        0), 'MOR/DSR')

MORDSR_EDDStatus = Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/EDD Summary Page/EDDSummaryPage_MORDSR_text_EDDStatus'), 
    0)

if (Mobile.verifyElementExist(findTestObject('Object Repository/Tester03/Manager Flow/EDD Summary Page/EDDSummaryPage_text_EDDStatus', [('Text') : 'MOR/DSR', ('Verify') : 'AMBER']),  5, FailureHandling.OPTIONAL)
	|| Mobile.verifyElementExist(findTestObject('Object Repository/Tester03/Manager Flow/EDD Summary Page/EDDSummaryPage_text_EDDStatus', [('Text') : 'MOR/DSR', ('Verify') : 'RED']),  5, FailureHandling.OPTIONAL))
{
	EDDStatus ++
	
}

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/EDD Summary Page/EDDSummaryPage_text_Mitigation Notes'),
	0), 'Mitigation Notes')

MitigationNotesDetails = Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/EDD Summary Page/EDDSummaryPage_MitigationNotes_text_Mitigation Notes_Detail'),
	0)
Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/EDD Summary Page/EDDSummaryPage_FieldText_Collateral'), 
        0), 'Collateral')

Colateral_EDDStatus = Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/EDD Summary Page/EDDSummaryPage_Collateral_text_EDDStatus'), 
    0)

if (Mobile.verifyElementExist(findTestObject('Object Repository/Tester03/Manager Flow/EDD Summary Page/EDDSummaryPage_text_EDDStatus', [('Text') : 'Collateral', ('Verify') : 'AMBER']),  5, FailureHandling.OPTIONAL)
	|| Mobile.verifyElementExist(findTestObject('Object Repository/Tester03/Manager Flow/EDD Summary Page/EDDSummaryPage_text_EDDStatus', [('Text') : 'Collateral', ('Verify') : 'RED']),  5, FailureHandling.OPTIONAL))
{
	EDDStatus ++
	
}

Mobile.takeScreenshot()

Mobile.swipe(300, 900, 300, 300)

Mobile.takeScreenshot()

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/EDD Summary Page/EDDSummaryPage_FieldText_Product Features'), 
        0), 'Product Features')

ProductFeatures_EDDStatus = Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/EDD Summary Page/EDDSummaryPage_ProductFeatures_text_EDDStatus'), 
    0)

if (Mobile.verifyElementExist(findTestObject('Object Repository/Tester03/Manager Flow/EDD Summary Page/EDDSummaryPage_text_EDDStatus', [('Text') : 'Product Features', ('Verify') : 'AMBER']),  5, FailureHandling.OPTIONAL)
	|| Mobile.verifyElementExist(findTestObject('Object Repository/Tester03/Manager Flow/EDD Summary Page/EDDSummaryPage_text_EDDStatus', [('Text') : 'Product Features', ('Verify') : 'RED']),  5, FailureHandling.OPTIONAL))
{
	EDDStatus ++
	
}

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/EDD Summary Page/EDDSummaryPage_FieldText_Credit Policies'), 
        0), 'Credit Policies')

CreditPolicies_EDDStatus = Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/EDD Summary Page/EDDSummaryPage_CreditPolicies_text_EDDStatus'), 
    0)

if (Mobile.verifyElementExist(findTestObject('Object Repository/Tester03/Manager Flow/EDD Summary Page/EDDSummaryPage_text_EDDStatus', [('Text') : 'Credit Policies', ('Verify') : 'AMBER']),  5, FailureHandling.OPTIONAL)
	|| Mobile.verifyElementExist(findTestObject('Object Repository/Tester03/Manager Flow/EDD Summary Page/EDDSummaryPage_text_EDDStatus', [('Text') : 'Credit Policies', ('Verify') : 'RED']),  5, FailureHandling.OPTIONAL))
{
	EDDStatus ++
	
}

//Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/EDD Summary Page/EDDSummaryPage_text_Mitigation Notes'), 
//    0)
//
//Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/EDD Summary Page/EDDSummaryPage_MitigationNotes_text_Mitigation Notes_Detail'), 
//    0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/EDD Summary Page/EDDSummaryPage_text_By marking this as verified'), 
        0), 'By marking this as verified, you confirm that you have done your due diligence as a manager.')

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Tester03/Manager Flow/EDD Summary Page/EDDSummaryPage_button_Edit'), 0)

Mobile.delay(5)

Mobile.takeScreenshot()

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03/Manager Flow/EDD Summary Page/Edit EDD Summary Page/EditEDDSummary_TitleText_Edit Edd Summary'), 
    0)

Mobile.swipe(300, 900, 300, 300)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Tester03/Manager Flow/EDD Summary Page/Edit EDD Summary Page/EditEDDSummary_button_Save Changes'), 
    0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/EDD Summary Page/Edit EDD Summary Page/EditEDDSummary_PopUpText_Mitigation changes has been saved'), 
    0), 'Mitigation changes has been saved.', FailureHandling.OPTIONAL)

/*Mobile.takeScreenshot()

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03/Manager Flow/EDD Summary Page/EDDSummaryPage_TitleText_EDD Summary'), 
    0)

/*Mobile.tap(findTestObject('Object Repository/Tester03/Manager Flow/EDD Summary Page/EDDSummaryPage_button_Edit'), 0)

Mobile.takeScreenshot()

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03/Manager Flow/EDD Summary Page/Edit EDD Summary Page/EditEDDSummary_TitleText_Edit Edd Summary'),
	0)

Mobile.tap(findTestObject('Object Repository/Tester03/Manager Flow/EDD Summary Page/Edit EDD Summary Page/EditEDDSummary_Button_Close'), 
    0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/EDD Summary Page/Edit EDD Summary Page/EditEDDSummary_PopUpTitleText_Unsaved Changes'), 
    0), 'Unsaved Changes')

Mobile.takeScreenshot()

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/EDD Summary Page/Edit EDD Summary Page/EditEDDSummary_PopUpText_Would you like'), 
    0), 'Would you like to save your progress first? If you exit now, you will lose the changes you made.')

Mobile.tap(findTestObject('Object Repository/Tester03/Manager Flow/EDD Summary Page/Edit EDD Summary Page/EditEDDSummary_button_Save Now'), 
    0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/EDD Summary Page/Edit EDD Summary Page/EditEDDSummary_PopUpText_Mitigation changes has been saved'),
	0), 'Mitigation changes has been saved.')

Mobile.takeScreenshot()

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester03/Manager Flow/EDD Summary Page/EDDSummaryPage_TitleText_EDD Summary'),
	0)

Mobile.delay(10)*/

/*Mobile.tap(findTestObject('Object Repository/Tester03/Manager Flow/EDD Summary Page/EDDSummaryPage_button_Mark as Verified'), 
    0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/Review Application Page/ReviewApplicationPage_AfterClickMarkAsVerified_ EDDSummary_text_Edited by you'), 0), 'Edited by you')

EDDResult = Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/Review Application Page/ReviewApplicationPage_AfterClickedMarkAsVerified_EDDSummary_text_PolicyBreachesResult'), 0)

String[] EDDResult_count  = EDDResult.split(' policy breaches')

EDDResult_new = (EDDResult_count[0])

println(EDDResult_new)

int lastCharIndex = EDDResult_new.length()-1;

println(EDDResult_new.substring(lastCharIndex))

Mobile.verifyEqual(EDDResult_new.substring(lastCharIndex), Integer.toString(EDDStatus))

Mobile.takeScreenshot()*/


