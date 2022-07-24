package com.dico.ems.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Formula;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "nextofkin")
public class NextOfKin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String firstname;
    private String lastname;
    private String middlename;

    @Formula(value = " concat(lastname,' ', middlename, ' ', firstname) ")
    private String fullName;

    private String phone;
    private String stateOrigin;
    private String passport;
    private String photo;
    private String email;
    private String relationship;
    private String gender;

}
