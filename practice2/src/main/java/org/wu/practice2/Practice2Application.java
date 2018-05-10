package org.wu.practice2;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;


@Controller
@SpringBootApplication
public class Practice2Application {

    public static void main(String[] args) {
        SpringApplication.run(Practice2Application.class, args);
    }
    @RequestMapping(value = "/",method = GET)
    public String index(Model model) {
        Person title = new Person("SpringBoot学习小组", 2018, 0);
        List<Person> people = new ArrayList<>();
        Person p1 = new Person("郑璐琪", 18, 0);
        Person p2 = new Person("杨帅", 18, 0);
        Person p3 = new Person("杨伟民", 18, 0);
        Person p4 = new Person( "伍斌", 18, 0);
        Person p5 = new Person( "洪论武",18, 0);
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);
        model.addAttribute("GTitle", title);
        model.addAttribute("people", people);
        return "index";
    }
}
