# Sistema de Inventario - Grupo Moradogit checkout main
# 📦 Sistema de Control de Inventario (MVC)

Proyecto de desarrollo de software colaborativo aplicando el patrón de arquitectura **Modelo-Vista-Controlador (MVC)**.

## 👥 Integrantes del Equipo (Team Java)
* **Josue Rojas** - Modelo (`Producto.java`) - *Encapsulamiento y Estructura de Datos*
* **Sebas** - Modelo de Negocio (`Inventario.java`) - *Gestión de Colecciones y Lógica*
* **Edwin** - Vista (`FrmInventario.java`) - *Interfaz Gráfica (Swing) y Tablas*
* **Jaime** - Controlador (`InventarioController.java`) - *Integración y Eventos*

---

## 🚀 1. Funcionalidad del Proyecto
El sistema permite la gestión eficiente de un inventario de bodega mediante una interfaz gráfica amigable. Sus principales capacidades son:

* **Registro de Productos:** Ingreso de Código, Nombre, Precio y Stock.
* **Validación de Datos:** Control de errores para evitar ingresos inválidos (texto en campos numéricos).
* **Cálculo Automático:** El sistema calcula automáticamente el **Valor Total** por producto (`Precio × Stock`) y el **Valor Total de la Bodega**.
* **Visualización en Tiempo Real:** Los datos se reflejan instantáneamente en una Tabla (`JTable`).
* **Arquitectura MVC:** Separación estricta entre la interfaz (View), la lógica (Model) y la coordinación (Controller).

---

## 🛠️ 2. Forma de Ejecución
Sigue estos pasos para compilar y ejecutar el proyecto en tu entorno local:

### Prerrequisitos
* **Java Development Kit (JDK):** Versión 17 o superior.
* **IDE Recomendado:** VS Code, IntelliJ IDEA o NetBeans.

### Pasos
1.  **Clonar el repositorio:**
    ```bash
    git clone [https://github.com/TU_USUARIO/TU_REPOSITORIO.git](https://github.com/TU_USUARIO/TU_REPOSITORIO.git)
    ```
2.  **Abrir el proyecto:** Abre la carpeta raíz en tu IDE.
3.  **Localizar el punto de entrada:**
    * Navega a la carpeta: `src/Inventario/`
    * Busca el archivo: `Main.java`
4.  **Ejecutar:**
    * Haz clic derecho en `Main.java` y selecciona **"Run"** o **"Run Java"**.
    * La ventana del sistema debería aparecer en el centro de tu pantalla.

---

## 🌿 3. Descripción del Flujo de Ramas (Branching Model)
Para garantizar un desarrollo ordenado y cumplir con los estándares de colaboración, el equipo utilizó la siguiente estrategia de ramas:

### A. Estructura de Ramas
* **`main` (Rama Principal):** Contiene únicamente el código estable, funcional y probado. Es la versión de producción.
* **Ramas de Funcionalidad (`feature/*`):** Cada integrante creó una rama independiente para desarrollar su módulo específico sin afectar el trabajo de los demás:
    * `feature-model-josue`: Creación de la clase POJO `Producto`.
    * `feature-logic-sebas`: Implementación de la gestión de listas `Inventario`.
    * `feature-view-edwin`: Diseño de la GUI `FrmInventario`.
    * `feature-controller-jaime`: Lógica de control `InventarioController`.

### B. Estrategia de Integración (Pull Requests)
En lugar de fusionar directamente en `main`, seguimos este flujo estricto:
1.  **Desarrollo Local:** Cada miembro trabajó en su rama personal.
2.  **Push:** Se subieron los cambios al repositorio remoto.
3.  **Pull Request (PR):** Se abrió una solicitud de fusión en GitHub detallando los cambios técnicos.
4.  **Revisión de Código:** Los compañeros actuaron como *Reviewers*, aprobando el código antes de la fusión.
5.  **Merge:** Una vez aprobado, el código se integró a la rama `main`.

Este flujo asegura que el proyecto mantenga su integridad y que todos los miembros estén al tanto de los cambios en el código base.