package gugutech.elseapp.dao;

import gugutech.elseapp.model.UserBehaviorT;
import java.util.List;

public interface UserBehaviorTMapper {
    int deleteByPrimaryKey(Integer behaviorId);

    int insert(UserBehaviorT record);

    UserBehaviorT selectByPrimaryKey(Integer behaviorId);

    List<UserBehaviorT> selectAll();

    int updateByPrimaryKey(UserBehaviorT record);
}