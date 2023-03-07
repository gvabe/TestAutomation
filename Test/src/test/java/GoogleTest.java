import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
public class GoogleTest {
    @Test
    public void userCanLoginByUsername() {
        open("https://app.setantasports.com/home");
        $("[data-test-id='sign-in-btn']").click();
        $("#email").click();
        $("#email").setValue("gvabera96@gmail.com");
        $("#secret").click();
        $("#secret").setValue("Giorgi96");
        $("[data-test-id='btn btn--primary btn--loader']").click();
    }
}
