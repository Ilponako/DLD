package DLD.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    @FindBy(xpath = "//li[@class=\"tool-link auth-desktop \"]")
    private WebElement signInBtn;
    @FindBy (id = "Email")
    private WebElement loginField;
    @FindBy (id = "Password")
    private WebElement passwordField;
    @FindBy (id = "submit")
    private WebElement loginBtn;
    @FindBy (xpath = "//li[@class=\"tool-link products-link\"]")
    private WebElement productsBtn;
    @FindBy (xpath = "//h4[@class=\"product-name product_title\"]")
    private WebElement anyProduct;
    @FindBy(xpath = "//a[@class=\"login-reivew-condition\"]")
    private WebElement loginHereBtn;
    @FindBy(xpath = "//button[@class=\"add-cart-btn btn-effect one\"]")
    private WebElement addCartBtn;
    @FindBy(xpath = "//button[@class=\"btn-effect one checkout-btn\"]")
    private  WebElement procedToCheckoutBtn;
    @FindBy(xpath = "//a[text() = 'Continue as Guest']")
    private  WebElement continueAsGuestBtn;
    @FindBy(xpath = "//a[@class=\"btn-orange one\"]")
    private  WebElement orangeContinueAsGuestBtn;
    @FindBy(xpath = "//li[@class=\"tool-link webinars-link\"]")
    private WebElement webinarsBtn;
    @FindBy(xpath = "//a[text() = 'Login Here']")
    private WebElement loginToAddCommentBtn;
    @FindBy(xpath = "//button[@class=\"btn-effect one checkout-btn\"]")
    private WebElement checkoutBtn;
    @FindBy(xpath = "//li[@class=\"tool-link gift-card-link \"]")
    private WebElement giftCardBtn;
    @FindBy(xpath = "//a[@class=\"product-inner shine-effect-inner clearfix\"]")
    private WebElement anygiftCards;
    @FindBy(xpath = "//button[@class=\"add-cart-btn btn-effect one\"]")
    private WebElement addCartBasketBtn;
    @FindBy(xpath = "//a[@href='/digital/magtech-9mm-115-gr-fmj-webinar']")
    private WebElement webinarWithCommentSection;
    @FindBy(xpath = "//p[@class=\"reply-btn reply-btn-577\"]")
    private WebElement replyBtn;




    public void setSignInBtn (){
        signInBtn.click();
    }
    public void setloginField (String login){
        loginField.click();
        loginField.sendKeys(login);
    }
    public void setPasswordField(String password){
        passwordField.click();
        passwordField.sendKeys(password);
    }
    public void loginBtnClick() {
        loginBtn.click();
    }
    public void productsBtnClick(){
        productsBtn.click();
    }
    public void clickAnyProduct(){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//h4[@class=\"product-name product_title\"]")));
        anyProduct.click();
    }
    public void clickloginHereBtn(){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class=\"login-reivew-condition\"]")));
        loginHereBtn.click();
    }
    public void clickAddCartBtn(){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//button[@class=\"add-cart-btn btn-effect one\"]")));
        addCartBtn.click();
    }
    public void clickProcedToCheckoutBtn(){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class=\"btn-effect one checkout-btn\"]")));
        procedToCheckoutBtn.click();
    }
    public void clickContinueAsGuestBtn(){
        continueAsGuestBtn.click();
    }
    public void clickOrangeBtn(){
        orangeContinueAsGuestBtn.click();
    }
    public void clickwebinarsBtn(){
        webinarsBtn.click();
    }
    public void clickCommentBtn(){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text() = 'Login Here']")));
        loginToAddCommentBtn.click();
    }
    public void clickcheckoutBtn(){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class=\"btn-effect one checkout-btn\"]")));
        checkoutBtn.click();
    }
    public void clickgiftCardBtn(){
        giftCardBtn.click();
    }
    public void clickanygiftCards(){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[@class=\"product-inner shine-effect-inner clearfix\"]")));
        anygiftCards.click();
    }
    public void clickCartBasketBtn(){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class=\"add-cart-btn btn-effect one\"]")));
        addCartBasketBtn.click();
    }
    public void clickProductBtn(){
//        WebDriverWait wait = new WebDriverWait(driver, 60);
//        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[@href='/digital/magtech-9mm-115-gr-fmj-webinar']")));
//        webinarWithCommentSection.click();

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)", webinarWithCommentSection);

    }
    public void clickReplyBtn(){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//p[@class=\"reply-btn reply-btn-577\"]")));
        replyBtn.click();

    }
}
