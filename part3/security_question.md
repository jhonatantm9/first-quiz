Para hacer el sistema más seguro, hay una serie de actividades que podemos tener en cuenta:

- Es importante verificar las contraseñas de las cuentas, de tal forma que se evite el uso de contraseñas débiles que se conviertan en una brecha de seguridad para que un intruso pueda acceder fácilmente a la información de un usuario u otra información. A la hora de crear usuarios en la aplicación esto también debe tenerse en cuenta.
- Se debe restringir el acceso a ciertos servicios o el hecho de que cualquier usuario pueda realizar una operación sin autorización. Para ello se pueden utilizar roles que permitan verificar que las solicitudes que se deseen realizar estén permitidas para la persona que está haciendo la petición.

De forma más técnica, para el desarrollo del proyecto y la infraestructura se pueden seguir estas recomendaciones:

- Utilizar mecanismos de encriptación seguros a la hora de compartir información, principalmente sensible para evitar que estos puedan ser accedidos por cualquier usuario no autorizado
- Mantener actualizadas las dependencias del proyecto y siempre trabajar con librerías o repositorios que sean seguros y confiables.
- Si en el futuro se deben desarrollar nuevos componentes o funcionalidades, se debe realizar un buen diseño previo que sea verificado para evitar comprometer la aplicación durante la implementación. Un buen diseño permite prevenir una gran cantidad de errores a futuro.
- Cuando se deba intercambiar solicitudes, por ejemplo, peticiones HTTP se debe hacer una verificación de la URL y el encabezado de estas, puesto que a través de estas pueden haber intentos de robar información o comprometer la integridad del sistema.
- Para la base de datos, es necesario utilizar mecanismos como limitar permisos o usar consultas parametrizadas que permitan evitar ataques como inyecciones sql y así permitir la confidencialidad e integridad de los datos.
- Utilizar firewall correctamente configurado para permitir una comunicación de paquetes mucho más segura.
