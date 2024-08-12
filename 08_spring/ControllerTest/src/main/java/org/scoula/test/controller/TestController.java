package org.scoula.test.controller;



// 이거는 url 매핍과 view단으로 연결해주는 역활을 하고 있다
import lombok.extern.log4j.Log4j;
import org.scoula.test.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//1)컨트롤러라고 정의 - 알아서 new 해준다
@Controller

// 다음에 사용할 getMapping을 할때 /test/~가 된다

@RequestMapping("/test")
//\로그를 사용하기 위해서 필요
@Log4j
public class TestController {

    @GetMapping("/basic")
    public void basic() {
        log.info(" requst basic ======> TestController    /test/basic");
    }
    @PostMapping("/basic")
    public String postbasic() {
        log.info("postbasic ======> TestController    /test/postbasic");
        return "redirect:/test/basic";
    }
    @GetMapping("/user")
    public void user(@RequestParam("name") String name,@RequestParam("age") int age) {
        log.info("name : " + name + " age : " + age);
        log.info("user ======> TestController    /test/user");
    }
//    @PostMapping("/user")
//    public String userpost(@RequestParam("name") String name,@RequestParam("age") int age) {
//        log.info("name : " + name + " age : " + age);
//        log.info("userpost ======> TestController    /test/userpost");
//        return "redirect:/test/user";
//    }
    @GetMapping("/userdto")
    public void userdto(UserDTO dto) {
        log.info("dto : " +dto);
        log.info("userdto ======> TestController    /test/userdto");
    }

}
