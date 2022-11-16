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

Mobile.startApplication('C:\\Users\\Admin\\Downloads\\app-release.apk', true)

Mobile.tap(findTestObject('Object Repository/android.view.View (10)'), 0)

Mobile.tap(findTestObject('Object Repository/android.view.View (11)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Enter Name'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - Enter Name (1)'), 'Testing')

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Enter Email (2)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - Enter Email (3)'), 'test@gmail.com')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Enter Message'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - Enter Message (1)'), 'Sending message for testing purpose')

Mobile.pressBack()

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/android.widget.Button (13)'), 0)

Mobile.closeApplication()

