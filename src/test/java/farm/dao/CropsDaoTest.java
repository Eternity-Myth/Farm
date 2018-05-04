package farm.dao;

import com.farm.dao.CropsDao;
import com.farm.entity.Crops;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.annotation.Rollback;

import javax.annotation.Resource;

public class CropsDaoTest extends BaseDaoTest {
    @Resource
    private CropsDao cropsDao;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Rollback(value = false)
    @Test
    public void testInsert() throws Exception {
        Crops crops=new Crops();
        crops.setCropsName("test");
        crops.setArea(666);
        crops.setProfit(777);
        crops.setCropsTime(888);
        int insertCount = cropsDao.insert(crops);
        logger.info("insertCount=" + insertCount);
        logger.info("insertUser=" + crops);
    }
}
