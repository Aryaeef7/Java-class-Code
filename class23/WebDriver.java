package class23;


public class WebDriver {
    public void startBrowser(){
        System.out.println("starting the Browser");
    }
    public void openURL(){
        System.out.println("opening a url ");
    }
    public void testLoginPage(){
        System.out.println("Testing the login page  ");
    }
    public void closeBrowser(){
        System.out.println("closing the browser");
    }
}

class Chrome extends WebDriver {
    public void startBrowser() {
        System.out.println("starting google chrome");
    }

    public void openURL() {
        System.out.println("opening a url ");
    }

    public void testLoginPage() {
        System.out.println("Testing the login page in chrome ");
    }

    public void closeBrowser() {
        System.out.println("closing the google chrome");
    }
}
      class Safari extends WebDriver {
        public void startBrowser() {
            System.out.println("starting safari");
        }
        public void openURL(){
            System.out.println("opening a url safari");
        }

        public void testLoginPage() {
            System.out.println("Testing the login page in safari ");
        }

        public void closeBrowser() {
            System.out.println("closing the google chrome");
        }

            }

class Firefox extends WebDriver{
    public void startBrowser() {
        System.out.println("starting google Firefox");
    }
    public void openURL(){
        System.out.println("opening a url Firefox ");
    }

    public void testLoginPage() {
        System.out.println("Testing the login page in Firefox ");
    }

    public void closeBrowser() {
        System.out.println("closing the google FireFox");
    }

}







