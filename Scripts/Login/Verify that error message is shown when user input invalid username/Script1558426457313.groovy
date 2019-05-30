import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://nmqf.qa.dynagility.us/')

WebUI.setText(findTestObject('Login/in_textField', [('name') : 'username']), 'a@yopmail.com')

WebUI.setText(findTestObject('Login/in_textField', [('name') : 'password']), '12345678x@X')

WebUI.click(findTestObject('Login/btn_Login'))

error = WebUI.getText(findTestObject('Login/err_failedLogin'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent(error, false)

