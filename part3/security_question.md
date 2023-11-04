# Diseño seguro
            El diseño seguro es una cultura y metodología que evalúa constantemente las amenazas y garantiza que el código esté diseñado y probado de manera sólida para prevenir métodos de ataque conocidos. El modelado de amenazas debe estar integrado en sesiones de refinamiento (o actividades similares); buscar cambios en los flujos de datos y el control de acceso u otros controles de seguridad. Durante la creación de las historias de usuario, determine el flujo correcto y los estados de falla. Asegúrese de que sean bien entendidos y acordados por las partes responsables e impactadas. Analice las suposiciones y las condiciones para los flujos esperados y de falla, asegúrese de que aún sean precisos y deseables. Determine cómo validar las suposiciones y hacer cumplir las condiciones necesarias para los comportamientos adecuados. Asegúrese de que los resultados estén documentados en las historias de usuario. Aprenda de los errores y ofrezca incentivos positivos para promover mejoras. El diseño seguro no es un complemento ni una herramienta que pueda agregar al software.


# Interfaces de usuarios

1. App movil 
2. Interfaz web

    # Seguridad

    Perdida de control de acceso: 
        **Evitar que los clientes tengan la opcion de actuar fuera de los accesos permitidos**
                Violación del principio de mínimo privilegio o denegación por defecto, según el cual el acceso sólo debe ser permitido para capacidades, roles o usuarios particulares, y no disponible para cualquier persona. 

                Eludir las comprobaciones de control de acceso modificando la URL (alteración de parámetros o navegación forzada), el estado interno de la aplicación o la página HTML, o mediante el uso de una herramienta que modifique los pedidos a APIs.

                Permitir ver o editar la cuenta de otra persona, con tan solo conocer su identificador único (referencia directa insegura a objetos)

                Acceder a APIs con controles de acceso inexistentes para los métodos POST, PUT y DELETE

                Elevación de privilegios. Actuar como usuario sin haber iniciado sesión o actuar como administrador cuando se inició sesión como usuario regular.

                Manipulación de metadatos, como reutilizar o modificar un token de control de acceso JSON Web Token (JWT), una cookie o un campo oculto, manipulándolos para elevar privilegios o abusar de la invalidación de tokens JWT.

                Configuraciones incorrectas de CORS (uso compartido de recursos de origen cruzado) que permiten el acceso a APIs desde orígenes no autorizados o confiables.

                Forzar la navegación a páginas autenticadas siendo usuario no autenticado o a páginas privilegiadas siendo usuario regular.

# Datos de usuario

1. DB MySQL (informacion de clientes - informacion de pedidos)
2. Python

    # Seguridad

    1. **Fallas Criptograficas: hace referencia a la proteccion de los datos tanto en transito como en reposo**
                Asegurarse de que no se transmitan datos en texto claro, especialmente en el tráfico externo de Internet.

                Evitar el uso de algoritmos o protocolos criptográficos antiguos o débiles.

                Gestionar adecuadamente las claves criptográficas, evitando claves débiles y asegurándose de no incluirlas en repositorios de código fuente.

                Forzar el cifrado y aplicar directivas de seguridad en los encabezados HTTP.

                Validar correctamente los certificados de servidor y las cadenas de confianza.

                Utilizar vectores de inicialización seguros y modos de operación criptográficos apropiados.

                Evitar el uso de contraseñas como claves criptográficas sin una función de derivación adecuada.

                Emplear funciones hash criptográficas en lugar de funciones obsoletas o no criptográficas.

                Evitar métodos criptográficos de relleno obsoletos y estar alerta ante posibles canales laterales de ataques criptográficos a través de mensajes de error.

    2. **Inyeccion: tipo de vulnerabilidad o ataque que ocurre cuando un atacante introduce datos maliciosos o comandos en una aplicación o sistema para aprovechar una debilidad en la forma en que se procesan los datos.**

                La opción preferida es utilizar una API segura, que evite el uso de un intérprete por completo y proporcione una interfaz parametrizada o utilizar una herramienta de ORM.
                Nota:: Incluso cuando se parametrizan, los procedimientos almacenados pueden introducir una inyección SQL si el procedimiento PL/SQL o T-SQL concatena consultas y datos, o se ejecutan parámetros utilizando EXECUTE IMMEDIATE o exec().

                Implemente validaciones de entradas de datos en el servidor, utilizando "listas blancas". De todos modos, esto no es una defensa completa, ya que muchas aplicaciones requieren el uso de caracteres especiales, como en campos de texto o APIs para aplicaciones móviles.

                Para cualquier consulta dinámica restante, escape caracteres especiales utilizando la sintaxis de caracteres específica para el intérprete que se trate.
                Nota: La estructura de SQL como nombres de tabla, nombres de columna, etc. no se pueden escapar y, por lo tanto, los nombres de estructura suministrados por el usuario son peligrosos. Este es un problema común en el software de redacción de informes.

                Utilice LIMIT y otros controles SQL dentro de las consultas para evitar la fuga masiva de registros en caso de inyección SQL.

# Accesos

1. Ingenieros de Software: 12 personas
2. Atencion al cliente: 3 personas
3. Ventas: 1 persona

    # Seguridad 

                **Control de Acceso Roto:** Implementar mecanismos sólidos de control de acceso para asegurar que los empleados de soporte al cliente solo puedan acceder y modificar datos dentro de su ámbito de responsabilidad.

                **Registro y Monitoreo Insuficiente:** Establecer un registro y monitoreo exhaustivo para detectar y responder a incidentes de seguridad de manera oportuna.

                **Configuración de Seguridad Errónea:** Auditar y revisar regularmente la configuración de seguridad de nuestros contenedores de Kubernetes y la infraestructura de AWS para identificar y corregir configuraciones erróneas.

                **Uso de Componentes con Vulnerabilidades Conocidas:** Monitorear y actualizar continuamente los componentes, bibliotecas y dependencias de terceros para corregir vulnerabilidades conocidas.



