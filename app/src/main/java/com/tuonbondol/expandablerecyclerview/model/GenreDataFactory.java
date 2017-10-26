package com.tuonbondol.expandablerecyclerview.model;

import com.tuonbondol.expandablerecyclerview.R;

import java.util.Arrays;
import java.util.List;

/****
 *
 * @author TUON BONDOL
 *
 */

public class GenreDataFactory {

    public static List<Genre> makeGenres() {
        return Arrays.asList(makeRockGenre(),
                makeJazzGenre(),
                makeClassicGenre(),
                makeSalsaGenre(),
                makeBluegrassGenre());
    }

    private static Genre makeRockGenre() {
        return new Genre("Rock", makeRockArtists(), R.drawable.ic_electric_guitar);
    }

    private static List<Artist> makeRockArtists() {
        Artist queen = new Artist("Queen", true);
        Artist styx = new Artist("Styx", false);
        Artist reoSpeedwagon = new Artist("REO Speedwagon", false);
        Artist boston = new Artist("Boston", true);

        return Arrays.asList(queen, styx, reoSpeedwagon, boston);
    }

    private static Genre makeJazzGenre() {
        return new Genre("Jazz", makeJazzArtists(), R.drawable.ic_saxaphone);
    }

    private static List<Artist> makeJazzArtists() {
        Artist milesDavis = new Artist("Miles Davis", true);
        Artist ellaFitzgerald = new Artist("Ella Fitzgerald", true);
        Artist billieHoliday = new Artist("Billie Holiday", false);

        return Arrays.asList(milesDavis, ellaFitzgerald, billieHoliday);
    }

    private static Genre makeClassicGenre() {
        return new Genre("Classic", makeClassicArtists(), R.drawable.ic_violin);
    }

    private static List<Artist> makeClassicArtists() {
        Artist beethoven = new Artist("Ludwig van Beethoven", false);
        Artist bach = new Artist("Johann Sebastian Bach", true);
        Artist brahms = new Artist("Johannes Brahms", false);
        Artist puccini = new Artist("Giacomo Puccini", false);

        return Arrays.asList(beethoven, bach, brahms, puccini);
    }

    private static Genre makeSalsaGenre() {
        return new Genre("Salsa", makeSalsaArtists(), R.drawable.ic_maracas);
    }

    private static List<Artist> makeSalsaArtists() {
        Artist hectorLavoe = new Artist("Hector Lavoe", true);
        Artist celiaCruz = new Artist("Celia Cruz", false);
        Artist willieColon = new Artist("Willie Colon", false);
        Artist marcAnthony = new Artist("Marc Anthony", false);

        return Arrays.asList(hectorLavoe, celiaCruz, willieColon, marcAnthony);
    }

    private static Genre makeBluegrassGenre() {
        return new Genre("Bluegrass", makeBluegrassArtists(), R.drawable.ic_banjo);
    }

    private static List<Artist> makeBluegrassArtists() {
        Artist billMonroe = new Artist("Bill Monroe", false);
        Artist earlScruggs = new Artist("Earl Scruggs", false);
        Artist osborneBrothers = new Artist("Osborne Brothers", true);
        Artist johnHartford = new Artist("John Hartford", false);

        return Arrays.asList(billMonroe, earlScruggs, osborneBrothers, johnHartford);
    }
}

