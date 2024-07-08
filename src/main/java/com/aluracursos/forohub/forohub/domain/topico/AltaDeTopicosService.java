package com.aluracursos.forohub.forohub.domain.topico;

import com.aluracursos.forohub.forohub.domain.usuarios.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AltaDeTopicosService {
//    @Autowired
//    private UsuarioRepository usuarioRepository;
    @Autowired
    private TopicoRepository topicoRepository;
//    @Autowired
//    List<ValidadorDeConsultas> validadores;

    public DatosDetalleTopico altaTopico(DatosRegistrarTopico datosRegistrarTopico){

        //validadores.forEach(v->v.validar(datosDetalleTopico));
        var topico = new Topico(datosRegistrarTopico);
        topicoRepository.save(topico);
        return new DatosDetalleTopico(topico);
    }
}
