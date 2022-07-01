package seleniumSample;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioPage {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement searchbox = driver.findElement(By.xpath("//input[@name='searchVal']"));
		searchbox.sendKeys("bags");
		searchbox.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		//WebElement menbox = driver.findElement(By.xpath("//label[@for='Men')]"));
		WebElement menbox = driver.findElement(By.xpath("//label[contains(@class,'facet-linkname facet-linkname-genderfilter facet-linkname-Men')]"));
		menbox.click();
		Thread.sleep(2000);
		WebElement fashionbags = driver.findElement(By.xpath("//label[contains(@for,'Men - Fashion Bags')]"));
		fashionbags.click();
		Thread.sleep(2000);
		String itemsfound = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println(itemsfound + " items found");
		Thread.sleep(2000);
		List<WebElement> brand = driver.findElements(By.className("brand"));
		System.out.println("Total no of brands = " + brand.size());
		for (WebElement webElement : brand) {
			String brandname=webElement.getText();
			System.out.print(brandname+ ", ");			
		}
		Thread.sleep(2000);
		System.out.println();	
		List<WebElement> bag = driver.findElements(By.className("nameCls"));
		System.out.println("Total no of bagname = " + bag.size());
		for (WebElement webElement : bag) {
			String bagname=webElement.getText();
			System.out.print(bagname+ ", ");
		}
	}				
}
