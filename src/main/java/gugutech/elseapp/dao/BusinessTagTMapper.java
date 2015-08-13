package gugutech.elseapp.dao;

import gugutech.elseapp.model.BusinessTagT;
import java.util.List;

public interface BusinessTagTMapper {
    int deleteByPrimaryKey(Integer tagId);

    int insert(BusinessTagT record);

    BusinessTagT selectByPrimaryKey(Integer tagId);

    List<BusinessTagT> selectAll();

    int updateByPrimaryKey(BusinessTagT record);
}