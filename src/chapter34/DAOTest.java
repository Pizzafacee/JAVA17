package chapter34;

import org.junit.Test;

import java.util.List;

public class DAOTest {
    @Test
    public void test1(){
        UserDAO userDAO = new UserDAO();
        userDAO.save("1",new User("Tom",29));
        userDAO.save("2",new User("Jerry",22));
        userDAO.save("3",new User("Jack",22));
        List<User> list = userDAO.list();
        userDAO.delete("3");
        userDAO.update("2",new User("Jack",33));
        System.out.println(list);
    }
}
