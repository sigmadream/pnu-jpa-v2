package com.sangkon.nplus1.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
public class Member {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    @ManyToOne
    private Team team;
}
