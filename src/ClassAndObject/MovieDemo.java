package ClassAndObject;
import java.util.Scanner;
class Movie{
    private String title;
    private String maleActor;
    private String femaleActor;
    private String genre;
    private float rating;
    private int budget;


    void setTitle(String title){
        this.title = title;
    }
    String getTitle(){
        return title;
    }


    void setMaleActor(String maleActor){
        this.maleActor = maleActor;
    }
    String getMaleActor(){
        return maleActor;
    }


    void setFemaleActor(String femaleActor){
        this.femaleActor = femaleActor;
    }
    String getFemaleActor(){
        return femaleActor;
    }


    void setGenre(String genre){
        this.genre = genre;
    }
    String getGenre(){
        return genre;
    }

    void setRating(float rating){
        this.rating = rating;
    }
    float getRating(){
        return rating;
    }


    void setBudget(int budget){
        this.budget = budget;
    }
    int getBudget(){
        return budget;
    }


    //Display method
    void display(){
        System.out.println("Title: " + title);
        System.out.println("Male: " + maleActor);
        System.out.println("Female: " + femaleActor);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating);
        System.out.println("Budget: $" + budget);
    }


}



public class MovieDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie movie = new Movie();

        System.out.print("Enter title: ");
        movie.setTitle(sc.next());

        System.out.print("Enter male actor: ");
        movie.setMaleActor(sc.next());

        System.out.print("Enter female actor: ");
        movie.setFemaleActor(sc.next());

        System.out.print("Enter genre: ");
        movie.setGenre(sc.next());

        System.out.print("Enter rating: ");
        movie.setRating(sc.nextFloat());

        System.out.print("Enter budget: ");
        movie.setBudget(sc.nextInt());


//        movie.setTitle("Mission: Impossible");
//        movie.setMaleActor("Tom Cruise");
//        movie.setFemaleActor("Emmanuelle Béart");
//        movie.setGenre("Action");
//        movie.setRating(3.5f);
//        movie.setBudget(291000000);


        movie.display();



    }
}