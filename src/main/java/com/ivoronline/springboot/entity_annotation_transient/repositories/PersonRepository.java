package com.ivoronline.springboot.entity_annotation_transient.repositories;

import com.ivoronline.springboot.entity_annotation_transient.entities.PersonEntity;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<PersonEntity, Integer> { }
