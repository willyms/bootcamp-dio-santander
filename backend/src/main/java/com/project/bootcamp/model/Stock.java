package com.project.bootcamp.model;

import lombok.*;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.*;

@Data
@Entity
@Table(name = "tb_stock")
public class Stock {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Double price;

    @Column(name = "dt_publication")
    private LocalDate date;

    @Column(name = "variation")
    private Double variation;
}
