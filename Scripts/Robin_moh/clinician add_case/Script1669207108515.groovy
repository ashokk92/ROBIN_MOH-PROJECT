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

WebUI.click(findTestObject('Object Repository/Page_ROBINHome/a_Clinicians'))

WebUI.click(findTestObject('Object Repository/Page_/span_Add Clinician'))

WebUI.setText(findTestObject('Object Repository/Page_/input__AccumedCliniciansCreateFormclinicianLicense'), 'PPOIUYR')

WebUI.setText(findTestObject('Object Repository/Page_/input__AccumedCliniciansCreateFormclinicianName'), 'RAMESHWARAE')

WebUI.click(findTestObject('Object Repository/Page_/label_Select One'))

WebUI.click(findTestObject('Object Repository/Page_/li_Male'))

WebUI.click(findTestObject('Object Repository/Page_/label_Select One_1'))

WebUI.click(findTestObject('Object Repository/Page_/li_Active'))

WebUI.click(findTestObject('Object Repository/Page_/span_Home Care_ui-chkbox-icon ui-icon ui-ic_c29905'))

WebUI.setText(findTestObject('Object Repository/Page_/input__AccumedCliniciansCreateFormvalidFrom_input'), '23/07/2022')

WebUI.setText(findTestObject('Object Repository/Page_/input__AccumedCliniciansCreateFormvalidTo_input'), '23/11/2023')

WebUI.click(findTestObject('Object Repository/Page_/span_Add Profession'))

WebUI.click(findTestObject('Page_/td_internal medicine  intensive care unit ICU'))

WebUI.click(findTestObject('Page_/span_Profession_ui-chkbox-icon ui-icon ui-i_543df7'))

WebUI.click(findTestObject('Page_/td_Clinical Pathology'))

WebUI.click(findTestObject('Page_/td_Dermatology'))

WebUI.click(findTestObject('Object Repository/Page_/span_Save'))

WebUI.click(findTestObject('Page_/Element_P-SAVE'))

WebUI.closeBrowser()

