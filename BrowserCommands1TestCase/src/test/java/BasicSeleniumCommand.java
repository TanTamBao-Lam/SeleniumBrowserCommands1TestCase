import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicSeleniumCommand {
    public static void main(String[] args) {
        //Declare Chrome and FireFox driver
        WebDriver chromeDriver = new ChromeDriver();
        WebDriver fireFoxDriver = new FirefoxDriver();
        WebDriver edgeDriver = new EdgeDriver();

        /*
            Open the web page
                Chrome: GitHub - https://github.com/
                Firefox: LinkedIn - https://www.linkedin.com/feed/
                Edge: IRCC - https://www.canada.ca/en/immigration-refugees-citizenship/services/application/account.html
         */
        System.out.println("Opening web pages");

        chromeDriver.get("https://github.com/");
        System.out.println("Successfully opened GitHub on Chrome");

        fireFoxDriver.get("https://www.linkedin.com/feed/");
        System.out.println("Successfully opened LinkedIn on Firefox");

        edgeDriver.get("https://www.canada.ca/en/immigration-refugees-citizenship/services/application/account.html");
        System.out.println("Successfully opened IRCC page on Edge");

        //Get Page Title and length of the title. Print Page Title and Title length on the Eclipse Console.
        System.out.println("Getting page Titles, their length and printing them");

        String gitHubTitle = chromeDriver.getTitle();
        System.out.println("Chrome page title: " + gitHubTitle + "- Length: " + gitHubTitle.length());

        String linkedInTitle = fireFoxDriver.getTitle();
        System.out.println("Firefox page title: " + linkedInTitle + "- Length: " + linkedInTitle.length());

        String irccTitle = edgeDriver.getTitle();
        System.out.println("Edge page title: " + irccTitle + "- Length: " + irccTitle.length());

        //Get Page URL and verify if it is the correct page opened, print them out to the console.
        System.out.println("Get page url and verify if the correct page is open");
        String gitURL = chromeDriver.getCurrentUrl();
        String correctURL = "https://github.com/";
        if (correctURL.contains(gitURL))
            System.out.println("Correct GitHub page is opened");

        String linkedinURL = fireFoxDriver.getCurrentUrl();
        correctURL = "https://www.linkedin.com/feed/";
        if (correctURL.contains(linkedinURL))
            System.out.println("Correct Linked page is opened");

        String irccURL = edgeDriver.getCurrentUrl();
        correctURL = "https://www.canada.ca/en/immigration-refugees-citizenship/services/application/account.html";
        if (correctURL.contains(irccURL))
            System.out.println("Correct IRCC page is opened");

        //Get Page Source and Page source length, print them out to the console.
        System.out.println("Get page source and print it");

        String gitSource = chromeDriver.getPageSource();
        System.out.println("Chrome Source page: " + gitSource + " - Length: " + gitSource.length());

        String linkedinSource = fireFoxDriver.getPageSource();
        System.out.println("Firefox Source page: " + linkedinSource + " - Length: " + linkedinSource.length());

        String irccSource = edgeDriver.getPageSource();
        System.out.println("Edge Source page: " + irccSource + " - Length: " + irccURL.length());


        //Close the browser.
        System.out.println("Closing all browsers");
        chromeDriver.quit();
        fireFoxDriver.quit();
        edgeDriver.quit();
    }
}
