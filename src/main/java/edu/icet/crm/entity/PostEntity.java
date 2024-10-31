package edu.icet.crm.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.IdGeneratorType;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Setter
@Getter
@ToString
@Table(name = "post")
public class PostEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String naem;
    private String titel;
    private String description;
    private Double price;
   // @Lob
//    private MultipartFile img;
}
