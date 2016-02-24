package hello;

import hello.mapper.TestMapper;
import hello.mapper.UserInfo;
import hello.mapper.UserInfoMapper;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class ApplicationTest {
    @Autowired
    private DataSource dataSource;
    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    @Autowired
    private TestMapper testMapper;
    
    @Autowired
    private UserInfoMapper userinfoMapper;
    
    @Test
    public void testConnection() throws SQLException {
        System.out.println(dataSource);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }
    
    @Test
    public void testInsert() throws Exception {
        testMapper.set("testname");
    }
    
    @SuppressWarnings("unchecked")
    @Test
    public void testGet() throws Exception {
        HashMap<String, String> map = (HashMap<String, String>)testMapper.get( "testname");
        System.out.println( "name : " + map.get( "testname"));
        for( String value : map.values()) {
            System.out.println( value);
        }
    }
    
    @Test
    public void userCreate() throws Exception {
        UserInfo user = new UserInfo();
        user.setUserid("sofriend2");
        user.setPasswd("rhtmxm");
        user.setName("¿Ã¿Á»Ø2");
        userinfoMapper.create( user);
    }
    
    @Test
    public void userList() throws Exception {
        List<UserInfo> list = userinfoMapper.list();
        
        for( UserInfo info : list) {
            System.out.println( info.getUserid());
        }
    }
}
