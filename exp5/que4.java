import java.util.*;

class Production {
    String title;
    String director;
    String writer;
    static int collection;

    // Constructor for Production class
    Production(String title, String director, String writer) {
        setTitle(title);
        setDirector(director);
        setWriter(writer);
    }

    // Getter and Setter methods
    void setTitle(String title) {
        this.title = title;
    }

    String getTitle() {
        return title;
    }

    void setDirector(String director) {
        this.director = director;
    }

    String getDirector() {
        return director;
    }

    void setWriter(String writer) {
        this.writer = writer;
    }

    String getWriter() {
        return writer;
    }

    // toString method to display details of the Production class
    public String toString() {
        return "Title: " + getTitle() + ", Director: " + getDirector() + ", Writer: " + getWriter();
    }
}

class Play extends Production {
    private static int performances = 0;
    int seats1;

    // Constructor for Play class
    Play(String title, String director, String writer, int seats1) {
        super(title, director, writer);
        incrementPerformances();
        this.seats1 = seats1;
        collectionPlay(seats1);
    }

    // toString method to display details of the Play class
    public String toString() {
        return super.toString();
    }

    // Method to increment performances and calculate collection for Play
    void collectionPlay(int seats1) {
        collection = 500 * seats1;
    }

    //method to return collection 
    int collectionPlay() {
        return collection;
    }

    // Method to increment performances for Play
    public void incrementPerformances() {
        performances++;
    }

    // Static method to return total performances for Play
    public static int performancesReturn() {
        return performances;
    }
}

class Musical extends Play {
    String composer;
    String lyricist;
    int seats2;

    // Constructor for Musical class
    Musical(String title, String director, String writer, String composer, String lyricist, int seats1, int seats2) {
        super(title, director, writer, seats1);
        this.seats2 = seats2;
        collectionMusical2(seats2);
        setComposer(composer);
        setLyricist(lyricist);
    }

    // Getter and Setter methods for Musical class
    void setComposer(String composer) {
        this.composer = composer;
    }

    String getComposer() {
        return composer;
    }

    void setLyricist(String lyricist) {
        this.lyricist = lyricist;
    }

    String getLyricist() {
        return lyricist;
    }

    // toString method to display details of the Musical class
    public String toString() {
        return super.toString() + ", Composer: " + getComposer() + ", Lyricist: " + getLyricist();
    }

    // Method to calculate collection for Musical
    void collectionMusical2(int seats2) {
        collection = 800 * seats2;
    }

    // Overloaded method to return collection for Musical
    int collectionMusical2() {
        return collection;
    }
}

class Test3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Play[] play = new Play[3];
        Musical[] mus = new Musical[2];

        // Input details for Play objects
        for (int i = 0; i < 3; i++) {
            System.out.println("DETAILS OF THE FILM" + (i + 1) + ":");
            System.out.print("Enter the Title of the film: ");
            String title = sc.next();
            System.out.print("Enter the Director of the film: ");
            String director = sc.next();
            System.out.print("Enter the Writer of the film: ");
            String writer = sc.next();
            System.out.print("Enter the no. of seats: ");
            int seats1 = sc.nextInt();
            System.out.println("");

            play[i] = new Play(title, director, writer, seats1);
        }
        System.out.println("");

        // Input details for Musical objects
        for (int i = 0; i < 2; i++) {
            System.out.println("DETAILS OF THE SONG" + (i + 1) + ":");
            System.out.print("Enter the Title of the song: ");
            String title = sc.next();
            System.out.print("Enter the Director of the song: ");
            String director = sc.next();
            System.out.print("Enter the Writer of the song: ");
            String writer = sc.next();
            System.out.print("Enter the Composer of the song: ");
            String composer = sc.next();
            System.out.print("Enter the Lyricist of the song: ");
            String lyricist = sc.next();
            System.out.print("Enter the no. of seats: ");
            int seats2 = sc.nextInt();

            mus[i] = new Musical(title, director, writer, composer, lyricist, 0, seats2);
            System.out.println("");
        }
        System.out.println("");

        // Display details of Play objects
        for (int i = 0; i < 3; i++) {
            System.out.println("DETAILS OF THE FILM" + (i + 1) + ":");
            System.out.println(play[i].toString());
            System.out.println("");
        }

        // Display details of Musical objects
        for (int i = 0; i < 2; i++) {
            System.out.println("DETAILS OF THE SONG" + (i + 1) + ":");
            System.out.println(mus[i].toString());
            System.out.println("");
        }

        // Calculate total collection and display total performances
        int totalCollection = mus[0].collectionMusical2() + mus[1].collectionMusical2() + play[0].collectionPlay()
                + play[1].collectionPlay() + play[2].collectionPlay();
        System.out.println("Total no. of performances: " + play[2].performancesReturn());
        System.out.println("Box office collection: " + totalCollection);
    }
}
