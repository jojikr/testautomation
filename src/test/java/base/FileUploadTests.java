package base;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){

        var uploadPage = homePage.clickFileUpload();
        //Replace absolutePathOfFile with file path in running PC
        uploadPage.uploadFile("C:\\Users\\Joji\\IdeaProjects\\testautomation\\resources\\chromedriver.exe");
        assertEquals(uploadPage.getUploadedFiles(), "chromedriver.exe", "Uploaded files incorrect");
    }
}
