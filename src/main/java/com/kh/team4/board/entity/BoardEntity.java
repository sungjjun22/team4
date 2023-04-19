package com.kh.team4.board.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "board_table")
@SequenceGenerator(
        name = "BOARD_SEQ_GENERATOR"  //시퀀스 제너레이터 이름
        , sequenceName = "BOARD_SEQ"  //시퀀스 이름
        , initialValue = 1  //시작값
        , allocationSize = 1  //메모리를 통해 할당할 범위 사이즈
)
public class BoardEntity {
  @Id // pk 칼럼 지정
  @GeneratedValue(
          strategy = GenerationType.SEQUENCE  //사용할 전략을 시퀀스로  선택
          , generator = "BOARD_SEQ_GENERATOR" //식별자 생성기를 설정해놓은  USER_SEQ_GEN으로 설정
  )
  private int board_number;

  @Column(length = 50, nullable = false)
  private String board_title;

  @Column
  private String board_content;

  @Column
  private String board_image;

  @Column
  private String board_video;

  @Column
  private String board_file;

  @Column(length = 20, nullable = false)
  private String board_writer_email;

  @Column
  private String board_writer_profile;

  @Column
  @ColumnDefault("0")
  // 디폴트 값을 0으로 설정
  private int board_click_count;

  @Column
  @ColumnDefault("0")
  private int board_like_count;

  @Column
  @ColumnDefault("0")
  private int board_comment_count;

}
