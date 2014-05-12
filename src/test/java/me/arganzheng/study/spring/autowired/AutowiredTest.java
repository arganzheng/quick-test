package me.arganzheng.study.spring.autowired;

import static junit.framework.Assert.assertNotNull;

import java.util.List;

import me.arganzheng.study.BaseSpringTestCase;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * 
 * @author zhengzhibin
 * 
 */
public class AutowiredTest extends BaseSpringTestCase {

	@Autowired
	@Qualifier("luxury")
	private List<Car> luxuryCars;

	@Test
	public void testAutowired() {

		assertNotNull(luxuryCars);
		System.out.println(luxuryCars.getClass().getSimpleName());
		System.out.println(luxuryCars);
	}

}
