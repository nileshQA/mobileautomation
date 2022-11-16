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

Mobile.tap(findTestObject('android.view.View (27)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button (27)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Enter Email (6)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - Enter Email (7)'), 'figizo@lyricspad.net')

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Enter Password (4)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - Enter Password (5)'), '000000')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/android.widget.Button (28)'), 0)

Mobile.tap(findTestObject('android.view.View (27)'), 0)

Mobile.tap(findTestObject('Object Repository/android.view.View (28)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (16)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button (29)'), 0)

Mobile.delay(10)

Mobile.closeApplication()

