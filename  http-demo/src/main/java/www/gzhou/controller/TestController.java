package www.gzhou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: TuMing.Chen
 * CatKing
 * @Date: 2020/8/14 22:37
 */
@Controller
@RequestMapping("test")
public class TestController {

    @RequestMapping("/1")
    @ResponseBody
    public String TestPrint(){
        return "Hello Wold";
    }

}
