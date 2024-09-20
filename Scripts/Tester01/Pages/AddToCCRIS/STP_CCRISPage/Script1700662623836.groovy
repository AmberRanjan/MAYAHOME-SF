import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
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

Mobile.delay(10)

Mobile.setText(findTestObject('Object Repository/Tester01/CommonElements/input_PFNumber'), '80008113', 0)

Mobile.setText(findTestObject('Object Repository/Tester01/CommonElements/input_Password'), 'Tester1', 0)

Mobile.tap(findTestObject('Object Repository/Tester01/CommonElements/btn_Login'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/CommonElements/txt_Mortgage'), 'Mortgage')

Mobile.delay(60)

GlobalVariable.StpId = 'STP ID: MSF231127192742163'

GlobalVariable.FinancingAmountApplicantionEligiblityPage = 'RM 79,200.00'

GlobalVariable.MonthlyInstallmentApplicationEligiblitypAge = 'RM 385.00'

GlobalVariable.BankSellingPriceAllipacationEligiblityPage = 'RM 327,554.96'

GlobalVariable.InterestrateAplicationEligiblityPage = '4.5%'

GlobalVariable.LoanPeriodAplicationEligiblityPage = '35 Years'

String propertyType = GlobalVariable.PropertyType

String noOfAplicants = GlobalVariable.NoOfApplicants

String financingType = GlobalVariable.financingType


//click other action required and enter the stp id
Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_OtherActionRequired'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_OtherActionRequired'), 0)

String stpId = GlobalVariable.StpId
Mobile.setText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_SearchBar'), stpId.substring(8), 0)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CaseListing0'), 0)

// validat main applicant name, joining applicant name, property details name and status of the Application
Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_MAYA'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_BackArrow'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_ChatIcon'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_StarIcon'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_ThreeDots'), 0)

if (noOfAplicants.equalsIgnoreCase('2')) {
	
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_MainApplicantNameValue'), GlobalVariable.MainApplicant)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_JointApplicantNameValue'), GlobalVariable.JointApplicant)

}else if (noOfAplicants.equalsIgnoreCase('1')) {

	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_MainApplicantNameValue'), GlobalVariable.MainApplicant)
	
}

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CaseDetailsDisplay'), GlobalVariable.PropertyNameInputTextApplicationPage)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CaseDetailsTimelinetext'), 'Pending Add to CCRIS')

// Expand to verify the previous status of Add to CCRIS
Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_DownArrow'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_FullStatus'), 'Please proceed to Add CCRIS')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CCRIS_0'), 'Pending Add to CCRIS')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CCRIS_1'), 'Pending Manager’s Approval')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CCRIS_2'), 'Pending Processing')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CCRIS_3'), 'Successful AIP')

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_UpArrow'), 0)

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)

if (financingType.equalsIgnoreCase('Islamic Financing')) {
	
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CMHomeFinancing'), 'CM Home Financing-i')

} else if (financingType.equalsIgnoreCase('Conventional Financing')) {

	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_MaxiHome'), 'MaxiHome')

}

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_STPID'), GlobalVariable.StpId)

//Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CaseDetailsAANumber'), 'AA No: LOC1/64052/2023/5799')

//Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CaseDetailsRefIndex'), 'Ref. Index: 235693')

//Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_RightArrow'), 0)

//add code end to end Application details page

// verify the Loan related details

if (financingType.equalsIgnoreCase('Islamic Financing')) {
	
	//validate financing amount and intending financial amountvalue
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_FinancingAmount'), 'Financing Amount')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_ProfitRate'), 'Profit Rate')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_ProfitrateValue'), GlobalVariable.InterestrateAplicationEligiblityPage)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_BanksSellingPrice'), 'Bank\'s Selling Price')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_BankSellingPriceValue'), GlobalVariable.BankSellingPriceAllipacationEligiblityPage)

	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_FinaningPeriod'), 'Financing Period')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_FinancingPeriodValue'), GlobalVariable.LoanPeriodAplicationEligiblityPage)
	
	} else if (financingType.equalsIgnoreCase('Conventional Financing')) {
	
	//validate financing amount and intending financial amountvalue
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_LoanAmount'), 'Loan Amount')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_InterestRate'), 'Interest Rate')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_InterestRateValue'), GlobalVariable.InterestrateAplicationEligiblityPage)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_LoanPeriod'), 'Loan Period')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_LoanPeriodValue'), GlobalVariable.LoanPeriodAplicationEligiblityPage)
	
	}
	
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_FinancingAmountValue'), GlobalVariable.FinancingAmountApplicantionEligiblityPage)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_PurchaseAmount'), 'Purchase Amount')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_PropertyAmountValue'), GlobalVariable.PropertPriceInputText_Validation)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_MonthlyInstalment'), 'Monthly Instalment')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_MonthlyInstallmentValue'), GlobalVariable.MonthlyInstallmentApplicationEligiblitypAge)

