FROM openjdk:21

EXPOSE 1302

COPY build/libs/api-gateway-1.0-SNAPSHOT.jar .
RUN apk add --no-cash bash

COPY wait-for.sh /wait-for.sh
RUN chmod +x /wait-for.sh

ENTRYPOINT ["/wait-for.sh", "eureka-server:1301", "--timeout=70", "--", "java", "-jar", "api-gateway-1.0-SNAPSHOT.jar"]