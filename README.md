# Aut_Ilana_DemoQa

INSTRUCCIONES DE INSTALACIÓN Y EJECUCIÓN DEL PROYECTO DE AUTOMATIZACIÓN

Este proyecto contiene pruebas automatizadas utilizando el patrón de diseño Page Object Model (POM) en Java, con Selenium Web driver, Gherkin, Cucumber y TestNG, en IntelliJ IDEA 2023.1.5. A continuación, se proporcionan instrucciones sobre cómo configurar y ejecutar estas pruebas.

 
REQUISITOS PREVIOS

Descargar e instalar las siguientes aplicaciones:
- [JDK 19.0.2] (https://www.oracle.com/java/technologies/javase-
downloads.html)

- [IntelliJ IDEA 2023.1.5] (https://www.jetbrains.com/idea/download/)

- [ChromeDriver] (https://sites.google.com/chromium.org/driver/) (Asegúrate de tener la versión compatible con tu versión de Chrome)


CONFIGURACIÓN DEL PROYECTO

1. Clona este repositorio:
`bash
 git clone https://github.com/tu-usuario/tu-proyecto.git

2. Abre IntelliJ IDEA y selecciona "File" > "Open" para abrir el proyecto.

3. Configura el JDK en IntelliJ:
a. Abre "File" > "Project Structure".
b. Selecciona "Project" en el panel izquierdo.
c. Establece el "Project SDK" en la versión 19.0.2.

4. Configura las dependencias:
a. Utiliza Maven para gestionar las dependencias del proyecto. IntelliJ IDEA debería descargar automáticamente las dependencias al abrir el proyecto.


EJECUCIÓN DE PRUEBAS

1. Abre la clase de prueba en src/test/java que contiene las pruebas.
2. Haz clic con el botón derecho en la clase de prueba y selecciona "Run ‘RegistroEstudianteRuner’ o ‘CarruselRuner’" para ejecutar las pruebas.


NOTAS ADICIONALES

1. Asegúrate de tener configurado ChromeDriver y la propiedad webdriver.chrome.driver en tu código según sea necesario.

2. Si encuentras problemas al ejecutar las pruebas, verifica la configuración del JDK, las dependencias del proyecto y las configuraciones de Selenium WebDriver.
