# Build Docker Image 
$ docker build -t "microservicespring" .


# Run Docker Image 
$ docker run -p 9090:8080 spring-boot-docker.jar

En el comando de ejecución, se especifica que el puerto 8080 del contenedor debe asignarse al puerto 9090 del sistema operativo host.
