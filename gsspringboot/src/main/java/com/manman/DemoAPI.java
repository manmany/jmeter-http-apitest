package com.manman;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;


@RestController
@EnableAutoConfiguration
@RequestMapping("/com/manman/DemoAPI")
public class DemoAPI {

    @RequestMapping(value = "/getDemo/{userName}", method = RequestMethod.GET)
    public String getDemo(@PathVariable String userName) {
//        String i = "aaaa";
//        userName = userName + i;
    	return "you input data is: " + userName;
    }

    public static int count = 0;

    @RequestMapping(value = "/postDemo", method = RequestMethod.POST)
    public String postDemo(@RequestParam String userName) {
        count++;
        String result = "接口是第" + count +"次被调用，您的用户名是：" + userName;

		return result;
		
	}


    @RequestMapping(value = "/postJson", method = RequestMethod.POST)
    public @ResponseBody Student postJson(@RequestBody Student s) {
        Student student = new Student();
        student.name = s.name;
//        student.clazz = s.clazz;

        student.clazz = "二年二班";
        return student;

    }

}
