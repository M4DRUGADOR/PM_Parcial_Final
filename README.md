# Sistema de Gestión de Personajes (Java & Python)

Este proyecto es el desarrollo final para la asignatura de programación, que implementa un sistema de gestión de personajes de juego de rol utilizando arquitectura MVC (Modelo-Vista-Controlador) y persistencia en una base de datos MySQL. El sistema cuenta con dos implementaciones funcionales: una en Java y otra en Python.

## Requisitos Previos

Antes de ejecutar cualquier versión del sistema, asegúrate de tener instalado:
- **MySQL Server** (y el cliente de tu preferencia, como MySQL Workbench).
- **Java (JDK 17 o superior)** y **Maven** (para la versión Java).
- **Python 3.12** o superior (para la versión Python).

## Configuración de Base de Datos

1. Crea una base de datos llamada `juego_rol_db`:
   ```sql
   CREATE DATABASE juego_rol_db;
Ejecuta el script SQL correspondiente para crear la tabla de personajes (asegúrate de que los campos coincidan con tu schema.sql).

Instrucciones de Ejecución
1. Versión Java
Este proyecto está configurado como un proyecto Maven.

Abre la carpeta src en tu IDE

Asegúrate de que las dependencias de MySQL Connector estén en tu pom.xml.

Configura las credenciales en src/main/java/db/Conexion.java:

user: "root"

password: "TU_CONTRASEÑA_DE_BD"

Ejecuta la clase view/Menu.java.

2. Versión Python
Abre una terminal y navega a la carpeta python_app.

Instala la dependencia necesaria para MySQL:

pip install mysql-connector-python
Configura las credenciales en db/conexion.py:

Busca la función conectar() y actualiza el campo password.

Ejecuta el menú principal:


python menu.py
Credenciales de Base de Datos
Host: localhost

Usuario: root

Contraseña: [Configurar en cada archivo de conexión]

Desarrollado por: Kevin Daniel Carvajal Sanchez
