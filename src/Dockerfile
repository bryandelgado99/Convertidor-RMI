# Define la imagen base de Java
FROM openjdk:latest
# Copia los archivos compilados al contenedor
WORKDIR /app
COPY .. /app
# Compila los archivos Java
#RUN javac ConvertidorRemoto.java ConvertidorRemotoImpl.java Servidor_RMI.java Cliente_RMI.java
RUN javac *.java
# Expone el puerto utilizado por RMI
EXPOSE 1099
# Inicia el servidor RMI al ejecutar el contenedor
CMD ["java", "Servidor_RMI"]
