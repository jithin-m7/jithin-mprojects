package projects;

public class nooflinksin {
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
		List<WebElement> li= driver.findElements(By.tagName("a"));
	 	System.out.println("total no of links"+li.size());
	 	
	 	for(WebElement s:li)
	 	{
	 		//System.out.println(s);
	 		String h=s.getAttribute("href");
	 		System.out.println(h); 
	 		
	 		String t=s.getText();  
	 		System.out.println(t);
	 		
	 		
	 	}

	}

}
