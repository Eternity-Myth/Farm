package farm.dao;

import com.farm.dao.UserDao;

import com.farm.entity.User;
import com.farm.enums.AccountStatusEnum;
import com.farm.enums.SexEnum;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.annotation.Rollback;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;

public class UserDaoTest extends BaseDaoTest {

    @Resource
    private UserDao userDao;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Rollback(value = false)
    @Test
    public void testInsert() throws Exception {
        User user = new User();
        user.setUserName("fireoct");
        user.setUserPass("123456");
        user.setUserEmail("123456789@qq.com");
        user.setStatus(AccountStatusEnum.ACTIVED.getStatus());
        int insertCount = userDao.insert(user);
        logger.info("insertCount=" + insertCount);
        logger.info("insertUser=" + user);
    }

    @Test
    public void testUpdateBaseInfoById() throws Exception {
        User user = new User();
        user.setUserName("fireoct");
        user.setUserPass("123456");
        user.setUserEmail("123456789@qq.com");
        user.setStatus(AccountStatusEnum.ACTIVED.getStatus());
        int insertCount = userDao.insert(user);
        logger.info("insertCount=" + insertCount);
        logger.info("insertUser=" + user);
        User updateUser = userDao.selectById(user.getId());
        updateUser.setNickName("十月");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        updateUser.setBirth(sdf.parse("1990-05-05"));
        updateUser.setSex(SexEnum.MALE.getSex());
        updateUser.setProfile("大家好，我是偷星九月天里面的十月！");
        int updateCount = userDao.updateBaseInfoById(updateUser);
        logger.info("updateCount=" + updateCount);
        logger.info("updateUser=" + updateUser);
        User dbUser = userDao.selectById(user.getId());
        logger.info("dbUser=" + dbUser);
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