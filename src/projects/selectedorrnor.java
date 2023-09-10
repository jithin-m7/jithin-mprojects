package projects;

public class selectedorrnor {
  ChromeDriver driver;
	@Before
	public void start()
	{
		driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
	}
	
	@Test
	public void test()
	{
		Boolean i=driver.findElement(By.id("submit")).isDisplayed();
		if(i)
		{
			System.out.println("Displayed");  
		}
		else
		{
			System.out.println("Not Displayed");
		}
		
		Boolean c=driver.findElement(By.name("sex")).isSelected();
		if(c)
		{
			System.out.println("Selected");
		}
		else
		{
			System.out.println("Not Selected");
		}
		
		Boolean m=driver.findElement(By.id("submit")).isEnabled();
		if(m)
		{
			System.out.println("enabled");
		}
		else
		{
			System.out.println("Not enabled");
		}

}


}
