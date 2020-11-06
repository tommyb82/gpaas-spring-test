package com.example.gpaas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Immutable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

/**
 *
 */
@Entity
@Immutable
@Table(name = "search_terms")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
public class SearchTerm {

  public SearchTerm() {}

  @Id
  @Column(name = "search_id")
  private Integer id;

  @Column(name = "search_term")
  private String term;

}
