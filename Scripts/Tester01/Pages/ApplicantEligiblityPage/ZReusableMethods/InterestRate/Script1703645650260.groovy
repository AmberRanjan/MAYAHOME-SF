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
import java.time.LocalDate;

String financingType = GlobalVariable.financingType

if (financingType.equalsIgnoreCase('Islamic Financing')) {
	//Interest Rate
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_ProfitRate'), 'Profit Rate')

} else if (financingType.equalsIgnoreCase('Conventional Financing')) {
	
	//Interest Rate
	Mobile.verifyElementText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_InterestRate'), 'Interest Rate')
}

GlobalVariable.InterestrateAplicationEligiblityPage = Mobile.getText(findTestObject('Object Repository/Tester01/ApplicationEligiblityPage/txt_ProfitRateValue'), 0)

/*>>>>>>>> Home2U_Nandha_Tester2:Scripts/Tester01/Pages/ApplicantEligiblityPage/ReusableMethods/InterestRate/Script1699345429039.groovy

t_date = new Date()

def todaysDate = t_date.format('d MMMM YYYY')

System.out.println("Current Date: "+todaysDate);


Mobile.comment(todaysDate)

def todaysDate_day = t_date.format('d')

Mobile.comment(todaysDate_day)


def todaysDate_Month = t_date.format('MMMM')

Mobile.comment(todaysDate_Month)



def todaysDate_Year = t_date.format('YYYY')

Mobile.comment(todaysDate_Year)




	String datetime = DateTimeFormatter.ofPattern("dd MMM yyyy'T'HH:mm").format(LocalDateTime.now());
	System.out.println(datetime);
	
	*/
