import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.github.javafaker.Faker
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

import cucumber.api.java.pt.E
import cucumber.api.java.pt.Entao
import cucumber.api.java.pt.Quando
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



class MyAccount {

	@E("preencho os dados de cadastro com (.*)")
	def preenchoDadosCadastro(String email) {
//		Faker faker = new Faker()
//		String email = faker.internet().emailAddress()
		WebUI.setText(findTestObject('Page_My Account/input__email'), email)
		WebUI.setEncryptedText(findTestObject('Page_My Account/input__password'), 'Hm9iOAFzoyIJHehpVuQoHqTuAFiEo40L')
	}
	
	@Quando("clico no botão register")
	def clicoBotaoRegister() {
		WebUI.click(findTestObject('Page_My Account/input_botao_register'))
	}
	
	@Entao("visualizo a tela my account logada")
	def visualizoTelaMyAccountLogada() {
		WebUI.verifyElementPresent(findTestObject('Page_My Account/div_myaccount_logada'), 0)
		WebUI.closeBrowser()
	}
}