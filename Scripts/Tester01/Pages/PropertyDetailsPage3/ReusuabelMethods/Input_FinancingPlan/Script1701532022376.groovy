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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import org.openqa.selenium.WebElement
import io.appium.java_client.AppiumDriver

AppiumDriver<?> driver = MobileDriverFactory.getDriver()

String financingType = GlobalVariable.financingType
String propertyPurchsedFromDeveloper = GlobalVariable.propertyPurchsedFromDeveloper


CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)
Mobile.takeScreenshot(FailureHandling.OPTIONAL)

// validate financing plan details
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/txt_FinancingPlan'), 'Financing Plan')

//financng message diplay
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/txt_FinancingPlanMessageDisplay'), 
    'A recommended financing plan has been auto-selected for you.')

// chnage string to integer to use in the if loops under conventional and islamic 
float propertyvalue = Float.parseFloat(GlobalVariable.PropertPriceInputText.toString().replace(",", ""))
println("propertyvalue"+propertyvalue)
Mobile.comment('property value is '+propertyvalue)
float grossIncome = Float.parseFloat(GlobalVariable.Mothly_Gross_Income.toString().replace(",", ""))
println("grossIncome"+grossIncome)

// choose financing type
//Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/txt_FinancingType'), 'Financing Type', FailureHandling.CONTINUE_ON_FAILURE)
if (financingType.equalsIgnoreCase('Conventional Financing')) {
	
	// select conventional financing financing type
	Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/rdo_ConventionalFinancing'), 0)
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/txt_FinancingPlan_text2'), 'Financing Plan')
	Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_PleaseSelect'), 10)
	Mobile.delay(3)
	Mobile.takeScreenshot(FailureHandling.OPTIONAL)
	
	'Create set to idetify the size of drop down'
	Set<WebElement> drpdownData = driver.findElementsByXPath('(//*[@class = "android.widget.TextView"])');
	ArrayList<String> actualDropdownList = new ArrayList<String>()
	
	'expected array list'
	ArrayList<String> expectedDropdownListSJKP = new ArrayList<String>(Arrays.asList("Maxi Home", "SJKP", "SJKP Madani"))
	
	'Add dropdown value sto array list'
	println("drpdownData size is "+drpdownData.size())
	for (int i = 1; i<=drpdownData.size(); i++) {
		
		String drpDorwnvalue  = driver.findElementByXPath('(//*[@class = "android.widget.TextView"])['+i+']').getText()
		actualDropdownList.add(drpDorwnvalue)
	}
		
	if(propertyvalue > 300000.0 && propertyvalue <= 500000.0 && grossIncome<=11000.0 && GlobalVariable.FirstTimePurchase =='Yes' && GlobalVariable.ExistingHomeFinancing == '0' && 
			(GlobalVariable.Owner =='Main Applicant is the sole owner' || GlobalVariable.Owner =='Joint Applicant is the sole owner' || 
				GlobalVariable.Owner =='Both Main Applicant and Joint Applicant are owners')) {			
			'expected array list'
			ArrayList<String> expectedDropdownList = new ArrayList<String>(Arrays.asList("Maxi Home", "SJKP"))
			
			'compare the 2 array list'
			Collections.sort(expectedDropdownList)
			Collections.sort(actualDropdownList)
			Boolean status = expectedDropdownList.equals(actualDropdownList)
			println('financing plan Status is '+status)
			Mobile.verifyEqual(status, true, FailureHandling.STOP_ON_FAILURE)
		} else if(propertyvalue <= 300000.0 && grossIncome <=11000.0 && GlobalVariable.FirstTimePurchase =='Yes' && GlobalVariable.ExistingHomeFinancing == '0' && 
			(GlobalVariable.Owner =='Main Applicant is the sole owner' || GlobalVariable.Owner =='Joint Applicant is the sole owner' || 
				GlobalVariable.Owner =='Both Main Applicant and Joint Applicant are owners')) {
			ArrayList<String> expectedDropdownList = new ArrayList<String>(Arrays.asList("Maxi Home", "SJKP", "SJKP Madani"))
			
			'compare the 2 array list'
			Collections.sort(expectedDropdownList)
			Collections.sort(actualDropdownList)
			Boolean status = expectedDropdownList.equals(actualDropdownList)
			println('financing plan Status is '+status) 
			Mobile.verifyEqual(status, true, FailureHandling.STOP_ON_FAILURE)
		}else {
			
			ArrayList<String> expectedDropdownList = new ArrayList<String>(Arrays.asList("Maxi Home"))
			
			'compare the 2 array list'
			Collections.sort(expectedDropdownList)
			Collections.sort(actualDropdownList)
			Boolean status = expectedDropdownList.equals(actualDropdownList)
			println('financing plan Status is '+status)
			Mobile.verifyEqual(status, true, FailureHandling.STOP_ON_FAILURE)
		}
			

	//CustomKeywords.'com.keywords.DropDownValidation.drpDown_Invalidsearch'()
	Mobile.setText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/input_Search'), GlobalVariable.FinancingPlanSearchText, 10)
				
    Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/drpDownOption_FinancingPlan', [('FinancingPlan') : GlobalVariable.FinancingPlan]),  10, FailureHandling.CONTINUE_ON_FAILURE)
	// select islamin financing financing type
     
} else if (financingType.equalsIgnoreCase('Islamic Financing')) {
	
    Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/rdo_islamicFinancing'), 0)

    Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/txt_FinancingPlan_text2'), 'Financing Plan')

	Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/txt_PleaseSelect'), 10)
	
	Mobile.delay(3)
	
	Mobile.takeScreenshot(FailureHandling.OPTIONAL)
	
	'Create set to idetify the size of drop down'
	Set<WebElement> drpdownData = driver.findElementsByXPath('(//*[@class = "android.widget.TextView"])');
	ArrayList<String> actualDropdownList = new ArrayList<String>()
	
	'Add dropdown value sto array list'
	println("drpdownData size is "+drpdownData.size())
	for (int i = 1; i<=drpdownData.size(); i++) {
		
		String drpDorwnvalue  = driver.findElementByXPath('(//*[@class = "android.widget.TextView"])['+i+']').getText()
		actualDropdownList.add(drpDorwnvalue)
	}
		
		if(propertyvalue > 300000.0 && propertyvalue <= 500000.0 && grossIncome<=11000.0 && GlobalVariable.FirstTimePurchase =='Yes' && GlobalVariable.ExistingHomeFinancing == '0' && 
			(GlobalVariable.Owner =='Main Applicant is the sole owner' || GlobalVariable.Owner =='Joint Applicant is the sole owner' || 
				GlobalVariable.Owner =='Both Main Applicant and Joint Applicant are owners')) {
			
			'expected array list'
			ArrayList<String> expectedDropdownList = new ArrayList<String>(Arrays.asList("Commodity Murabahah Financing-i", "SJKP HF Guarantee Sch-i"))
			
			'compare the 2 array list'
			Collections.sort(expectedDropdownList)
			Collections.sort(actualDropdownList)
			Boolean status = expectedDropdownList.equals(actualDropdownList)
			println('financing plan Status is '+status)
			Mobile.verifyEqual(status, true, FailureHandling.STOP_ON_FAILURE)
		}else if(propertyvalue <= 300000.0 && grossIncome <= 11000.0 && GlobalVariable.FirstTimePurchase =='Yes' && GlobalVariable.ExistingHomeFinancing == '0' && 
			(GlobalVariable.Owner =='Main Applicant is the sole owner' || GlobalVariable.Owner =='Joint Applicant is the sole owner' || 
				GlobalVariable.Owner =='Both Main Applicant and Joint Applicant are owners')) {		
			'expected array list'
			
			ArrayList<String> expectedDropdownList = new ArrayList<String>(Arrays.asList("Commodity Murabahah Financing-i", "SJKP HF Guarantee Sch-i", "SJKP Madani-i"))
			
			'compare the 2 array list'
			Collections.sort(expectedDropdownList)
			Collections.sort(actualDropdownList)
			Boolean status = expectedDropdownList.equals(actualDropdownList)
			println('financing plan Status is '+status)
			Mobile.verifyEqual(status, true, FailureHandling.STOP_ON_FAILURE)
		}else {
			
			ArrayList<String> expectedDropdownList = new ArrayList<String>(Arrays.asList("Commodity Murabahah Financing-i"))
			
			'compare the 2 array list'
			Collections.sort(expectedDropdownList)
			Collections.sort(actualDropdownList)
			Boolean status = expectedDropdownList.equals(actualDropdownList)
			println('financing plan Status is '+status)
			Mobile.verifyEqual(status, true, FailureHandling.STOP_ON_FAILURE)
		}

    //CustomKeywords.'com.keywords.DropDownValidation.drpDown_Invalidsearch'()

	Mobile.setText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/input_Search'), GlobalVariable.FinancingPlanSearchText, 10)
				
    Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/drpDownOption_FinancingPlan', [('FinancingPlan') : GlobalVariable.FinancingPlan]),  10, FailureHandling.CONTINUE_ON_FAILURE)
	// select islamin financing financing type

}
	CustomKeywords.'com.keywords.ScrollAction.scroll'(0.30, 0.70)
	if (propertyPurchsedFromDeveloper.equalsIgnoreCase('Yes')) {
		
		
		Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/btn_Next'), 30, FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/btn_Next'), 0, FailureHandling.OPTIONAL)
		CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)
		CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)

		//validate vendor details
		Mobile.waitForElementPresent(findTestObject('Tester01/PropertyDetailsPage3/txt_VendorDetails'), 30, FailureHandling.CONTINUE_ON_FAILURE)
		
		Mobile.takeScreenshot(FailureHandling.OPTIONAL)
		
		Mobile.verifyElementText(findTestObject('Tester01/PropertyDetailsPage3/txt_VendorDetails'), 'Vendor Details', FailureHandling.CONTINUE_ON_FAILURE)
		
		Mobile.verifyElementText(findTestObject('Tester01/PropertyDetailsPage3/txt_AddVendor'), 'Add Vendor', FailureHandling.CONTINUE_ON_FAILURE)
		
		// enter vendor name
		Mobile.verifyElementText(findTestObject('Tester01/PropertyDetailsPage3/txt_Name'), 'Name', FailureHandling.CONTINUE_ON_FAILURE)
		
		Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/input_VendorName'), 'e.g. Vendor Business Sdn Bhd', FailureHandling.CONTINUE_ON_FAILURE)
		
		Mobile.setText(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/input_VendorName'), GlobalVariable.VendorNameInputValue, 0, FailureHandling.CONTINUE_ON_FAILURE)
		
		CustomKeywords.'com.keywords.ScrollAction.scroll'(0.50, 0.30)
		
		//enter vendor ID Type
		Mobile.verifyElementText(findTestObject('Tester01/PropertyDetailsPage3/txt_IDType'), 'ID Type', FailureHandling.CONTINUE_ON_FAILURE)
		
		Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/drpDown_IDType'), 'Please Select', FailureHandling.CONTINUE_ON_FAILURE)
		
		Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/drpDown_IDType'), 10, FailureHandling.CONTINUE_ON_FAILURE)
				
		CustomKeywords.'com.keywords.DropDownValidation.drpDown_Invalidsearch'()
			
		Mobile.setText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/input_Search'), GlobalVariable.VendorIDTypeInputValue , 10, FailureHandling.CONTINUE_ON_FAILURE)
		
		Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/drpDown_Option', [('Variable') : GlobalVariable.VendorIDTypeInputValue]),
				10, FailureHandling.CONTINUE_ON_FAILURE)
			
		//enter vendor id number
		Mobile.verifyElementText(findTestObject('Tester01/PropertyDetailsPage3/txt_IDNumber'), 'ID Number', FailureHandling.CONTINUE_ON_FAILURE)
		
		Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/input_IDNumber'), GlobalVariable.VendorIdNumberDefaultvalue, FailureHandling.CONTINUE_ON_FAILURE)
		
		Mobile.setText(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/input_IDNumber'), GlobalVariable.VendorIDNumberInputValue, 0, FailureHandling.CONTINUE_ON_FAILURE)
		
		//enter vendor alternate ID Type
		/*Mobile.verifyElementText(findTestObject('Tester01/PropertyDetailsPage3/txt_AlternateIDType'), 'Alternate ID Type (Optional)')
		
		Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/drpDown_IDType'), 'Please Select')
		
		Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/drpDown_IDType'), 10)
		
		CustomKeywords.'com.keywords.DropDownValidation.drpDown_Invalidsearch'()
			
		Mobile.setText(findTestObject('Object Repository/Tester01/PropertyDetailsPage1/input_Search'), GlobalVariable.VendorAlternateIDTypeInputValue , 10)
		
		Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/drpDown_Option', [('Variable') : GlobalVariable.VendorAlternateIDTypeInputValue]), 10)
		
		//enter vendor alternate id number
		Mobile.verifyElementText(findTestObject('Tester01/PropertyDetailsPage3/txt_AlternateIDNumber'), 'Alternate ID Number')
		
		Mobile.verifyElementText(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/input_AlternateIDNumber'), GlobalVariable.VendorAlternateIDNumberDefaultValue)
		
		Mobile.setText(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/input_AlternateIDNumber'), GlobalVariable.VendorAlternateIDNumberInputValueValue, 0)
		
		Mobile.verifyElementVisible(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/btn_CheckVendorOCISS'), 30)
			
		CustomKeywords.'com.keywords.ScrollAction.scroll'(0.30, 0.70)
		CustomKeywords.'com.keywords.ScrollAction.scroll'(0.30, 0.70)*/
		
		Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/btn_CheckVendorOCISS'), 0,  FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/btn_CheckVendorOCISS'), 0,  FailureHandling.OPTIONAL)
		
		Mobile.delay(5)
		
		Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/btn_ConfirmAndNext'), 0,  FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/btn_ConfirmAndNext'), 0,  FailureHandling.OPTIONAL)
		
		
		}else{
			
			Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/btn_Check Eligibility'), 30, FailureHandling.CONTINUE_ON_FAILURE)
			Mobile.tap(findTestObject('Object Repository/Tester01/PropertyDetailsPage3/btn_Check Eligibility'), 0, FailureHandling.OPTIONAL)
			
		}
		

	Mobile.delay(4)
	
	Mobile.takeScreenshot(FailureHandling.OPTIONAL)
