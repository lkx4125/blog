package com.lrm.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author : LiKaixin
 * @number : phone 15179204125
 * @create : 2022-05-27 12:04
 * @Description :
 * 联表查询得到的多个对象封装成一个公共对象
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BlogQuery {

    private String title;
    private Long typeId;
    private boolean recommend;

}
