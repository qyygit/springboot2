package imooc.controller;

import imooc.pojo.IMoocJSONResult;
import imooc.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


//@Controller
@RestController        // @RestController = @Controller + @ResponseBody
@RequestMapping("/user")
public class UserContoller {

	@RequestMapping("/getUser")
//	@ResponseBody
	public User getUser() {


		User u = new User();
		u.setName("imooc22");
		u.setAge(18);
		u.setBirthday(new Date());
		u.setPassword("imooc2");
		u.setDesc("hello imooc2~~");
		
		return u;
	}
	
	@RequestMapping("/getUserJson")
//	@ResponseBody
	public IMoocJSONResult getUserJson() {
		
		User u = new User();
		u.setName("imooc");
		u.setAge(18);
		u.setBirthday(new Date());
		u.setPassword("imooc");
		u.setDesc("hello imooc");
		
		return IMoocJSONResult.ok(u);
	}
}
