# Parte Teórica

# 1. Tipos de datos primitivos en Java
Java tiene 8 tipos de datos primitivos:

- **byte** (8 bits, -128 a 127)
- **short** (16 bits, -32,768 a 32,767)
- **int** (32 bits, -2³¹ a 2³¹-1)
- **long** (64 bits, -2⁶³ a 2⁶³-1)
- **float** (32 bits, números decimales, precisión simple)
- **double** (64 bits, números decimales, precisión doble)
- **char** (16 bits, un solo carácter Unicode)
- **boolean** (true o false)

# 2. Estructuras de control de flujo en Java

# Condicionales
- **if-else**: Ejecuta bloques de código según una condición.
- **switch**: Evalúa una variable contra varios valores posibles.

# Bucles
- **for**: Itera un número definido de veces.
- **while**: Repite mientras una condición sea true.
- **do-while**: Similar a while, pero ejecuta al menos una vez.

# 3. Importancia de los nombres significativos para variables y métodos

Usar nombres significativos en variables y métodos facilita la lectura y mantenimiento del código, permitiendo una mejor colaboración entre desarrolladores.

# 4. Programación Orientada a Objetos (POO)

La **POO** es un paradigma de programación basado en el uso de objetos que contienen atributos (datos) y métodos (funciones). Permite modelar el mundo real y fomenta la reutilización del código.

# 5. Cuatro pilares de la Programación Orientada a Objetos

- **Abstracción**: Oculta detalles innecesarios y muestra solo lo esencial.
- **Encapsulamiento**: Protege los datos restringiendo el acceso directo.
- **Herencia**: Permite que una clase herede características de otra.
- **Polimorfismo**: Permite que un mismo método tenga diferentes comportamientos.

# 6. Herencia en Java

La herencia permite que una clase (hija) adquiera propiedades y métodos de otra (padre). Se usa con `extends`.

# Ejemplo
```java
class Animal {
    void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal {
    void hacerSonido() {
        System.out.println("El perro ladra");
    }
}
```
En este ejemplo, `Perro` hereda de `Animal`, pero puede redefinir (sobreescribir) métodos.

# 7. Modificadores de acceso en Java

Los modificadores de acceso controlan la visibilidad de las clases, métodos y atributos.

- **public**: Accesible desde cualquier parte del código.
- **private**: Solo accesible dentro de la misma clase.
- **protected**: Accesible dentro del mismo paquete y en clases hijas.

# 8. Variables de entorno en Java y su importancia

Las variables de entorno son valores del sistema que almacenan información sobre el entorno de ejecución.

# Importancia:
1. Permiten configurar aplicaciones sin modificar el código.
2. Se usan para definir la ruta de `JAVA_HOME`, que indica la ubicación del JDK en el sistema.
3. Facilitan la seguridad al manejar credenciales sin almacenarlas en el código.

