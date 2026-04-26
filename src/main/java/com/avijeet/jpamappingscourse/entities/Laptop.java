package com.avijeet.jpamappingscourse.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Laptop {
    @Id
    private Integer id;
    private String model;
    private String brand;
    private Boolean isGamingLaptop;
    
}
