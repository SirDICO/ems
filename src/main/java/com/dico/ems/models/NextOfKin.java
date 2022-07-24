package com.dico.ems.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
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
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
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
