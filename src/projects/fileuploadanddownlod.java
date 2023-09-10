package projects;

public class fileuploadanddownlod {
  ChromeDriver driver;
	@Before
	public void start()
	{
		driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
	}
	
	@Test
	public void test() throws InterruptedException 
	{
	
		 driver.findElement(By.xpath("//*[@id=\"photo\"]")).sendKeys("C:\\Users\\user\\Downloads\\JithinMResume.pdf");
		 driver.findElement(By.xpath("//*[@id=\"post-body-3077692503353518311\"]/div[1]/div/div/h2[2]/div[1]/div/div[28]/div[2]/div/a")).click();
	}

}
