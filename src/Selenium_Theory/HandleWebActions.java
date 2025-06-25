package Selenium_Theory;

public class HandleWebActions {

// Top list of web actions:

//    1) Buttons and Edit Fields
//    2) Hyperlink and Images

//    3) Checkbox and Radio button: Normal way of selenium methods

//    4) Dropdown (static/dynamic):
//      > If <select> tag is present: It indicates a Single-select or Multi-select dropdown, In such cases, use the Select class in Selenium to interact with the dropdown options.
//      > Common methods of Select class include:
//     - selectByValue(String value)
//     - selectByVisibleText(String text)
//     - selectByIndex(int index)
//     - getAllSelectedOptions()
//     - getFirstSelectedOption()
//     - deselectAll() [Only for multi-select]
//     - deselectByValue(), deselectByVisibleText(), deselectByIndex()

//      > Auto-suggestion dropdown:
//      These are dynamic dropdowns that do not use the <select> tag, Handle them using standard WebDriver methods like:
//     - sendKeys() to type input
//     - wait for suggestions using WebDriverWait and ExpectedConditions
//     - locate suggestion options using findElements()
//     - iterate over suggestions and click the desired option


//    5) Calendar / Date Pickers
//    6) Web Tables (dynamic/static)
//    7) Handle frames / iFrames
//         > Need to work with (driver.switchTo().frame();) this method to handle frame in selenium Also

//    8) Handle alert pop-ups
//    9) Handle multiple Windows/Tabs
//    10) Mouse and Keyboard actions
//    11) Javascript executor (scroll, click, highlight)
//    12) Take screenshot handle
//    13) Applied waits in selenium
//    14) File Upload & Download Handling
//    15) Shadow DOM Element Handling
//    16) Authentication Popups (Basic Auth)


}
