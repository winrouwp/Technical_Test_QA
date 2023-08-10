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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.tokopedia.com/')

WebUI.click(findTestObject('Page_Situs Jual Beli Online Terlengkap, Mudah  Aman  Tokopedia/input_Kategori_css-3017qm exxxdg63'))

WebUI.setText(findTestObject('Page_Situs Jual Beli Online Terlengkap, Mudah  Aman  Tokopedia/input_Kategori_css-3017qm exxxdg63'), 
    'Iphone 14 pro')

WebUI.click(findTestObject('Page_Situs Jual Beli Online Terlengkap, Mudah  Aman  Tokopedia/strong_iphone 14 pro'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('button_Jenis toko'), 0)

WebUI.click(findTestObject('Page_Jual Iphone 14 pro  Tokopedia/input_Rp_pmin'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Jual Iphone 14 pro  Tokopedia/input_Rp_pmin'), '100000')

WebUI.sendKeys(findTestObject('Page_Jual Iphone 14 pro  Tokopedia/input_Rp_pmin'), Keys.chord(Keys.ENTER))

WebUI.scrollToElement(findTestObject('button_Jenis toko'), 0)

WebUI.click(findTestObject('Page_Jual Iphone 14 pro  Tokopedia/input_Rp_pmax'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Jual Iphone 14 pro  Tokopedia/input_Rp_pmax'), '30000000')

WebUI.sendKeys(findTestObject('Page_Jual Iphone 14 pro  Tokopedia/input_Rp_pmax'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Filter/Page_Jual iphone 14 pro  Tokopedia/svg_Urutkan_unf-icon css-1w4dubj'))

WebUI.click(findTestObject('Filter/Page_Jual iphone 14 pro  Tokopedia/p_Harga Terendah'))

WebUI.delay(5)

WebUI.closeBrowser()

