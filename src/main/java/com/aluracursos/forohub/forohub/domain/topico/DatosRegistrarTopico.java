package com.aluracursos.forohub.forohub.domain.topico;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DatosRegistrarTopico(
//        @NotNull
//        Long usuario,
        @NotNull
        String mensaje,
        @NotNull
        String nombreCurso,
        @NotNull
        String titulo
) {
}
