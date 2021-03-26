package nl.isaac.devblog.awselasticbeanstalkapp.startrek.api.data;

import java.util.ArrayList;
import java.util.List;

import nl.isaac.devblog.awselasticbeanstalkapp.startrek.api.models.Film;

public final class FilmsData {
    public static final List<Film> films;

    static {
        films = new ArrayList<>();
        initFilms();
    }

    private static void initFilms() {
        films.add(buildFilm("Star Trek: The Motion Picture", "December 7, 1979", "https://en.wikipedia.org/wiki/Star_Trek:_The_Motion_Picture"));
        films.add(buildFilm("Star Trek II: The Wrath of Khan", "June 4, 1982", "https://en.wikipedia.org/wiki/Star_Trek_II:_The_Wrath_of_Khan"));
        films.add(buildFilm("Star Trek III: The Search for Spock", "June 1, 1984", "https://en.wikipedia.org/wiki/Star_Trek_III:_The_Search_for_Spock"));
        films.add(buildFilm("Star Trek IV: The Voyage Home", "November 26, 1986", "https://en.wikipedia.org/wiki/Star_Trek_IV:_The_Voyage_Home"));
        films.add(buildFilm("Star Trek V: The Final Frontier", "June 9, 1989", "https://en.wikipedia.org/wiki/Star_Trek_V:_The_Final_Frontier"));
        films.add(buildFilm("Star Trek VI: The Undiscovered Country", "December 6, 1991", "https://en.wikipedia.org/wiki/Star_Trek_VI:_The_Undiscovered_Country"));
        films.add(buildFilm("Star Trek Generations", "November 18, 1994", "https://en.wikipedia.org/wiki/Star_Trek_Generations"));
        films.add(buildFilm("Star Trek: First Contact", "November 22, 1996", "https://en.wikipedia.org/wiki/Star_Trek:_First_Contact"));
        films.add(buildFilm("Star Trek: Insurrection", "December 11, 1998", "https://en.wikipedia.org/wiki/Star_Trek:_Insurrection"));
        films.add(buildFilm("Star Trek: Nemesis", "December 13, 2002", "https://en.wikipedia.org/wiki/Star_Trek:_Nemesis"));
        films.add(buildFilm("Star Trek", "May 8, 2009", "https://en.wikipedia.org/wiki/Star_Trek_(film)"));
        films.add(buildFilm("Star Trek Into Darkness", "May 16, 2013", "https://en.wikipedia.org/wiki/Star_Trek_Into_Darkness"));
        films.add(buildFilm("Star Trek Beyond", "July 22, 2016", "https://en.wikipedia.org/wiki/Star_Trek_Beyond"));
    }

    private static Film buildFilm(final String title, final String usReleaseDateText, final String wikipediaUrl) {
        return new Film().title(title).usReleaseDateText(usReleaseDateText).wikipediaUrl(wikipediaUrl);
    }

    private FilmsData() {
    }
}
