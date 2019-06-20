import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SlideForms {
	
public static WebDriver driver;
	
	public static void init_chrome()
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();  
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get("https://www.slideteam.net");
		 
	}

	// Form 1 || Contact Us || https://www.slideteam.net/contacts
	static void contact_us()
	{
		driver.findElement(By.xpath("/html/body/div[2]/footer/div/div/div[2]/div/div[6]/ul/li[4]/a")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement field_name=driver.findElement(By.id("name"));
		field_name.sendKeys("Himanshi sharma");
		WebElement field_email=driver.findElement(By.id("email"));
		field_email.sendKeys("himanshi.sharma@slidetech.in");
		WebElement field_phone=driver.findElement(By.id("telephone"));
		field_phone.sendKeys("8295782957");
		WebElement field_comment=driver.findElement(By.id("comment"));
		field_comment.sendKeys("PowerPoint Presentation Designs and Makeovers. SlideTeam is a presentation design agency offering custom design services for PowerPoint presentations. We have a team of expert graphic designers, adept in PowerPoint and advanced imaging softwares like Photoshop and 3D Maya.");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.className("button-set")).submit();
	}
	
	// Form 2 || On Research Services Page || https://www.slideteam.net/powerpoint_presentation_design_services/business_research_services
	static void Submit_Your_Business_Research_Requirements()
	{
		driver.findElement(By.xpath("/html/body/div[2]/footer/div/div/div[2]/div/div[6]/ul/li[10]/a")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement form2_name=driver.findElement(By.id("name"));
		form2_name.sendKeys("Himanshi Sharma");
		WebElement form2_email=driver.findElement(By.id("form_email"));
		form2_email.sendKeys("himanshi.sharma@slidetech.in");
		WebElement form2_telephone=driver.findElement(By.id("telephone"));
		form2_telephone.sendKeys("5678912345");
		WebElement form2_message=driver.findElement(By.id("comment"));
		form2_message.sendKeys("PowerPoint Presentation Designs and Makeovers. SlideTeam is a presentation design agency offering custom design services for PowerPoint presentations. We have a team of expert graphic designers, adept in PowerPoint and advanced imaging softwares like Photoshop and 3D Maya.");
		WebElement form2_captcha_field=driver.findElement(By.id("captcha_business_research_services_captcha"));
		form2_captcha_field.sendKeys("23102018");	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("finalSubmit")).submit();
		
		
	}
	// Form 3 || https://www.slideteam.net/powerpoint_presentation_design_services/hire-a-designer
	static void Contact_Us_To_Get_Started()
	{
		driver.get("https://www.slideteam.net/powerpoint_presentation_design_services/hire-a-designer");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement form3_name=driver.findElement(By.id("name"));
		form3_name.sendKeys("Himanshi sharma");
		WebElement form3_email=driver.findElement(By.id("email"));
		form3_email.sendKeys("himanshi.sharma@slidetech.in");
		WebElement form3_phone=driver.findElement(By.id("telephone"));
		form3_phone.sendKeys("8295782957");
		WebElement form3_comment=driver.findElement(By.id("comment"));
		form3_comment.sendKeys("PowerPoint Presentation Designs and Makeovers. SlideTeam is a presentation design agency offering custom design services for PowerPoint presentations. We have a team of expert graphic designers, adept in PowerPoint and advanced imaging softwares like Photoshop and 3D Maya.");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.className("text-center")).submit();
		
	}
	
	// Form 4 || Questionnaire || https://www.slideteam.net/questionnaire/
	static void  Questionnaire()
	{
		// Custom Design Services FORM
		
		driver.get("https://www.slideteam.net/questionnaire/");
		WebElement form4_name=driver.findElement(By.name("name"));
		form4_name.sendKeys("himanshi.sharma@slidetech.in");
		WebElement form4_email=driver.findElement(By.name("email"));
		form4_email.sendKeys("himanshi.sharma@slidetech.in");
		WebElement form4_phone=driver.findElement(By.name("phone"));
		form4_phone.sendKeys("852364598");
		
		// Fill to the best of your knowledge - no field is mandatory
		WebElement form4_slide_count=driver.findElement(By.name("number_of_slides"));
		form4_slide_count.sendKeys("8");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("finalSubmit")).submit();
		
	}
	
	// Form 5 || https://www.slideteam.net/blog/using-these-smart-goals-can-increase-your-impact-as-a-marketer/
	
	static void blog_comment()
	{
		driver.get("https://www.slideteam.net/blog/using-these-smart-goals-can-increase-your-impact-as-a-marketer/");
		WebElement form5_name=driver.findElement(By.id("author"));
		form5_name.sendKeys("Himanshi Sharma");
		WebElement form5_email=driver.findElement(By.id("email"));
		form5_email.sendKeys("himanshi.sharma@slidetech.in");
		WebElement form5_comment=driver.findElement(By.id("comment"));
		form5_comment.sendKeys("PowerPoint Presentation Designs and Makeovers. SlideTeam is a presentation design agency offering custom design services for PowerPoint presentations. We have a team of expert graphic designers, adept in PowerPoint and advanced imaging softwares like Photoshop and 3D Maya.");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("post-the-comment")).submit();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		init_chrome();
		contact_us();
		Submit_Your_Business_Research_Requirements();
		Contact_Us_To_Get_Started();
		Questionnaire();
		blog_comment();
	}


}
