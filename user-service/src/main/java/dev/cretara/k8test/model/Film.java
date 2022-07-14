package dev.cretara.k8test.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "film")
public class Film {
    @Id
    @Column(name = "film_id", nullable = false)
    private Integer id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description")
    @Type(type = "org.hibernate.type.TextType")
    private String description;

    @Column(name = "release_year")
    private Integer releaseYear;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "language_id", nullable = false)
    private Language language;

    @Column(name = "rental_duration", nullable = false)
    private Integer rentalDuration;

    @Column(name = "rental_rate", nullable = false, precision = 4, scale = 2)
    private BigDecimal rentalRate;

    @Column(name = "length")
    private Integer length;

    @Column(name = "replacement_cost", nullable = false, precision = 5, scale = 2)
    private BigDecimal replacementCost;

    @Column(name = "last_update", nullable = false)
    private Instant lastUpdate;


/*
    TODO [JPA Buddy] create field to map the 'rating' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "rating", columnDefinition = "mpaa_rating")
    private Object rating;
*/
/*
    TODO [JPA Buddy] create field to map the 'special_features' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "special_features", columnDefinition = "text[]")
    private Object specialFeatures;
*/
/*
    TODO [JPA Buddy] create field to map the 'fulltext' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "fulltext", columnDefinition = "tsvector not null")
    private Object fulltext;
*/
}
