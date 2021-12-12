package com.kazi.user.valueobject;

import com.kazi.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentResponseVO {

    private User user;
    private Department department;
}
