package org.example.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table (name="employee")

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Double salary;

    @Column ( name = "arabic_name")
    private String arabicName;

    @Column ( name = "english_name")
    private String englishName;

    @Column ( name = "join_date")
    private String joinDate;

    @Column ( name = "date_of_birth")
    private String dateOfBirth;

    @Column
    private String mobile;

    @Column
    private String status;

    @Column
    private String gender;


}
