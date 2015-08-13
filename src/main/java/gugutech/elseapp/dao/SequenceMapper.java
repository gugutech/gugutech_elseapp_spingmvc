package gugutech.elseapp.dao;

import gugutech.elseapp.model.Sequence;
import java.util.List;

public interface SequenceMapper {
    int deleteByPrimaryKey(String name);

    int insert(Sequence record);

    Sequence selectByPrimaryKey(String name);

    List<Sequence> selectAll();

    int updateByPrimaryKey(Sequence record);
}