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
import org.openqa.selenium.Keys as Keys

Mobile.startExistingApplication('com.inditex.zara')

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('TC-SEARCH/android.widget.ImageView0'), 2)

Mobile.tap(findTestObject('TC-SEARCH/android.widget.TextView0 - PRIA'), 2)

Mobile.tap(findTestObject('TC-SEARCH/android.widget.TextView0 - CARILAH SEBUAH ITEM WARNA KOLEKSI...'), 3)

Mobile.setText(findTestObject('TC-SEARCH/android.widget.EditText0'), 'BAJU' + '\\n', 3)

//Mobile.sendKeys(findTestObject('TC-SEARCH/android.widget.EditText0'), Keys.chord(Keys.RETURN))
Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

//Mobile.getText(findTestObject('TC-SEARCH/android.widget.TextView0 - 61 HASIL PENCARIAN'), 3)

Mobile.tap(findTestObject('TC-SEARCH/android.widget.ImageButton0'), 3)

Mobile.tap(findTestObject('TC-SEARCH/android.widget.TextView0 - CARILAH SEBUAH ITEM WARNA KOLEKSI...'), 3)

Mobile.setText(findTestObject('TC-SEARCH/android.widget.EditText0'), 'AYAM' + '\\n', 3)

//Mobile.getText(findTestObject('TC-SEARCH/android.widget.TextView0 - TIDAK DITEMUKAN SATU PUN HASIL UNTUK AYAM'), 3)

Mobile.closeApplication()

