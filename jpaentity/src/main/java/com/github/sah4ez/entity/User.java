package com.github.sah4ez.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by aleksandr on 08.05.17.
 */
@Entity
@Table(name = "user")
public class User implements Serializable{
    private static final long serialVersionUID = 3650142246777179368L;
    private Long id;
    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
