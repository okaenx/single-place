cd api-gateway
docker build -t api-gateway .
docker run -p 1302:1302 api-gateway:latest