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

WebUI.click(findTestObject('Object Repository/Page_ROBINHome/a_Refund Advance'))

WebUI.setText(findTestObject('Page_Refund Advance/Element_input_search advance'), 'mrn-00009')

WebUI.click(findTestObject('Object Repository/Page_Refund Advance/td_YATYAHA KIARNH'))

WebUI.click(findTestObject('Object Repository/Page_Refund Advance/span_Refund'))

WebUI.click(findTestObject('Object Repository/Page_Refund Advance/label_Doctor not available'))

WebUI.click(findTestObject('Object Repository/Page_Refund Advance/li_Patient not availed service'))

WebUI.setText(findTestObject('Object Repository/Page_Refund Advance/input_Refund amount_RefundAdvanceCollection_fdf893'), 
    '500')

WebUI.setText(findTestObject('Object Repository/Page_Refund Advance/textarea_Notes, If any_RefundAdvanceCollect_f61fed'), 
    'refunded ')

WebUI.click(findTestObject('Object Repository/Page_Refund Advance/span_Refund Advance'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Refund Advance/p_Advance payment has been refunded successfully'), 
    'Advance payment has been refunded successfully.')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Refund Advance/div_AlertAdvance payment has been refunded _26386b'))

WebUI.click(findTestObject('Object Repository/Page_Refund Advance/span_OK'))

WebUI.click(findTestObject('Object Repository/Page_Refund Advance/span_Print Refund'))

WebUI.closeBrowser()

