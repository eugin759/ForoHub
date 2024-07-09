# ForoHub   
Challenge final de la formacion Alura ApiRest


## API Reference

#### Get 

```http
  GET /topicos
```

```http
  GET /topicos/${id}
```

#### POST

```http
  POST /topicos
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `titulo` | `string` | **Required**. Tema del topico |
| `nombreCurso` | `string` | **Required**. Nombre de la clase/Genero del topico |
| `mensaje` | `string` | **Required**. Descripcion del topico a detalle |
| `usuario` | `string` | Nombre del autor, **Anonimo** por defecto |

#### PUT 

```http
  PUT /topicos/${id}
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `mensaje` | `string` | **Required**. Descripcion del topico a detalle |


#### DELETE

```http
  DELETE /topicos/${id}
```
## Links

Dependencias  
https://www.postman.com/  
https://spring.io/projects/spring-boot  
https://www.aluracursos.com/

IDE  
[IntellliJ](https://www.jetbrains.com/idea/promo/)


## Related

Este es el cronograma y especificaciones que se siguieron para el proyecto 

[Trello Foro Hub](https://trello.com/b/9DeAlIsq/foro-hub-challenge-back-end)


## Authors

- [@eugin759](https://github.com/eugin759)
