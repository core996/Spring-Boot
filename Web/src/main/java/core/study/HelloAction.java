package core.study;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description: 欢迎页面
 * @author: Xin Wu
 * @create: 2019-09-01 11:28
 **/
@Controller
@ResponseBody
public class HelloAction {
    @RequestMapping("/hello")
    public String Hello(){
        return "hello World" ;
    }
}
