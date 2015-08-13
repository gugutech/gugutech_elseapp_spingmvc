package gugutech.elseapp.dao;

import gugutech.elseapp.model.LookupT;
import java.util.List;

public interface LookupTMapper {
    int deleteByPrimaryKey(Integer lookupId);

    int insert(LookupT record);

    LookupT selectByPrimaryKey(Integer lookupId);

    List<LookupT> selectAll();

    int updateByPrimaryKey(LookupT record);
}