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

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('MENU-WANITA/android.widget.TextView0 - MENU (1)'), 3)

Mobile.tap(findTestObject('MENU-WANITA/android.widget.TextView0 - WANITA'), 3)

Mobile.tap(findTestObject('MENU-WANITA/android.widget.TextView0 - POLOS'), 3)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.tap(findTestObject('MENU-WANITA/android.widget.TextView0 - SEPATU'), 4)

Mobile.tap(findTestObject('MENU-WANITA/android.widget.TextView0 - SPECIAL PRICES'), 4)

Mobile.tap(findTestObject('MENU-WANITA/android.widget.TextView0 - SEPATU RATA'), 4)

Mobile.tap(findTestObject('MENU-WANITA/android.widget.TextView0 - HAK TINGGI'), 4)

Mobile.tap(findTestObject('MENU-WANITA/android.widget.TextView0 - SEPATU OLAH RAGA'), 4)

Mobile.tap(findTestObject('MENU-WANITA/android.widget.TextView0 - SANDAL'), 4)

Mobile.tap(findTestObject('MENU-WANITA/android.widget.TextView0 - BOT SEMATA KAKI'), 4)

Mobile.tap(findTestObject('MENU-WANITA/android.widget.TextView0 - BOT'), 4)

Mobile.tap(findTestObject('MENU-WANITA/android.widget.TextView0 - KULIT'), 4)

Mobile.pressBack()

Mobile.tap(findTestObject('MENU-WANITA/android.widget.TextView0 - CAREERS (1)'), 4)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('MENU-WANITA/JOIN THE TEAM'), 4)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('MENU-WANITA/android.view.View0 - Position All'), 4)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('QUALITY CONTROL')

Mobile.tap(findTestObject('MENU-WANITA/android.view.View0 - QUALITY CONTROL'), 2)

Mobile.tap(findTestObject('MENU-WANITA/android.widget.TextView0 - QUALITY CONTROL'), 2)

Mobile.scrollToText('SEARCH')

Mobile.tap(findTestObject('MENU-WANITA/android.widget.Button0 - SEARCH'), 4)

Mobile.pressBack()

Mobile.closeApplication()

