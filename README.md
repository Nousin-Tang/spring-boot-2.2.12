# Spring Boot 源码环境搭建

## [官网](https://github.com/spring-projects/spring-boot/)下载源码然后编译

## 修改文件夹下的 pom 文件

pom.xml的添加如下一个属性：`<disable.checks>true</disable.checks>`
```xml
<groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-build</artifactId>
  <version>${revision}</version>
  <packaging>pom</packaging>
  <name>Spring Boot Build</name>
  <description>Spring Boot Build</description>
  <properties>
    <revision>2.2.12.BUILD-SNAPSHOT</revision>
    <main.basedir>${basedir}</main.basedir>
    <disable.checks>true</disable.checks>
</properties>
```

## 执行 mvn 命令
```sh
$ mvn clean install -DskipTests -Pfast
```
