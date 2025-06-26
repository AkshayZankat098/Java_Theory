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
//    7) Handle frames / iFrames:
//         > Need to work with (driver.switchTo().frame(index, WebElement, name, id); driver.switchTo().defaultContent(); driver.switchTo().parentFrame();) this method to handle frame in selenium Also

//    8) Handle alert pop-ups (Normal alert, Confirm alert with 'OK' and 'CANCEL' button, Prompt alert that ask to fill data from the input field):
//        > Inside the alert is not a web-element
//        > With the help of Alert interface we can handle the alert
//        > Alert MyAlert = driver.switchTo().alert(); Then with the help of MyAlert we can handle alerts. (accept(), dismiss(), getText(), sendKeys(String text))
//        > Also we can handle using waits = Alert WaitAlert = wait.until(ExpectedConditions.alertIsPresent());

//      Handle authentication type of pop-up:
//        > Basic pop-up URL = http://the-internet.herokuapp.com/basic_auth
//        > Structure of this URL: http://username:password@the-internet.herokuapp.com/basic_auth
//        > By injecting the username and password we can handle this pop-up: http://admin:admin@the-internet.herokuapp.com/basic_auth

//    9) Handle multiple Windows/Tabs:
//       - Key Methods:
//                getWindowHandle() – current window ID
//                getWindowHandles() – all open window IDs
//                driver.switchTo().window(handle) – switch between windows

//        - Using List to Access by Index
//                List<String> windowList = new ArrayList<>(driver.getWindowHandles());
//                driver.switchTo().window(windowList.get(1));  // Switch to new window
//                Do actions
//                driver.close();
//                driver.switchTo().window(windowList.get(0));  // Back to main window

//       - With the help of Iterator class also we can handle the same thing:
//                Set<String> windows = driver.getWindowHandles();
//                Iterator<String> it = windows.iterator();
//
//                String mainWindow = it.next();
//                String childWindow = it.next();

//    10) Actions:
//    Mouse Actions: With the help of Actions class we can handle this (Mouse hover, right click, double click, drag and drop)
//                   > Actions Action = new Actions(driver);
//    - Mouse Hover : Action.moveToElement(hoverElement).perform();               - build().perform() : To compile and execute a chain of actions.
//    - Right Click (Context Click) : actions.contextClick(rightClickElement).perform();
//    - Double Click : actions.doubleClick(doubleClickElement).perform();
//    - Drag and Drop :
//            WebElement source = driver.findElement(By.id("dragSource"));
//            WebElement target = driver.findElement(By.id("dropTarget"));
//            actions.dragAndDrop(source, target).perform();

//    KeyBoard Actions:  WebElement element = driver.findElement(By.name("q"));
//        element.sendKeys(Keys.ARROW_DOWN);
//        element.sendKeys(Keys.ARROW_UP);
//        element.sendKeys(Keys.ARROW_LEFT);
//        element.sendKeys(Keys.ARROW_RIGHT);
//        element.sendKeys(Keys.ENTER);
//    Ctrl + A (Select All) = element.sendKeys(Keys.chord(Keys.CONTROL, "a"));
//    Ctrl + C / Ctrl + V (Copy / Paste) =
//            element.sendKeys(Keys.chord(Keys.CONTROL, "c")); // Copy
//            element.sendKeys(Keys.chord(Keys.CONTROL, "v")); // Paste
//    - Web can also handle via action class :  Action.sendKeys(Keys.ENTER).perform();

//    11) Javascript executor (scroll, click, highlight)
//    12) Take screenshot handle
//    13) Applied waits in selenium
//    14) File Upload & Download Handling
//    15) Shadow DOM Element Handling


}
