package gugutech.elseapp.dao;

import gugutech.elseapp.model.BusinessStoreT;
import java.util.List;

public interface BusinessStoreTMapper {
    int deleteByPrimaryKey(Integer storeId);

    int insert(BusinessStoreT record);

    BusinessStoreT selectByPrimaryKey(Integer storeId);

    List<BusinessStoreT> selectAll();

    int updateByPrimaryKey(BusinessStoreT record);
}