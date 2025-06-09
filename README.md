# retoJavaReus

Proyecto de ejemplo en **Spring Boot 3** que se compila con **Maven** y usa Java
21. Todo el código se encuentra bajo el paquete `com.vn.reus` y la base de datos
H2 se guarda en la carpeta `./data`.

## Características

- **Resolver Sudokus**: envía un tablero mediante `POST /sudoku/resolver` y
  obtén la solución si es posible.
- **Cifrado tipo Enigma**: `GET /enigma/cifrar` devuelve el texto codificado de
  forma simple.
- **Metadatos EXIF**: `POST /exif` extrae las etiquetas EXIF de una imagen
  subida.
- **Gestión de Sospechosos**: pequeños end points para listar y administrar
  entidades "sospechoso" con Spring Data JPA.

## Cómo ejecutarlo

Desde la raíz del proyecto ejecuta:

```bash
./mvnw spring-boot:run
```

La API quedará disponible en `http://localhost:8080/`.

## Pruebas

```bash
./mvnw test
```

