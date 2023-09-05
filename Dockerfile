# Utiliza una imagen base que contenga Java
FROM openjdk:17

# Copia el archivo JAR de tu aplicación a la imagen
COPY target/student-management-0.0.1-SNAPSHOT.jar /app.jar

# Expone el puerto en el que tu aplicación Spring Boot está configurada para ejecutarse
EXPOSE 8080

# Comando para ejecutar la aplicación cuando se inicie el contenedor
CMD ["java", "-jar", "/app.jar"]