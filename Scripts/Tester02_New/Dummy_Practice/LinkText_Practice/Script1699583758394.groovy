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

Mobile.startExistingApplication(GlobalVariable.SF_ApplicationID)

int deviceHeight = Mobile.getDeviceHeight()


int deviceWidth = Mobile.getDeviceWidth()

/*

String x_Element1 = Mobile.getAttribute(findTestObject('Object Repository/Tester02_New/Practice_LinkText/android.widget.TextView - IWe have read and agree to be bound by the Product Disclosure Sheet'), 'x', 10, FailureHandling.STOP_ON_FAILURE)

String y_Element1 = Mobile.getAttribute(findTestObject('Object Repository/Tester02_New/Practice_LinkText/android.widget.TextView - IWe have read and agree to be bound by the Product Disclosure Sheet'), 'y', 10, FailureHandling.STOP_ON_FAILURE)


String width_Element1 = Mobile.getAttribute(findTestObject('Object Repository/Tester02_New/Practice_LinkText/android.widget.TextView - IWe have read and agree to be bound by the Product Disclosure Sheet'), 'width', 10, FailureHandling.STOP_ON_FAILURE)


String height_Element1 = Mobile.getAttribute(findTestObject('Object Repository/Tester02_New/Practice_LinkText/android.widget.TextView - IWe have read and agree to be bound by the Product Disclosure Sheet'), 'height', 10, FailureHandling.STOP_ON_FAILURE)

int x_position_Element1 = Integer.parseInt(x_Element1)

int y_position_Element1 = Integer.parseInt(y_Element1)


//Mobile.tapAndHoldAtPosition(x, y, height, FailureHandling.STOP_ON_FAILURE)

//int n = x+10

Mobile.tapAtPosition(x_position_Element1+200, y_position_Element1+100)

*/


String x_Element2 = Mobile.getAttribute(findTestObject('Object Repository/Tester02_New/Practice_LinkText/android.widget.TextView - IWe confirm that'), 'x', 10, FailureHandling.STOP_ON_FAILURE)

String y_Element2 = Mobile.getAttribute(findTestObject('Object Repository/Tester02_New/Practice_LinkText/android.widget.TextView - IWe confirm that'), 'y', 10, FailureHandling.STOP_ON_FAILURE)


String width_Element2 = Mobile.getAttribute(findTestObject('Object Repository/Tester02_New/Practice_LinkText/android.widget.TextView - IWe confirm that'), 'width', 10, FailureHandling.STOP_ON_FAILURE)


String height_Element2 = Mobile.getAttribute(findTestObject('Object Repository/Tester02_New/Practice_LinkText/android.widget.TextView - IWe confirm that'), 'height', 10, FailureHandling.STOP_ON_FAILURE)

int x_position_Element2 = Integer.parseInt(x_Element2)

int y_position_Element2 = Integer.parseInt(y_Element2)


//Mobile.tapAndHoldAtPosition(x, y, height, FailureHandling.STOP_ON_FAILURE)

//int n = x+10

Mobile.tapAtPosition(x_position_Element2+200, y_position_Element2+200)

