# Repositorio de Ejemplos de Microservicios con Docker

Este repositorio contiene ejemplos de microservicios implementados en diferentes tecnologías utilizando Docker y a la vez con un reto de lograr un tamaño de imagen menor a 200 MB.

## Microservicios y Tecnologías Utilizadas

1. **Microservicio Spring con Java 8 y JDK 8 en Alpine** 
   - Utiliza Spring y Java 8 con una imagen Alpine con OpenJDK 8.
   - **Instrucción:** ```docker build -t microservices_java8 .```
   - **Tamaño:** 101 MB aprox.
   - **Offline:** Si

2. **Microservicio Spring con Java 17 en Ubuntu con JDK**
   - Emplea Spring y Java 17 con una imagen Ubuntu con JDK instalado a través de la consola.
   - **Instrucción:** ```docker build -t microservices_java17 .```
   - **Tamaño:** 96 MB aprox.
   - **Offline:** No

3. **Microservicio Python con imagen Python Alpine**
   - Se basa en Python utilizando una imagen Alpine de Python.
   - **Instrucción:** ```docker build -t  microservices_python .```
   - **Tamaño:** 66 MB aprox.
   - **Offline:** Si

4. **Microservicio Node con imagen Node Alpine**
   - Utiliza Node.js con una imagen Alpine de Node.
   - **Instrucción:** ```docker build -t  microservices_node .```
   - **Tamaño:** 183 MB aprox.
   - **Offline:** Si

---

_**Autor:** Pedro PL_ 
