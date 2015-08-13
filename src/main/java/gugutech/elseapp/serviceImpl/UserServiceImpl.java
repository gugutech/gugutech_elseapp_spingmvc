package gugutech.elseapp.serviceImpl;

import gugutech.elseapp.dao.UserUserTMapper;
import gugutech.elseapp.model.UserUserT;
import gugutech.elseapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ali4 on 2015/8/12.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserUserTMapper userUserTMapper;

    public List<UserUserT> findAllUsers() {
        List<UserUserT> users = userUserTMapper.selectAll();
        return users;
    }
}
