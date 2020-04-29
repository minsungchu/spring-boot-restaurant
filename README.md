# spring-boot-restaurant

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
