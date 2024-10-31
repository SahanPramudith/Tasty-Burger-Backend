package edu.icet.crm.model;

import jakarta.persistence.Lob;

public class Post {
    private Integer id;
    private String name;
    @Lob
    private Byte img;
    private String titel;
    private Double price;

}
