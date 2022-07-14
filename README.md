# 📱 Smartphones Market Application

## Descripción

Los avances tecnológicos existentes en la actualidad hacen que nuestra forma
de comunicarnos cada vez este más sumergida en la innovación y en las nuevas funcionalidades,
entre los mencionados avances se encuentran los conocidos smartphones, los cuales permiten
tener en las manos de los usuarios un dispositivo capaz de conectarse a internet, efectuar
mensajería, capturar momentos únicos y demás.

Como es mencionado, los smartphones juegan un papel muy importante en los mercados actuales,
haciendo que el comercio de este producto sea movido y recurrente. Es por ello, que surge la
necesidad de tener nuevos espacios seguros o confiables,
que permitan la adquisición de los mismos, razón por la cual lleva el desarrollo de
Smartphones Market Application, una herramienta que le permite al cliente efectuar sus compras
respectivas de sus smartphones de una forma ágil y segura.

## 📋 Tabla de contenido

1. ¿Cómo instalar Smartphones Market Application?
2. ¿Cómo correr las pruebas?
3. ¿Cómo correr Smartphones Market Application?
4. Diagramas
5. Recursos

## ⏬ ¿Cómo instalar Smartphones Market Application?

**Pre-requisitos**:
1. Instalar [**JDK**](https://www.java.com/es/download/help/download_options_es.html) versión 11.
2. Instalar Maven.
3. Instalar Docker.

> **Nota**: Considere que debe de tener el kit de **docker-compose** posterior a la instalación de la
> herramienta docker.

Ejecute los comandos que se muestran a continuación para la instalación de **Java 11**.

    sudo apt-get update
    sudo apt-get install openjdk-11-jdk

Luego verifique que java la instalación de JDK 11.

    java --version 

Agregue la herramienta **Maven** en su entorno y compruebe que se instaló correctamente.

    sudo apt update        
    sudo apt install maven
    mvn -version

Para el caso de instalación de **Docker** revise la [documentación](https://docs.docker.com/engine/install/ubuntu/).

## ✅ ¿Cómo correr las pruebas?

El aplicativo cuenta con una cantidad numerosa de pruebas en categorías de unitarias y de
integración. Ahora bien, recuerde que para que las pruebas se ejecuten exitosamente debe de contar con la
herramienta **Maven** instalada en su entorno de preferencia. Ubiquese en el directorio en donde se encuentra
el proyecto y ejecute el siguiente comando.

    mvn test 

## ➡️ ¿Cómo correr Smartphones Market Application?

Los distintos **servicios** que utiliza o consume **Smartphones Market Application** están bajo el
uso del software de Docker, especialmente en la implementación de **Docker-Compose**. Con base a lo expuesto
ubiquese previamente en la carpeta de proyecto y corra lo siguiente.

    docker-compose up

Luego abra el aplicativo en su navegador de preferencia utilizando la **URL** a continuación.

    http://localhost/endpoint/endpoint

## 🔀 Diagramas

## 🔗 Recursos
&copy; 2022 Hecho con ❤️ por Ysnaldo J. López H. , Todos los derechos reservados.   
