# Basis-Image mit Java 21
FROM eclipse-temurin:21-jdk-alpine

# Arbeitsverzeichnis im Container
WORKDIR /app

# Kopiere die Java-Dateien in das Arbeitsverzeichnis
COPY ./src/dbdemo/*.java .

# Kompiliere alle Java-Dateien
RUN javac *.java

# Starte das Programm
CMD ["java", "dbdemo.Main"]
