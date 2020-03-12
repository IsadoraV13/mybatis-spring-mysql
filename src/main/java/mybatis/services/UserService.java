package mybatis.services;

import mybatis.mappers.UserMapper;
import mybatis.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service //create a bean out of this class and inject where necessary
public class UserService {

    @Autowired //injects a bean (Java Object managed by Spring) of type UserMapper in this class
    UserMapper userMapper;

    public ArrayList<User> getAllUsers() {
        return userMapper.getAllUsers();
    }
}
