import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\WebDriver//chromedriver.exe");
		System.out.println("Hello world");
WebDriver driver = new ChromeDriver();
System.out.println("driver object created");
driver.get("https://trello.com/b/Wl2fb4cy/standard-xml-setup-projects");
	}

}
