package com.example.demo_board.entity;

import lombok.Data;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Board {

    @Id // @Id = 기본키 지정
    @GeneratedValue
    private Long id;
    private String title;
    private String content;

    private String filename;

    private String filepath;
}
