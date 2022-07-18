package beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class BeanTest{

    public static void main(String[] args) {
//        Artist + Album
    Artist JCole = new Artist(17,false, "JCole", "English");
    Album TheOffSeason = new Album(16, JCole, "The Off-Season", new Date("05/14/2021"), 1.0, "Rap");

        System.out.println(TheOffSeason.getName() + " by " + TheOffSeason.getArtist().getName() + "\n" + "Release Date: " + TheOffSeason.getReleaseDate() + "\n" + "Genre: " + TheOffSeason.getGenre() + "\n" + "Album Sales: " + TheOffSeason.getSales() + "\n");


//        Author + Quote
        Author Romeo = new Author(1, "Romeo", "Cohens");
        Author Jack = new Author(2, "Jacqueline", "Camacho");
        Quote quote1 = new Quote(1, "Failure is a part of Success!", Romeo);
        Quote quote2 = new Quote(2, "Kindness is understandable in all languages.", Jack);
        Quote quote3 = new Quote(3, "Be Humble or Be Humbled", Romeo);

        ArrayList<Quote> quotes = new ArrayList<>();
        quotes.add(quote1);
        quotes.add(quote2);
        quotes.add(quote3);

        for (Quote quote : quotes) {
            System.out.println(quote.getAuthor().getFirstName() + quote.getAuthor().getLastName() + " ~ " + quote.getContent());
        }
    }
}
