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

//validate downpayment value
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_Downpayment'), 'Downpayment')

	String financingAmount = Mobile.getText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_FinancingAmountValue'), 0).substring(2).replace(",", "")
	String propertyPriceG = GlobalVariable.PropertPriceInputText
	String propertyPrice = propertyPriceG.replace(",", "")
	String downpayment = Mobile.getText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_DownpaymentValue'),0).substring(2).replace(",", "")
		
	boolean status = CustomKeywords.'com.keywords.coreMethods.CompareTowFloatValues'(propertyPrice, financingAmount, downpayment)
	// Verify the downpaymnet is teh value minused from property price and sancationed financing amount
	Mobile.verifyEqual(status, true)
