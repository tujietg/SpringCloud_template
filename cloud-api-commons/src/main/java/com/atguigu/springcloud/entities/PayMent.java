package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author tujietg
 * @date 5/11/20 3:32 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PayMent {

    private Long id;
    private String serial;

}
