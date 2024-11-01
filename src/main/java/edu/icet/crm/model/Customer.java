package edu.icet.crm.model;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customer {
    private Integer id;
    private String name;
    private String email;
    private String address;
    private String tpno;
}
