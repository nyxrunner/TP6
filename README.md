<div align="center">

# <span style="color: #0E5EA1;">TP6: Patrones de Diseño</span>
</div>

## <span style="color: #0E5EA1;">1. Singleton (Creacional)</span>

* **Problema:** Varios módulos deben consultar y modificar la configuración global de la librería <span style="color: #0E5EA1;">**La Red Escrita**</span> sin desincronizarse.
* **Justificación:** Se usa <span style="color: #0E5EA1;">**Singleton**</span> para asegurar una única instancia global accesible en todo el sistema.
### Diagrama de Clase
<img width="776" height="356" alt="1" src="https://github.com/user-attachments/assets/59a16756-e797-44e2-a3c8-43c1b18eb833" />
---

## <span style="color: #0E5EA1;">2. Factory Method (Creacional)</span>
- **Problema:** La librería <span style="color: #0E5EA1;">**La Red Escrita**</span> vende libros físicos y digitales, pero instanciarlos directamente con `new` acopla el código.
- **Justificación:** Se aplica <span style="color: #0E5EA1;">**Factory Method**</span> para delegar la creación de cada formato a subclases creadoras específicas.
### Diagrama de Clase
<img width="834" height="433" alt="2" src="https://github.com/user-attachments/assets/c5d3ac3d-bfb8-42c0-8dfb-b07f22bfc4a7" />
---

## <span style="color: #0E5EA1;">3. Abstract Factory (Creacional)</span>
- **Problema:** Se venden kits de libro y separador en versiones Clásica y de Colección en la librería <span style="color: #0E5EA1;">**La Red Escrita**</span>, debiendo evitar mezclar familias.
- **Justificación:** Se utiliza <span style="color: #0E5EA1;">**Abstract Factory**</span> para garantizar la creación de familias completas de productos compatibles.
### Diagrama de Clase
<img width="1274" height="433" alt="3" src="https://github.com/user-attachments/assets/40e3783a-302f-4cf6-9700-062c6c04516d" />
---

## <span style="color: #0E5EA1;">4. Adapter (Estructural)</span>
- **Problema:** El sistema de <span style="color: #0E5EA1;">**La Red Escrita**</span> maneja envíos en kilogramos, pero debe usar un servicio legacy que solo acepta gramos.
- **Justificación:** Se usa <span style="color: #0E5EA1;">**Adapter**</span> para convertir las unidades (kg a gramos) permitiendo reutilizar el servicio legacy sin modificarlo.
### Diagrama de Clase
<img width="493" height="400" alt="4" src="https://github.com/user-attachments/assets/a806c246-633d-49e2-9f97-508efebd0284" />
---

## <span style="color: #0E5EA1;">5. Decorator (Estructural)</span>
- **Problema:** Los libros de <span style="color: #0E5EA1;">**La Red Escrita**</span> se pueden personalizar opcionalmente con empaque de regalo o firma sin multiplicar clases por herencia.
- **Justificación:** Se aplica <span style="color: #0E5EA1;">**Decorator**</span> para agregar características adicionales al libro envolviéndolo dinámicamente en tiempo de ejecución.
### Diagrama de Clase
<img width="1003" height="481" alt="5" src="https://github.com/user-attachments/assets/1f50f24f-7dde-4337-8813-a2d6d4a9edb8" />
---

## <span style="color: #0E5EA1;">6. Facade (Estructural)</span>
- **Problema:** La compra en la librería <span style="color: #0E5EA1;">**La Red Escrita**</span> requiere llamar paso a paso los servicios independientes de inventario, pago y envío.
- **Justificación:** Se implementa <span style="color: #0E5EA1;">**Facade**</span> para unificar los tres subsistemas en una sola clase simple que procesa la venta en un solo paso.
### Diagrama de Clase
<img width="952" height="291" alt="6" src="https://github.com/user-attachments/assets/84547671-869a-46ab-af9c-cf4e4eafd270" />
