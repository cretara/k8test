package dev.cretara.k8test.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Getter
@Setter
@Table(name = "store")
public class Store {
    @Id
    @Column(name = "store_id", nullable = false)
    private Integer id;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "manager_staff_id", nullable = false)
    private Staff managerStaff;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "address_id", nullable = false)
    private Address address;

    @Column(name = "last_update", nullable = false)
    private Instant lastUpdate;

    @Override
    public String toString() {
        return "Store{" +
                "id=" + id +
                ", managerStaff=" + managerStaff +
                ", address=" + address +
                ", lastUpdate=" + lastUpdate +
                '}';
    }
}
