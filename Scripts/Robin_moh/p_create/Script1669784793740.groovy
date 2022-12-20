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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://dev-api2.santechture.com:8887/ROBIN/faces//MainPages/JHAH/Login.xhtml')

WebUI.setText(findTestObject('Object Repository/jaha_moh/input_Loading_loginFormuserName'), 'root')

WebUI.setEncryptedText(findTestObject('Object Repository/jaha_moh/input_Loading_loginFormpassword'), 'mM0VwRptd7w=')

WebUI.click(findTestObject('Object Repository/jaha_moh/label_'))

WebUI.click(findTestObject('Object Repository/jaha_moh/label__1'))

WebUI.click(findTestObject('Object Repository/jaha_moh/span_King Salman Abdulaziz Hospital -Riyadh'))

WebUI.click(findTestObject('Object Repository/jaha_moh/button_Sign In'))

WebUI.click(findTestObject('Object Repository/jaha_moh/a_Patient Journey Management'))

WebUI.click(findTestObject('Object Repository/jaha_moh/a_Patient Journey Management'))

WebUI.click(findTestObject('Object Repository/jaha_moh/a_Data Entry'))

WebUI.click(findTestObject('Object Repository/jaha_moh/span_Create New Visit'))

WebUI.click(findTestObject('Object Repository/jaha_moh/span_New patient'))

WebUI.setText(findTestObject('Object Repository/jaha_moh/input__AccumedPatientCreateFormmrn'), 'mrn-9/6.2')

WebUI.setText(findTestObject('Object Repository/jaha_moh/input_National ID_AccumedPatientCreateForme_a5ef9f'), '8956/*20.3')

WebUI.click(findTestObject('Object Repository/jaha_moh/div_Create Patient'))

WebUI.setText(findTestObject('Object Repository/jaha_moh/input__AccumedPatientCreateFormpatientName'), 'IUYTG')

WebUI.setText(findTestObject('Object Repository/jaha_moh/input__AccumedPatientCreateFormpatientSurname'), 'MLKO908')

WebUI.setText(findTestObject('Object Repository/jaha_moh/input__AccumedPatientCreateFormMiddlename'), '458/KLUYT')

WebUI.click(findTestObject('Object Repository/jaha_moh/label_ (1)'))

WebUI.click(findTestObject('Object Repository/jaha_moh/li_Male'))

WebUI.setText(findTestObject('Object Repository/jaha_moh/input__AccumedPatientCreateFormdateOfBirth2_input'), '23/08/1995')

WebUI.click(findTestObject('Object Repository/jaha_moh/a_23'))

WebUI.click(findTestObject('Object Repository/jaha_moh/label_Select One'))

WebUI.click(findTestObject('Object Repository/jaha_moh/li_Married'))

WebUI.click(findTestObject('Object Repository/jaha_moh/span_Add Insurance Card'))

WebUI.click(findTestObject('Object Repository/jaha_moh/span_Create Patient Card_ui-icon ui-icon-cl_e19e76'))

WebUI.click(findTestObject('Object Repository/jaha_moh/span_Insert Patient'))

WebUI.click(findTestObject('Object Repository/jaha_moh/div_Visit Details'))

WebUI.click(findTestObject('Object Repository/jaha_moh/label__1 (1)'))

WebUI.click(findTestObject('Object Repository/jaha_moh/li_ACCIDENT  EMERGENCY'))

WebUI.setText(findTestObject('Object Repository/jaha_moh/input_Clinician_InvoiceFormclinician_input'), 'm')

WebUI.click(findTestObject('Object Repository/jaha_moh/td_AMAL  (R) ELSAID'))

WebUI.click(findTestObject('Object Repository/jaha_moh/span_Insert Visit'))

WebUI.verifyElementText(findTestObject('Object Repository/jaha_moh/p_Visit has been created successfully'), 'Visit has been created successfully.')

WebUI.closeBrowser()

