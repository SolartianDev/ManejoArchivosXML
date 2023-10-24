package manejodearchivosxml;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class EscribirProductoXML {
    
    // Paso 1: Se define un método llamado escribirXML que se encarga de crear un objeto Producto,
    // configurar la escritura del objeto en un archivo XML y realizar la escritura.

    public static void escribirXML() {
        // Paso 2: Se crea un objeto Producto con valores específicos para nombre, precio y descripción.
        Producto pro =  new Producto("MacBook Pro", 400.00, "La última MacBook Pro de Apple");
        
        try {
            // Paso 3: Se crea un contexto JAXB para la clase Producto. Esto se utiliza para configurar
            // la serialización y deserialización de objetos de Producto a XML y viceversa.
            JAXBContext jc = JAXBContext.newInstance(Producto.class);
            
            // Paso 4: Se crea un objeto Marshaller que se utiliza para convertir el objeto Producto en un
            // documento XML.
            Marshaller m = jc.createMarshaller();
            
            // Paso 5: Se utiliza el método m.marshal para escribir el objeto Producto en un archivo XML llamado "producto.xml".
            m.marshal(pro, new File("producto.xml"));
            
            // Paso 6: Se muestra un mensaje de éxito en la consola indicando que el archivo XML se creó correctamente.
            System.out.println("El archivo XML fue creado exitosamente ");
            
            // Paso 7: Además de escribir en un archivo, se utiliza m.marshal para mostrar el contenido XML
            // en la consola (System.out).
            m.marshal(pro, System.out);
            
        } catch (JAXBException e) {
            // Paso 8: En caso de excepción, se captura la excepción de JAXB y se muestra un mensaje de error.
            System.out.println("JAXB Excepción: " + e.getMessage());
        }
    }
}

