package manejodearchivosxml;

public class ManejodeArchivosXML {

    public static void main(String[] args) {
        // Paso 1: Llama al método `escribirXML` de la clase `EscribirProductoXML`.
        EscribirProductoXML.escribirXML();
        
        // Paso 2: Imprime una línea en blanco para separar los mensajes en la consola.
        System.out.println("\n");
        
        // Paso 3: Llama al método `leerXML` de la clase `LeerXML`.
        LeerXML.leerXML();
    }
}

