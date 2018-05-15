package farm.dao;

import com.farm.dao.CropsDao;
import com.farm.entity.Crops;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.annotation.Rollback;

import javax.annotation.Resource;
import java.util.Random;

public class CropsDaoTest extends BaseDaoTest {
    @Resource
    private CropsDao cropsDao;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Rollback(value = false)
//    @Test
//    public void testInsert() throws Exception {
//        for (int i = 0; i < 100; i++) {
//            Crops crops = new Crops();
//            crops.setCropsName("test");
//            Random random = new Random();
//            crops.setArea(random.nextInt(200));
//            crops.setProfit(random.nextInt(1000));
//            crops.setCropsTime(random.nextInt(365));
//            int insertCount = cropsDao.insert(crops);
//            logger.info("insertCount=" + insertCount);
//            logger.info("insertUser=" + crops);
//        }
//    }

    @Test
    public void testSelectById() throws Exception {
    }
}
