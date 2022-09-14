package newProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day2 {
	
	WebDriver driver;
	
	//invoke browser
	public void invokeBrowser() throws InterruptedException {
	
	//path of the driver
		
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\pkadam8\\\\eclipse-workspace_new\\\\newProject\\\\Browser\\\\chromedriver.exe");		
	//instantiate chrome driver
		driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
		driver.findElement(By.name("firstName")).sendKeys("Test");
		driver.findElement(By.name("lastName")).sendKeys("xyz");
		Thread.sleep(1000);
		driver.findElement(By.name("phone")).sendKeys("0917654567");
		driver.findElement(By.id("userName")).sendKeys("test@gmail.com");	
		driver.findElement(By.name("address1")).sendKeys("Progressive bldg. Dr. comp");
		driver.findElement(By.name("city")).sendKeys("Mumbai");
		driver.findElement(By.name("state")).sendKeys("Maharashtra");
		driver.findElement(By.name("postalCode")).sendKeys("400012");
		
		//select dropdown
		Select drpCountry= new Select (driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("INDIA");
		WebElement usrName= driver.findElement(By.id("email"));
		usrName.sendKeys("pkadam");
		WebElement pwd= driver.findElement(By.name("password"));
		pwd.sendKeys("Test@1234");
		driver.findElement(By.name("confirmPassword")).sendKeys("Test@1234");
		//driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td/input")).click();
		
		WebElement submit= driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td/input"));
		submit.click();
		
		Thread.sleep(20000);
		//print the text
		WebElement text= driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/font/b"));
		String s= text.getText();
		System.out.println("Text is:" +s);
		
		//click on linktext
		driver.findElement(By.linkText("sign-in")).click();
		//driver.findElement(By.xpath("//*[@id=\"dismiss-button\"]/div/span")).click();
		
		Thread.sleep(20000);
		driver.findElement(By.name("userName")).sendKeys("pkadam");
		driver.findElement(By.name("password")).sendKeys("Test@1234");
		driver.findElement(By.name("submit")).click();
		
		driver.findElement(By.linkText("Flights")).click();
		Thread.sleep(20000);		
		
		WebElement radio1= driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[1]"));
		WebElement radio2= driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]"));
		radio2.click();
		System.out.println("Radio button option 2 is selected");
		
		Select drpDown= new Select (driver.findElement(By.name("passCount")));
		drpDown.selectByValue("2");
		
		Select drpDeparture= new Select (driver.findElement(By.name("fromPort")));
		drpDeparture.selectByValue("Paris");
		
		
		Select drpMonth= new Select (driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[5]/td[2]/select[1]")));
		drpMonth.selectByVisibleText("September");
		
		Select drpDay= new Select (driver.findElement(By.name("fromDay")));
		drpDay.selectByValue("10");
		
		Select drpArrival= new Select (driver.findElement(By.name("toPort")));
		drpArrival.selectByValue("London");
		
		Select drpRtnMonth= new Select (driver.findElement(By.name("toMonth")));
		drpRtnMonth.selectByVisibleText("December");
		
		Select drpRtnDay= new Select (driver.findElement(By.name("toDay")));
		drpRtnDay.selectByValue("25");
		
		WebElement optionF= driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]"));
		optionF.click();
		
		driver.findElement(By.name("findFlights")).click();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Day2 myObj= new Day2();
		myObj.invokeBrowser();
	}

}

