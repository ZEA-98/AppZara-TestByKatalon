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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

Mobile.startExistingApplication('com.inditex.zara')

Mobile.tap(findTestObject('MENGAKSES TOKO/android.widget.TextView0 - MENGAKSES'), 0)

Mobile.tap(findTestObject('MENGAKSES TOKO/android.widget.TextView0 - BAHASA INDONESIA'), 0)

Mobile.tap(findTestObject('MENGAKSES TOKO/android.widget.TextView0 - LANJUTKAN'), 0)

Mobile.tap(findTestObject('MENGAKSES TOKO/android.widget.TextView0 - MELANJUTKAN'), 0)

Mobile.tap(findTestObject('MENGAKSES TOKO/android.widget.Button0 - SAAT APLIKASI DIGUNAKAN'), 0)

Mobile.closeApplication()

