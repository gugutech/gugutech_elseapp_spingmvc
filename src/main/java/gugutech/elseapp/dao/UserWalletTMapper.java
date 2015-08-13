package gugutech.elseapp.dao;

import gugutech.elseapp.model.UserWalletT;
import java.util.List;

public interface UserWalletTMapper {
    int deleteByPrimaryKey(Integer walletId);

    int insert(UserWalletT record);

    UserWalletT selectByPrimaryKey(Integer walletId);

    List<UserWalletT> selectAll();

    int updateByPrimaryKey(UserWalletT record);
}