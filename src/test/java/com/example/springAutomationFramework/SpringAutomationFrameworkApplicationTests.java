package com.example.springAutomationFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Profile;

@SpringBootTest
@Profile("qa")
class SpringAutomationFrameworkApplicationTests {

	@Autowired
	private Engine engine;

	@Value("Testing")
	private String enviroment;

	@Value("${app.url}")
	private String appUrl;

	@Test
	void contextLoads() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		engine.startCar();
		engine.enginerOn();
		System.out.println(appUrl);
		driver.get(appUrl);
		driver.quit();
		System.out.println(enviroment);
	}

}
