package farm.dao;

/**
 * Created by Guan WenCong on 2018/5/3.
 */

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

/**
 * Junit测试DAO的父类，继承此类省去每次配置@RunWith以及@ContextConfiguration的麻烦
 * 配置Spring和Junit整合，Junit启动时加载SpringIOC容器
 * spring-test，junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
//这里使用test/resources/里面的spring-dao-test.xml整入了事务的配置，用于回滚操作
@ContextConfiguration({"classpath:spring/spring-dao-test.xml"})
// 配置事务的回滚,对数据库的增删改都会回滚,便于测试用例的循环利用
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional
public class BaseDaoTest {
}
