FROM openjdk:21

EXPOSE 1301

COPY build/libs/eureka-server-1.0-SNAPSHOT.jar .
RUN apk add --no-cash bash

COPY wait-for.sh /wait-for.sh
RUN chmod +x /wait-for.sh

ENTRYPOINT ["/wait-for.sh", "config-service:1300", "--timeout=70", "--", "java", "-jar", "eureka-server-1.0-SNAPSHOT.jar"]