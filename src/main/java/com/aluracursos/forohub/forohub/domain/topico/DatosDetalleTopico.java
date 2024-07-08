package com.aluracursos.forohub.forohub.domain.topico;

import java.time.LocalDateTime;

public record DatosDetalleTopico(
        Long id,
//        Long usuario,
        String mensaje,
        String nombreCurso,
        String titulo,
        LocalDateTime fecha
) {
    public DatosDetalleTopico(Topico topico){
        this(topico.getId(), topico.getMensaje(),
                topico.getNombreCurso(), topico.getTitulo(), topico.getFecha());
    }
}
