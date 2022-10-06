package cw06102022;

public class Main {
    public static void main(String[] args) {
     CatalogPage catalogPage = new CatalogPage();
     catalogPage.verifyButtonClose();
     catalogPage.verifyButtonSave();

     HomePage homePage = new HomePage();
     homePage.verifyButtonClose();
     homePage.verifyButtonSave();

     KorzinaPage korzinaPage = new KorzinaPage();
     korzinaPage.verifyButtonClose();
     korzinaPage.verifyButtonOpen();
     korzinaPage.verifyButtonSave();


    }
}
