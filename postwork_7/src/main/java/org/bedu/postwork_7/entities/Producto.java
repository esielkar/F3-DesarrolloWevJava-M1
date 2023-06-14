package org.bedu.postwork_7.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Table(name = "PRODUCTOS")
@Entity
@NoArgsConstructor
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String categoria;

    private float precio;

    @Column(name = "numero_registro", length = 20)
    private String numeroRegistro;

    @Column(name = "fecha_creacion")
    private LocalDate fechaCreacion;
}