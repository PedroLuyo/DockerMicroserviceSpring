# Utilizamos una imagen base con OpenJDK 11 (slim)
FROM openjdk:8u212-jre-alpine3.9

# Establecemos el directorio de trabajo
WORKDIR /app

# Copiamos el archivo JAR al directorio de trabajo
COPY target/spring-boot-docker.jar /app/

# Exponemos el puerto 8080
EXPOSE 8080

# Comando para ejecutar tu aplicación
CMD ["java", "-jar", "spring-boot-docker.jar"]