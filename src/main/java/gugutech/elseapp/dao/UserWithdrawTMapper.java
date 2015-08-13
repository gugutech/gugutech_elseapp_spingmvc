package gugutech.elseapp.dao;

import gugutech.elseapp.model.UserWithdrawT;
import java.util.List;

public interface UserWithdrawTMapper {
    int deleteByPrimaryKey(Integer withdrawId);

    int insert(UserWithdrawT record);

    UserWithdrawT selectByPrimaryKey(Integer withdrawId);

    List<UserWithdrawT> selectAll();

    int updateByPrimaryKey(UserWithdrawT record);
}