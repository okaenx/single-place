cd eureka-server
docker build -t eureka-server .
docker run -p 1301:1301 eureka-server:latest