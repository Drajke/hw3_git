import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class justTest {
    @Test
    void oneTest(){
        Selenide.open("https://yandex.ru");
        Selenide.open("https://github.com/selenide/selenide");
    }
}
