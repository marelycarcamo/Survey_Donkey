# Survey Donkey

## Descripción Funcional
<p align="justify">Este programa es una aplicación de Android que permite a los usuarios navegar a través de las secciones de una encuesta. La aplicación solicita permiso para escribir en el almacenamiento externo del dispositivo y muestra un mensaje de toast para informar al usuario si el permiso fue concedido o denegado.</p>

<p align="justiify">La aplicación utiliza un ViewPager para permitir a los usuarios deslizarse entre las diferentes secciones. Cuando el usuario presiona el botón flotante de acción (FAB), la aplicación avanza a la siguiente sección.</p>

## Descripción Técnica
<p align="justify">La aplicación está escrita en Kotlin y utiliza el marco de trabajo de Android. La interfaz de usuario se define en un archivo de diseño XML y se infla en la actividad principal de la aplicación.</p>

<p align="justify">La aplicación utiliza el <code>ActivityResultContracts.RequestPermission()</code> para solicitar permisos en tiempo de ejecución. Si el permiso para escribir en el almacenamiento externo es concedido, la aplicación muestra un mensaje de toast diciendo “Permiso aceptado”. Si el permiso es denegado, la aplicación muestra un mensaje de toast diciendo “Permiso negado”.</p>

<p align="justify">La aplicación utiliza un ViewPager junto con un PagerAdapter personalizado para mostrar las encuestas. Cuando el usuario presiona el FAB, la aplicación cambia la página actual del ViewPager a la siguiente encuesta.</p>

😊
