cd config-server
docker build -t config-server .
docker run -p 1300:1300 config-server:latest