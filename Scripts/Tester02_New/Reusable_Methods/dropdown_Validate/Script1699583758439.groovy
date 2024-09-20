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


import org.openqa.selenium.WebElement
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import io.appium.java_client.AppiumDriver
KeywordLogger logger = new KeywordLogger()

/*Author: Vasudha
 * Data From Excel: Home2u_TestData
 * Sheet: SF_Scenarios_Data
 */
int Row_Number = 1

def sheet = 'SF_Scenarios_Data'



Mobile.comment('Validate Dropdown all texts')

Mobile.takeScreenshot()

AppiumDriver<?> driver = MobileDriverFactory.getDriver()


List<String> array_beforeSort = new ArrayList()

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/Methods/Dropdown_Search/Dropdown_text_getAll'), 10,FailureHandling.OPTIONAL)

dropDownCount = MobileDriverFactory.getDriver().findElementsByXPath("//*[@class = 'android.widget.ScrollView']//android.widget.TextView").size()
for (int i = 1; i <= dropDownCount; i++) {
	String dropDown_Value = Mobile.getText(findTestObject('Object Repository/DropDown/DropDown_text_xpath_changeNumber',
			[('number') : i]), 10,FailureHandling.OPTIONAL)

	array_beforeSort.add(dropDown_Value)
}

ArrayList<String> array_afterSort = new ArrayList<String>();
for(int i=0; i < array_beforeSort.size(); i++){
	array_afterSort.add(array_beforeSort.get(i))
}

//array_afterSort = Collections.sort(array_beforeSort, Collections.reverseOrder());
Collections.sort(array_afterSort)

assert array_beforeSort.equals(array_afterSort)
def dropDown_DataValidation(def sheet = 'SF_Scenarios_Data', String excel_coulmn_name, int excel_Count) {
	List<String> array_dropdown_app = new ArrayList()
	
	Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/Methods/Dropdown_Search/Dropdown_text_getAll'), 10,FailureHandling.OPTIONAL)
	
	def dropDownCount_app = MobileDriverFactory.getDriver().findElementsByXPath("//*[@class = 'android.widget.ScrollView']//android.widget.TextView").size()
	for (int i = 1; i <= dropDownCount_app; i++) {
		String dropDown_Value = Mobile.getText(findTestObject('Object Repository/DropDown/DropDown_text_xpath_changeNumber',
				[('number') : i]), 10,FailureHandling.OPTIONAL)
	
		array_dropdown_app.add(dropDown_Value)
	}
	
	

	List<String> array_excel = new ArrayList()

	for (int i = 1; i <= excel_Count; i++) {

		Mobile.scrollToText(findTestData(sheet).getValue(excel_coulmn_name,i))

		'DataFile'
		def excel_data = findTestData(sheet).getValue(excel_coulmn_name, i)

		array_excel.add(excel_data)

		//String dropDown_Value_excel = findTestData(excel_data).getValue(2,i)
	}

	assert array_dropdown_app.equals(array_excel)
}

def dropDown_Search(String Search_Text) {
	Mobile.comment('Validate Dropdown with Invalid text')

	Mobile.setText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_dropdownArrow_Alternate ID Type (Optional)_Search'),
			'abcdefghijklmnopqrstuvwxyz', 0)

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/StartNewApplication/StartNewApplicationPage_IDType_dorpDown_No results found'),
			'No results found')

	Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_dropdownArrow_Alternate ID Type (Optional)_Search_Close'),
			0)

	Mobile.setText(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_dropdownArrow_Alternate ID Type (Optional)_Search'),
			Search_Text, 0)

	Mobile.delay(5)

	Mobile.tap(findTestObject('Object Repository/Tester02_New/CustomerOnboardingPage_1/CustomerOnboardingPage1_dropdownArrow_Alternate ID Type (Optional)_Search_Result',[('Variable') : Search_Text]),
	0)
}