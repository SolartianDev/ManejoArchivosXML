package manejodearchivosxml;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class LeerXML {
  
    // Este método se encarga de leer un archivo XML y convertirlo en un objeto Producto.
    public static void leerXML(){
   
        try {
            // Paso 1: Se crea un contexto JAXB para la clase Producto, similar al paso 3 del código anterior.
            JAXBContext jc = JAXBContext.newInstance(Producto.class);
            
            // Paso 2: Se crea un objeto Unmarshaller que se utiliza para convertir el archivo XML en un objeto Java.
            Unmarshaller un = jc.createUnmarshaller();
            
            // Paso 3: Se abre un flujo de entrada desde el archivo XML "producto.xml".
            InputStream en = new FileInputStream("producto.xml");
            
            // Paso 4: Se utiliza un.unmarshal para deserializar el archivo XML y convertirlo en un objeto Producto.
            Producto pro = (Producto) un.unmarshal(en);
            
            // Paso 5: Se muestra un mensaje de éxito en la consola indicando que el archivo XML se leyó exitosamente.
            System.out.println("El archivo XML fue leído exitosamente ");
            
            // Paso 6: Se muestra el contenido del objeto Producto en la consola (toString).
            System.out.println("\n");
            System.out.println(pro);
            
        } catch (JAXBException | IOException e) {
            // Paso 7: En caso de excepción de JAXB o IOException, se captura la excepción y se muestra un mensaje de error.
            System.out.println(e.getMessage());
        }
    }
}
