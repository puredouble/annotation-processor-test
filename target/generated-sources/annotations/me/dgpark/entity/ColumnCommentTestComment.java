package me.dgpark.entity;

import java.lang.String;

public class ColumnCommentTestComment {
  public String local_date_time = "ALTER TABLE `ENTITY_NAME` CHANGE `local_date_time` `local_date_time` DATETIME COMMENT 'localDateTime_comment'";

  public String local_time = "ALTER TABLE `ENTITY_NAME` CHANGE `local_time` `local_time` TIME COMMENT 'localTime_comment'";

  public String string2 = "ALTER TABLE `ENTITY_NAME` CHANGE `string2` `string2` NOT NULL VARCHAR (500) COMMENT 'string2_comment'";

  public String double1 = "ALTER TABLE `ENTITY_NAME` CHANGE `double1` `double1` DOUBLE COMMENT 'double1_comment'";

  public String boolean1 = "ALTER TABLE `ENTITY_NAME` CHANGE `boolean1` `boolean1` BIT COMMENT 'boolean1_comment'";

  public String string3 = "ALTER TABLE `ENTITY_NAME` CHANGE `string3` `string3` LONGTEXT COMMENT 'string3_comment'";

  public String long1 = "ALTER TABLE `ENTITY_NAME` CHANGE `long1` `long1` BIGINT (20) COMMENT 'long1_comment'";

  public String column_enum = "ALTER TABLE `ENTITY_NAME` CHANGE `column_enum` `column_enum` VARCHAR (255) COMMENT 'columnEnum_comment'";

  public String string1 = "ALTER TABLE `ENTITY_NAME` CHANGE `string1` `string1` VARCHAR (255) COMMENT 'string1_comment'";

  public String integer = "ALTER TABLE `ENTITY_NAME` CHANGE `integer` `integer` NOT NULL INT (11) COMMENT 'integer_comment'";

  public String local_date = "ALTER TABLE `ENTITY_NAME` CHANGE `local_date` `local_date` DATE COMMENT 'localDate_comment'";
}
