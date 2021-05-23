import com.ytian.springcloud.service.AccountService;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.math.BigDecimal;

@SpringBootTest
public class test {

    @Resource
    private AccountService accountService;

    Long userId =1L;
    BigDecimal money = BigDecimal.valueOf(100);

    @Test
    public void testAccount()
    {
        accountService.decrease(userId,money);
    }
}
