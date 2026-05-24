package com.grupo2.soporte_tecnico.service;

import com.grupo2.soporte_tecnico.model.Tecnico;
import java.util.List;

public interface TecnicoService {
    List<Tecnico> listarTodos();
    List<Tecnico> listarDisponibles();
    Tecnico obtenerPorId(Long id);
    Tecnico crear(Tecnico tecnico);
    Tecnico actualizar(Long id, Tecnico tecnico);
    void eliminar(Long id);
}
