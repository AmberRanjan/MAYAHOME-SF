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


/**Author:: Vasudha
 * JIRA ticeks covered:
 * M25SP3DSF-8
 * M25SP3DSF-71
 * M25SP3DSF-69
 * M25SP3DSF-34 
 * M25SP3DSF-35 
 * M25SP3DSF-36 
 */


Mobile.startExistingApplication( GlobalVariable.SF_ApplicationID)
Mobile.unlockScreen()
//Verify the all Elements Text on the Login Page
Mobile.comment('Verify the all Elements Text on the Login Page')

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/LoginPage/LoginPage_text_Login to Sales Force'), 10,
	FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/LoginPage/LoginPage_text_Login to Sales Force'), 'Login to Sales Force',
		FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/LoginPage/LoginPage_text_Please enter your details below'), 'Please enter your details below.',
		FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/LoginPage/LoginPage_textBoxLabel_PF Number'), 'PF Number', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/LoginPage/LoginPage_textBoxLabel_Password'), 'Password', FailureHandling.CONTINUE_ON_FAILURE) //--> IOS Identification is difficult

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/LoginPage/LoginPage_text_Note'), 'Note: Use of this system is restricted to activities and purposes authorised by Maybank Group Management. Unauthorised use may result in disciplinary action and/or legal prosecution.',
		FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/LoginPage/LoginPage_buttonText_Login'), 'Login', FailureHandling.CONTINUE_ON_FAILURE) //--> Login Button text is different in IOS(LOGIN) and Android(Login)

// Verify Login Button is Grayedout and not clickable when PF Number and Password Fields are Empty
Mobile.comment('Verify Login Button is Grayedout and not clickable when PF Number and Password Fields are Empty')

