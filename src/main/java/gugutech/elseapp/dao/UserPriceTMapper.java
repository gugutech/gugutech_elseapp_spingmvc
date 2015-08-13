package gugutech.elseapp.dao;

import gugutech.elseapp.model.UserPriceT;
import java.util.List;

public interface UserPriceTMapper {
    int deleteByPrimaryKey(Integer priceId);

    int insert(UserPriceT record);

    UserPriceT selectByPrimaryKey(Integer priceId);

    List<UserPriceT> selectAll();

    int updateByPrimaryKey(UserPriceT record);
}