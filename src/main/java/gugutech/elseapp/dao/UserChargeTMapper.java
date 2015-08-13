package gugutech.elseapp.dao;

import gugutech.elseapp.model.UserChargeT;
import java.util.List;

public interface UserChargeTMapper {
    int deleteByPrimaryKey(Integer charId);

    int insert(UserChargeT record);

    UserChargeT selectByPrimaryKey(Integer charId);

    List<UserChargeT> selectAll();

    int updateByPrimaryKey(UserChargeT record);
}