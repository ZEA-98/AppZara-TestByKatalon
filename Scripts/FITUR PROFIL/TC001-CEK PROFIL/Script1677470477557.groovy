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

Mobile.delay(6, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('TC PROFIL/android.view.ViewGroup-ZARA-QR'), 3)

Mobile.tap(findTestObject('TC PROFIL/android.widget.ImageView0'), 3)

Mobile.getText(findTestObject('TC PROFIL/android.widget.TextView0 - PEMBELIAN'), 3)

Mobile.getText(findTestObject('TC PROFIL/android.widget.TextView0 - ONLINE'), 3)

Mobile.tap(findTestObject('TC PROFIL/android.widget.TextView0 - DI TOKO'), 3)

Mobile.getText(findTestObject('TC PROFIL/android.widget.TextView0 - TEMUKANLAH TIKET ANDA SECARA LANGSUNG DI PONSEL DENGAN MENGGUNAKAN ZARA QR ANDA'), 
    3)

Mobile.tap(findTestObject('TC PROFIL/android.widget.TextView0 - AKUN SAYA'), 3)

Mobile.getText(findTestObject('TC PROFIL/android.widget.TextView0 - ALAMAT'), 3)

Mobile.tap(findTestObject('TC PROFIL/android.widget.TextView0 - TOKO'), 3)

Mobile.getText(findTestObject('TC PROFIL/android.widget.TextView0 - CARI KOTA JALAN KODE POS'), 3)

Mobile.tap(findTestObject('TC PROFIL/android.widget.TextView0 - BANTUAN'), 3)

Mobile.getText(findTestObject('TC PROFIL/android.widget.TextView0 - HUBUNGI'), 3)

Mobile.tap(findTestObject('TC PROFIL/android.widget.TextView0 - PENGATURAN'), 3)

Mobile.getText(findTestObject('TC PROFIL/android.widget.TextView0 - BAHASA YANG DIGUNAKAN UNTUK BERKOMUNIKASI'), 3)

Mobile.closeApplication()

