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

//Mobile.startExistingApplication('com.maybank2u.salesforce.uatent')

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/ResultsScreens/STP_Pass_Page/BrachNamePage/BranchNamePage_Header'),
		0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/ResultsScreens/STP_Pass_Page/BrachNamePage/BranchNamePage_text_To proceed, please assign a branch for your applicant'),
		'To proceed, please assign a branch for your applicant')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/ResultsScreens/STP_Pass_Page/BrachNamePage/BranchNamePage_textBox_DefaultValue_Branch name'),
		'Branch name')

Mobile.tap(findTestObject('Object Repository/Tester02_New/ResultsScreens/STP_Pass_Page/BrachNamePage/BranchNamePage_textBox_DefaultValue_Branch name'),
		0)



Mobile.tap(findTestObject('Object Repository/Tester02_New/ResultsScreens/STP_Pass_Page/BrachNamePage/BranchNamePage2_button_Back'),
		0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/ResultsScreens/STP_Pass_Page/BrachNamePage/BranchNamePage_button_Back'),
		0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/ResultsScreens/STP_Pass_Page/BrachNamePage/BranchNamePage_textBox_DefaultValue_Branch name'),
		0)


Mobile.setText(findTestObject('Object Repository/Tester02_New/ResultsScreens/STP_Pass_Page/BrachNamePage/BranchNamePage2_textBox_BrachName'),
		'Shah Alam', 0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/ResultsScreens/STP_Pass_Page/BrachNamePage/BranchNamePage2_textBox_BrachName_Result_Shah Alam', [('Variable') : GlobalVariable.BranchName]),0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/ResultsScreens/STP_Pass_Page/BrachNamePage/BranchNamePage2_button_Submit'),
		0)

//Mobile.closeApplication()

