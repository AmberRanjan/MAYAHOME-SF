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

DataEntryTotalCountTitle = Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/Pending Requests Page/PendingRequestsPage_TitleText_Pending requests'), 
    0)

Mobile.takeScreenshot()

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/Pending Requests Page/PendingRequestsPage_TabName_Data Entry  LO'), 
        0), 'Data Entry / LO')

DataEntryTotalCount = Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/Pending Requests Page/PendingRequestsPage_Count_Data Entry  LO'), 
    0)

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/Pending Requests Page/PendingRequestsPage_EditText_Search for name, property, AA no or STP ID'), 
        0), 'Search for name, property, AA no or STP ID')

Mobile.setText(findTestObject('Object Repository/Tester03/Manager Flow/Pending Requests Page/PendingRequestsPage_EditText_Search for name, property, AA no or STP ID'), 'MSF240202111205837',0 )
    //GlobalVariable.StpId, 0)

Mobile.takeScreenshot()

Mobile.delay(5)

ApplicantNamePendingRequest = Mobile.getText(findTestObject('Object Repository/Tester03/Manager Flow/Pending Requests Page/PendingRequestsPage_text_ApplicantName'),
	0).replace('...', '')

Mobile.tap(findTestObject('Object Repository/Tester03/Manager Flow/Pending Requests Page/PendingRequestsPage_text_ApplicantName'), 
    0)

return ApplicantNamePendingRequest


//Mobile.tap(findTestObject('Object Repository/Tester03/Manager Flow/Pending Requests Page/PendingRequestsPage_Button_Close'),
//	0)




