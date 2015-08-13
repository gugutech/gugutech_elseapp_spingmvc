package gugutech.elseapp.dao;

import gugutech.elseapp.model.UserCommentT;
import java.util.List;

public interface UserCommentTMapper {
    int deleteByPrimaryKey(Integer commentId);

    int insert(UserCommentT record);

    UserCommentT selectByPrimaryKey(Integer commentId);

    List<UserCommentT> selectAll();

    int updateByPrimaryKey(UserCommentT record);
}