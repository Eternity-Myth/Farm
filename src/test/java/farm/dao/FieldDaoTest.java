package farm.dao;

import com.farm.dao.FieldDao;
import com.farm.entity.Field;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.annotation.Rollback;

import javax.annotation.Resource;
import java.util.Random;

public class FieldDaoTest extends BaseDaoTest {
    @Resource
    private FieldDao fieldDao;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Rollback(value = false)
    @Test
    public void testInsert() throws Exception {
        for (int i = 0; i < 100; i++) {
            Field field = new Field();
            Random random=new Random();
            field.setArea(random.nextFloat()*500);
            int insertCount = fieldDao.insertSelective(field);
            logger.info("insertCount=" + insertCount);
            logger.info("insertField=" + field);
        }
    }
//
//    @Test
//    public void testSelectById() throws Exception {
//        Field field = new Field();
//        field = fieldDao.selectById(1);
//        System.out.println(field.getId());
//        System.out.println(field.getArea());
//        System.out.println(field.getCrops());
//    }

//    @Test
//    public void testUpdateBaseInfoById() throws Exception {
//        Field field=fieldDao.selectById(1);
//        field.setArea(100);
//        field.setCrops("test");
//    }

}
