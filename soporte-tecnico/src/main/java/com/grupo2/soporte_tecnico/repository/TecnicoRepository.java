package com.grupo2.soporte_tecnico.repository;

import com.grupo2.soporte_tecnico.model.Tecnico;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class TecnicoRepository {

    private final Map<Long, Tecnico> almacen = new HashMap<>();
    private Long contadorId = 1L;

    public List<Tecnico> findAll()                   { return new ArrayList<>(almacen.values()); }
    public Optional<Tecnico> findById(Long id)       { return Optional.ofNullable(almacen.get(id)); }
    public boolean existsById(Long id)               { return almacen.containsKey(id); }
    public boolean deleteById(Long id)               { return almacen.remove(id) != null; }

    public List<Tecnico> findDisponibles() {
        return almacen.values().stream()
                .filter(Tecnico::isDisponible)
                .toList();
    }

    public Tecnico save(Tecnico tecnico) {
        if (tecnico.getId() == null) tecnico.setId(contadorId++);
        almacen.put(tecnico.getId(), tecnico);
        return tecnico;
    }
}
