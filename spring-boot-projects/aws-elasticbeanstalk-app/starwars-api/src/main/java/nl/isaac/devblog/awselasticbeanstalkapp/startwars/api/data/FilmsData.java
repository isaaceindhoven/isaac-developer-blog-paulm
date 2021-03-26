package nl.isaac.devblog.awselasticbeanstalkapp.startwars.api.data;

import java.util.ArrayList;
import java.util.List;

import nl.isaac.devblog.awselasticbeanstalkapp.starwars.api.models.Film;

public final class FilmsData {
    public static final List<Film> films;

    static {
        films = new ArrayList<>();
        initFilms();
    }

    private static void initFilms() {
        films.add(buildFilm("Episode I – The Phantom Menace", "May 19, 1999", "https://en.wikipedia.org/wiki/Star_Wars:_Episode_I_–_The_Phantom_Menace"));
        films.add(buildFilm("Episode II – Attack of the Clones", "May 16, 2002", "https://en.wikipedia.org/wiki/Star_Wars:_Episode_II_–_Attack_of_the_Clones"));
        films.add(buildFilm("Episode III – Revenge of the Sith", "May 19, 2005", "https://en.wikipedia.org/wiki/Star_Wars:_Episode_III_–_Revenge_of_the_Sith"));
        films.add(buildFilm("Episode IV – A New Hope", "May 25, 1977", "https://en.wikipedia.org/wiki/Star_Wars_(film)"));
        films.add(buildFilm("Episode V – The Empire Strikes Back", "May 21, 1980", "https://en.wikipedia.org/wiki/The_Empire_Strikes_Back"));
        films.add(buildFilm("Episode VI – Return of the Jedi", "May 25, 1983", "https://en.wikipedia.org/wiki/Return_of_the_Jedi"));
        films.add(buildFilm("Episode VII – The Force Awakens", "December 18, 2015", "https://en.wikipedia.org/wiki/Star_Wars:_The_Force_Awakens"));
        films.add(buildFilm("Episode VIII – The Last Jedi", "December 15, 2017", "https://en.wikipedia.org/wiki/Star_Wars:_The_Last_Jedi"));
        films.add(buildFilm("Episode IX – The Rise of Skywalker", "December 20, 2019", "https://en.wikipedia.org/wiki/Star_Wars:_The_Rise_of_Skywalker"));
        films.add(buildFilm("Rogue One", "December 16, 2016", "https://en.wikipedia.org/wiki/Rogue_One"));
        films.add(buildFilm("Solo", "May 25, 2018", "https://en.wikipedia.org/wiki/Solo:_A_Star_Wars_Story"));
    }

    private static Film buildFilm(final String title, final String usReleaseDateText, final String wikipediaUrl) {
        return new Film().title(title).usReleaseDateText(usReleaseDateText).wikipediaUrl(wikipediaUrl);
    }

    private FilmsData() {
    }
}
