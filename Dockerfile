# Verwende offizielles Java 17 JDK-Image
FROM eclipse-temurin:17-jdk

# Arbeitsverzeichnis im Container
WORKDIR /app

# Kopiere alle Projektdateien in das Arbeitsverzeichnis
COPY . /app

# Baue das Projekt (Tests überspringen)
RUN chmod +x mvnw && ./mvnw clean package -DskipTests

# Port 8080 öffnen
EXPOSE 8080

# Starte die Spring Boot-Anwendung
ENTRYPOINT ["java", "-jar", "target/*.jar"]