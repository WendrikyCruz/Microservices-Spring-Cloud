package com.wendrikycruz.hroauth.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class Role implements Serializable {

    private static final long serialVersionUID = 1l;

    private Long id;
    private String roleName;

}
