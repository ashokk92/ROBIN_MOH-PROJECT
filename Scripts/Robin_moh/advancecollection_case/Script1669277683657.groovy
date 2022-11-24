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

WebUI.callTestCase(findTestCase('Robin_moh/login_case'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.doubleClick(findTestObject('Object Repository/Page_ROBINHome/a_Collections'))

WebUI.click(findTestObject('Object Repository/Page_ROBINHome/a_Advance Collection'))

WebUI.click(findTestObject('Object Repository/Page_Advance Collection/span_Add Advance Collection'))

WebUI.setText(findTestObject('Object Repository/Page_Advance Collection/input_Search Patient_advanceCollectionDlgFo_160f63'), 
    'mrn-00009')

WebUI.click(findTestObject('Object Repository/Page_Advance Collection/td_yatyaha hussqm kiarnh'))

WebUI.setText(findTestObject('Object Repository/Page_Advance Collection/input_Amount Received_advanceCollectionDlgF_e586c6'), 
    '500')

WebUI.setText(findTestObject('Object Repository/Page_Advance Collection/textarea_Notes, If any_advanceCollectionDlg_440711'), 
    'advance amount ')

WebUI.click(findTestObject('Page_Advance Collection/Element_ADC1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Advance Collection/div_Alert    OK'))

WebUI.click(findTestObject('Object Repository/Page_Advance Collection/span_OK'))

WebUI.click(findTestObject('Object Repository/Page_Advance Collection/a_View'))

WebUI.click(findTestObject('Object Repository/Page_Advance Collection/span_Hide'))

WebUI.click(findTestObject('Object Repository/Page_Advance Collection/a_Print'))

WebUI.closeBrowser()

