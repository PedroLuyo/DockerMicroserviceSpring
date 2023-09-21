# Utilizamos una imagen base con Ubuntu
FROM ubuntu

# Establecemos un directorio de trabajo
WORKDIR /app

# Copiamos el archivo JAR desde tu local al contenedor
COPY target/spring-boot-docker-0.0.1-SNAPSHOT.jar /app/

# Exponemos el puerto 8080
EXPOSE 8080

# Ejecutamos el microservicio Spring al iniciar el contenedor y instalamos un jdk17 ligero
CMD ["sh", "-c", "apt-get update && apt-get install -y openjdk-17-jre-headless && java -jar /app/spring-boot-docker-0.0.1-SNAPSHOT.jar"]
