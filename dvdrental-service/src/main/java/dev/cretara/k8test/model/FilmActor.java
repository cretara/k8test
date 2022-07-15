package dev.cretara.k8test.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Getter
@Setter
@Table(name = "film_actor")
public class FilmActor {
    @EmbeddedId
    private FilmActorId id;

    @MapsId("actorId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "actor_id", nullable = false)
    private Actor actor;

    @MapsId("filmId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "film_id", nullable = false)
    private Film film;

    @Column(name = "last_update", nullable = false)
    private Instant lastUpdate;

    @Override
    public String toString() {
        return "FilmActor{" +
                "id=" + id +
                ", actor=" + actor +
                ", film=" + film +
                ", lastUpdate=" + lastUpdate +
                '}';
    }
}
