package com.kh.team4.board.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "board_table")
public class BoardEntity {
  @Id // pk 지정
  private int board_number;


}
