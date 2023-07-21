package io.reginaldlaw.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan()
// @RestController
//@ComponentScan(basePackageClasses=Controller.class)
public class Application {

    /*
  @RequestMapping("/")
  public String home() {
    return "Hello World";
  }
  
  */

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

}
