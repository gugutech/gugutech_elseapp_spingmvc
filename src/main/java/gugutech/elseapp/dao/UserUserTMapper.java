package gugutech.elseapp.dao;

import gugutech.elseapp.model.UserUserT;
import java.util.List;

public interface UserUserTMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(UserUserT record);

    UserUserT selectByPrimaryKey(Integer userId);

    List<UserUserT> selectAll();

    int updateByPrimaryKey(UserUserT record);
}