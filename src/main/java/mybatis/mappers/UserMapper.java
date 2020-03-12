package mybatis.mappers;

import mybatis.models.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.ArrayList;

@Mapper
public interface UserMapper {

    String SELEC_ALL_USERS = "SELECT * FROM `mybatis-test`.users";

    @Select(SELEC_ALL_USERS) //requires a query to run
    public ArrayList<User> getAllUsers();

}
