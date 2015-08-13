package gugutech.elseapp.dao;

import gugutech.elseapp.model.UserLoginT;
import java.util.List;

public interface UserLoginTMapper {
    int deleteByPrimaryKey(Integer loginId);

    int insert(UserLoginT record);

    UserLoginT selectByPrimaryKey(Integer loginId);

    List<UserLoginT> selectAll();

    int updateByPrimaryKey(UserLoginT record);
}