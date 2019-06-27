package DLD.Tests;

import DLD.Pages.LoginPage;
import DLD.StartClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends StartClass {

    @Test
    public void loginPage (){
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.setSignInBtn();
        loginPage.setloginField("olena.ponomarchuk+test20@nordwhale.com");
        loginPage.setPasswordField("123456");
        loginPage.loginBtnClick();
    }
    @Test
    public void invalidloginPage () {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.setSignInBtn();
        loginPage.setloginField("test");
        loginPage.setPasswordField("test");
        loginPage.loginBtnClick();
    }
    @Test
    public void loginOfPhysicalProduct(){
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.productsBtnClick();
        loginPage.clickAnyProduct();
        loginPage.setSignInBtn();
        loginPage.setloginField("olena.ponomarchuk+test20@nordwhale.com");
        loginPage.setPasswordField("123456");
        loginPage.loginBtnClick();
    }
    @Test
    public void loginHereBtnOfProduct(){
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.productsBtnClick();
        loginPage.clickAnyProduct();
        loginPage.clickloginHereBtn();
        loginPage.setloginField("olena.ponomarchuk+test20@nordwhale.com");
        loginPage.setPasswordField("123456");
        loginPage.loginBtnClick();
    }
    @Test
    public void loginFromHeader(){
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.productsBtnClick();
        loginPage.clickAnyProduct();
        loginPage.clickAddCartBtn();
        loginPage.setSignInBtn();
        loginPage.setloginField("olena.ponomarchuk+test20@nordwhale.com");
        loginPage.setPasswordField("123456");
        loginPage.loginBtnClick();
    }
    @Test
    public void loginFormPdTroceoCheckoutBtn(){
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.productsBtnClick();
        loginPage.clickAnyProduct();
        loginPage.clickAddCartBtn();
        loginPage.clickProcedToCheckoutBtn();
        loginPage.setPasswordField("123456");
        loginPage.loginBtnClick();
    }
    @Test
    public void loginContinueAsGuestBtn(){
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.productsBtnClick();
        loginPage.clickAnyProduct();
        loginPage.clickAddCartBtn();
        loginPage.clickProcedToCheckoutBtn();
        loginPage.clickContinueAsGuestBtn();
        loginPage.clickOrangeBtn();
    }
    @Test
    public void loginThroughWebinarsBtn(){
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.clickwebinarsBtn();
        loginPage.setSignInBtn();
        loginPage.setloginField("olena.ponomarchuk+test20@nordwhale.com");
        loginPage.setPasswordField("123456");
        loginPage.loginBtnClick();
    }
    @Test
    public void loginThroughAddCommentBtn(){
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.clickwebinarsBtn();
        loginPage.clickAnyProduct();
        loginPage.clickCommentBtn();
        loginPage.setloginField("olena.ponomarchuk+test20@nordwhale.com");
        loginPage.setPasswordField("123456");
        loginPage.loginBtnClick();
    }
    @Test
    public void loginСheckoutBtn(){
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.clickwebinarsBtn();
        loginPage.clickAnyProduct();
        loginPage.clickcheckoutBtn();
        loginPage.setloginField("olena.ponomarchuk+test20@nordwhale.com");
        loginPage.setPasswordField("123456");
        loginPage.loginBtnClick();
    }
    @Test
    public void loginThroughGiftCardBtn(){
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.clickgiftCardBtn();
        loginPage.setSignInBtn();
        loginPage.setloginField("olena.ponomarchuk+test20@nordwhale.com");
        loginPage.setPasswordField("123456");
        loginPage.loginBtnClick();
    }
    @Test
    public void loginThroughanygiftCards(){
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.clickgiftCardBtn();
        loginPage.clickanygiftCards();
        loginPage.setSignInBtn();
        loginPage.setloginField("olena.ponomarchuk+test20@nordwhale.com");
        loginPage.setPasswordField("123456");
        loginPage.loginBtnClick();
    }
    @Test
    public void loginThrougaddCartBasketBtn(){
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.clickgiftCardBtn();
        loginPage.clickanygiftCards();
        loginPage.clickCartBasketBtn();
        loginPage.setSignInBtn();
        loginPage.setloginField("olena.ponomarchuk+test20@nordwhale.com");
        loginPage.setPasswordField("123456");
        loginPage.loginBtnClick();
    }
    @Test
    public void loginFormProcedCartBasketBtn(){
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.clickgiftCardBtn();
        loginPage.clickanygiftCards();
        loginPage.clickCartBasketBtn();
        loginPage.clickcheckoutBtn();
        loginPage.setloginField("olena.ponomarchuk+test20@nordwhale.com");
        loginPage.setPasswordField("123456");
        loginPage.loginBtnClick();
    }
    @Test // need ti fix later dont fogot
    public void loginFormThroughReplyOnComment(){
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.clickwebinarsBtn();
        loginPage.clickProductBtn();
        loginPage.clickReplyBtn();
    }


}



