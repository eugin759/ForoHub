package com.aluracursos.forohub.forohub.domain.topico;

import java.time.LocalDateTime;

public record DatosDetalleTopico(
        Long id,
        String usuario,
        String mensaje,
        String nombreCurso,
        String titulo,
        Boolean activo,
        LocalDateTime fecha
) {
    public DatosDetalleTopico(Topico topico){
        this(topico.getId(), topico.getUsuario(), topico.getMensaje(),
                topico.getNombreCurso(), topico.getTitulo(), topico.getActivo(), topico.getFecha());
    }
}
