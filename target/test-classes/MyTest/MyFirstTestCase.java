import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://chrome_driver//chromedriver.exe");
		System.out.println("Hello world");
WebDriver driver = new ChromeDriver();
System.out.println("driver object created");
	}

}
