package com.sridhar.example.security;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name = "AUTHORITY", uniqueConstraints = {@UniqueConstraint(columnNames = {"NAME"})})
public class Authority implements GrantedAuthority {

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

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


    @Override
    public String getAuthority() {
        return getName();
    }

    

}
