package com.co.cfd.springboot.cashflow.ninja.expenses.entities;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "expenses")
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference
    private TypeOfExpense type;

    private Double value;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "create_at")
    @DateTimeFormat(pattern = "YYYY-MM-dd")
	@JsonFormat(pattern = "YYYY-MM-dd")
    private LocalDate createAt;
   
    @Temporal(TemporalType.DATE)
    @Column(name = "update_at")
    @DateTimeFormat(pattern = "YYYY-MM-dd")
	@JsonFormat(pattern = "YYYY-MM-dd")
    private LocalDate updateAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeOfExpense getType() {
        return type;
    }

    public void setType(TypeOfExpense type) {
        this.type = type;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public LocalDate getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDate createAt) {
        this.createAt = createAt;
    }

    public LocalDate getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDate updateAt) {
        this.updateAt = updateAt;
    }


}
