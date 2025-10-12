# 🐳 Java + MySQL mit Docker

Dieses Projekt zeigt, wie man eine einfache Java-Anwendung mit einer MySQL-Datenbank in Docker kombiniert.

## 📂 Projektstruktur

- `src/dbdemo/`: Java-Quellcode
- `Dockerfile`: Bauanleitung für Java-Anwendung
- `docker-compose.yml`: Startet Java + Datenbank zusammen
- `.dockerignore`: Ausschluss für unnötige Dateien im Container

## ▶️ Starten (lokal)

Voraussetzung: Docker und docker-compose müssen installiert sein.

```bash
docker-compose up --build
```

## ✅ Ergebnis

- Verbindung zur Datenbank wird aufgebaut
- Aktuelle Zeit aus MySQL-Datenbank wird ausgegeben
