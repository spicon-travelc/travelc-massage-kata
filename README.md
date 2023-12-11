### Título de la Kata ###
Políticas de cancelación Salón de Masajes

### Descripción ###
Un salón de masajes ofrece servicios de masaje y está preparando su plataforma para ofrecerlos online. Cada masaje tiene un precio, un estado de disponibilidad, una duración específica y una política de cancelación.


### Preparación ###
Descarga y ejecutar en local el servicio que devuelve la disponibilidad de masajes. Para ello seguir las instrucciones: https://github.com/spicon-travelc/travelc-massage-kata-service

### Servicio de disponibilidad ###
Tenemos un servicio que nos proporciona todos los masajes disponibles para un día concreto. Cada masaje tiene la siguiente información:

* Código del masaje
* Nombre
* Estado
* Duración
* Precio
* Política de cancelación

Para acceder al servicio:
get - http://localhost:38080/massages/quote/2023-10-02

### Objetivo ###
Se necesita un servicio que devuelva los masajes disponibles para un día concreto y que muestre las políticas de cancelación en un formato que el cliente entienda.

Cosas a tener en cuenta:

* La política de cancelación expresada en un mensaje. Teniendo en cuenta que el día del masaje siempre será 100 % no reembolsable.

Ejemplo del mensaje:

* Sin gastos de cancelación hasta el 22 ene 2024
* Entre 23 ene 2024 y 24 ene 2024: 100 €
* Desde 25 ene 2024: no reembolsable
