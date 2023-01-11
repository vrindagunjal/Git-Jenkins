package Demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserLaunch {
public static void main(String[] args) {
	System.out.println(System.getProperty("user.dir"));
System.setProperty("webdriver.chrome.driver","I:\\IMP Backup\\05_Vrinda Office data\\Cogniwize\\Training\\Drivers\\chromedriver.exe");
ChromeDriver browser=new ChromeDriver();
browser.get("https://www.google.in");
}
}
