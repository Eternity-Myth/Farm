package farm.dao;

import com.farm.dao.UserDao;

import com.farm.entity.User;
import com.farm.enums.AccountStatusEnum;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.annotation.Rollback;

import javax.annotation.Resource;

public class UserDaoTest extends BaseDaoTest {

    @Resource
    private UserDao userDao;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Rollback(value = false)
    @Test
    public void testInsert() throws Exception {
        User user = new User();
        user.setUserName("Eternity-Myth");
        user.setUserPass("123456");
        user.setUserEmail("530711667@qq.com");
//        user.setStatus(AccountStatusEnum.ACTIVED.getStatus());
        int insertCount = userDao.insert(user);
        logger.info("insertCount=" + insertCount);
        logger.info("insertUser=" + user);
    }

    @Test
    public void testUpdateBaseInfoById() throws Exception {

    }

    @Test
    public void testSelectById() throws Exception {

    }

    @Test
    public void testSelectByUserName() throws Exception {

    }

    @Test
    public void testSelectByUserEmail() throws Exception {

    }
}