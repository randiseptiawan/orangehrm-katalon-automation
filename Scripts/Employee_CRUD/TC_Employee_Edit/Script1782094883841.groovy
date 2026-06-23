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

WebUI.click(
	findTestObject('Employee/button_Edit')
)

WebUI.click(
	findTestObject('Employee/a_Job')
)

WebUI.click(
	findTestObject('Employee/Dropdown_Select_Job')
)

WebUI.click(
	findTestObject('Employee/Option_Job_QA Engineer_Select')
)

WebUI.click(
	findTestObject('Employee/button_Edit_Save')
)

WebUI.verifyElementPresent(
	findTestObject('Employee/p_Edit_Success'),
	10
)

WebUI.click(
	findTestObject('Dashboard/a_PIM')
)

WebUI.setText(
	findTestObject('Employee/input_Employee Id_Search'),
	GlobalVariable.EmployeeID
)

WebUI.click(
	findTestObject('Employee/button_Search')
)

WebUI.verifyTextPresent(
	GlobalVariable.EmployeeID,
	false
)

WebUI.verifyTextPresent(
	'QA Engineer',
	false
)