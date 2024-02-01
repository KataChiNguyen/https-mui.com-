import internal.GlobalVariable as GlobalVariable
import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: Navigate to Page home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

'Step 2: At Page home, click on hyperlink product core > navigate to Page core'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_product_core'))

'Step 3: At Page core, click on hyperlink product advanced > navigate to Page x'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_core/hyperlink_product_advanced'))

'Step 4: At Page x, click on hyperlink product templates > navigate to Page templates'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_x/hyperlink_product_templates'))

'Step 5: At Page templates, click on hyperlink browse templates > navigate to Page store'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_templates/hyperlink_browse_templates'))

'Step 6: At Page store, click on hyperlink store'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_store/hyperlink_store'))

'Step 7: At Page store, click on hyperlink store'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_store/hyperlink_store'))

'Step 8: At Page store, click on hyperlink sign in > navigate to Page store sign-in'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_store/hyperlink_sign_in'))

'Step 9: At Page store sign-in, click on hyperlink don t have an account sign up > navigate to Page store sign-up'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_store_sign-in/hyperlink_don_t_have_an_account_sign_up'))

'Step 10: Login into Application'

TrueTestScripts.login()

'Step 11: Add visual checkpoint at Page store'

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify Successful Sign Up Process at Page Store_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
