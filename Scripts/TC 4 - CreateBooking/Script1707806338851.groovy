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

response = WS.sendRequest(findTestObject('Booking/CreateBooking'))

WS.verifyElementPropertyValue(response, 'booking.firstname', "Susi")
WS.verifyElementPropertyValue(response, 'booking.lastname', "Mulyadi")
WS.verifyElementPropertyValue(response, 'booking.totalprice', 256)
WS.verifyElementPropertyValue(response, 'booking.depositpaid', true)
WS.verifyElementPropertyValue(response, 'booking.bookingdates.checkin', "2023-04-07")
WS.verifyElementPropertyValue(response, 'booking.bookingdates.checkout', "2023-04-11")
WS.verifyElementPropertyValue(response, 'booking.additionalneeds', "Bakso")

