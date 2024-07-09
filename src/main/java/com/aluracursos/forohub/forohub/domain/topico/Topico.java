package com.aluracursos.forohub.forohub.domain.topico;

import com.aluracursos.forohub.forohub.domain.usuarios.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String usuario;
    private String mensaje;
    private String nombreCurso;
    private String titulo;
    private LocalDateTime fecha;
    private Boolean activo;

    public Topico(DatosRegistrarTopico datosRegistrarTopico){
        this.activo = true;
        this.mensaje = datosRegistrarTopico.mensaje();
        this.nombreCurso = datosRegistrarTopico.nombreCurso();
        this.titulo = datosRegistrarTopico.titulo();
        this.fecha = LocalDateTime.now();
        if (datosRegistrarTopico.usuario() == null) {
            this.usuario = "Anonimo";
        }else{this.usuario = datosRegistrarTopico.usuario();}
    }

    public void cerrarTopico(){
        this.activo = false;
    }

    public void actualizarDatos(DatosActualizarTopico datosActualizarTopico){
            this.mensaje = datosActualizarTopico.mensaje();
    }

}
