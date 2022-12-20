package com.katalon
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class patientcreation {
	@Given("user navigate to the application")
	def user_navigate_to_the_application () {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl('https://moh.accumed.sa/ROBIN/faces//MainPages/SANTECHTURE/Login.xhtml')
	}
	@When ("user enter the (.*) and (.*)")
	def user_enter_the_username_and_passowrd(String username,String password) {
		WebUI.setText(findTestObject('Object Repository/Page_ROBINLogin/input_Loading_loginFormuserName'), username)
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_ROBINLogin/input_Loading_loginFormpassword'), password)
	}
	@And ("user clicks the sign in button")
	def user_clicks_the_signin_button () {
		WebUI.click(findTestObject('Object Repository/Page_ROBINLogin/label_'))
		WebUI.click(findTestObject('Page_ROBINLogin/label_'))
		WebUI.click(findTestObject('Object Repository/Page_ROBINLogin/td_King Salman Abdulaziz Hospital -Riyadh'))
		WebUI.click(findTestObject('Object Repository/Page_ROBINLogin/button_Sign In'))
	}
	@And("user navigate to PJ and dataentry page")
	def user_navigate_to_PJ_dataentry_page() {
		WebUI.click(findTestObject('Object Repository/Page_ROBINHome/a_Patient Journey Management'))
		WebUI.click(findTestObject('Object Repository/Page_ROBINHome/a_Patient Journey Management'))
		WebUI.click(findTestObject('Object Repository/Page_ROBINHome/a_Data Entry'))
	}
	@And("user click on the create newvisit button")
	def user_click_on_the_create_newvisit_button() {
		WebUI.click(findTestObject('Object Repository/Page_Data Entry/span_Create New Visit'))
	}
	@And("Again user need to click on newpatient button")
	def Again_user_need_to_click_on_newpatient_button() {
		WebUI.click(findTestObject('Object Repository/Page_Data Entry/span_New patient'))
	}
	@And("patient form will be available on screen")
	def patient_form_will_be_available_on_screen() {
	}
	@And("enter the mrn")
	def enter_the_mrn(String mrn) {
		WebUI.setText(findTestObject('Object Repository/Page_Data Entry/input__AccumedPatientCreateFormmrn'), "mrn-000893")
	}
	@And("enter the nationalid")
	def enter_the_nationalid(String nationalid) {
		WebUI.setText(findTestObject('Object Repository/Page_Data Entry/input_National ID_AccumedPatientCreateForme_a5ef9f'), "023.6589.0")
	}
	@And("enter the name")
	def enter_the_name(String name) {
		WebUI.setText(findTestObject('Object Repository/Page_Data Entry/input__AccumedPatientCreateFormpatientName'), "parahms")
	}
	@And("enter the middlename")
	def enter_the_middlename(String middlename) {
		WebUI.setText(findTestObject('Object Repository/Page_Data Entry/input__AccumedPatientCreateFormMiddlename'), "sulihoty")
	}
	@And("enter the surname")
	def enter_the_surname(String surname) {
		WebUI.setText(findTestObject('Object Repository/Page_Data Entry/input__AccumedPatientCreateFormpatientSurname'), "hjtuy")
	}
	@And("select the DOB_Age")
	def select_the_DOB_Age(String DOB_Age){
		WebUI.setText(findTestObject('Object Repository/Page_Data Entry/input__AccumedPatientCreateFormdateOfBirth2_input'), "23/07/1998")
		WebUI.click(findTestObject('Object Repository/Page_Data Entry/a_23'))
	}
	@And("select and click the gender")
	def select_and_click_the_gender(){
		WebUI.click(findTestObject('Page_Data Entry/Element_label-gender'))
		WebUI.click(findTestObject('Object Repository/Page_Data Entry/li_Male'))
	}
	@And("enter the emailid")
	def enter_the_emailid(String emailid){
		WebUI.setText(findTestObject('Object Repository/Page_Data Entry/input_Email_AccumedPatientCreateFormemail'), "asdfh@gmail.com")
	}
	@And("enter the mobilenumber")
	def enter_the_mobilenumber(String mobilenumber){
		WebUI.setText(findTestObject('Object Repository/Page_Data Entry/input_Mobile_AccumedPatientCreateFormmobile'),  "8956874230")
	}
	@And("click on the insert patient")
	def click_on_the_insert_patient(){
		WebUI.click(findTestObject('Object Repository/Page_Data Entry/span_Insert Patient'))
	}
	@And("again select the department in dropdown list")
	def again_select_the_department_in_dropdown_list(){
		WebUI.click(findTestObject('Page_Data Entry/Element_depart'))
		WebUI.click(findTestObject('Object Repository/Page_Data Entry/li_Cardiology'))
	}
	@And("select the end type in dropdown list")
	def select_the_end_type_in_dropdown_list() {
		WebUI.click(findTestObject('Page_Data Entry/Element_endtype'))
		WebUI.click(findTestObject('Object Repository/Page_Data Entry/li_HomeOther'))
	}
	@And("select the visit type in dropdown list")
	def select_the_visit_type_in_dropdown_list() {
		WebUI.click(findTestObject('Page_Data Entry/Element_visit type'))
		WebUI.click(findTestObject('Object Repository/Page_Data Entry/li_New'))
	}
	@And("enter the clinician name")
	def enter_the_clinician_name() {
		WebUI.setText(findTestObject('Object Repository/Page_Data Entry/input_Clinician_InvoiceFormclinician_input'), 'm')
		WebUI.click(findTestObject('Object Repository/Page_Data Entry/td_AMAL  (R) ELSAID'))
	}
	@Then("click on the inservisit button")
	def click_on_the_inservisit_button() {
		WebUI.click(findTestObject('Object Repository/Page_Data Entry/span_Insert Visit'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Data Entry/p_Visit has been created successfully'))
		WebUI.closeBrowser()
	}
}

