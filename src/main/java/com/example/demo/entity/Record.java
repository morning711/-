package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
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
  @TableName("record")
@ApiModel(value = "Record对象", description = "")
public class Record implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "userid", type = IdType.AUTO)
      private Integer userid;

    private Integer bookid;

    private LocalDateTime borrowtime;

    private LocalDateTime returntime;

    private Integer state;


}
