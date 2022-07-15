package dev.cretara.k8test.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;
import java.util.Arrays;

@Entity
@Getter
@Setter
@Table(name = "staff")
public class Staff {
    @Id
    @Column(name = "staff_id", nullable = false)
    private Integer id;

    @Column(name = "first_name", nullable = false, length = 45)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 45)
    private String lastName;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "address_id", nullable = false)
    private Address address;

    @Column(name = "email", length = 50)
    private String email;

    @Column(name = "store_id", nullable = false)
    private Integer storeId;

    @Column(name = "active", nullable = false)
    private Boolean active = false;

    @Column(name = "username", nullable = false, length = 16)
    private String username;

    @Column(name = "password", length = 40)
    private String password;

    @Column(name = "last_update", nullable = false)
    private Instant lastUpdate;

    @Column(name = "picture")
    private byte[] picture;

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                ", email='" + email + '\'' +
                ", storeId=" + storeId +
                ", active=" + active +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", lastUpdate=" + lastUpdate +
                ", picture=" + Arrays.toString(picture) +
                '}';
    }
}
