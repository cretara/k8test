package dev.cretara.k8test.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Getter
@Setter
@Table(name = "inventory")
public class Inventory {
    @Id
    @Column(name = "inventory_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "film_id", nullable = false)
    private Film film;

    @Column(name = "store_id", nullable = false)
    private Integer storeId;

    @Column(name = "last_update", nullable = false)
    private Instant lastUpdate;

    @Override
    public String toString() {
        return "Inventory{" +
                "id=" + id +
                ", film=" + film +
                ", storeId=" + storeId +
                ", lastUpdate=" + lastUpdate +
                '}';
    }
}