//case processings
//Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_CaseProcessing'), 0)
//////code to click back button

//know your customer

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_KnowYourCutomer'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_KnowYourCustomer'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_VerifyApplicantsIdentity'), 'Verify your applicant’s identity')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_KYCDescription'), 'Please prepare relevant documents (e.g: applicant’s ID) before proceeding.')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_ProceedWithKYC_KnowYourCustomer'), 'Proceed with KYC')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_FailApplicant'), 'Fail Applicant')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_FailApplicantDescription'), 'If this applicant has failed to produce valid documents, you can indicate that they\'ve failed the verification process.')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_MarkAsFail'), 'Mark as Fail')

//////code to click back button

///verify Documnets and files

Mobile.delay(10)

//Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_DocumentsAndFiles'), 0)

//Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_Documents'), 0)

//click proceed to Add CCris
Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_ProceedToAddCCRS'), 0)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_Home'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_OtherActionRequired'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_OtherActionRequired'), 0)

Mobile.setText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_SearchBar'), stpId.substring(8), 0)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CaseListing0'), 0)

// validat main applicant name, joining applicant name, property details name and status of the Application
Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_MAYA'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_STPID'), GlobalVariable.StpId)

// verify proceed to system check and previous status details
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CaseDetailsTimelinetext'), 'Pending automated system check')

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_DownArrow'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CCRIS_0'), 'Pending automated system check')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_FullStatus'), 'Please click on the button to proceed.')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CCRIS_1'), 'Pending Add to CCRIS')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CCRIS_2'), 'Pending Manager’s Approval')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CCRIS_3'), 'Pending Processing')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CCRIS_4'), 'Successful AIP')

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_UpArrow'), 0)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_ProceedWithSystemCheck'), 0)


//verifypending KYC and previous status details
Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_Home'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_PendingKYC'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_PendingKYC'), 0)

Mobile.setText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_SearchBar'), stpId.substring(8), 0)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CaseListing0'), 0)

// validat main applicant name, joining applicant name, property details name and status of the Application
Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_MAYA'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_STPID'), GlobalVariable.StpId)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CaseDetailsTimelinetext'), 'Pending KYC')

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_DownArrow'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CCRIS_0'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CCRIS_0'), 'Pending KYC')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_FullStatus'), 'Please schedule to perform KYC soon!')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CCRIS_1'), 'Pending automated system check')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CCRIS_2'), 'Pending Add to CCRIS')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CCRIS_3'), 'Pending Manager’s Approval')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CCRIS_4'), 'Pending Processing')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CCRIS_5'), 'Successful AIP')

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_UpArrow'), 0)

//CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)
Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_ProceedWithKYC'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_ProceedWithKYC_KnowYourCustomer'),
	30)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_ProceedWithKYC'), 0)


Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_KnowYourCustomer'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_UploadDocuments'), 'Please upload images of these necessary documents')

if (noOfAplicants.equalsIgnoreCase('2')) {
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_MainApplicantsID'), 'Main Applicant\'s ID')

	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_MyKad_MainApplicant'), 'MyKad (Front & back)')

	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_0Of2DocumentsUploaded_MainApplcant'),
		'0 out of 2 documents uploaded')

	WebUI.callTestCase(findTestCase('Tester01/Pages/AddToCCRIS/ReusableMethods/CameraClick_KnowYourCustomer'), [:], FailureHandling.STOP_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_0Of2DocumentsUploaded_MainApplcant'),
		'2 out of 2 documents uploaded')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_JointApplicantsID'), 'Joint Applicant\'s ID')

	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_MyKad_JointApplicant'), 'MyKad (Front & back)')

	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_0Of2DocumentsUploaded_JointApplcant'),
		'0 out of 2 documents uploaded')
	WebUI.callTestCase(findTestCase('Tester01/Pages/AddToCCRIS/ReusableMethods/CameraClick_KnowYourCustomer'), [:], FailureHandling.STOP_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_0Of2DocumentsUploaded_JointApplcant'),
		'2 out of 2 documents uploaded')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_BookingFormOtherDocument'), 'Booking Form & Other Document(s)')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_0Outof10DocumentsUploaded_BookingForm'),
		'0 out of 10 documents uploaded')
	WebUI.callTestCase(findTestCase('Test Cases/Tester01/Pages/AddToCCRIS/ReusableMethods/CameraClick_KnowYourCustomerBookingForm'), [:], FailureHandling.STOP_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_0Outof10DocumentsUploaded_BookingForm'),
		'2 out of 10 documents uploaded')
} else if (noOfAplicants.equalsIgnoreCase('1')) {
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_MainApplicantsID'), 'Applicant\'s ID')

	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_MyKad_MainApplicant'), 'MyKad (Front & back)')

	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_0Of2DocumentsUploaded_MainApplcant'), '0 out of 2 documents uploaded')
	
	WebUI.callTestCase(findTestCase('Tester01/Pages/AddToCCRIS/ReusableMethods/CameraClick_KnowYourCustomer'), [:], FailureHandling.STOP_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_0Of2DocumentsUploaded_MainApplcant'), '2 out of 2 documents uploaded')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_BookingFormOtherDocumentSingleApplicant'), 'Booking Form & Other Document(s)')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_0Outof10DocumentsUploaded_BookingFormSingleApplicant'), '0 documents uploaded')
	
	WebUI.callTestCase(findTestCase('Test Cases/Tester01/Pages/AddToCCRIS/ReusableMethods/CameraClick_KnowYourCustomerBookingForm'), [:], FailureHandling.STOP_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_0Of2DocumentsUploaded_JointApplcant'), '2 documents uploaded')
}

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_Submit'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_InProgress'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_InProgressDescription'), 'Please wait as your documents are being verified and uploaded. This may take around 30 seconds to complete.')

