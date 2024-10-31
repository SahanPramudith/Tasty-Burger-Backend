package edu.icet.crm.model;

import jakarta.persistence.Lob;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PostModel {
    private Integer id;
    private String naem;
    private String titel;
    private String description;
    private Double price;
//    @Lob
    //private MultipartFile img;
}
