# 馃摫 Smartphones Market Application

## Descripci贸n

Los avances tecnol贸gicos existentes en la actualidad hacen que nuestra forma
de comunicarnos cada vez este m谩s sumergida en la innovaci贸n y en las nuevas funcionalidades,
entre los mencionados avances se encuentran los conocidos smartphones, los cuales permiten
tener en las manos de los usuarios un dispositivo capaz de conectarse a internet, efectuar
mensajer铆a, capturar momentos 煤nicos y dem谩s.

Como es mencionado, los smartphones juegan un papel muy importante en los mercados actuales,
haciendo que el comercio de este producto sea movido y recurrente. Es por ello, que surge la
necesidad de tener nuevos espacios seguros o confiables,
que permitan la adquisici贸n de los mismos, raz贸n por la cual lleva el desarrollo de
Smartphones Market Application, una herramienta que le permite al cliente efectuar sus compras
respectivas de sus smartphones de una forma 谩gil y segura.

## 馃搵 Tabla de contenido

1. 驴C贸mo instalar Smartphones Market Application?
2. 驴C贸mo correr las pruebas?
3. 驴C贸mo correr Smartphones Market Application?
4. Diagramas
5. Recursos

## 鈴? 驴C贸mo instalar Smartphones Market Application?

**Pre-requisitos**:
1. Instalar [**JDK**](https://www.java.com/es/download/help/download_options_es.html) versi贸n 11.
2. Instalar Maven.
3. Instalar Docker.

> **Nota**: Considere que debe de tener el kit de **docker-compose** posterior a la instalaci贸n de la
> herramienta docker.

Ejecute los comandos que se muestran a continuaci贸n para la instalaci贸n de **Java 11**.

    sudo apt-get update
    sudo apt-get install openjdk-11-jdk

Luego verifique que java la instalaci贸n de JDK 11.

    java --version 

Agregue la herramienta **Maven** en su entorno y compruebe que se instal贸 correctamente.

    sudo apt update        
    sudo apt install maven
    mvn -version

Para el caso de instalaci贸n de **Docker** revise la [documentaci贸n](https://docs.docker.com/engine/install/ubuntu/).

## 鉁? 驴C贸mo correr las pruebas?

El aplicativo cuenta con una cantidad numerosa de pruebas en categor铆as de unitarias y de
integraci贸n. Ahora bien, recuerde que para que las pruebas se ejecuten exitosamente debe de contar con la
herramienta **Maven** instalada en su entorno de preferencia. Ubiquese en el directorio en donde se encuentra
el proyecto y ejecute el siguiente comando.

    mvn test 

## 鉃★笍 驴C贸mo correr Smartphones Market Application?

Los distintos **servicios** que utiliza o consume **Smartphones Market Application** est谩n bajo el
uso del software de Docker, especialmente en la implementaci贸n de **Docker-Compose**. Con base a lo expuesto
ubiquese previamente en la carpeta de proyecto y corra lo siguiente.

    docker-compose up

Luego abra el aplicativo en su navegador de preferencia utilizando la **URL** a continuaci贸n.

    http://localhost/endpoint/endpoint

## 馃攢 Diagramas

## 馃敆 Recursos
&copy; 2022 Hecho con 鉂わ笍 por Ysnaldo J. L贸pez H. , Todos los derechos reservados.   
