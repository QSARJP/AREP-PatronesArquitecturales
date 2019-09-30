# Tutorial patrones Arquitecturales

En el siguiente tutorial se encontrará como se crean diferentes servicios en la pltaforma de aws 
desde el depliegue de paginas estaticas hasta el de una aplicacion web conectada a una base de datos.

Si se desea ver el tutorial en video seleccione el sigueinte link [link-youtube]()

# S3
Primero abriremos la consola de AWS y seleccioanremos la opcion de S3 en la categoria de storage

![](img/s3/1.png)

pasamos a crear un nuevo bucket colocando el nombre que se desee realizar,  para este caso sera el de patrones arquitecturales


![](img/s3/2.png)

En la opcion de seguridad, debemos quitar lo de bloquear todo acceso publico

![](img/s3/3.png)

Por ultimo, esta la revison para ver toda la iformaciòn relevante hasta ahora.

Ahora, pasamos a abrir el bucket creado anteriormente y seleccinamos la opcion de cargar 

![](img/s3/4.png)

Se peude colocar en este sitio desde una imagen hasta una pagina web html con informacion estatica, para este caso elegimos el 
de subir una pagina web estatica.

![](img/s3/5.png)

existen varias opciones, al momento de seleccionar las propiedades desde diferentes servicios hasta el cifrado del elemento subido,
como el fin es ilustrativo, se escoge la opcion gratiuta.

![](img/s3/6.png)

Por ultimo, debemos entrar a nuestro elemento cargado y seleccinamos la opcion de hacerlo publico


![](img/s3/7.png)

y ya podemos ver el sitio desplegado en un servicio s3 

![](img/s3/8.png)

Nota: se pueden subir mas de un archivo, por lo que se podira crear una pagina web con diferentes pestañas, pero se deben subir cada uno de los archivos.

Para ver temas de costos asociados a este servicio por favro mirar el sigueinte link [CostosS3](https://aws.amazon.com/es/s3/pricing/)


# RDS

Antes de crear la base de datos, se debe realizar un grupo serguro dentro del servicio VPC

![](img/RDS/1.png)

Pasamos a crear un grupo seguro colocando el nombre que deseamos y selecciando una vpc, por defecto se tiene una.

![](img/RDS/2.png)

Se crea un inbound con el tipo que se desea, para este caso se coloca el de PostgreSQL, teniendo en cuenta que se coloca el source como anywhere.

![](img/RDS/3.png)

nota: Para ver temas de costos asociados a este servicio por favro mirar el sigueinte link [CostosVPC](https://aws.amazon.com/es/vpc/pricing/)

Pasamos luego a la creacion de la base de dato, seleccionamos el servicio RDS y seleccionamos crear base de datos

![](img/RDS/4.png)

Y seleccionamos PostgreSQL 

![](img/RDS/5.png)

Agregamos usuario y clave para nuestra base de datos donde el usuario es admin y la contraseña admin12334

![](img/RDS/6.png)

Pasamos a habilitar la opcion de security group que habiamos creado anteriromente

![](img/RDS/7.png)

Por ultimo le damos la opcion de crear, para ver si esta funcionando, abrimos la base de datos en  dbeaver
Como podemos observar la base da datos fue creada 

![](img/RDS/8.png)

Creamos una tabla, que nos servira para el sigueinte punto.

![](img/RDS/9.png)


nota: Para ver temas de costos asociados a este servicio por favro mirar el sigueinte link [CostosRDS](https://aws.amazon.com/es/rds/pricing/)

# EC2

Nos dirigimos al servicio EC2 y le damos lanzar una instancia

![](img/EC2/1.png)

Seleccinamos la segunda opcion la cual nos permite lanzar una maquina linux con las especificaciones que veremos acontinuacion

![](img/EC2/2.png)

Seleccinamos la opcion gratuita para este ejemplo pero se puedne ver las demas opciones

![](img/EC2/3.png)

Pasamos luego a lanzar la instancia, pero antes nos pregunta cual es la llave que vmaos a seleccionar, como ya se tenia una llave se seleccina pero si 
es necesario crear una nueva desde ahi se peude realizar la opcion

![](img/EC2/4.png)

Se debe agregar el security group para esta maquian con el fin de que se puedan encontrar estos servicios
![](img/EC2/5.png)

Por ultimo, se puede ver en la sigueinte imagen que la maquina ya ha sido creada y la direccion seleccianada es la que se va tener en cuenta cuando se lance la aplicaicon desde ahi 
![](img/EC2/6.png)






