package gugutech.elseapp.dao;

import gugutech.elseapp.model.UserBlackListT;
import java.util.List;

public interface UserBlackListTMapper {
    int deleteByPrimaryKey(Integer blackId);

    int insert(UserBlackListT record);

    UserBlackListT selectByPrimaryKey(Integer blackId);

    List<UserBlackListT> selectAll();

    int updateByPrimaryKey(UserBlackListT record);
}