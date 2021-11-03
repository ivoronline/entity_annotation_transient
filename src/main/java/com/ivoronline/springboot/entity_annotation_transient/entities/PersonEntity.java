package com.ivoronline.springboot.entity_annotation_transient.entities;

import javax.persistence.*;

@Entity
public class PersonEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Integer id;

  public String  name;

  public Integer age;

  @Transient
  public String message;

}








