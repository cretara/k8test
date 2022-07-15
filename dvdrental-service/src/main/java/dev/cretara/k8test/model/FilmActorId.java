package dev.cretara.k8test.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Getter
@Setter
public class FilmActorId implements Serializable {

    @Serial
    private static final long serialVersionUID = -5665684522047043838L;
    @Column(name = "actor_id", nullable = false)
    private Integer actorId;

    @Column(name = "film_id", nullable = false)
    private Integer filmId;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) {
            return false;
        }
        FilmActorId entity = (FilmActorId) o;
        return Objects.equals(this.actorId, entity.actorId) &&
                Objects.equals(this.filmId, entity.filmId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actorId, filmId);
    }

    @Override
    public String toString() {
        return "FilmActorId{" +
                "actorId=" + actorId +
                ", filmId=" + filmId +
                '}';
    }
}
