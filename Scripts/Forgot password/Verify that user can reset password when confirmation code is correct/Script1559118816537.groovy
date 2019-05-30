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
import org.openqa.selenium.Keys as Keys

WebUI.doubleClick(findTestObject('Login/in_textField', [('name') : 'newPassword']))

WebUI.sendKeys(findTestObject('Login/in_textField', [('name') : 'newPassword']), Keys.chord(Keys.DELETE))

WebUI.sendKeys(findTestObject('Login/in_textField', [('name') : 'newPassword']), '123456789x@X')

WebUI.doubleClick(findTestObject('Login/in_textField', [('name') : 'passwordConfirmation']))

WebUI.sendKeys(findTestObject('Login/in_textField', [('name') : 'passwordConfirmation']), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('Login/in_textField', [('name') : 'passwordConfirmation']), '123456789x@X')

WebUI.doubleClick(findTestObject('Login/in_textField', [('name') : 'verificationCode']))

WebUI.sendKeys(findTestObject('Login/in_textField', [('name') : 'verificationCode']), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('Login/in_textField', [('name') : 'verificationCode']), '560659')

WebUI.click(findTestObject('Login/btn_changePassword'))

url = WebUI.getUrl()

WebUI.verifyMatch(url, 'https://nmqf.qa.dynagility.us/', false)

