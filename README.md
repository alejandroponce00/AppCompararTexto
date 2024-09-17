# AppCompararTexto
Proyecto FInal Integrador Ticmas "Desarrollo de aplicaciones moviles"
Alumno:Alejandro Alberto Ponce
Consigna:Debe contener una única pantalla (sin importar el layout elegido) con:
2 cuadros de textos (EditText) 
1 botón con el texto “comparar”
1 texto (TextView) que en el que se escriba el resultado de la acción al presionar el botón.

Asegurarse de que:
Utiliza MVVM
Tiene al menos un test unitario
Tiene al menos un test de UI
Función de la aplicación
Cuando el usuario hace clic en el botón “comparar” debe comparar la entrada de ambos cuadros de texto y escribir en el texto (TextView) si ambas cadenas de caracteres son iguales o no.


Descripción:

Pantalla Principal:

Al abrir la aplicación, se presenta al usuario con una interfaz de usuario sencilla y amigable.
En el centro de la pantalla, hay dos campos de entrada de texto etiquetados como "Texto 1" y "Texto 2".
Justo debajo de los campos de entrada, se encuentra un botón de "Comparar".
Funcionalidad:

El usuario ingresa texto en los campos "Texto 1" y "Texto 2".
Al presionar el botón "Comparar", la aplicación compara ambos textos.
La comparación se realiza en función de la igualdad de contenido y no distingue entre mayúsculas y minúsculas, es decir, es insensible a mayúsculas y minúsculas.
La aplicación determina si los textos son iguales y muestra un mensaje en la parte inferior de la pantalla indicando si son iguales o no.
Si los textos son iguales, se muestra un mensaje afirmativo, como "Los textos son iguales".
Si los textos son diferentes, se muestra un mensaje negativo, como "Los textos son diferentes".
