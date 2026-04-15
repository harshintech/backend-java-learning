============================================================
  SPRING CORE TUTORIAL - BY HARSH
  XML Config + Java Config + Small Project Demo
============================================================

FOLDER STRUCTURE
----------------
spring-core-tutorial/
|
|-- xml-config-project/          <-- Project 1: XML-based config
|   |-- pom.xml
|   `-- src/main/
|       |-- java/com/demo/
|       |   |-- beans/Student.java
|       |   |-- dao/StudentDAO.java + StudentDAOImpl.java
|       |   |-- service/StudentService.java + StudentServiceImpl.java
|       |   `-- MainApp.java
|       `-- resources/
|           `-- applicationContext.xml   <-- THE XML CONFIG
|
|-- java-config-project/         <-- Project 2: Java-based config
|   |-- pom.xml
|   `-- src/main/
|       `-- java/com/demo/
|           |-- beans/Student.java
|           |-- dao/StudentDAO.java + StudentDAOImpl.java
|           |-- service/StudentService.java + StudentServiceImpl.java
|           |-- config/AppConfig.java    <-- THE JAVA CONFIG
|           `-- MainApp.java
|
`-- notes/                       <-- TXT tutorial guides
    |-- 01_Spring_Core_Concepts.txt
    |-- 02_XML_Config_Guide.txt
    |-- 03_Java_Config_Guide.txt
    `-- 04_Quick_Reference_Cheatsheet.txt

HOW TO RUN
----------
1. Open either project folder in IntelliJ IDEA as Maven project
2. Wait for Maven to download Spring dependencies
3. Open MainApp.java and click Run

OR via terminal:
  cd xml-config-project
  mvn compile exec:java -Dexec.mainClass="com.demo.MainApp"

WHAT YOU WILL LEARN
-------------------
- IoC Container concept
- Setter Injection (XML and Java)
- Constructor Injection (XML and Java)
- Bean Scopes (singleton vs prototype)
- Service -> DAO dependency injection pattern
- ClassPathXmlApplicationContext vs AnnotationConfigApplicationContext
- @Configuration and @Bean annotations

============================================================
