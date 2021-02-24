package com.human.edu;

import java.sql.Connection;
import java.sql.SQLException;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.human.service.MemberService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class TestMemberService {
	@Inject
	private DataSource dataSource;//객체,오브젝트
	@Inject
	private MemberService memberService;
	
	@Test
	public void memberSelect() throws Exception {
		//JUnit으로 멤버서비스 CRUD중 View,Read 셀렉트테스트
		System.out.println("디버그1개레코드:"+memberService.memberView("user2"));
		System.out.println("디버그다중레코드:"+memberService.memberSelect());
	}
	@Test
	public void oracle_connect() throws SQLException {
		Connection connect = dataSource.getConnection();
		//DB커넥트를 new 키워드로 만들지 않고, get방식을 사용하는 이유(아래)
		//new키워드 객체를 만들게 허용하면, 객체를 계속 생성이 가능합니다.(부담)
		//한번 커넥션이 되면, 커넥션을 2번이상 호출하지 않게 됩니다.static 싱글톤클래스
		System.out.println("현재 접속된 DB커넥션은 "+connect);
	}
	@Test
	public void junit_test() {
		System.out.println("JUnit실행확인 메서드!");
	}
	
}
