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
public class FilmCategoryId implements Serializable {

    @Serial
    private static final long serialVersionUID = -1340803044026206913L;
    @Column(name = "film_id", nullable = false)
    private Integer filmId;

    @Column(name = "category_id", nullable = false)
    private Integer categoryId;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) {
            return false;
        }
        FilmCategoryId entity = (FilmCategoryId) o;
        return Objects.equals(this.filmId, entity.filmId) &&
                Objects.equals(this.categoryId, entity.categoryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filmId, categoryId);
    }

}
