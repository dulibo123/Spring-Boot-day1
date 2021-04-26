import com.baizhi.HelloApplication;
import com.baizhi.bean.Person;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)

@SpringBootTest(classes = HelloApplication.class)
public class TestApplication {
    @Autowired
    Person person;
@Test
    public void test(){
    System.out.println(person);
    }
}
