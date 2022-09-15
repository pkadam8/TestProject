package newProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day1 {
	
	WebDriver driver;
	
	public void invokeBrowser() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pkadam8\\eclipse-workspace_new\\newProject\\Browser\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
		driver.findElement(By.name("firstName")).sendKeys("Test");
		driver.findElement(By.name("lastName")).sendKeys("abcd");
		driver.findElement(By.name("phone")).sendKeys("9867543456");
		driver.findElement(By.id("userName")).sendKeys("test@gmail.com");
		Thread.sleep(10000);
		driver.findElement(By.name("address1")).sendKeys("tesing co op");
		driver.findElement(By.name("city")).sendKeys("Mumbai");
		driver.findElement(By.name("state")).sendKeys("Maharashtra");
		driver.findElement(By.name("postalCode")).sendKeys("400012");
		
		//select dropdown
		Select drpCountry= new Select (driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("INDIA");
		
		driver.findElement(By.id("email")).sendKeys("pkadam");
		driver.findElement(By.name("password")).sendKeys("Test@1234");
		driver.findElement(By.name("confirmPassword")).sendKeys("Test@1234");
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td/input")).click();
		
		//print the message
		WebElement text= driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/font/b"));
		String s= text.getText();
		System.out.println("Text is: "+s);
		
		//click linktext
		driver.findElement(By.linkText("sign-in")).click();
		Thread.sleep(10000);
		driver.findElement(By.name("userName")).sendKeys("pkadam");
		driver.findElement(By.name("password")).sendKeys("Test@1234");
		driver.findElement(By.name("submit")).click();
	}
	//invoke browser

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Day1 myObj=new Day1();
		myObj.invokeBrowser();

	}

}

