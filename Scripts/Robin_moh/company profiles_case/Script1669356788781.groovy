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

WebUI.click(findTestObject('Object Repository/Page_ROBINHome/a_Definitions'))

WebUI.click(findTestObject('Object Repository/Page_ROBINHome/a_Definitions'))

WebUI.click(findTestObject('Object Repository/Page_ROBINHome/a_Contract'))

WebUI.click(findTestObject('Object Repository/Page_ROBINHome/a_Companies Profiles'))

WebUI.click(findTestObject('Object Repository/Page_Companies Profiles/span_Create'))

WebUI.setText(findTestObject('Object Repository/Page_Companies Profiles/input__AccumedCompaniesProfilesCreateFormco_8c60b2'), 
    'ACCUMED')

WebUI.setText(findTestObject('Object Repository/Page_Companies Profiles/input_CompanyID_AccumedCompaniesProfilesCre_4f51c6'), 
    'IKUY908')

WebUI.setText(findTestObject('Object Repository/Page_Companies Profiles/input_Company Abbreviation_AccumedCompanies_ce4dc7'), 
    'PULSED')

WebUI.click(findTestObject('Object Repository/Page_Companies Profiles/span_Save'))

WebUI.click(findTestObject('Object Repository/Page_Companies Profiles/span_View'))

WebUI.click(findTestObject('Object Repository/Page_Companies Profiles/span_Close'))

WebUI.click(findTestObject('Object Repository/Page_Companies Profiles/span_Edit'))

WebUI.click(findTestObject('Object Repository/Page_Companies Profiles/span_Edit profile_ui-icon ui-icon-closethick'))

WebUI.closeBrowser()

