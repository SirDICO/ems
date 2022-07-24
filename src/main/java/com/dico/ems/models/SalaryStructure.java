package com.dico.ems.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "salaryStructure")
public class SalaryStructure {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private double Salary;
    private String Level;

}
