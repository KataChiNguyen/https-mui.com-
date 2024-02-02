import internal.GlobalVariable as GlobalVariable
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

'Step 2: At Page home, click on hyperlink discover the core libraries > navigate to Page core'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_discover_the_core_libraries'))

'Step 3: At Page core, click on hyperlink material ui an open source react compon > navigate to Page material-ui'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_core/hyperlink_material_ui_an_open_source_react_compon'))

'Step 4: Add visual checkpoint at Page material-ui'

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify Access to Material UI Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
