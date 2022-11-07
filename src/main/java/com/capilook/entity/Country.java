package com.capilook.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "country")
public class Country {

    @Id
    @Column(name = "country_id")
    private Long id;

    @Column(name = "country_name")
    @NotNull
    @NotBlank
    private String countryName;

    @Column(name = "capital_city")
    @NotNull
    @NotBlank
    private String capitalCity;

}
