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

WebUI.click(findTestObject('Object Repository/Page_ROBINHome/a_Users'))

WebUI.click(findTestObject('Object Repository/Page_Users/span_Create'))

WebUI.setText(findTestObject('Object Repository/Page_Users/input__AccumedFacilityUserCreateFormj_idt17_107b9e'), 'pramodww')

WebUI.setText(findTestObject('Object Repository/Page_Users/input__AccumedFacilityUserCreateFormj_idt17_86d7a8'), 'pramo908')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Users/input_Password_AccumedFacilityUserCreateFor_a75e5d'), 
    'KQSly2f9cr8=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Users/input_Confirm Password_AccumedFacilityUserC_10f9ca'), 
    'KQSly2f9cr8=')

WebUI.setText(findTestObject('Object Repository/Page_Users/input_The maximum Percentage of discount ()_23843f'), '10')

WebUI.setText(findTestObject('Object Repository/Page_Users/input_Email List_AccumedFacilityUserCreateF_c8221a'), 'phyut@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Users/li_ACCOUNTANT'))

WebUI.click(findTestObject('Object Repository/Page_Users/span_Test Admin1_ui-button-icon-left ui-ico_f2c47e'))

WebUI.click(findTestObject('Object Repository/Page_Users/li_CASHIER ADMIN'))

WebUI.click(findTestObject('Object Repository/Page_Users/span_Test Admin1_ui-button-icon-left ui-ico_f2c47e'))

WebUI.click(findTestObject('Object Repository/Page_Users/li_DATA-ENTRY'))

WebUI.click(findTestObject('Object Repository/Page_Users/span_Test Admin1_ui-button-icon-left ui-ico_f2c47e'))

WebUI.click(findTestObject('Object Repository/Page_Users/li_Manager'))

WebUI.click(findTestObject('Object Repository/Page_Users/span_Test Admin1_ui-button-icon-left ui-ico_f2c47e'))

WebUI.click(findTestObject('Object Repository/Page_Users/span_Save'))

WebUI.click(findTestObject('Object Repository/Page_Users/span_Edit'))

WebUI.click(findTestObject('Object Repository/Page_Users/span_Cancel'))

WebUI.click(findTestObject('Object Repository/Page_Users/span_Deactivate'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Users/div_ConfirmationAre you sureYesNo'))

WebUI.click(findTestObject('Object Repository/Page_Users/span_Yes'))

WebUI.click(findTestObject('Object Repository/Page_Users/span_Activate'))

WebUI.click(findTestObject('Object Repository/Page_Users/span_Yes'))

WebUI.closeBrowser()

