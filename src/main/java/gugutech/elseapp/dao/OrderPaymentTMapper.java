package gugutech.elseapp.dao;

import gugutech.elseapp.model.OrderPaymentT;
import java.util.List;

public interface OrderPaymentTMapper {
    int deleteByPrimaryKey(Integer paymentId);

    int insert(OrderPaymentT record);

    OrderPaymentT selectByPrimaryKey(Integer paymentId);

    List<OrderPaymentT> selectAll();

    int updateByPrimaryKey(OrderPaymentT record);
}