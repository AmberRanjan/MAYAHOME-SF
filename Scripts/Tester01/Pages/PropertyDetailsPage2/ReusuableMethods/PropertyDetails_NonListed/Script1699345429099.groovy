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

String EditPropertyDetails = 'False'

// verify Message displayed to ask cutomer to enter details and check elligiblity
Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_Property Details'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/btn_Close'), 30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage2/txt_ApplicantEligiblity1'), 'Please fill up the following details to check your applicant’s eligibility', FailureHandling.CONTINUE_ON_FAILURE)

//verify Property detail text
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage2/txt_PropertyDetails'), 'Property Details', FailureHandling.CONTINUE_ON_FAILURE)

// verify edit button is present
Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/PropertyDetailsPage2/txt_EditPropertyDetails'), 0, FailureHandling.CONTINUE_ON_FAILURE)

if (EditPropertyDetails.equalsIgnoreCase('True')) {
    Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage2/txt_EditPropertyDetails'), 0, FailureHandling.CONTINUE_ON_FAILURE)
}

// verify porperty address is displayed as entered in orevious screen
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage2/txt_PropertyAddress'), 'Property Address', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage2/txt_PropertyAddressvalue'), GlobalVariable.PropertyAddressValue, FailureHandling.CONTINUE_ON_FAILURE)

//verify development type details are displayed as entered in previous screen
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_DevelopmentType'), 'Development Type', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage2/txt_DevelopmentTypeValue'), GlobalVariable.DevelopmentTypeInputText, FailureHandling.CONTINUE_ON_FAILURE)

//verify Property Area details are displayed as entered in previous screen
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage2/txt_PropertyArea'), 'Property Area', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage2/txt_PropertyAreaValue'), GlobalVariable.PropertyAreaValue, FailureHandling.CONTINUE_ON_FAILURE)

//verify lease type details are displayed as entered in previous screen
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage2/txt_LeaseType'), 'Type of Lease', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage2/txt_LeaseTypeValue'), GlobalVariable.TypeOfLeaseValue, FailureHandling.CONTINUE_ON_FAILURE)

//verify property price details are displayed as entered in previous screen
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage2/txt_PropertyPrice'), 'Property Price', FailureHandling.CONTINUE_ON_FAILURE)

String propertyPrice = 'RM '+GlobalVariable.PropertPriceInputText
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage2/txt_PropertyPriceValue'), propertyPrice, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)
