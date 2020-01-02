package me.dgpark.entity;


import me.dgpark.comment.ColumnComment;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity(name = "ENTITY_NAME")
public class ColumnCommentTest {

    @Column(nullable = false)
    @ColumnComment("comment1")
    private String fieldName1;

    @Column(nullable = false)
    @ColumnComment("comment2")
    private Integer fieldName2;

    @Column
    @ColumnComment("comment3")
    private Long fieldName3;

    @Column
    @ColumnComment("comment4")
    private LocalDate fieldName4;

    @Column
    @ColumnComment("comment5")
    private LocalDateTime fieldName5;

    @Column
    @ColumnComment("comment6")
    private Double fieldName6;

    @Column
    @ColumnComment("comment7")
    private Boolean fieldName7;

}
