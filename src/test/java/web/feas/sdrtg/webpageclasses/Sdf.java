package web.feas.sdrtg.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class Sdf extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":85,\"executed_user_id\":85,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"https://www.devrabbit.com/\",\"report_upload_url\":\"https://smartqe.io:443/UploadReportFile\",\"project_name\":\"feas\",\"project_description\":\"\",\"project_id\":419,\"module_name\":\"sdrtg\",\"module_description\":\"\",\"sub_module_id\":0,\"module_id\":710,\"testcase_name\":\"fdgfhjf\",\"testcase_id\":577,\"testset_id\":0,\"executed_timestamp\":-1101919925,\"browser_type\":\"chrome\",\"testcase_overwrite\":true,\"client_timezone_id\":\"Asia/Calcutta\"}";

	public static String projectName = "feas";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public Sdf(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Contact')]")	
	private WebElement	Contact_404684a;
	public String clkaContact_404684() {
		waitForExpectedElement(driver, Contact_404684a);		
		String text = Contact_404684a.getText();
		Contact_404684a.click();
		return text;
	}

}