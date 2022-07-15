package dev.cretara.k8test.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FilmDTO {

    private Integer id;

    private String title;

    private String description;

    private Integer releaseYear;

}
