Proyecto POO Unidad 2 – Relación entre Clases- Oscar Tacuri

Descripción del Proyecto
Este proyecto forma parte de la **Unidad 2: Relación entre Clases** del curso de *Programación Orientada a Objetos*.  
El objetivo es **ampliar un sistema audiovisual en Java** aplicando conceptos avanzados de POO, como **herencia**, **asociación**, **agregación** y **composición**, integrando nuevas clases y subclases para crear un sistema completo, organizado y funcional.

El proyecto base fue clonado desde el repositorio de ejemplo de la UPS:  
👉 [https://github.com/CS-Programacion-Orientada-Objetos/poo_unidad1](https://github.com/CS-Programacion-Orientada-Objetos/poo_unidad1)

---

## 🧩 Estructura del Proyecto
```
Tacuri_Oscar_POO_U2/
│
├── src/
│   ├── ContenidoAudiovisual.java
│   ├── Pelicula.java
│   ├── SerieDeTV.java
│   ├── Documental.java
│   ├── Actor.java
│   ├── Temporada.java
│   ├── Investigador.java
│   ├── Cortometraje.java
│   ├── VideoMusical.java
│   └── Main.java
│
├── UML/
│   └── diagrama_clases.png
│
├── README.md
└── .gitignore
```

---

## 🚀 Funcionalidades Principales
- **Herencia:** Las clases `Cortometraje` y `VideoMusical` heredan de `ContenidoAudiovisual`.  
- **Asociación:** La clase `Actor` está asociada a `Pelicula`, y `Investigador` a `Documental`.  
- **Agregación:** Una `SerieDeTV` puede contener múltiples `Temporada`.  
- **Polimorfismo:** Se implementan métodos sobrescritos para mostrar la información específica de cada tipo de contenido.  
- **Gestión en GitHub:** Incluye commits organizados, documentación y control de versiones.

---

## 🖥️ Ejemplo de Uso
```java
Actor actor1 = new Actor("Tom Holland", 28);
Pelicula pelicula = new Pelicula("Spider-Man: Homecoming", 2017, "Acción");
pelicula.agregarActor(actor1);
pelicula.mostrarInformacion();
```

---

## 🧠 Objetivos de Aprendizaje
- Aplicar los conceptos de **asociación, agregación y composición** en Java.  
- Comprender la importancia de la **herencia y el polimorfismo**.  
- Representar las relaciones entre clases mediante **diagramas UML**.  
- Gestionar proyectos con **Git y GitHub** de manera profesional.

---

## ⚙️ Instrucciones de Ejecución
1. Clonar el repositorio:
   ```bash
   git clone https://github.com/XavierTacuri/Tacuri_Oscar_POO_U2.git
   ```
2. Abrir el proyecto en **Eclipse IDE** o cualquier entorno compatible con Java.  
3. Compilar y ejecutar la clase `Main.java`.  
4. Observar la salida en la consola con los objetos creados y sus relaciones.

---

## 🧾 Requisitos Técnicos
- **Lenguaje:** Java 8 o superior  
- **IDE recomendado:** Eclipse o IntelliJ IDEA  
- **Sistema operativo:** Windows / Linux / macOS  

---

## 📈 Mejoras Futuras
- Implementación de pruebas unitarias con JUnit.  
- Interfaz gráfica básica para gestionar el contenido audiovisual.  
- Lectura y escritura de datos en archivos.  

---

## 📚 Créditos
- Guía oficial: *Unidad 2 – Relación entre Clases (UPS)*  
- Documentación Java: [https://docs.oracle.com/javase/](https://docs.oracle.com/javase/)  
- Autor: **Oscar Tacuri**  
