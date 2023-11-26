package org.example.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table (name="vacation_type")
public class VacationType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;

    @Column(name = "arabic_description")
    private String arabicDescription;


}
