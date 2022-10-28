FROM adoptopenjdk/openjdk11:alpine-jre
EXPOSE 8081
ADD target/jd-homeworks_Spring_boot_Task1-0.0.1-SNAPSHOT.jar myapp.jar
ENTRYPOINT ["java","-jar","/myapp.jar"]