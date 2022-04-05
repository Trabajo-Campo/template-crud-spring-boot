### UNPAZ

## Trabajo de Campo

# Rest Service - CRUD con Spring-Boot

Este código es un ejemplo simple realizado durante la clase virtual de **Trabajo de Campo de la Licenciatura en Gestión de las Tecnologías de la información de la UNPAZ** del [04-ABRIL-2022](https://youtu.be/GL1d8X-VXuc)

# Tecnologías

- Spring-boot
- Maven
- java 11
- JPA con Hibernete de ORM provider
- H2 para la base de datos en memoria
- lombok para anotaciones de desarrollo rápido
- @RestController
- Empaquetado Clasico: Controller->Service->Repository->Entity
- Configuracion a través de un archivo yml

# Pruebas
El proyecto esta configurado para arrancar en el puerto 8090.

1. Get ```http://localhost:8090/api/recursos```
	* recupera todos los recursos
2. Get ```http://localhost:8090/api/recursos/2``` 
	* recupera un recurso por ID
3. Get ```http://localhost:8090/api/recursos/search?nombre=Zapatilla```  
	* recupera un recurso por query parameter nombre
4. Post  ```http://localhost:8090/api/recursos```
	* ```Body: { "nombre": "Proyecto", "disponible": false}``` -> crea un recurso
5. Delete ```http://localhost:8090/api/recursos/2``` 
	* Borra un recurso por ID
6.   Put ```http://localhost:8090/api/recursos```
	*  ```Body: { "id": 2, "nombre": "Proyecto", "disponible": true}``` -> Actualiza un recurso

# Arrancar el proyecto con Maven
``` mvn clean spring-boot:run ```

