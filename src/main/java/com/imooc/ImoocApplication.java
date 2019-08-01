package com.imooc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
// 扫描mybatis  mapper 的包路径
@MapperScan(basePackages = ("com.imooc.mapper"))
// 所有需要的包，包含一些工具类包，所在的路径
@ComponentScan(basePackages = {"com.imooc","org.n3r.idworker"})
// 开启定时扫描任务
@EnableScheduling
// 异步任务开启
@EnableAsync
public class ImoocApplication {

	public static void main(String[] args) {

		SpringApplication.run(ImoocApplication.class,args);

	}
}
