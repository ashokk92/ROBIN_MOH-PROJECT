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

WebUI.doubleClick(findTestObject('Object Repository/Page_ROBINHome/a_Patient Journey Management'))

WebUI.click(findTestObject('Object Repository/Page_ROBINHome/a_View Visits'))

WebUI.setText(findTestObject('Object Repository/Page_View Visits/input_View Visits_phWLFormsearch'), 'mrn-09876')

WebUI.click(findTestObject('Object Repository/Page_View Visits/span_Search'))

WebUI.click(findTestObject('Object Repository/Page_View Visits/span_sahuyt sanyhja garam'))

WebUI.click(findTestObject('Object Repository/Page_View Visits/span_KSP001Self Pay - Cash_ui-button-icon-l_b3bc42'))

WebUI.click(findTestObject('Object Repository/Page_View Visits/label_Data Entry'))

WebUI.click(findTestObject('Object Repository/Page_View Visits/li_Data Entry'))

WebUI.click(findTestObject('Object Repository/Page_View Visits/span_Update Visit'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_View Visits/p_Visit has been updated successfully'), 'Visit has been updated successfully.')

WebUI.closeBrowser()

