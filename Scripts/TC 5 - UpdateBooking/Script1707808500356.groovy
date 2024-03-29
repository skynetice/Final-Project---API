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

//ambil token
response = WS.sendRequest(findTestObject('Object Repository/Auth/CreateToken'))

// simpan token di variabel
token = WS.getElementPropertyValue(response, 'token')

// jalankan method put, input parameter token dengan nilai variabel token
updated = WS.sendRequestAndVerify(findTestObject('Object Repository/Booking/UpdateBooking',[('token'):token]))

WS.verifyElementPropertyValue(updated, 'firstname', "Susi")



firstname = WS.getElementPropertyValue(updated, 'firstname')
lastname = WS.getElementPropertyValue(updated, 'lastname')
totalprice = WS.getElementPropertyValue(updated, 'totalprice')
depositpaid = WS.getElementPropertyValue(updated, 'depositpaid')
checkin = WS.getElementPropertyValue(updated, 'bookingdates.checkin')
checkout = WS.getElementPropertyValue(updated, 'bookingdates.checkout')
needs = WS.getElementPropertyValue(updated, 'additionalneeds')

println(firstname)
println(lastname)
println(totalprice)
println(depositpaid)
println(checkin)
println(checkout)
println(needs)
