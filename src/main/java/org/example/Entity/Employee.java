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

    @Column ( name = "last_name")
    private String lastName;

    @Column ( name = "first_name")
    private String firstName;

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
