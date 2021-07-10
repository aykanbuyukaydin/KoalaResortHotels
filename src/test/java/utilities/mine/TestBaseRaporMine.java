package utilities.mine;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class TestBaseRaporMine {
    protected static ExtentReports extentReports; //extent report'a ilk atamayi yapar
    protected static ExtentTest extentTest; // test pass veya failed gibi bilgileri kaydeder. Ayrica ekran resmi icin de kullaniriz
    protected static ExtentHtmlReporter extentHtmlReporter; // Html raporu duzenler
    // Test işlemine başlamadan hemen önce (test methodundan önce değil, tüm test işleminden önce)
    @BeforeTest(alwaysRun = true) // alwaysRun : her zaman çalıştır.
    public void setUpTest() {
        extentReports = new ExtentReports();
        //rapor oluştuktan sonra raporunuz nereye eklensin istiyorsanız buraya yazıyorsunuz.
        String filePath = System.getProperty("user.dir") + "/test-output/mine/RaporUS_003.html";
        //oluşturmak istediğimiz raporu (html formatında) başlatıyoruz, filePath ile dosya yolunu belirliyoruz.
        extentHtmlReporter = new ExtentHtmlReporter(filePath);
        extentReports.attachReporter(extentHtmlReporter);
        // İstediğiniz bilgileri buraya ekeyebiliyorsunuz.
        extentReports.setSystemInfo("Enviroment","QA");
        extentReports.setSystemInfo("Browser", ConfigReader.getProperty("browser")); // chrome, firefox
        extentReports.setSystemInfo("Automation Engineer", "Mine");
        extentHtmlReporter.config().setDocumentTitle("Hotel,room,reservation Testi");  //buralari kendin gir
        extentHtmlReporter.config().setReportName("Hotel,room,reservation test raporu"); //buralari kendin gir
    }
    // Her test methodundan sonra eğer testte hata varsa, ekran görüntüsü alıp rapora ekliyor
    @AfterMethod(alwaysRun = true)
    public void tearDownMethod(ITestResult result) throws IOException {
        if (result.getStatus() == ITestResult.FAILURE) { // eğer testin sonucu başarısızsa
            String screenshotLocation = ReusableMethods.getScreenshot(result.getName());
            extentTest.fail(result.getName());
            extentTest.addScreenCaptureFromPath(screenshotLocation);
            extentTest.fail(result.getThrowable());
        } else if (result.getStatus() == ITestResult.SKIP) { // eğer test çalıştırılmadan geçilmezse
            extentTest.skip("Test Case is skipped: " + result.getName()); // Ignore olanlar
        }
        Driver.closeDriver();
    }
    // Raporlandırmayı sonlandırmak icin
    @AfterTest(alwaysRun = true)
    public void tearDownTest() {
        extentReports.flush();
    }

}