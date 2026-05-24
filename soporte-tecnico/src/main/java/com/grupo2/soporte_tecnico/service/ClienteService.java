package com.grupo2.soporte_tecnico.service;

import com.grupo2.soporte_tecnico.model.Cliente;
import java.util.List;

public interface ClienteService {
    List<Cliente> listarTodos();
    Cliente obtenerPorId(Long id);
    Cliente crear(Cliente cliente);
    Cliente actualizar(Long id, Cliente cliente);
    void eliminar(Long id);
}
