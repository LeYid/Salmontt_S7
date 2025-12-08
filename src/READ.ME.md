# **Salmontt S7 – Gestión de Unidades Operativas**



#### Segunda entrega sumativa – Desarrollo Orientado a Objetos I



**Autor**: Camila Reid

**Asignatura**: Desarrollo Orientado a Objetos

**Carrera**: Ingeniería en Informática

**Sede**: Duoc UC





##### **📘 Descripción del sistema**



Este proyecto corresponde a la Entrega Nº7 del sistema salmonero Salmontt, donde se implementa un modelo orientado a objetos en Java utilizando herencia, polimorfismo y listas dinámicas para la gestión de distintas unidades operativas de una empresa salmonera.



El sistema carga y muestra tres tipos de unidades:



* CentroCultivo (hija de UnidadOperativa)



* PlantaProceso (hija de UnidadOperativa)



* CentroCultivoPlanta (clase mixta que combina características de ambas)



Cada clase sobrescribe el método mostrarInformacion() para aplicar polimorfismo, permitiendo que cada tipo de unidad imprima sus propios atributos específicos.







##### **Estructura general del proyecto**

📁 src/

&nbsp;├── model/

&nbsp;│   ├── UnidadOperativa.java

&nbsp;│   ├── CentroCultivo.java

&nbsp;│   ├── PlantaProceso.java

&nbsp;│   └── CentroCultivoPlanta.java

&nbsp;├── data/

&nbsp;│   └── GestorUnidades.java

&nbsp;└── ui/

&nbsp;    └── Salmontt\_S7.java  (main)





##### **⚙️ Funcionamiento del sistema**



El sistema:



* Carga automáticamente una lista de unidades operativas en ***GestorUnidades***.



* Clasifica los objetos según su tipo utilizando ***instanceof***.



* Imprime por consola:



	***+ Centros de cultivo***



	***+ Plantas de proceso***



	***+ Unidades mixtas***



* Utiliza herencia y polimorfismo para mostrar la información de forma dinámica.





##### **▶️ Cómo ejecutar el proyecto**



1. Clonar el repositorio: *git clone* ***https://github.com/LeYid/Camila\_Reid\_Salmontt\_S7***



2\. Abrir en NetBeans o IntelliJ IDEA.



3\. Verificar que la estructura de paquetes esté correcta.



4\. Ejecutar la clase: ***ui/Salmontt\_S7.java***



5\. Observar en la consola la información de las unidades cargadas.





##### **📅 Fecha de entrega**



08/12/2025

