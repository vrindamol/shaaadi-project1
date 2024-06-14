package Test1;

import Bace1.Baseclass;
import Page1.Loginpage;
import Utilities1.Excelutil;
import org.testng.annotations.Test;

import java.io.IOException;

public class Logintest extends Baseclass {
    @Test
    public void Loginpage() throws InterruptedException, IOException {
        Loginpage lp = new Loginpage(driver);

        lp.verifytitle();

        String x1 = "D:\\Documents\\Project\\Logindetails.xlsx";
        String Sheet = "Sheet1";
        int rowCount = Excelutil.getRowCount(x1, Sheet);
        for (int i = 1; i <= rowCount; i++) {

            String Emailid = Excelutil.getCellValue(x1, Sheet, i, 0);
            System.out.println("Emailid is " + Emailid);
            String Password = Excelutil.getCellValue(x1, Sheet, i, 1);
            lp.Login(Emailid,Password);
            lp.Logo();
        }

    }

}
