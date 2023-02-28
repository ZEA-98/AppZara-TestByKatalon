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

Mobile.tap(findTestObject('REGISTER INVALID EMAIL/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('TC LOGIN/android.widget.EditText0 - EMAIL.'), 0)

Mobile.tap(findTestObject('TC LOGIN/android.widget.EditText0 - KATA SANDI.'), 0)

Mobile.setText(findTestObject('TC LOGIN/android.widget.EditText0 - KATA SANDI. (1)'), 'Arza1234', 0)

Mobile.tap(findTestObject('TC LOGIN/android.widget.TextView0 - MASUK'), 0)

Mobile.getText(findTestObject('TC LOGIN/android.widget.EditText0 - EMAIL.Bidang ini wajib diisi'), 0)

Mobile.closeApplication()

