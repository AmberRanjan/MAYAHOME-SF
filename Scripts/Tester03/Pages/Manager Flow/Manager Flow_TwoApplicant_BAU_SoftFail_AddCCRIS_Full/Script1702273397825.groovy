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

Mobile.callTestCase(findTestCase('Test Cases/Tester02_New/Pages/Login/ReusableMethods_Login/Method_Login_Manager'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Tester03/Pages/Manager Flow/Manager Flow Page 1'), [:], FailureHandling.STOP_ON_FAILURE)

ApplicationName = Mobile.callTestCase(findTestCase('Test Cases/Tester03/Pages/Manager Flow/Manager Flow Page 2_Pending Requests_BAU_SoftFail'), [:], FailureHandling.STOP_ON_FAILURE)

CaseDateTime = Mobile.callTestCase(findTestCase('Test Cases/Tester03/Pages/Manager Flow/Manager Flow Page 3_MAYA_BAU_SoftFail'), [('ApplicantNamePendingRequest') : ApplicationName], FailureHandling.OPTIONAL) 

Mobile.callTestCase(findTestCase('Test Cases/Tester03/Pages/Manager Flow/Manager Flow Page 4_Review Application_BAU_SoftFail'),
	[('CaseDetailsTimeLineDate') : CaseDateTime], FailureHandling.OPTIONAL)

