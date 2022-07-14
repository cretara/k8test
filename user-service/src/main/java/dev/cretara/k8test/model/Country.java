package dev.cretara.k8test.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "country")
public class Country {
    @Id
    @Column(name = "country_id", nullable = false)
    private Integer id;

    @Column(name = "country", nullable = false, length = 50)
    private String countryName;

    @Column(name = "last_update", nullable = false)
    private Instant lastUpdate;

}
