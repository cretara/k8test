package dev.cretara.k8test.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "city")
public class City {
    @Id
    @Column(name = "city_id", nullable = false)
    private Integer id;

    @Column(name = "city", nullable = false, length = 50)
    private String cityName;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "country_id", nullable = false)
    private Country country;

    @Column(name = "last_update", nullable = false)
    private Instant lastUpdate;

}
