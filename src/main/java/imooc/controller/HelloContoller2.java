package imooc.controller;


import imooc.pojo.IMoocJSONResult;
import imooc.pojo.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContoller2 {

	@Autowired
	private Resource resource;
	
	@RequestMapping("/hello")
	public Object hello() {
		return "hello springboot~~";
	}
	
	@RequestMapping("/getResource")
	public IMoocJSONResult getResource() {
		
		Resource bean = new Resource();
		BeanUtils.copyProperties(resource, bean);
		
		return IMoocJSONResult.ok(bean);
	}
	
}