Mobile.verifyElementAttributeValue(findTestObject('Object Repository/Tester02_New/LoginPage/LoginPage_button_Login'), 'enabled', 'false',
		10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester02_New/LoginPage/LoginPage_button_Login'), 10, FailureHandling.CONTINUE_ON_FAILURE)

//Verify Login Button is Grayedout and not clickable when PF Number is wrong and Password Field is Empty
Mobile.comment('Verify Login Button is Grayedout and not clickable when PF Number is wrong and Password Field is Empty')

Mobile.setText(findTestObject('Tester02_New/LoginPage/LoginPage_textBox_PF Number'), '0012', 10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementAttributeValue(findTestObject('Object Repository/Tester02_New/LoginPage/LoginPage_button_Login'), 'enabled', 'false',
		10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester02_New/LoginPage/LoginPage_button_Login'), 10, FailureHandling.CONTINUE_ON_FAILURE)

//Verify Login Button is clickable when PF Number is wrong and Password Field is filled and verify Wrong PF number message
Mobile.comment('Verify Login Button is clickable when PF Number is wrong and Password Field is filled and verify Wrong PF number message')

Mobile.setText(findTestObject('Tester02_New/LoginPage/LoginPage_textBox_Password'), GlobalVariable.SF_Agent_Password, 10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester02_New/LoginPage/LoginPage_button_Login'),10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/LoginPage/LoginPage_text_PF Number does not exist'), 'PF Number does not exist. Refer to your manager for more information',
	FailureHandling.CONTINUE_ON_FAILURE)
/*


//Verify Please enter PF Number

//Mobile.clearText(findTestObject('Tester02_New/LoginPage/LoginPage_textBox_PF Number'), 0)  --> Not required doing automatic clear after clicking Login button

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/Tester02_New/LoginPage/LoginPage_button_Login'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/LoginPage/LoginPage_text_Please enter PF number'), 'Please enter PF number',
	FailureHandling.CONTINUE_ON_FAILURE)
*/
//Verify Login Button is Grayedout and not clickable when PF Number is empty and Password Field is filled
Mobile.comment('Verify Login Button is Grayedout and not clickable when PF Number is empty and Password Field is filled')



//Mobile.clearText(findTestObject('Tester02_New/LoginPage/LoginPage_textBox_Password'), 0) --> Not required doing automatic clear after clicking Login button
Mobile.clearText(findTestObject('Tester02_New/LoginPage/LoginPage_textBox_PF Number'), 10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Tester02_New/LoginPage/LoginPage_textBox_Password'), GlobalVariable.SF_Agent_Password, 10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementAttributeValue(findTestObject('Object Repository/Tester02_New/LoginPage/LoginPage_button_Login'), 'enabled', 'false',
		10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester02_New/LoginPage/LoginPage_button_Login'), 10, FailureHandling.CONTINUE_ON_FAILURE)

//Verify Login Button is clickable when PF Number and Password Fields are filled
Mobile.comment('Verify Login Button is clickable when PF Number and Password Fields are filled')

Mobile.setText(findTestObject('Tester02_New/LoginPage/LoginPage_textBox_PF Number'), GlobalVariable.UserID, 10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementAttributeValue(findTestObject('Object Repository/Tester02_New/LoginPage/LoginPage_button_Login'), 'enabled', 'true',
		10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester02_New/LoginPage/LoginPage_button_Login'), 10, FailureHandling.CONTINUE_ON_FAILURE)

Boolean UserIsOnHomePage = Mobile.verifyElementExist(findTestObject('Object Repository/Tester02_New/HomePage_text_Hire Purchase'),
		10, FailureHandling.OPTIONAL)

if (UserIsOnHomePage == true) {
	println('Login Successful') /*Mobile.verifyElementText(findTestObject('Object Repository/FirstTimeLoginPage/FirstTimeLoginPage_text_Your preferred name is the name you would like to be known publicly to your customers.You are unable to change it once its confirmed'),
	 'Your preferred name is the name you would like to be known publicly to your customers. You are unable to change it once it’s confirmed.',
	 FailureHandling.OPTIONAL)
	 */
} else {
	Boolean userIsLoginFirstTimeScreen = Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/FirstTimeLoginPage/FirstTimeLoginPage_text_What is a preferred name'),
			10, FailureHandling.OPTIONAL)

	if (userIsLoginFirstTimeScreen == true) {
		Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/FirstTimeLoginPage/FirstTimeLoginPage_buttonText_I Understand'),
				'I Understand', FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.tap(findTestObject('Object Repository/Tester02_New/FirstTimeLoginPage/FirstTimeLoginPage_buttonText_I Understand'), 10, FailureHandling.CONTINUE_ON_FAILURE)

		Boolean UserIsOnFirstTimeLoginPreferredNamePage = Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/FirstTimeLoginPage/FirstTimeLoginPage_text_First-Time Login'),
				10, FailureHandling.OPTIONAL)

		if (UserIsOnFirstTimeLoginPreferredNamePage == true) {
			Mobile.verifyElementAttributeValue(findTestObject('Object Repository/Tester02_New/FirstTimeLoginPage/FirstTimeLoginPage_button_Next'),
					'enabled', 'false', 10, FailureHandling.CONTINUE_ON_FAILURE)

			Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/FirstTimeLoginPage/FirstTimeLoginPage_text_First-Time Login'),
					'First-Time Login', FailureHandling.CONTINUE_ON_FAILURE)

			Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/FirstTimeLoginPage/FirstTimeLoginPage_text_Let us know your preferred name 0'),
					'Let us know your preferred name 0', FailureHandling.CONTINUE_ON_FAILURE)

			Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/FirstTimeLoginPage/FirstTimeLoginPage_textBoxText_Preferred Name'),
					'Preferred Name', FailureHandling.CONTINUE_ON_FAILURE)

			Mobile.setText(findTestObject('Object Repository/Tester02_New/FirstTimeLoginPage/FirstTimeLoginPage_textbox_loginPreferredNameInput'),
					GlobalVariable.FirstTimeLoginUserName, 10, FailureHandling.CONTINUE_ON_FAILURE)

			Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/FirstTimeLoginPage/FirstTimeLoginPage_buttonText_Next'),
					'Next', FailureHandling.CONTINUE_ON_FAILURE)

			Mobile.verifyElementAttributeValue(findTestObject('Object Repository/Tester02_New/FirstTimeLoginPage/FirstTimeLoginPage_button_Next'),
					'enabled', 'true', 10, FailureHandling.CONTINUE_ON_FAILURE)

			Mobile.tap(findTestObject('Object Repository/Tester02_New/FirstTimeLoginPage/FirstTimeLoginPage_button_Next'), 10, FailureHandling.CONTINUE_ON_FAILURE)
		}

		Boolean UserIsOnFirstTimeLoginMobileNumberPage = Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/FirstTimeLoginPage/FirstTimeLoginPage_text_First-Time Login'),
				10, FailureHandling.OPTIONAL)

		if (UserIsOnFirstTimeLoginMobileNumberPage == true) {
			Mobile.verifyElementAttributeValue(findTestObject('Object Repository/Tester02_New/FirstTimeLoginPage/FirstTimeLoginPage_MobileNumber_Button_Next'),
					'enabled', 'false', 10, FailureHandling.CONTINUE_ON_FAILURE)

			Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/FirstTimeLoginPage/FirstTimeLoginPage_text_First-Time Login'),
					'First-Time Login', FailureHandling.CONTINUE_ON_FAILURE)

			Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/FirstTimeLoginPage/FirstTimeLoginPage_MobileNumber_text_Please add your mobile phone number'),
					'Please add your mobile phone number', FailureHandling.CONTINUE_ON_FAILURE)

			Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/FirstTimeLoginPage/FirstTimeLoginPage_MobileNumber_textBox_loginPreferredMobileNumber'),
					'eg. 0123456789', FailureHandling.CONTINUE_ON_FAILURE)

			Mobile.setText(findTestObject('Object Repository/Tester02_New/FirstTimeLoginPage/FirstTimeLoginPage_MobileNumber_textBox_loginPreferredMobileNumber'),
					'ex;kj87657', 10, FailureHandling.CONTINUE_ON_FAILURE)

			Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/FirstTimeLoginPage/FirstTimeLoginPage_MobileNumber_text_Please enter a valid phone number in order to proceed. Eg 0122228262'),
					20, FailureHandling.OPTIONAL)

			Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/FirstTimeLoginPage/FirstTimeLoginPage_MobileNumber_text_Please enter a valid phone number in order to proceed. Eg 0122228262'),
					'Please enter a valid phone number in order to proceed. Eg 0122228262', FailureHandling.OPTIONAL)

			Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/FirstTimeLoginPage/FirstTimeLoginPage_MobileNumber_textButton_Next'),
					'Next', FailureHandling.OPTIONAL)

			Mobile.verifyElementAttributeValue(findTestObject('Object Repository/Tester02_New/FirstTimeLoginPage/FirstTimeLoginPage_MobileNumber_Button_Next'),
					'enabled', 'true', 10, FailureHandling.CONTINUE_ON_FAILURE)

			Mobile.tap(findTestObject('Object Repository/Tester02_New/FirstTimeLoginPage/FirstTimeLoginPage_MobileNumber_Button_Next'),
					10, FailureHandling.CONTINUE_ON_FAILURE)

			Mobile.clearText(findTestObject('Object Repository/Tester02_New/FirstTimeLoginPage/FirstTimeLoginPage_MobileNumber_textBox_loginPreferredMobileNumber'),
					10, FailureHandling.CONTINUE_ON_FAILURE)

			Mobile.setText(findTestObject('Object Repository/Tester02_New/FirstTimeLoginPage/FirstTimeLoginPage_MobileNumber_textBox_loginPreferredMobileNumber'),
					GlobalVariable.FirstTimeLoginMobileNumber, 10, FailureHandling.CONTINUE_ON_FAILURE)
		}
		Boolean UserIsOnFirstTimeLoginSignaturePage = Mobile.waitForElementPresent(findTestObject('Object Repository/Tester02_New/FirstTimeLoginPage/FirstTimeLoginPage_Sign_text_Please draw your signature in the box below0'),
				10, FailureHandling.OPTIONAL)
		if(UserIsOnFirstTimeLoginSignaturePage == true)
		{

			Mobile.tap(findTestObject('Object Repository/Tester02_New/FirstTimeLoginPage/FirstTimeLoginPage_Sign_Button_Back'), 10, FailureHandling.CONTINUE_ON_FAILURE)

			Mobile.tap(findTestObject('Tester02_New/FirstTimeLoginPage/FirstTimeLoginPage_MobileNumber_Button_Next'), 10, FailureHandling.CONTINUE_ON_FAILURE)

			Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/FirstTimeLoginPage/FirstTimeLoginPage_Sign_text_Please draw your signature in the box below0'),
					'Please draw your signature in the box below0')

			Mobile.tap(findTestObject('Object Repository/Tester02_New/FirstTimeLoginPage/FirstTimeLoginPage_Sign_Button_Done'), 10, FailureHandling.CONTINUE_ON_FAILURE)

			Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/FirstTimeLoginPage/FirstTimeLoginPage_Sign_ButtonText_Done'),
					'Done')

			Mobile.tap(findTestObject('Object Repository/Tester02_New/FirstTimeLoginPage/FirstTimeLoginPage_Sign_box_Signature'),10, FailureHandling.CONTINUE_ON_FAILURE)

			Mobile.tap(findTestObject('Object Repository/Tester02_New/FirstTimeLoginPage/FirstTimeLoginPage_Sign_Button_Clear Signature'),10, FailureHandling.CONTINUE_ON_FAILURE)

			Mobile.tap(findTestObject('Tester02_New/FirstTimeLoginPage/FirstTimeLoginPage_Sign_box_Signature'), 10, FailureHandling.CONTINUE_ON_FAILURE)

			Mobile.tap(findTestObject('Tester02_New/FirstTimeLoginPage/FirstTimeLoginPage_Sign_Button_Done'), 10, FailureHandling.CONTINUE_ON_FAILURE)

			Mobile.verifyElementText(findTestObject('Object Repository/Tester02_New/FirstTimeLoginPage/FirstTimeLoginPage_Success_text_Welcome to Sales Force'),
					'Welcome to Sales Force!')

			Mobile.getText(findTestObject('Object Repository/Tester02_New/FirstTimeLoginPage/FirstTimeLoginPage_Success_text_Youre all set to do great work with your team'),
					10, FailureHandling.CONTINUE_ON_FAILURE)

			Mobile.getText(findTestObject('Object Repository/Tester02_New/FirstTimeLoginPage/FirstTimeLoginPage_Success_Button_Dismiss'),10, FailureHandling.CONTINUE_ON_FAILURE)

			Mobile.tap(findTestObject('Object Repository/Tester02_New/FirstTimeLoginPage/FirstTimeLoginPage_Success_Button_Dismiss'),10, FailureHandling.CONTINUE_ON_FAILURE)
		}
	}
}

Mobile.closeApplication()

