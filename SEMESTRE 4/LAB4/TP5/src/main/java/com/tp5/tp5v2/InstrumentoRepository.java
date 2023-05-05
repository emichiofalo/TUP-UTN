package com.tp5.tp5v2;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstrumentoRepository extends CrudRepository<Instrumento, Integer> {
}
