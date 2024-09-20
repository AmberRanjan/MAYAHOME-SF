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

/**Author: Vasudha
 * 
 */
//Mobile.startExistingApplication(GlobalVariable.SF_ApplicationID)





Mobile.callTestCase(findTestCase('Tester02_New/Pages/Login/ReusableMethods_Login/Method_Login'), [:], FailureHandling.STOP_ON_FAILURE)

//Mobile.callTestCase(findTestCase('Tester02_New/Pages/Login/TC_001_LoginPageValidation'), [:], FailureHandling.STOP_ON_FAILURE)
//Mobile.callTestCase(findTestCase('Tester02_New/Pages/HomePage/HomePage_Validation'), [:], FailureHandling.STOP_ON_FAILURE)
Mobile.callTestCase(findTestCase('Tester02_New/Pages/HomePage/HomePage_StartNewApplication'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Tester02_New/Pages/StartNewApplicationPage/StartNewAppliucation_Page_Validation'), [:], FailureHandling.STOP_ON_FAILURE)

if (GlobalVariable.Applicants_No == '2') {
	Mobile.callTestCase(findTestCase('Tester02_New/Pages/2ApplicantsCustomerOnboardingPage/2ApplicantsCustomerOnboardingPage_Validation'),
		[:], FailureHandling.STOP_ON_FAILURE)
}

Mobile.callTestCase(findTestCase('Tester02_New/Pages/CustomerOnboardingPage_1/CustomerOnboardingPage_1_Validation_Full'), [:],
	FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Tester02_New/Pages/CustomerOnboardingPage_2/CustomerOnboardingPage_2_Validation_Full'), [:],
	FailureHandling.STOP_ON_FAILURE)
	


Mobile.callTestCase(findTestCase('Tester02_New/Pages/CustomerOnboardingPage_3/CustomerOnboardingPage_3_Validation_Full'), [:],
	FailureHandling.STOP_ON_FAILURE)
	

Mobile.callTestCase(findTestCase('Tester02_New/Pages/CustomerOnboardingPage_4/CustomerOnboardingPage_4_Validation_Full'), [:],
	FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Tester02_New/Pages/CustomerOnboardingPage_5/CustomerOnboardingPage_5_Validation_Full'), [:],
	FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Tester02_New/Pages/CustomerOnboarding_ConfirmationPage/CustomerOnboarding_ConfirmationPage'),
	[:], FailureHandling.STOP_ON_FAILURE)

if (GlobalVariable.Applicants_No == '2') {
	Mobile.callTestCase(findTestCase('Tester02_New/Pages/CustomerOnboardingPage_1_JointApplicant/CustomerOnboardingPage_1_JointApplicant_Validation_Full'),
		[:], FailureHandling.STOP_ON_FAILURE)

	Mobile.callTestCase(findTestCase('Tester02_New/Pages/CustomerOnboardingPage_2_JointApplicant/CustomerOnboardingPage_2_JointApplicant_Validation_Full'),
		[:], FailureHandling.STOP_ON_FAILURE)

	Mobile.callTestCase(findTestCase('Tester02_New/Pages/CustomerOnboardingPage_3_JointApplicant/CustomerOnboardingPage_3_JointApplicant_Validation_Full'),
		[:], FailureHandling.STOP_ON_FAILURE)

	Mobile.callTestCase(findTestCase('Tester02_New/Pages/CustomerOnboardingPage_4_JointApplicant/CustomerOnboardingPage_4_JointApplicant_Validation_Full'),
		[:], FailureHandling.STOP_ON_FAILURE)

	Mobile.callTestCase(findTestCase('Tester02_New/Pages/CustomerOnboardingPage_5_JointApplicant/CustomerOnboardingPage_5_JointApplicant_Validation_Full'),
		[:], FailureHandling.STOP_ON_FAILURE)

	Mobile.callTestCase(findTestCase('Tester02_New/Pages/CustomerOnboarding_ConfirmationPage/CustomerOnboarding_ConfirmationPage_JointApplicant'),
		[:], FailureHandling.STOP_ON_FAILURE)
}

Mobile.callTestCase(findTestCase('Tester02_New/Pages/CustomerOnboarding_ConsentPages/CustomerOnboarding_ConsentPage'), [:],
	FailureHandling.STOP_ON_FAILURE)


Mobile.callTestCase(findTestCase('Tester02_New/Pages/PropertyDetailsPage1/PropertyDetailsPage1_Listed'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Tester02_New/Pages/PropertyDetailsPage2/PropertyDetailsPage2_Listed'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Tester02_New/Pages/PropertyDetailsPage3/PropertyDetailsPage3_Listed'), [:], FailureHandling.STOP_ON_FAILURE)


//---------------------------------------------------BAU Pass Screen script Required-------------------------------------------------------
//Mobile.callTestCase(findTestCase('Tester02_New/Pages/Results_Screens/STP_Pass/STP_Pass_PageValidation_Full'), [:], FailureHandling.STOP_ON_FAILURE)

//---------------------------------------------------BAU Pass Screen script Required-------------------------------------------------------


Mobile.delay(10)
	
Mobile.callTestCase(findTestCase('Tester02_New/Pages/Results_Screens/STP_Pass/BrachNamePage'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Tester02_New/Pages/Results_Screens/STP_Pass/BranchName_SuccessPage'), [:], FailureHandling.STOP_ON_FAILURE)


Mobile.callTestCase(findTestCase('Tester02_New/Pages/DataEntryPages/DataEntryPage2/DataEntryPage2_Validation_Full'), [:], FailureHandling.STOP_ON_FAILURE)



Mobile.callTestCase(findTestCase('Tester02_New/Pages/DataEntryPages/DataEntryPage3/DataEntryPage3_Validation_Full'), [:], FailureHandling.STOP_ON_FAILURE)



Mobile.callTestCase(findTestCase('Tester02_New/Pages/DataEntryPages/DataEntryPage4/DataEntryPage4_Validation_Full'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Tester02_New/Pages/DataEntryPages/DataEntryPage5/DataEntryPage5_Validation_Full'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Tester02_New/Pages/DataEntryPages/DataEntryPage5/DataEntryPage5_Confirmation_Validation_Full'), 
    [:], FailureHandling.STOP_ON_FAILURE)
    
  
Mobile.callTestCase(findTestCase('Tester02_New/Pages/DataEntryPages/DataEntryPage6/DataEntryPage6_Validation_Full'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Tester02_New/Pages/DataEntryPages/DataEntryPage6/DataEntryPage6_Confirmation_Validation_Full'), 
    [:], FailureHandling.STOP_ON_FAILURE)
      
Mobile.callTestCase(findTestCase('Tester02_New/Pages/DataEntryPages/ReviewPage/ReviewPage_Validation_Full'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Tester02_New/Pages/DataEntryPages/DataEntryCompletedPage/DataEntryCompletedPage_Validation_Full'), 
    [:], FailureHandling.STOP_ON_FAILURE)

