# Utilizamos una imagen base con Node Alpine
FROM node:lts-alpine3.18

# Establecemos un directorio de trabajo
WORKDIR /app

# Copiamos el archivo node.js necesario desde tu local al contenedor
COPY microservices.js /app/

# Instalamos Express (u otras dependencias si es necesario)
RUN npm install express

# Exponemos el puerto 8080
EXPOSE 8080

# Ejecutamos el microservicio node.js al iniciar el contenedor
CMD ["node", "microservices.js"]