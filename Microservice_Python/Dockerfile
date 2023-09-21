# Utilizamos una imagen base con Python Alpine
FROM python:3.12.0rc3-alpine3.18

# Establecemos un directorio de trabajo
WORKDIR /app

# Copiamos el archivo Python necesario desde tu local al contenedor
COPY microservices.py /app/

# Instalamos Flask (u otras dependencias si es necesario)
RUN pip install Flask

# Exponemos el puerto 8080
EXPOSE 8080

# Ejecutamos el microservicio python al iniciar el contenedor
CMD ["python", "microservices.py"]