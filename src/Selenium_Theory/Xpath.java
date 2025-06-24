package Selenium_Theory;

public class Xpath {

//Xpath : Syntax for finding any element on the we page using XML path (Location of web elements) expression (DOM structure).

//CopyFullXpath : /html/body/app-root/app-menu/div/div/div/div/mx-blocked-users/div[3]/div[1]/div/div/form/div[1]/div[2]/div/mx-server-pick-list-button/form/div/div/div[1]/input
//CopyXpath : //*[@id="AutoBlockUserID"]

//1) Absolute Xpath / Full Xpath :  
//2) Relative Xpath / Partial Xpath :

//Syntax of relative Xpath parth01 : //tagname[@attribute='Value']
//Example : //input[@name='txtUsername'] && //*[@name='txtUsername'] (*= Regular expression and represent of all the tagnames or tags)

//Methods Present in relative Xpath :: 
//or, and, contains(), starts-with(), text(), chained xpath
// Contains:         //tagname[contains(@attribute, '')]
// Starts-with:      //tagname[starts-with(@attribute, '')]
// Text match:       //tagname[text()='']
// Chained XPath:    //form[@id='searchbox']//input[@id='search_text'] (Here, <form> is the parent and <input> is the child)

}
