package commons;

import java.io.File;

public class GlobalConstants {
	public static final String PORTAL_PAGE_URL = "https://demo.nopcommerce.com/";
	public static final String ADMIN_PAGE_URL = "https://admin-demo.nopcommerce.com/";
	public static final String LIVE_GURU_ADMIN_PAGE_URL = "http://live.techpanda.org/index.php/backendlogin/customer/";
	public static final String PROJECT_PATH = System.getProperty("user.dir");
	public static final String OS_NAME = System.getProperty("os.name");
	public static final String UPLOAD_FILE_PATH = PROJECT_PATH + File.separator + "uploadFiles" + File.separator;
	public static final String DOWNLOAD_FILE_PATH = PROJECT_PATH + File.separator + "downloadFiles";
	public static final String BROWSER_LOG = PROJECT_PATH + File.separator + "browserLogs";
	public static final String DRAG_DROP_HTML5 = PROJECT_PATH + File.separator + "dragDropHTML5";
	public static final String DB_DEV_URL = "192.168.1.5:8080";
	public static final String DB_DEV_USER = "automationfc";
	public static final String DB_DEV_PASS = "P@sswOr1d1!";
	public static final String DB_TEST_URL = "192.168.1.15:8080";
	public static final String DB_TEST_USER = "automationfc";
	public static final String DB_TESTPASS = "P@sswOr1d1!";
	public static final long SHROT_TIMEOUT = 5;
	public static final long LONG_TIMEOUT = 30;
	public static final long RETRY_TEST_FAIL = 3;

}
