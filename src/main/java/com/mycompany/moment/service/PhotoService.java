package com.mycompany.moment.service;

import com.mycompany.moment.domain.Photo;
import java.util.List;

/**
 * Service Interface for managing Photo.
 */
public interface PhotoService {

    /**
     * Save a photo.
     *
     * @param photo the entity to save
     * @return the persisted entity
     */
    Photo save(Photo photo);

    /**
     *  Get all the photos.
     *  
     *  @return the list of entities
     */
    List<Photo> findAll();

    /**
     *  Get the "id" photo.
     *
     *  @param id the id of the entity
     *  @return the entity
     */
    Photo findOne(Long id);

    /**
     *  Delete the "id" photo.
     *
     *  @param id the id of the entity
     */
    void delete(Long id);
}
