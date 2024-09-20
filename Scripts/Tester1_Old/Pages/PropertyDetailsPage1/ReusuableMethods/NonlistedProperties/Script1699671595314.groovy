import internal.GlobalVariable as GlobalVariable
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
import org.openqa.selenium.Keys as Keys

//input Lot No,unit no unit details
Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/txt_UnitDetails'), 'Lot No/Dev Lot No/Unit No/Dev Unit No')

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/input_UnitDetails'), GlobalVariable.UnitDetailsDefaultValue)

Mobile.setText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/input_UnitDetails'), GlobalVariable.UnitDetailsInputText,  0)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

//swipe up the screen
//CustomKeywords.'com.keywrods.ScrollAction.scroll'(0.50, 0.20)

Mobile.swipe(300, 900, 300, 300)


// input block storey details
Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/txt_blockStoreyDetails'), 'Jalan/Lorong/Block/Storey')

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/input_blockStoreyDetails'), GlobalVariable.BlockStoreyDetailsDefaultValue)

Mobile.setText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/input_blockStoreyDetails'), GlobalVariable.BlockStoreyDetailsInputText, 
    0)


//input development name
Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/txt_Development Name'), 'Development Name')

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/input_DevelopmentName'), GlobalVariable.DevelopmentNameDefaultValue)

Mobile.setText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/input_DevelopmentName'), GlobalVariable.DevelopmentNameInputText, 
    0)

//input city details
Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/txt_City'), 'City')

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/input_City'), GlobalVariable.CityDefaultValue)

Mobile.setText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/input_City'), GlobalVariable.CityInputText, 
    0)

// input postcode details
Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/txt_Postcode'), 'Postcode')

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/input_Postcode'), GlobalVariable.PostCodeDefaultvalue)

Mobile.setText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/input_Postcode'), GlobalVariable.PostCodeInputText, 
    0)

//swipe up the screen
//CustomKeywords.'com.keywrods.ScrollAction.scroll'(0.50, 0.30)

Mobile.swipe(300, 900, 300, 300)

// Select State
Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/txt_State'), 'State')

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/txt_PleaseSelect'), GlobalVariable.StateDefaultValue)

Mobile.tap(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/txt_PleaseSelect'), 10)

CustomKeywords.'com.keywrods.DropDownValidation.drpDown_Invalidsearch'()

Mobile.setText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/input_Search'), GlobalVariable.StateInputText, 
    10)

Mobile.tap(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/drpDownOption_State', [('State') : GlobalVariable.StateInputText]), 
    10)

//Development Type
Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/txt_DevelopmentType'), 'Development Type')

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/txt_PleaseSelect'), GlobalVariable.DevelopmentTypeDefaultValue)

Mobile.tap(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/txt_PleaseSelect'), 10)

CustomKeywords.'com.keywrods.DropDownValidation.drpDown_Invalidsearch'()
Mobile.setText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/input_Search'), GlobalVariable.DevelopmentTypeInputText, 
    10)

Mobile.tap(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/drpDownOption_DevelopmentType', [('DevelopmentType') : GlobalVariable.DevelopmentTypeInputText]), 
    0)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)

//swipe up the screen
//CustomKeywords.'com.keywrods.ScrollAction.scroll'(0.50, 0.30)
Mobile.swipe(300, 900, 300, 300)



Mobile.delay(15)
/*//Type of building
Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/txt_TypeofBuilding'), 'Type of Building')

//Mobile.tap(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/txt_Residential'), 'Residential')

//Stage of construction
Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/txt_StageofConstruction'), 'Stage of Construction')


//Mobile.tap(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/txt_CompletedwithCCC'), 'Completed with CCC')

// Select Property Area
Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/txt_PropertyArea'), 'Property Area')

Mobile.tap(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/rdo_PropertyArea', [('PropertyArea') : GlobalVariable.PropertyArea]), 
    GlobalVariable.PropertyArea)

// Select Type of Lease 
Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage2/txt_LeaseType'), 'Type of Lease')

Mobile.tap(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/rdo_TypeOfLease', [('TypeOfLease') : GlobalVariable.TypeOfLease]), 
    GlobalVariable.TypeOfLease)


//enter property price
Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/txt_PropertyPrice'), 'Property Price')

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage2/txt_RM'), 'RM')

Mobile.verifyElementText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/input_PropertyPrice'), GlobalVariable.PropertyPriceDefaultValue)

Mobile.setText(findTestObject('Object Repository/Tester1_old/PropertyDetailsPage1/input_PropertyPrice'), GlobalVariable.PropertPriceInputText, 10)*/

//swipe up the screen
CustomKeywords.'com.keywrods.ScrollAction.scroll'(0.30, 0.70)
CustomKeywords.'com.keywrods.ScrollAction.scroll'(0.30, 0.70)
//Mobile.swipe(300, 900, 300, 300)



Mobile.tap(findTestObject('Object Repository/Tester1_old/CommonElements/btn_Next'), 0)

Mobile.delay(5)

Mobile.takeScreenshot(FailureHandling.OPTIONAL)