for (int i=0; i<=3; i++) {
	
	Mobile.delay(30)
	Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_CheckDocumentStatus'), 0)
	Boolean verificationCompletedPresent = Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_VerificationCompleted'), 15)
	if (verificationCompletedPresent) {
		break;
	}
}
Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_VerificationCompletedDescription'), 'You can prompt the applicant to sign and accept the Letter of Offer now or choose to do it later.')
Mobile.delay(5)
Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_OfferAndAcceptance'), 0)


Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_Home'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_PendingSignOffLetter'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_PendingSignOffLetter'), 0)

Mobile.setText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_SearchBar'), stpId.substring(8), 0)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CaseListing0'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_MAYA'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_STPID'), GlobalVariable.StpId)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CaseDetailsTimelinetext'), 'Pending Signing of LO')

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_DownArrow'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CCRIS_0'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CCRIS_0'), 'Pending Signing of LO')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_FullStatus'), 'Pending Letter of Offer to be signed.')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CCRIS_1'), 'Pending KYC')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CCRIS_2'), 'Pending automated system check')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CCRIS_3'), 'Pending Add to CCRIS')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CCRIS_4'), 'Pending Manager’s Approval')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CCRIS_5'), 'Pending Processing')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CCRIS_6'), 'Successful AIP')

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_UpArrow'), 0)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_OfferAndAcceptance'), 0)

//signAnd accept offer page1

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_SigningOfDocuments'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_SigningOfDocumentsDescription'), 'Please ensure all the documents are correct and complete before the applicant signs.')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_SignLODocName_0'), 'Letter of Offer')

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_SignDocRightArrow_0'), 0)

WebUI.callTestCase(findTestCase('Tester01/Pages/AddToCCRIS/ReusableMethods/IUnderstandScroll'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_SignLODocName_1'), 'Mortgage’s Product Disclosure Sheet')

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_SignDocRightArrow_1'), 0)

WebUI.callTestCase(findTestCase('Tester01/Pages/AddToCCRIS/ReusableMethods/IUnderstandScroll'), [:], FailureHandling.STOP_ON_FAILURE)

if (noOfAplicants.equalsIgnoreCase('2')) {
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_MainApplicantEtiqaProposalForm'),
		'MAIN APPLICANT')

	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_SignLODocName_2'),
		'Etiqa Proposal Form')

		Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_SignDocRightArrow_2'), 0)

	WebUI.callTestCase(findTestCase('Tester01/Pages/AddToCCRIS/ReusableMethods/IUnderstandScroll'), [:], FailureHandling.STOP_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_JointApplicantEtiqaProposalForm'),
		'JOINT APPLICANT')

	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_SignLODocName_3'),
		'Etiqa Proposal Form')
	Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_SignDocRightArrow_3'), 0)
	
	WebUI.callTestCase(findTestCase('Tester01/Pages/AddToCCRIS/ReusableMethods/IUnderstandScroll'), [:], FailureHandling.STOP_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_MainApplicantEtiqaSalesIllustartion'),
		'MAIN APPLICANT')

	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_SignLODocName_4'),
		'Etiqa Sales Illustration & Product Disclosure Sheet')
	
	Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_SignDocRightArrow_4'), 0)
	
	WebUI.callTestCase(findTestCase('Tester01/Pages/AddToCCRIS/ReusableMethods/IUnderstandScroll'), [:], FailureHandling.STOP_ON_FAILURE)

	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_JointApplicantEtiqaSalesIllustration'),
		'JOINT APPLICANT')

	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_SignLODocName_5'),
		'Etiqa Sales Illustration & Product Disclosure Sheet')
	Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_SignDocRightArrow_5'), 0)
	
	WebUI.callTestCase(findTestCase('Tester01/Pages/AddToCCRIS/ReusableMethods/IUnderstandScroll'), [:], FailureHandling.STOP_ON_FAILURE)
	
} else if (noOfAplicants.equalsIgnoreCase('1')) {
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_MainApplicantEtiqaProposalForm'), 'MAIN APPLICANT')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_SignLODocName_2'), 'Etiqa Proposal Form')

	Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_SignDocRightArrow_2'), 0)
	
	WebUI.callTestCase(findTestCase('Tester01/Pages/AddToCCRIS/ReusableMethods/IUnderstandScroll'), [:], FailureHandling.STOP_ON_FAILURE)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_MainApplicantEtiqaSalesIllustartion'), 'MAIN APPLICANT')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_SignLODocName_3'), 'Etiqa Sales Illustration & Product Disclosure Sheet')

	Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_SignDocRightArrow_3'), 0)
	
	WebUI.callTestCase(findTestCase('Tester01/Pages/AddToCCRIS/ReusableMethods/IUnderstandScroll'), [:], FailureHandling.STOP_ON_FAILURE)
	
	}

	CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)
	
Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_OfferAndAcceptance'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_Sign AcceptOffer'), 30)

