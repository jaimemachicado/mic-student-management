# Descripción
Microservicio que realiza la gestión de estudiantes.

# Ejecución
* Se debe instanciar la BBDD mysql, que se puede hacer haciendo uso de docker compose (docker compose up), 
  con el siguiente contenido en el fichero docker-compose.yml:
````yaml
version: '3'
services:
  mysql:
    image: mysql:latest
    environment:
      MYSQL_ROOT_PASSWORD: mypassword
      MYSQL_DATABASE: mydatabase
    ports:
      - "3306:3306"
````
* Compilar el proyecto y ejecutar la aplicación StudentManagementApplication