# HMS Core SDK - Java

The **HMS Core SDK** (`hms-core-sdk-java`) is the foundational Java SDK module for integrating with the **Hospital Management System (HMS)**. It provides core interfaces, models, and utility components designed to be extended and implemented by hospital-specific custom handlers.

---

## ✨ Features

- 🔌 Define interfaces for custom hospital workflows
- 🛠️ Provide abstract handlers for external implementations
- 📦 Lightweight JAR packaging for dynamic usage
- 📚 Exposes JavaDocs and source JARs
- 🧩 Designed for plug-and-play with implementation modules

---

## 🧱 Project Structure

This module typically exports:

- **Interfaces** to be implemented by external hospitals
- **Shared utilities** and models for all hospitals
- **No direct dependencies** to avoid bloat in consuming projects

---

## 📦 Packaging

After building, a JAR is generated and copied to the consumer module (e.g., `hms-sdk-impl-java/lib/`):


This copies the compiled JAR to a predefined `lib/` directory for downstream usage.

---

## 🛠 Build & Install

```bash
# Build the JAR
./gradlew build

# Copy to external folder (optional)
./gradlew copyJarToOpt
