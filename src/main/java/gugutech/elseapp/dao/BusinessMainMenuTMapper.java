package gugutech.elseapp.dao;

import gugutech.elseapp.model.BusinessMainMenuT;
import java.util.List;

public interface BusinessMainMenuTMapper {
    int deleteByPrimaryKey(Integer businessMainMenuId);

    int insert(BusinessMainMenuT record);

    BusinessMainMenuT selectByPrimaryKey(Integer businessMainMenuId);

    List<BusinessMainMenuT> selectAll();

    int updateByPrimaryKey(BusinessMainMenuT record);
}