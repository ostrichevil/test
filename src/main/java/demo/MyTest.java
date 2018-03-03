package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@RestController
@EnableWebMvc
public class MyTest {

    @RequestMapping("/myTest")
    String home()
    {
        return "hello";
    }
    public static  void main(String[] args)
    {
        SpringApplication.run(MyTest.class);
    }
}
