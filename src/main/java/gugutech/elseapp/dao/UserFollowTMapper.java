package gugutech.elseapp.dao;

import gugutech.elseapp.model.UserFollowT;
import java.util.List;

public interface UserFollowTMapper {
    int deleteByPrimaryKey(Integer followId);

    int insert(UserFollowT record);

    UserFollowT selectByPrimaryKey(Integer followId);

    List<UserFollowT> selectAll();

    int updateByPrimaryKey(UserFollowT record);
}