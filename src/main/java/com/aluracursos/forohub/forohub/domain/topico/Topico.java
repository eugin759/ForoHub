package com.aluracursos.forohub.forohub.domain.topico;

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

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "usuario_id")
//    private Usuario usuario;

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
    }

    public void cerrarTopico(){
        this.activo = false;
    }

}
