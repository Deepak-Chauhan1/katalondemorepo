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

Mobile.startApplication('C:\\Users\\Testing\\Downloads\\eribank.apk', true)

Mobile.setText(findTestObject('Object Repository/TC2/android.widget.EditText - Username'), Username, 0)

Mobile.setText(findTestObject('Object Repository/TC2/android.widget.EditText - Password'), Password, 0)

Mobile.tap(findTestObject('Object Repository/TC2/android.widget.Button - Login'), 0)

Mobile.tap(findTestObject('Object Repository/TC2/android.widget.Button - Make Payment'), 0)

Mobile.setText(findTestObject('Object Repository/TC2/android.widget.EditText - Phone'), '912345678954', 0)

Mobile.setText(findTestObject('Object Repository/TC2/android.widget.EditText - Name'), 'Deepak Chauhan', 0)

Mobile.setText(findTestObject('Object Repository/TC2/android.widget.EditText - Amount'), '5000', 0)

Mobile.tap(findTestObject('Object Repository/TC2/android.widget.Button - Select'), 0)

Mobile.tap(findTestObject('Object Repository/TC2/android.widget.TextView - India'), 0)

Mobile.tap(findTestObject('Object Repository/TC2/android.widget.Button - Send Payment'), 0)

Mobile.tap(findTestObject('Object Repository/TC2/android.widget.Button - Yes'), 0)

Mobile.tap(findTestObject('Object Repository/TC2/android.widget.Button - Logout'), 0)

Mobile.closeApplication()

