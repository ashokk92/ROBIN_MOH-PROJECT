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

WebUI.click(findTestObject('Object Repository/Page_ROBINHome/a_Patient Journey Management'))

WebUI.click(findTestObject('Object Repository/Page_ROBINHome/a_Patient Journey Management'))

WebUI.click(findTestObject('Object Repository/Page_ROBINHome/a_Data Entry'))

WebUI.setText(findTestObject('Object Repository/Page_Data Entry/input_Create New Visit Ammar_phWLFormsearch'), 'MRN-0098/9')

WebUI.click(findTestObject('Object Repository/Page_Data Entry/span_Search'))

WebUI.click(findTestObject('Page_Data Entry/a_MAREDU KLIYAUAO KIRAN'))

WebUI.click(findTestObject('Object Repository/Page_Data Entry/a_Diagnosis  Consultation Codes'))

WebUI.setText(findTestObject('Object Repository/Page_Data Entry/input_timeUnit_AccumedHaadActivityListForma_6ca34a'), 'con')

WebUI.click(findTestObject('Object Repository/Page_Data Entry/td_Consultation'))

WebUI.click(findTestObject('Object Repository/Page_Data Entry/span_Add Service'))

WebUI.setText(findTestObject('Object Repository/Page_Data Entry/input_timeUnit_AccumedHaadActivityListForma_6ca34a'), 'm')

WebUI.click(findTestObject('Object Repository/Page_Data Entry/td_Maintenance (alone) of other catheter, i_11d1c0'))

WebUI.click(findTestObject('Object Repository/Page_Data Entry/span_Add Service'))

WebUI.setText(findTestObject('Object Repository/Page_Data Entry/input_timeUnit_AccumedHaadActivityListForma_6ca34a'), 't')

WebUI.click(findTestObject('Object Repository/Page_Data Entry/td_Telemedicine Assessment  for diagnosis  _320e5d'))

WebUI.click(findTestObject('Object Repository/Page_Data Entry/span_Add Service'))

WebUI.setText(findTestObject('Object Repository/Page_Data Entry/input_timeUnit_AccumedHaadActivityListForma_6ca34a'), 'b')

WebUI.click(findTestObject('Object Repository/Page_Data Entry/td_Brain stem evoked response audiometry'))

WebUI.click(findTestObject('Object Repository/Page_Data Entry/span_Add Service'))

WebUI.click(findTestObject('Object Repository/Page_Data Entry/span_Update Visit'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Data Entry/p_Visit has been updated successfully'), 'Visit has been updated successfully.')

WebUI.closeBrowser()

