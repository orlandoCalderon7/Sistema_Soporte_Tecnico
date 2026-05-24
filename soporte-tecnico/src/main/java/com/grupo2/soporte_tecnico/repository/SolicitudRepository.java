package com.grupo2.soporte_tecnico.repository;

import com.grupo2.soporte_tecnico.model.Solicitud;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class SolicitudRepository {

    private final Map<Long, Solicitud> almacen = new HashMap<>();
    private Long contadorId = 1L;

    public List<Solicitud> findAll()                  { return new ArrayList<>(almacen.values()); }
    public Optional<Solicitud> findById(Long id)      { return Optional.ofNullable(almacen.get(id)); }
    public boolean existsById(Long id)                { return almacen.containsKey(id); }
    public boolean deleteById(Long id)                { return almacen.remove(id) != null; }

    public List<Solicitud> findByClienteId(Long clienteId) {
        return almacen.values().stream()
                .filter(s -> s.getClienteId().equals(clienteId))
                .toList();
    }

    public List<Solicitud> findByEstado(String estado) {
        return almacen.values().stream()
                .filter(s -> s.getEstado().name().equalsIgnoreCase(estado))
                .toList();
    }

    public Solicitud save(Solicitud solicitud) {
        if (solicitud.getId() == null) solicitud.setId(contadorId++);
        almacen.put(solicitud.getId(), solicitud);
        return solicitud;
    }
}
