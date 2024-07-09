package com.aluracursos.forohub.forohub.domain.topico.validaciones;

import com.aluracursos.forohub.forohub.domain.topico.DatosRegistrarTopico;
import com.aluracursos.forohub.forohub.domain.topico.Topico;
import com.aluracursos.forohub.forohub.domain.topico.TopicoRepository;
import jakarta.validation.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

@Component
public class TopicoActivoRepetido implements ValidadorDeConsultas{
    @Autowired
    TopicoRepository topicoRepository;

    public void validar(DatosRegistrarTopico datosRegistrarTopico){
        Pageable pageable = PageRequest.of(0,10);
        Page<Topico> topicoRepetido = topicoRepository.findByActivoTrueAndTitulo(datosRegistrarTopico.titulo(), pageable);
        if (topicoRepetido.getTotalElements() >=5){
            throw new ValidationException("Ya existen multiples topicos con ese tema en particular");
        }
    }
}
