package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author Always
 * @since 2022-07-31
 */
@Getter
@Setter
  @TableName("book")
@ApiModel(value = "Book对象", description = "")
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "bookid", type = IdType.AUTO)
      private Integer bookid;

    private String bookname;

    private Integer bookclass;

    private String bookauthor;

    private String bookdes;

    private Integer booktotalnum;

    private Integer bookcurnum;


}
