# spring-boot-restaurant

### 강의 활용법

1. 팀프로젝트를 가정하고 진행
2. 목적이 무엇인지 생각 / 왜 그렇게 되는지 관찰 / 반복하면서 원리 이해 / 예상치 못한 문제를 해결 / 계획
3. 매일 기록

### 무엇을 만들것인가

1. 무엇이 문제인가?(요구사항, 불편함) > 문제 해결을 통해 > 프로그램을 만든다
2. 요구사항 메인 : "오늘 뭐먹지?"
   1. 주변에 어떤 가게가 있는지 잘 모른다 : 매일 같은곳에 가는 건 싫다. 기존에 방문한 사람들의 평가. 가보고 싶은 곳을 기록하고 싶다.
   2. 온라인 예약이 가능할까
3. 사용자 스토리 : 사용자 입장에서 기능을 서술
   1. 형식 : 사용자는 (가치)를 위해 (기능)을 할 수 있다.
   2. 사용자는 누구인가? 고객, 가게, 관리자
   3. 고객
      - 고객은 뭘 먹고 싶은지 발견할 수 있도록 가게 목록을 볼 수 있다.
      - 고객은 정확히 먹고 싶은게 뭔지 확인하기 위해 가게의 메뉴를 볼 수 있다.
      - 고객은 좋은 가게인지 알 수 있도록 평점을 확인할 수 있다.
      - 고객은 선택의 폭을 좁히기 위해 가게 목록을 분류에 따라 볼 수 있다.
      - 고객은 나와 남을 위해 가게에 평점과 리뷰를 남길 수 있다.
      - 고객은 나중에 찾아보기 쉽도록 즐겨찾기에 추가할 수 있다.
      - 고객은 가게에서 기다리지 않기 위해 가게에 인원, 메뉴를 예약할 수 있다.
   4. 가게
      - 가게는 관심있는 고객을 받기 위해 예약 요청을 볼 수 있다.
      - 가게는 더 나은 고객 서비스를 위해 예약 요청에 응답할 수 있다.
   5. 관리자
      - 관리자는 고객이 서비스를 쓸 수 있도록 가게 정보를 등록할 수 있다.
4. 개발계획 및 변경
   1. 요구사항 변경은 반복된다.
   2. 계획을 세우자. 사용자 스토리 기반하여 계획을 세운다.
   3. 요구사항 변경시, 해당내용을 계획에 반영하여, 변경되는 기간, 내용등을 잘 알 수 있도록 한다.

### 어떻게 만들것인가

1. 도메인 모델링

   1. Restaurant : 모델
   2. Menu Item > Food & Beverages : 메뉴
   3. User > 고객, 관리자, 가게 사장 : 사용자
   4. Favorite : 즐겨찾기
   5. Review : 평점, 댓글
   6. Reservation : 예약

2. 시스템 아키텍처

   1. 제약조건 : 홈페이지 > Web, Mobile
   2. 다른부분 : Web은 웹브라우저로 사용자가 접근하고, Mobile은 모바일앱으로 사용자가 접근한다.
   3. 공통인 부분 : 기능이 동일하다
   4. Front-end / Back-end : 프론트앤드에 "다른부분"을 구현하고, 백앤드에 "공통인부분"을 구현한다.
   5. Multi-tier Architecture > 3-tier Architecture
      - Presentation | Front-end | HTML/CSS/JS
      - Business | Back-end | REST API
      - Data Source | Database | DBMS
   6. 이번 프로젝트는 Back-end에 집중함.

3. Back-end 아키텍쳐

   1. Layered Architecture
      - UI Layer
      - Application Layer
      - Domain Layer
      - Infrastructure Layer

4. 기술선택
   - Java
   - Spring Boot
   - REST API

### 프로젝트 생성

1. https://spring.io 접속 > spring initializr를 이용하여 프로젝트 생성 후 다운로드
2. 선택항목
   - Project : Gradle Project
   - Language : Java
   - Spring Boot : 2.2.6
   - Project Metadata
     - Group : kr.co.fastcampus
     - Artifact : eatgo
     - Name : eatgo
     - Description : Eat Go Project
     - Package name : kr.co.fastcampus.eatgo
     - Packaging : Jar
     - Java : 8
   - Dependencies
     - Spring Web
     - Spring Boot DevTools
     - Lombok

### 멀티프로젝트 설정 / Hello World

1. 인텔리제이에서 폴더 오픈
2. 멀티프로젝트 구조로 변경
   - eatgo-api 폴더 생성
   - src 폴더 및 build.gradle 파일을 eatgo-api로 이동
   - settings.gradle 파일을 열어서, include 'eatgo-api' 추가
