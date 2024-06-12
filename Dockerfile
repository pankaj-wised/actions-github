FROM openjdk:21
EXPOSE 8080
ADD target/github-actions-springboot.jar github-actions-springboot.jar
ENTRYPOINT ["java","-jar","/github-actions-springboot.jar"]