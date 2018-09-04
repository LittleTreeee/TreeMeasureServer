package cn.nju.edu.littletree;

import cn.nju.edu.littletree.imageUpload.UploadImageServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class Application {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

//    // 注册servlet
//    @Bean
//    public ServletRegistrationBean weChatValid(){
//        //第一个参数是第1步中创建的WeChatServlet实例，第二个参数是其对应的路径，相当于web.xml中配置时的url-pattern。
//        return new ServletRegistrationBean(new UploadImageServlet(), "/uploadimage");
//    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
