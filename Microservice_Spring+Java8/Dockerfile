# Utilizamos una imagen base con OpenJDK 8 Alpine
FROM openjdk:8u212-jre-alpine3.9

# Establecemos un directorio de trabajo
WORKDIR /app

# Copiamos el archivo JAR al directorio de trabajo
COPY target/spring-boot-docker.jar /app/

# Exponemos el puerto 8080
EXPOSE 8080

# Comando para ejecutar la aplicación .jar
CMD ["java", "-jar", "spring-boot-docker.jar"]