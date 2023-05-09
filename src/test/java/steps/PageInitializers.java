package steps;

import pages.EmployeeSearchPage;
import pages.LoginPage;

public class PageInitializers {

    // declear object
    public static LoginPage login;
    public static EmployeeSearchPage employeeSearchPage;


    // initialize
    public static void initializePageObjects(){
        login = new LoginPage();
        employeeSearchPage = new EmployeeSearchPage();
    }

}
