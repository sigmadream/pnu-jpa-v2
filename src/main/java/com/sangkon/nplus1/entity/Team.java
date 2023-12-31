package com.sangkon.nplus1.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@ToString
public class Team {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;
}
