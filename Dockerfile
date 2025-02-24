# Verwende offizielles Java 17-Image
FROM eclipse-temurin:17-jdk

# Arbeitsverzeichnis innerhalb des Containers
WORKDIR /app

# Kopiere den gesamten Projektinhalt in das Arbeitsverzeichnis
COPY . /app

# Baue das Projekt (Tests werden übersprungen)
RUN chmod +x mvnw && ./mvnw clean package -DskipTests

# Exponiere Port 8080
EXPOSE 8080

# Starte die Anwendung
ENTRYPOINT ["java", "-jar", "target/*.jar"]