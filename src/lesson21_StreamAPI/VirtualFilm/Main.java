package lesson21_StreamAPI.VirtualFilm;

import lesson21_StreamAPI.RestoranMenu.Dish;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Film> filmCollection = Arrays.asList(
                new Film("The Dark Knight", "Christopher Nolan", "Action", 2008, 9.0),
                new Film("Inception", "Christopher Nolan", "Sci-Fi", 2010, 8.8),
                new Film("Interstellar", "Christopher Nolan", "Sci-Fi", 2014, 8.6),
                new Film("Parasite", "Bong Joon-ho", "Thriller", 2019, 8.6),
                new Film("Dune", "Denis Villeneuve", "Sci-Fi", 2021, 8.0),
                new Film("Mad Max: Fury Road", "George Miller", "Action", 2015, 8.1),
                new Film("Spirited Away", "Hayao Miyazaki", "Animation", 2001, 8.6),
                new Film("Pulp Fiction", "Quentin Tarantino", "Crime", 1994, 8.9)
        );
        System.out.println("1.\"Action\" janrına aid bütün filmləri siyahıya əlavə et.");
        List<Film> action = filmCollection.stream().filter(Film -> Film.getGenre().equals("Action")).collect(Collectors.toUnmodifiableList());
        System.out.println(action);
        System.out.println("2.2015-dən sonra çıxmış filmlərin yalnız adlarını əldə et.");
        filmCollection.stream().filter(Film-> Film.getReleaseYear()>2015).map(Film::getTitle).forEach(System.out::println);
        System.out.println("3.Bütün film kolleksiyasını buraxılış ilinə görə artan sırada düz.");
        filmCollection.stream().sorted(Comparator.comparingInt(Film::getReleaseYear)).forEach(System.out::println);
        System.out.println("4.Hər janr üçün ayrıca film siyahısı.");
        Map<String, List<Film>> map = filmCollection.stream().collect(Collectors.groupingBy(Film::getGenre));
        map.forEach((k,v)-> System.out.println("Janr: "+k+"\n Ona uygun filmler: "+v));
        System.out.println("5.Kolleksiyadakı bütün filmlər arasında reytinqi ən yüksək olan filmi tap.");
        Optional<Film> film = filmCollection.stream().max(Comparator.comparingDouble(Film::getRating));
        System.out.println(film);
    }
}
