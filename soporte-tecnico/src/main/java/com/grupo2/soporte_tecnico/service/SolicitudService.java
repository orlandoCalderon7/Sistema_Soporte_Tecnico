package com.grupo2.soporte_tecnico.service;

import com.grupo2.soporte_tecnico.model.Solicitud;
import java.util.List;

public interface SolicitudService {
    List<Solicitud> listarTodas();
    Solicitud obtenerPorId(Long id);
    List<Solicitud> listarPorCliente(Long clienteId);
    List<Solicitud> listarPorEstado(String estado);
    Solicitud crear(Solicitud solicitud);
    Solicitud actualizar(Long id, Solicitud solicitud);
    void eliminar(Long id);
}
