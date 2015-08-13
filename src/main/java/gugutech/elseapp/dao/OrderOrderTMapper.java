package gugutech.elseapp.dao;

import gugutech.elseapp.model.OrderOrderT;
import java.util.List;

public interface OrderOrderTMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(OrderOrderT record);

    OrderOrderT selectByPrimaryKey(Integer orderId);

    List<OrderOrderT> selectAll();

    int updateByPrimaryKey(OrderOrderT record);
}