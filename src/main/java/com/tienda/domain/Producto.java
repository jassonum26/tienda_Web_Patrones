
package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "producto")
public class Producto implements Serializable {
    
    //Version de serializacion
    private static final long serialVersionUID = 1L;
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long idProducto; //id_producto
    
    private Long idCategoria; //id_categoria

    public Producto(Long idCategoria, String descripcion, String detalle, double precio, int existencias, String rutaImagen, boolean activo) {
        this.idCategoria = idCategoria;
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.precio = precio;
        this.existencias = existencias;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
    }
    private String descripcion;
    private String detalle;
    private double precio;
    private int existencias;
    private String rutaImagen; //ruta_imagen
    private boolean activo;

    public Producto() {
    }

    
}
