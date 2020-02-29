package com.PMS.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author jianan
 * @since 2020-02-29
 */
public class Machine implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Machine{" +
            "name=" + name +
        "}";
    }
}
