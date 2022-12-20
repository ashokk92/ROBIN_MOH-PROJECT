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
import org.junit.After
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

class myloginsteps {

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
	@And ("user click on the sign in button")
	def user_clicks_on_signin_button () {
		WebUI.click(findTestObject('Object Repository/Page_ROBINLogin/label_'))
		WebUI.click(findTestObject('Page_ROBINLogin/label_'))
		WebUI.click(findTestObject('Object Repository/Page_ROBINLogin/td_King Salman Abdulaziz Hospital -Riyadh'))
		WebUI.click(findTestObject('Object Repository/Page_ROBINLogin/button_Sign In'))
	}
	@Then("user able to access the application")
	def user_able_to_access_the_application() {
	WebUI.closeBrowser()
	}
}