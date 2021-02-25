package com.fan;

import com.fan.bean.TestBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: 测试类
 * @author: 景行
 * @create: 2021/02/25
 **/
public class MyApplication {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		TestBean testBean = (TestBean)ac.getBean("testBean");
		testBean.test();
	}


}
