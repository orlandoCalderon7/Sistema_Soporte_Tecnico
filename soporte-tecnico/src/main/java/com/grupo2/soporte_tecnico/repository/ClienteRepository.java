package com.grupo2.soporte_tecnico.repository;

import com.grupo2.soporte_tecnico.model.Cliente;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class ClienteRepository {

    private final Map<Long, Cliente> almacen = new HashMap<>();
    private Long contadorId = 1L;

    public List<Cliente> findAll()                   { return new ArrayList<>(almacen.values()); }
    public Optional<Cliente> findById(Long id)       { return Optional.ofNullable(almacen.get(id)); }
    public boolean existsById(Long id)               { return almacen.containsKey(id); }
    public boolean deleteById(Long id)               { return almacen.remove(id) != null; }

    public Cliente save(Cliente cliente) {
        if (cliente.getId() == null) cliente.setId(contadorId++);
        almacen.put(cliente.getId(), cliente);
        return cliente;
    }
}
