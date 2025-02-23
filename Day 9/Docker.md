# Docker Commands Cheat Sheet

## 1. Check Docker Version

docker version;
docker --version

## 2. Check Docker Images

docker images
## 3. Pull an Image
docker pull hello-world

## 4. Run an Image

docker run hello-world
(for running this image)

## 5. List Running Containers

docker ps
(it'll not show anything because your image executed and shown the output and it's exited)

## 6. List All Containers

docker ps -a
(you can see hello-world in exited status)

## 7. Remove Exited Container

docker rm <container_name>

## 8. Remove Image

docker rmi <image_name>

## 9. Run an Image

docker run -d

# Additional Commands

## List Docker Images with sudo:

sudo docker images

## Run a Docker Container with specific name and port:

sudo docker run -d --name webapp -p 80:80 sample-website