package me.dgpark.entity;


import me.dgpark.comment.ColumnComment;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity(name = "ENTITY_NAME")
public class ColumnCommentTest {

    @ColumnComment("string1_comment")
    private String string1;

    @Column(nullable = false, length = 500)
    @ColumnComment("string2_comment")
    private String string2;

    @Lob
    @ColumnComment("string3_comment")
    private String string3;

    @Column(nullable = false)
    @ColumnComment("integer_comment")
    private Integer integer;

    @Column
    @ColumnComment("long1_comment")
    private Long long1;

    @ColumnComment("localDate_comment")
    private LocalDate localDate;

    @ColumnComment("localDateTime_comment")
    private LocalDateTime localDateTime;

    @ColumnComment("localTime_comment")
    private LocalTime localTime;

    @ColumnComment("double1_comment")
    private Double double1;

    @ColumnComment("boolean1_comment")
    private Boolean boolean1;

    @Enumerated(EnumType.STRING)
    @ColumnComment("columnEnum_comment")
    private ColumnEnum columnEnum;

}
