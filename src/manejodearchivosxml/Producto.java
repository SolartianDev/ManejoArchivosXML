package manejodearchivosxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

// Paso 1: Se define la anotación @XmlRootElement para indicar que esta clase representa el elemento raíz XML.
@XmlRootElement(name = "Productos")

// Paso 2: Se define la anotación @XmlAccessorType con XmlAccessType.FIELD para especificar que se utilizarán
// los campos de la clase para la vinculación XML.
@XmlAccessorType(XmlAccessType.FIELD)
public class Producto {
// Paso 3: Se define la anotación @XmlAttribute para mapear el atributo "nombre" en XML al campo "nombre" de la clase.
    @XmlAttribute
    private String nombre;

// Paso 4: No se utiliza anotación para el campo "precio", lo que significa que se espera que se
// vincule con el valor del elemento XML.

    private double precio;

// Paso 5: No se utiliza anotación para el campo "descripcion", lo que significa que se espera que se
// vincule con el valor del elemento XML.

    private String descripcion;

// Paso 6: Se definen constructores, incluido el constructor predeterminado y uno que acepta los valores
// de "nombre", "precio" y "descripcion" para inicializar el objeto Producto.

   public Producto() {
    }

    public Producto(String nombre, double precio, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }

// Paso 7: Se definen métodos getter para obtener los valores de "nombre", "precio" y "descripcion".

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

// Paso 8: Se sobrescribe el método toString para proporcionar una representación de cadena
// del objeto Producto que incluye nombre, precio y descripción.

    @Override
    public String toString() {
        return "Producto: nombre: " + nombre + ", precio: " + precio + ", descripción: " + descripcion;
    }
}

