#### 20210224(수) 작업예정
- JUnit테스트 CRUD들어갑니다..
- jsp화면에서 CRUD작업예정.
- 3월2일(4교시)제출할 과제물 정리시간
- egov(Mysql) 마무리.
- 구름IDE C언어 구구단 설명OK.

#### 20210223(화) 작업
- 오라클에 member테이블 생성 + 더미데이터입력
- Ora_DbInterface 스프링MVC프로젝트 생성
- pom.xml로 자바,스프링,마이바티스 버전 업데이트+메이븐 업데이트.
- 프로젝트 Facets부분 web_module = 3.1 변경+자바1.8로.
- web.xml의 웹모듈버전 2.5 -> 3.1로변경.
- 깃연동OK.
- root-context.xml에 dB커넥션 Bean생성.
- log4jdbc.log4j2.properties 필수생성: 역할: 쿼리를 콘솔에서 디버그기능.
- mappers폴더생성 후 sampleMapper.xml 쿼리파일생성(CRUD쿼리)
- 쿼리에서 발생되는 반환값을 담을 공간 = VO클래스로 해결.
- 서비스패키지(DAO포함)생성.(@Repository,@Service) servlet-context.xml 파일 component-scan 속성사용.
- JUnit테스트 들어갑니다..