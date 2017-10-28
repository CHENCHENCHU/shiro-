package cn.mldn.mldnshiro.ssm.service.member;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.mldn.mldnshiro.ssm.service.front.IMemberServiceFront;

@ContextConfiguration(locations= {"classpath:spring/spring-*.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestMemberServiceFront {
	@Resource
	private IMemberServiceFront memberServiceFront;
	@Test
	public void TestGet() {
		System.err.println(this.memberServiceFront.get("mldn"));
	}
	@Test
	public void TestGetRoleAndAction() {
		System.err.println(this.memberServiceFront.getRoleAndActionByMember("mldn"));
	}
}
