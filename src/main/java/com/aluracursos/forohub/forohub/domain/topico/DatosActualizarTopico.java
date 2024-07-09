package com.aluracursos.forohub.forohub.domain.topico;

import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(
        @NotNull
        String mensaje
) {
}
