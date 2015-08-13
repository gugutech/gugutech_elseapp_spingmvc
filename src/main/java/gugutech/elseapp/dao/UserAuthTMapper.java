package gugutech.elseapp.dao;

import gugutech.elseapp.model.UserAuthT;
import java.util.List;

public interface UserAuthTMapper {
    int deleteByPrimaryKey(Integer authId);

    int insert(UserAuthT record);

    UserAuthT selectByPrimaryKey(Integer authId);

    List<UserAuthT> selectAll();

    int updateByPrimaryKey(UserAuthT record);
}