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
import java.time.LocalDate as LocalDate
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

if (((GlobalVariable.Owner == 'Main Applicant, Joint Applicant and other person(s)') || (GlobalVariable.Owner == 'Main Applicant and other person(s)')) ||
	(GlobalVariable.Owner == 'Joint Applicant and other person(s)')) {
		Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1'),
			'Step 3 of 6')
	
	}else {
		
		Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_StaticVerification_1'),
			'Step 2 of 5')
		}

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_text_Property Details'),
		'Property Details')

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_text_Property Name'),
		'Property Name')

CustomKeywords.'methods_Tester02.ValidateTextBox.ValidateText_Alpha_Max'(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_textBox_Property Name'),
		40)

Mobile.setText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_textBox_Property Name'),
		GlobalVariable.PropertyNameInputText, 0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_text_Unit Number'),
		'Unit Number')

CustomKeywords.'methods_Tester02.ValidateTextBox.ValidateText_Alpha_Max'(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_textBox_Unit Number'),
		40)

Mobile.setText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_textBox_Unit Number'),
		GlobalVariable.UnitNumberInputText, 0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_text_Title Code'),
		'Title Code')

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_dropDownArrow_TitleCode'),
		0)

CustomKeywords.'methods_Tester02.dropdown_Search.dropDown_Search'(GlobalVariable.DE_TitleCode)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_text_Title Number'),
		'Title Number')

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_textBox_Title Number'),
		0)

CustomKeywords.'methods_Tester02.ValidateTextBox.ValidateText_Alpha_Max'(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_textBox_Title Number'),
		40)

Mobile.setText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_textBox_Title Number'),
		GlobalVariable.TitleNumber, 0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_text_Lot Number'),
		'Lot Number')

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_textBox_Lot Number'),
		0)

CustomKeywords.'methods_Tester02.ValidateTextBox.ValidateText_Alpha_Max'(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_textBox_Lot Number'),
		40)

Mobile.setText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_textBox_Lot Number'),
		GlobalVariable.UnitDetailsInputText, 0)

Mobile.swipe(300, 900, 300, 300)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_text_BlockStreet'),
		'Block/Street')

CustomKeywords.'methods_Tester02.ValidateTextBox.ValidateText_Alpha_Max'(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_textBox_BlockStreet'),
		40)

Mobile.setText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_textBox_BlockStreet'),
		GlobalVariable.BlockStoreyDetailsInputText, 0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_text_Purchase Date'),
		'Purchase Date')

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_textBox_PurchaseDate'),
		0, FailureHandling.STOP_ON_FAILURE)

t_date = new Date()

def todaysDate = t_date.format('d MMMM YYYY')

System.out.println('Current Date: ' + todaysDate)

Mobile.comment(todaysDate)

def todaysDate_day = t_date.format('d')

Mobile.comment(todaysDate_day)

def todaysDate_Month = t_date.format('MMMM')

Mobile.comment(todaysDate_Month)

def todaysDate_Year = t_date.format('YYYY')

Mobile.comment(todaysDate_Year)

//findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_text')
Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_text _Month', [('Variable') : todaysDate_Year]),
0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_text _Month', [('Variable') : todaysDate_Year]),
0, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_text _Month', [('Variable') : GlobalVariable.Year]),
0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_text _Month', [('Variable') : todaysDate_Month]),
0, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_text _Month', [('Variable') : todaysDate_Month]),
0, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_text _Month', [('Variable') : GlobalVariable.Month]),
0, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_text _Month', [('Variable') : GlobalVariable.Date]),
0)

/*
 Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_PurchaseDate_button_LeftArrow'),
 0)
 Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_PurchaseDate_button_1'),
 0)
 */
Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_PurchaseDate_button_Confirm'),
		0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_text_Built Up Area'),
		'Built Up Area')

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_textBox_Built Up Area'),
		0)

CustomKeywords.'methods_Tester02.ValidateTextBox.ValidateText_Alpha_Max'(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_textBox_Built Up Area'),
		40)

Mobile.setText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_textBox_Built Up Area'),
		GlobalVariable.BuiltUpArea_TextBox, 0)

Mobile.swipe(300, 900, 300, 300)

Mobile.getText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_dropDownText_BuildUpArea'),
		0)

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_dropDownArrow_BuildUpArea'),
		0)

CustomKeywords.'methods_Tester02.dropdown_Search.dropDown_Search'(GlobalVariable.BuiltUpArea_TextBox_DropDown)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_text_Property Insured Amount'),
		'Property Insured Amount')

CustomKeywords.'methods_Tester02.ValidateTextBox.ValidateText_Alpha_Max'(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_textBox_Property Insured Amount'),
		40)

Mobile.setText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_textBox_Property Insured Amount'),
		GlobalVariable.PropertPriceInputText, 0)

if (GlobalVariable.Applicants_No == '1') {
	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_text_Life Insurance Product Type'),
			'Life Insurance Product Type')

	if (GlobalVariable.LifeInsuranceProductType == 'CLTT') {
		Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_Life Insurance Product Type_RadioButton_CLTT'),
				0)
	}

	if (GlobalVariable.LifeInsuranceProductType == 'MRTT') {
		Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_Life Insurance Product Type_RadioButton_MRTT'),
				0)
	}
}

if (GlobalVariable.Applicants_No == '2') {

	Mobile.swipe(300, 900, 300, 300)

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_2Applicants_text_Life Insurance Product Type (Main Applicant)'),
			'Life Insurance Product Type (Main Applicant)')



	if (GlobalVariable.LifeInsuranceProductType == 'CLTT') {

		Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_2Applicants_radioButton_Main_CLTT'),
				0)
	}

	if (GlobalVariable.LifeInsuranceProductType == 'MRTT') {
		Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_2Applicants_radioButton_Main_MRTT'),
				0)
	}

	Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_button_SaveAndNext'),
			0)

	Mobile.verifyElementVisible(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_2Applicants_errorMessage_Please ensure that only 1 type of insurance is selected'),
			0,FailureHandling.OPTIONAL)

	Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_2Applicants_text_Life Insurance Product Type (Joint Applicant)'),
			'Life Insurance Product Type (Joint Applicant)')

	if (GlobalVariable.LifeInsuranceProductType == 'MRTT') {

		Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_2Applicants_radioButton_Joint_MRTT'),
				0)
	}

	if (GlobalVariable.LifeInsuranceProductType == 'CLTT') {

		Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_2Applicants_radioButton_Joint_CLTT'),
				0)
	}


}

Mobile.tap(findTestObject('Object Repository/Tester02_New/DataEntryPages/DataEntryPage2/DataEntryPage2_button_SaveAndNext'),
		0)