if (noOfAplicants.equalsIgnoreCase('2')) {
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_VisibleElement', [('variable'):'Main Applicant']),'Main Applicant')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_MainApplicantNameSignAndAcceptPage'), GlobalVariable.MainApplicant)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_VisibleElement', [('variable'):'Joint Applicant']),'Joint Applicant')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_JointApplicantNameSignAndAcceptPage'), GlobalVariable.JointApplicant)
	
	Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_Edit_MainApplicant'), 0)
	
	//sign and edit customer main applicant page
	Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_Sign AcceptOffer'), 30)
	
  //Mobile.verifyElementText(findTestObject('Object Repository/Tester01/txt_VisibleElement', [('variable'):'Main Applicant']),'Main Applicant')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_MainApplicantNameSignAndAcceptPage'),
		GlobalVariable.MainApplicant)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_SignOffDescription'), 'Please draw your signature in the box below')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_NoteSignaturePage'), 'Note: This signature will be reused in the revised Letter of Offer (if any), upon acknowledgement..')
	
	Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_SignatureCanvas'), 0)
	
	Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_ClearSignature'), 0)
	
	Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_SignatureCanvas'), 0)
	
	Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_Continue'), 0)
	
	//sign and accept offer joint applicantion page
	
	Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_Edit_JointApplicant'), 0)
	
	Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_Sign AcceptOffer'), 30)
	
	//Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_VisibleElement', [('(variable'):'Joint Applicant']), 'Joint Applicant')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_JointApplicantNameSignAndAcceptPage'),
		GlobalVariable.JointApplicant)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_SignOffDescription'), 'Please draw your signature in the box below')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_NoteSignaturePage'),
		'Note: This signature will be reused in the revised Letter of Offer (if any), upon acknowledgement.', FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_SignatureCanvas'), 0)
	
	Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_ClearSignature'), 0)
	
	Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_SignatureCanvas'), 0)
	
	Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_Continue'), 0)
		
} else if (noOfAplicants.equalsIgnoreCase('1')) {
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_MainApplicantNameSignAndAcceptPage'), GlobalVariable.MainApplicant)
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_SignOffDescription'), 'Please draw your signature in the box below')
	
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_NoteSignaturePage'), 'Note: This signature will be reused in the revised Letter of Offer (if any), upon acknowledgement.')
	
	Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_SignatureCanvas'), 0)
	
	Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_ClearSignature'), 0)
	
	Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_SignatureCanvas'), 0)
	
}

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)
Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_Submit'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CaseCompleted'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_Congratulations'), 'Congratulations! This case is now complete.')

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_ViewCase'), 0)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_Home'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_OtherActionRequired'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_OtherActionRequired'), 0)

Mobile.setText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_SearchBar'), stpId.substring(8), 0)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CaseListing0'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_MAYA'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_STPID'), GlobalVariable.StpId)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CaseDetailsTimelinetext'), 'LO Signed')

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_DownArrow'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CCRIS_0'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CCRIS_0'), 'LO Signed')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_FullStatus'), 'The letter of offer has been signed by all relevant parties.')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CCRIS_1'), 'Pending Signing of LO')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CCRIS_2'), 'Pending KYC')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CCRIS_3'), 'Pending automated system check')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CCRIS_4'), 'Pending Add to CCRIS')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CCRIS_5'), 'Pending Manager’s Approval')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CCRIS_6'), 'Pending Processing')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_CCRIS_7'), 'Successful AIP')

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_UpArrow'), 0)

CustomKeywords.'com.keywords.ScrollAction.scroll'(0.70, 0.30)

