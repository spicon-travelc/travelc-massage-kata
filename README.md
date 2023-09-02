### Título de la Kata ###
Sistema de disponibilidad Salón de Masajes

### Descripción ###
Un salón de masajes ofrece servicios de masaje proporcionados por terapeutas. Cada terapeuta tiene un precio por hora para sus servicios, y el salón ofrece diferentes tipos de masajes, cada uno con una duración específica y una política de cancelación.

### Objetivo ###
Crear un sistema que permita a los clientes consultar la disponibilidad de masajes para un día concreto.

Por un lado, tenemos un servicio que nos da los terapeutas disponibles con la siguiente información:

* Código identificador del terapetua
* Nombre
* Precio por hora
* Si permite cancelar una sesión de masaje o no.

Para acceder al servicio:
get - http://192.168.10.124:38080/massage/therapist

Por otro lado, tenemos un servicio que nos proporciona todos los masajes disponibles para un día concreto. Cada masaje tiene la siguiente información:

* Código del masaje
* Nombre
* Estado
* Duración
* Política de cancelación

Para acceder al servicio:
get - http://192.168.10.124:38080/massage/quote/2023-10-02


El nuevo servicio de disponibilidad tiene que devolver una lista de terapeutas y los masajes que puede ofrecer para el día de la consulta. No se mostrarán los masajes que no estén disponibles.

También se deberá calcular:

* El precio final del masaje.
* La política de cancelación expresada en un mensaje. Teniendo en cuenta que el día del masaje siempre será 100 % no reembolsable.

Ejemplo del mensaje:

* Sin gastos de cancelación hasta el 22 ene 2024
* Entre 23 ene 2024 y 24 ene 2024: 100 €
* Desde 25 ene 2024: no reembolsable
