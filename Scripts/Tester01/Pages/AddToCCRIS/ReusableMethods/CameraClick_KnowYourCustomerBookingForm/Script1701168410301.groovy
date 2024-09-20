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

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_NoDocumentsToShow'), 'No Documents To Show')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_DocNotUploaded'), 'You have not uploaded any documents yet.')

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_AddDocument'), 20)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_Camera'), 20)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_CameraClick'), 20)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_CameraClickTick'), 20)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_AddDocument'), 'Add Document')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_AddDocDescription'),
	'Please snap a photo of both the front and back of the main applicant’s ID.')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_KycDocCount'),
	'1 out of 10 File Upload')

/*Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/Doc_ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_Reupload'), 0)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_Camera'), 20)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_CameraClick'), 20)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_CameraClickTick'), 20)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_KycDocCount'),
	'1 out of 2 File Upload')*/

//Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_Delete'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_DeleteDocument'), 'Delete document?')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_DeleteDocDescription'), 'You will not be able to recover the deleted document. Are you sure you want to delete?')

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_Cancel'), 'Cancel')

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_Delete'), 30)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_AddDocument'), 20)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_Camera'), 20)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_CameraClick'), 20)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_CameraClickTick'), 20)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_KycDocCount'), '1 out of 10 File Upload')

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_AddAnotherDocument'), 20)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_Camera'), 20)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_CameraClick'), 20)

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_CameraClickTick'), 20)

Mobile.verifyElementText(findTestObject('Object Repository/Tester01/AddToCCRIS/txt_KycDocCount'), '2 out of 10 File Upload')

Mobile.tap(findTestObject('Object Repository/Tester01/AddToCCRIS/btn_Next'), 20)