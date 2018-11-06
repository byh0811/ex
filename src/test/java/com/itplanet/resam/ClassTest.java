package com.itplanet.resam;

import org.junit.*;
import org.junit.runner.*;
import org.mybatis.spring.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.test.context.*;
import org.springframework.test.context.junit4.*;
import org.springframework.test.context.web.*;

import com.itplanet.resam.dao.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/**/*-context.xml")
public class ClassTest {
	@Autowired private SqlSessionTemplate tpl;
	@Test
	public void test() {
		System.out.println(tpl.selectList("selectBoard"));
	}
}
