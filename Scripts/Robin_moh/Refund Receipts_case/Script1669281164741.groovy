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

WebUI.click(findTestObject('Object Repository/Page_ROBINHome/a_Refund Receipts'))

WebUI.setText(findTestObject('Page_Refund Receipts/input_Filter by MRN_refundFormdtBillsj_idt179filter'), 'mrn-00009')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Refund Receipts/span_Refund'))

//WebUI.click(findTestObject('Object Repository/Page_Refund Receipts/span_Paid_ui-chkbox-icon ui-icon ui-icon-bl_14296d'))

WebUI.click(findTestObject('Page_Refund Receipts/span__ui-chkbox-icon ui-icon ui-icon-blank ui-c'))

WebUI.click(findTestObject('Object Repository/Page_Refund Receipts/label_Doctor not available'))

WebUI.click(findTestObject('Object Repository/Page_Refund Receipts/li_Service not available'))

WebUI.setText(findTestObject('Object Repository/Page_Refund Receipts/textarea_Notes, If any_billItemsFormtxtRefundNote'), 
    'refunding')

WebUI.click(findTestObject('Object Repository/Page_Refund Receipts/span_Refund selected services amount'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Refund Receipts/p_Receipt Refunded Successfully'))

WebUI.click(findTestObject('Object Repository/Page_Refund Receipts/span_Preview'))

WebUI.click(findTestObject('Object Repository/Page_Refund Receipts/span_Report_ui-icon ui-icon-closethick'))

WebUI.click(findTestObject('Object Repository/Page_Refund Receipts/span_Close'))

WebUI.closeBrowser()

