package projects;

public class screenshot {
  ChromeDriver driver ;
	@Before
	public void b()
	{
	driver=new ChromeDriver();
	driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
}

	
		
	
	@Test
	public void testBStackTakeScreenShot() throws Exception{

		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f,new File("C:\\Users\\user\\Downloads\\sample\\scennshoth.jpg"));
	}


}
