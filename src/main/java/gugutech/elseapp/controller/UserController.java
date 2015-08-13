package gugutech.elseapp.controller;

import gugutech.elseapp.model.UserUserT;
import gugutech.elseapp.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by ali4 on 2015/8/12.
 */

@Controller
@RequestMapping(value = "user")
public class UserController {
    private UserService userService;

    public UserController(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring.xml","classpath:conf/spring-mybatis.xml"});
        userService = (UserService)applicationContext.getBean("userServiceImpl");
    }


    @RequestMapping(method = RequestMethod.GET,value = "/all")
    @ResponseBody
    public List<UserUserT> findAllUsers(){
        return userService.findAllUsers();
    }
}
