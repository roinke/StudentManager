package net.roink.controller;

import net.roink.entity.Student;
import net.roink.entity.Teacher;
import net.roink.entity.User;
import net.roink.service.StudentService;
import net.roink.service.TeacherService;
import net.roink.service.UserService;
import net.roink.utils.MD5Utils;
import net.roink.utils.MapControl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;
    @Autowired
    private StudentService studentService;
    @Autowired
    private TeacherService teacherService;

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/login")
    @ResponseBody
    public Map<String,Object> login(String userName, String password, String type,String captcha, HttpSession session){

        if(StringUtils.isEmpty(userName) || StringUtils.isEmpty(password) || StringUtils.isEmpty(type)){
            return MapControl.getInstance().error("用户名或密码不能为空").getMap();
        }
        String _captcha = (String)session.getAttribute("captcha");
        if(StringUtils.isEmpty(captcha)){
            return MapControl.getInstance().error("验证码不能为空").getMap();
        }
        if(!captcha.equals(_captcha)){
            return MapControl.getInstance().error("验证码错误").getMap();
        }

        //管理员登录
        if("1".equals(type)){
            User user = userService.login(userName, MD5Utils.getMD5(password));
            if(user != null){
                session.setAttribute("user",user);
                session.setAttribute("type",1);
                return MapControl.getInstance().success().add("data",user).getMap();
            }else{
                return MapControl.getInstance().error("用户名或密码错误").getMap();
            }
        }
        //老师登录
        if("2".equals(type)){
            Teacher teacher = teacherService.login(userName, MD5Utils.getMD5(password));
            if(teacher != null){
                session.setAttribute("user",teacher);
                session.setAttribute("type",2);
                return MapControl.getInstance().success().add("data",teacher).getMap();
            }else{
                return MapControl.getInstance().error("用户名或密码错误").getMap();
            }

        }
        //学生登录
        if("3".equals(type)){
            Student student = studentService.login(userName, MD5Utils.getMD5(password));
            if(student != null){
                session.setAttribute("user",student);
                session.setAttribute("type",3);
                return MapControl.getInstance().success().add("data",student).getMap();
            }else{
                return MapControl.getInstance().error("用户名或密码错误").getMap();
            }
        }
        return MapControl.getInstance().error("用户名或密码错误").getMap();
    }



}
