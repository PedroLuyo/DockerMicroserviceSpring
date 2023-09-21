# Repositorio de Ejemplos de Microservicios con Docker

Este repositorio contiene ejemplos de microservicios implementados en diferentes tecnologías utilizando Docker con el objetivo de lograr el menor tamaño posible de la imagen.

## Microservicios y Tecnologías Utilizadas

1. **Microservicio Spring con Java 8 y JDK 8 en Alpine** 
   - Utiliza Spring y Java 8 con una imagen Alpine con OpenJDK 8.
   - **Instrucción:** ```docker build -t microservices_java8 .```
   - **Tamaño:** 101 MB aprox.

2. **Microservicio Spring con Java 17 en Alpine Linux con JDK**
   - Emplea Spring y Java 17 con una imagen Alpine Linux con JDK instalado a través de la consola Ubuntu.
   - **Instrucción:** ```docker build -t microservices_java17 .```
   - **Tamaño:** 96 MB aprox.

3. **Microservicio Python con imagen Python Alpine**
   - Se basa en Python utilizando una imagen Alpine de Python.
   - **Instrucción:** ```docker build -t  microservices_python .```
   - **Tamaño:** 66 MB aprox.

4. **Microservicio Node con imagen Node Alpine**
   - Utiliza Node.js con una imagen Alpine de Node.

## Objetivo

El propósito de estos ejemplos es mostrar cómo implementar microservicios utilizando diferentes tecnologías y minimizando el tamaño de las imágenes de Docker.


---

