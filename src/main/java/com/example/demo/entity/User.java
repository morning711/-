package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
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
  @TableName("user")
@ApiModel(value = "User对象", description = "")
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "userid", type = IdType.AUTO)
      private Integer userid;

    private String username;

    private Integer usertag;

    private String userphone;

    private String userstudynumber;

    private String userpassword;

    public User(Integer userid,Integer usertag){
        this.userid=userid;
        this.usertag=usertag;
    }


}
