import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.sb.FeignApp;
import org.sb.service.DataAPIClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@ExtendWith(SpringExtension.class) // Use SpringExt
@SpringBootTest(classes = FeignApp.class)
class AppTest {

    @Autowired
    DataAPIClient dataAPIClient;

    @Test
    void contextLoads(){
        Assertions.assertNotNull(dataAPIClient);
    }

    @Test
    void test(){
        Assertions.assertNotNull(dataAPIClient.getBloodGroup());
        //If API gives B then test will run
        Assertions.assertEquals("B", dataAPIClient.getBloodGroup().getType());
    }
}
