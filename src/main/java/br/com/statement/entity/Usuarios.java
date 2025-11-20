package br.com.statement.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "usuarios")
public class Usuarios extends PanacheEntity {
    public String firstName;
    public String lastName;
    public String email;
    public String password;
    @Column(name = "dateCreated", insertable = false, updatable = false)
    public LocalDateTime dateCreated;
}