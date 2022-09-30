# QMP 7

## Como usuarie de QueMePongo quiero ver todas las prendas que tengo en mi guardarropas desde el navegador para poder administrarlas

- Ruta: `/guardarropas/prendas`
- Metodo HTTP: `GET`
- Codigos de respuesta:
  - 200: OK
- Ejemplo Body JSON OK:

```json
[
  {
    "id": 1,
    "tipo": "Remera",
    "material": "Algodon",
    "trama": "Liso",
    "colorPrimario": "Rojo",
    "colorSecundario": "Azul"
  },
  ...
]
```

## Como usuario de QueMePongo, quiero crear una prenda desde el navegador

- Ruta: `/guardarropas/prendas`
- Metodo HTTP: `POST`
- Codigo de respuesta:
  - 200: OK
- Ejemplo Body JSON OK:

```json
{
  "tipo": "Remera",
  "material": "Algodon",
  "trama": "Liso",
  "colorPrimario": "Rojo",
  "colorSecundario": "Azul"
}
```

## Como usuarie de QueMePongo quiero ver una prenda en particular que tengo en mi guardarropas para poder editarla

- Ruta: `/guardarropas/prendas/:id`
- Metodo HTTP: `GET`
- Codigo de respuesta:
  - 200: OK
  - 404: No existe la prenda

- Ejemplo Body JSON OK:

```json
{
  "id": 1,
  "tipo": "Remera",
  "material": "Algodon",
  "trama": "Liso",
  "colorPrimario": "Rojo",
  "colorSecundario": "Azul"
}
```

- Ejemplo Body JSON 404:

```json
{
  "error": "No existe la prenda"
}
```

## Como usuarie de QueMePongo, quiero poder eliminar una prenda de mi guardarropas

- Ruta: `/guardarropas/prendas/:id`
- Metodo HTTP: `DELETE`
- Codigo de respuesta:
  - 200: OK
  - 404: No existe la prenda
- Ejemplo Body JSON OK:

```json
{
  "id": 1,
  "tipo": "Remera",
  "material": "Algodon",
  "trama": "Liso",
  "colorPrimario": "Rojo",
  "colorSecundario": "Azul"
}
```

- Ejemplo Body JSON 404:

```json
{
  "error": "No existe la prenda"
}
```

## Como usuarie de QueMePongo, quiero poder ver mis eventos para administrarlos

- Ruta: `/eventos`
- Metodo HTTP: `GET`
- Codigo de respuesta:
  - 200: OK

- Ejemplo Body JSON OK:

```json
[
  {
    "id": 1,
    "nombre": "Lluvia",
    "fecha": "2020-10-10",
    "temperatura": 20,
    "usuario": "Juan"
  },
  ...
]
```

## Como usuarie de QueMePongo, quiero poder abrir las sugerencias de prendas para un evento en mi navegador

- Ruta: `/eventos/:id/sugerencias`
- Metodo HTTP: `GET`
- Codigo de respuesta:
  - 200: OK
  - 404: No existe el evento

- Ejemplo Body JSON OK:

```json
[
  {
    "id": 1,
    "tipo": "Remera",
    "material": "Algodon",
    "trama": "Liso",
    "colorPrimario": "Rojo",
    "colorSecundario": "Azul"
  },
  ...
]
```

- Ejemplo Body JSON 404:

```json
{
  "error": "No existe el evento"
}
```