package com.jhipster.demo.pet.service;

import com.jhipster.demo.pet.domain.Pet;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Service Interface for managing {@link Pet}.
 */
public interface PetService {
    /**
     * Save a pet.
     *
     * @param pet the entity to save.
     * @return the persisted entity.
     */
    Pet save(Pet pet);

    /**
     * Updates a pet.
     *
     * @param pet the entity to update.
     * @return the persisted entity.
     */
    Pet update(Pet pet);

    /**
     * Partially updates a pet.
     *
     * @param pet the entity to update partially.
     * @return the persisted entity.
     */
    Optional<Pet> partialUpdate(Pet pet);

    /**
     * Get all the pets.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<Pet> findAll(Pageable pageable);

    /**
     * Get all the pets with eager load of many-to-many relationships.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<Pet> findAllWithEagerRelationships(Pageable pageable);

    /**
     * Get the "id" pet.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<Pet> findOne(Long id);

    /**
     * Delete the "id" pet.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
