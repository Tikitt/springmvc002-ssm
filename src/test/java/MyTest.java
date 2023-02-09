import com.st.mapper.UserMapper;
import com.st.pojo.User;
import com.st.service.UserService;
import com.st.service.impl.UserServiceImpl;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @program: springmvc002-ssm
 * @description: 测试UserMapper
 * @author: tiki
 * @create: 2023-01-14 19:34
 * 还是我来说一下吧，controller层要注解是因为springMVC会根据注解扫描到哪些是接口，mapper层要加@Parm注解是因为要让参数名称和数据库名称一致
 * mysql8.0以上版本，需要在url后边加上？serverTimezone=UTC
 * 想要直接测试mapper的话，在test里使用@Autowired引入userMapper对象，调用该对象里的方法
 **/

@RunWith(SpringJUnit4ClassRunner.class)// 启动Spring容器
//@ContextConfiguration(locations = {"classpath:applicationContext_mapper.xml","classpath:applicationContext_service.xml"})
@ContextConfiguration(locations = {"classpath:applicationContext_*.xml"})

public class MyTest {
    @Autowired
    UserService userService;
    @Test
    public void testSelectUserPage(){
        List<User> users = userService.selectUserPage(null, null, 0);
        users.forEach(user -> System.out.println(user));
    }
}
