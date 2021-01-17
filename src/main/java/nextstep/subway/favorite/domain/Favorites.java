package nextstep.subway.favorite.domain;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Embeddable
public class Favorites {

    @OneToMany(mappedBy = "member", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, orphanRemoval = true)
    private List<Favorite> favorites = new ArrayList<>();

    public void addFavorite(Favorite favorite) {
        favorites.add(favorite);
    }

    public List<Favorite> getFavorites() {
        return favorites;
    }

    public void removeFavorite(Favorite favorite) {
        favorites.remove(favorite);
    }
}
