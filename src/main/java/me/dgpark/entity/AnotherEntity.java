package me.dgpark.entity;

import me.dgpark.comment.ColumnComment;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Table(name = "ANOTHER_TABLE_NAME")
@Entity
public class AnotherEntity {

    @Id
    @ColumnComment("일련번호")
    private Long id;

    @ColumnComment("이름")
    private String name;

    @ColumnComment("설명")
    private String description;

    @ColumnComment("조인 테이블 아이디")
    @JoinColumn(name = "column_comment_test_id")
    private ColumnCommentTest columnCommentTest;

}
