package de.pan.todobackend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import de.pan.todobackend.model.Fusballkarten;

@Repository
public interface FusballkartenRepository extends CrudRepository<Fusballkarten, Integer> {

}
