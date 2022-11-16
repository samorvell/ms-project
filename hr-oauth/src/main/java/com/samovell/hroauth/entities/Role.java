package com.samovell.hroauth.entities;

import lombok.Data;

import java.io.Serializable;

@Data
public class Role implements Serializable {
    public static final long serialVersionUID = 1L;

    private Long id;
    private String roleName;

}
