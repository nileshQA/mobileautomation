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

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (21)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button (45)'), 0)

Mobile.tap(findTestObject('Login with google button'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - nilesh Likhar (6)'), 0)

Mobile.tap(findTestObject('android.widget.Button (45)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button (46)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView (2)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button (47)'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/android.view.View (41)'), 0)

Mobile.tap(findTestObject('Object Repository/android.view.View (42)'), 0)

Mobile.tap(findTestObject('Object Repository/android.view.View (43)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button (48)'), 0)

Mobile.tap(findTestObject('Object Repository/android.view.View (44)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button (49)'), 0)

Mobile.delay(10)

Mobile.closeApplication()

