package com.xiaohao.base.test;

import com.xiaohao.base.model.User;
import com.xiaohao.core.dao.UserDao;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ethan
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
@TransactionConfiguration(defaultRollback = false)
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class BaseTestTemplate {

}
