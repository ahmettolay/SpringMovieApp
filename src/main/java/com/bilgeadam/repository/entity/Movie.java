package com.bilgeadam.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Movie implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
   private String name;
   private String languege;
   private String image;
   private String country;
   private double rating;
   private String summary;
   private LocalDate premiered;
   private String url;
   @ElementCollection
   private List<Integer> genreId;
   @ElementCollection
   private  List<Integer> commentId;



}
