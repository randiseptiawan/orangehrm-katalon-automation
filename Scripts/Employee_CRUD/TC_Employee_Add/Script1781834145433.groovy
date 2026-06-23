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

def employeeID = "REMP_" + new Random().nextInt(100000)

GlobalVariable.EmployeeID = employeeID

/**WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')

WebUI.callTestCase(
	findTestCase('Common/TC_Login_Action'),
	[
		username : 'Admin',
		password : 'admin123'
	]
)**/

WebUI.click(
	findTestObject('Dashboard/a_PIM')
)

WebUI.click(
	findTestObject('Employee/button_Add')
)

WebUI.setText(
	findTestObject('Employee/input_Employee Full Name_firstName_Create'),
	'Robin'
)

WebUI.setText(
	findTestObject('Employee/input_Employee Full Name_lastName_Create'),
	'Hood'
)

WebUI.sendKeys(
    findTestObject('Employee/input_Employee Id_Create'),
    Keys.chord(Keys.CONTROL, 'a')
)

WebUI.sendKeys(
    findTestObject('Employee/input_Employee Id_Create'),
    Keys.chord(Keys.DELETE)
)

WebUI.setText(
	findTestObject('Employee/input_Employee Id_Create'),
	employeeID
)

WebUI.click(
	findTestObject('Employee/button_Add_Save')
)
	
WebUI.verifyElementPresent(
	findTestObject('Employee/div_Add_Success'),
	10
)

WebUI.waitForPageLoad(1000)

WebUI.verifyElementPresent(
	findTestObject('Employee/h6_Personal Details'),
	10
)

WebUI.verifyEqual(
    WebUI.getText(
        findTestObject('Employee/h6_First_Last Name')
    ),
    'Robin Hood'
)

/**WebUI.closeBrowser()**/


	