3. interfaces 패키지 추가 및 WelcomeController.java 추가
   - 위치 : main.java.kr.co.fastcampus.eatgo
   - 함수 및 관련 어노테이션 추가(RestController, GetMapping)

### TDD(Test Driven Development)

1. 의미
   - 테스트를 통한 목표 주도 개발
   - 사용자 중심 개발
   - 인터페이스 중심 개발
2. 목적
   - 올바르게 작동하는 깔끔한 코드를 만드는 것
3. TDD Cycle : Red / Green / Refactoring
   - Red | Test First : 테스트 코드를 우선 작성 (입력 1,2에 대해 출력 3)
   - Green | Test Code : 메소드를 만듬으로써 테스트 코드가 동작하도록 구현 (입력 1,2에 대한 출력 3)
   - Refactoring : 리펙토링을 통해 일반화 구현 (입력 x,y 에 대한 출력 z)
4. 코딩
   - domain 패키지 추가 : Restaurant.java 파일 추가
   - 테스트 코드 추가 : RestaurantTests.java 파일 추가
     - Test library : JUnit 5
   - issue #1 : assert error
     - Line 22 in RestaurantTests.java : assertSame(restaurant.getInformation(), "Bob zip in Seoul");
     - 에러 내용 : 두 인자의 String내용이 같은데도 assert 에러가 발생함.

### REST API

1. 다양한 환경 지원 : 웹, 모바일 등등...
2. 서로 다른 Front-end를 지원할 수 있어야 함.
3. 하나의 Back-end로 동일한 기능을 지원해야 함. > 이를 구현할 수 있는 기술이 REST API임.
4. REST API : REpresentational State Transfer, 리소스의 처리
   - 표현 상태를 전달하는것, 즉 리소스를 처리하는 것 > CRUD
   - C | Create | POST
   - R | Read | GET
   - U | Update | PUT/PATCH
   - D | Delete | DELETE
5. 리소스의 지정 : URI(Uniform Resource Identifier), URL(Uniform Resource Locator)
   - 리소스 지정할 때, URI 식별자를 사용하거나, URL 지시자를 사용함
6. 리소스의 분류 : Collection, Member
   - Member는 Collection에 속한 개별적인 리소스를 의미함
   - Collection
     - Read(List) : Collection의 목록을 불러옴
     - Create : 새로운 리소스를 생성함
   - Member
     - Read(Detail) : 리소스의 상세 정보를 불러옴
     - Update : 리소스를 수정함
     - Delete : 리소스를 삭제함.
7. 적용 : Restaurant
   - Collection : http://host/restaurants
   - Member : http://host/restaurants/{id}
8. JSON : JavaScript Object Notation
9. APIs
   - 가게 목록 : GET /restaurants
   - 가게 상세 : GET /restaurants/{id}
   - 가게 추가 : POST /restaurants
   - 가게 수정 : PATCH /restaurants/{id}
   - 가게 삭제 : DELETE /restaurants/{id}

### 프로젝트 구조(Layered Architecture)
1. UI Layer | interfaces package | RestaurantController
   - GET /restaurants(findAll() 함수 이용, 식당 목록을 불러옴)
   - GET /restaurants/{id} (findById(id) 함수 이용, 특정 식당 정보 불러옴)
2. Application Layer | application package | RestaurantService
3. Domain Layer | domain Package | Restaurant, RestaurantRepository, Menu Item
   - Restaurant(id, name, address)
   - RestaurantRepository : findAll(), findById(id)
   - RestaurantRepositoryImp

        
### 의존성 주입 (DI, Dependency Injection)
1. Dependency(의존 관계) : 둘 이상의 객체개 서로 협력
    - A는 B에 의존 = A는 B를 사용 = B의 변화가 A에 영향
    - 의존 관계의 관리 필요
2. Controller는 Repository에 의존
3. Repository 생성 : Repository 객체 생성의 책임을 Controller가 가지고 있다.
4. Controller에 Repository를 연결
5. Spring IoC Container : 객체간의 의존관계를 스프링에서 관리를 한다.
    - @Component
    - @Autowired
6. 장점
    - 의존성 주입을 통해 Controller와 Repository간의 직접적인 의존관계를 분리할 수 있다.
    - 강하게 연결되어 있는 의존관계를 유연하게 바꿀 수 있다.
    - 객체를 직접 생성하고 관리하는 작업들을 스프링이 알아서 해줌으로, 코드가 간단해진다.
    