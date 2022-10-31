package Class24;

public interface WebDriver {
    /*
     Create a WebDriver Interface that will have the following unimplemented behaviour:
     openBrowser(), closeBrowser(), maximizeWindow(), findElement().
      Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
     */
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver{
    public void openBrowser(){
        System.out.println("call the method .get() after creating the instance of ChromeDriver");
    }
    public void closeBrowser(){
        System.out.println("call the method .quit() after creating " +
                "the instance of ChromeDriver and calling method .get()");
    }
    public void maximizeWindow(){
        System.out.println("call the method.manage().window().maximmize()after creating " +
                "the instance of ChromeDriver and calling method .get()");

    }
    public void findElement(){
        System.out.println("call the method .findElement() after creating " +
                "the instance of ChromeDriver and calling method .get()");
    }
}
class FirefoxDriver implements WebDriver{
    public void openBrowser(){

        System.out.println("call the method .get() after creating the instance of FirefoxDriver ");
    }
    public void closeBrowser(){
        System.out.println("call the method .quit() after creating " +
                "the instance of FirefoxDriver and calling method .get()");
    }
    public void maximizeWindow(){
        System.out.println("call the method.manage().window().maximmize()after creating " +
                "the instance of FirefoxDriver and calling method .get()");
    }
    public void findElement(){
        System.out.println("call the method .findElement() after creating " +
                "the instance of FirefoxDriver and calling method .get()");
    }
}
class TestWebDriver{
    public static void main(String[] args) {
        WebDriver []drivers={new ChromeDriver(),new FirefoxDriver()};
        for(WebDriver driver:drivers){
            driver.openBrowser();
            driver.maximizeWindow();
            driver.findElement();
            driver.closeBrowser();
        }
    }
}
