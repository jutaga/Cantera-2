package com.company;
import java.util.*;


/**
 * Main class,
 *  Contains the main logic process , applying a class called Songs and some extra methods
 *
 * @version 1.07.003 2022-06-03.
 *
 * @author Cristian Gallego Hurtado - cris.gahur@hotmail.com
 * @author Juan Pablo Tabares Gallego - juancho9615@hotmail.com
 *
 * @since 1.01.001
 */

public class Main {

    /**
     * Declaration of attributes used in the methods and scanner of inputs.
     */
    static Scanner getString = new Scanner(System.in);
    static Scanner getInt = new Scanner(System.in);
    static public int option;
    static private boolean continues = true , continues1 = true;
    static public String option1, playlistName;
    public static Songs[] playList = new Songs[5];

    public static void main(String[] args) {

        Songs song1 = new Songs("GASOLINA", 2,20,2,"2002","Latin music" , 5 , "reggaeton" , "/path/img/cover1.jpg" );
        Songs song2 = new Songs("EL CANTANTE", 2,12,2,"1957","Salsa music to enjoy",4,"salsa", "/path/img/cover2.jpg");
        Songs song3 = new Songs("BEAT IT", 2,2,10,"1969","Pop music to dance with friends",3,"pop","/path/img/cover3.jpg");
        Songs song4 = new Songs("YOUR LOVE", 2,20,3,"1960","Rock music to enjoy with friends",3,"rock", "/path/img/cover4.jpg");
        Songs song5 = new Songs("PLASTICO", 2,6,12,"1947","Salsa music to enjoy.", 6,"salsa","/path/img/cover5.jpg");

        List<Songs> list= Arrays.asList(song1, song2, song3, song4, song5);
        ArrayList<String> filteredResult = new ArrayList<>();


        do {
        System.out.println("WELCOME TO THE APP MUSIC, PLEASE CHOOSE WHAT YOU WANT TO DO ");
        System.out.println("1. SHOW ME THE MAIN LIBRARY");
        System.out.println("2. CREATE A NEW PLAYLIST");
        System.out.println("3. SHOW ME A PLAYLIST");
        System.out.println("4. EXIT");
        option= getInt.nextInt();

            switch (option) {
                case 1 -> {
                    //MAIN LIBRARY
                    songsList("1. ", song1.getName(), song1.getDuration(), song1.genre, song1.date);
                    songsList("2. ", song2.getName(), song2.getDuration(), song2.genre, song2.date);
                    songsList("3. ", song3.getName(), song3.getDuration(), song3.genre, song3.date);
                    songsList("4. ", song4.getName(), song4.getDuration(), song4.genre, song4.date);
                    songsList("5. ", song5.getName(), song5.getDuration(), song5.genre, song5.date);
                    System.out.println("CHOOSE WHAT DO YOU WOULD TO FILTER:");
                    System.out.println("1. GENRE");
                    System.out.println("2. YEAR");
                    System.out.println("3. SORT BY DURATION");
                    System.out.println("4. SORT BY DATE");
                    System.out.println("5. RETURN");
                    option = getInt.nextInt();
                    switch (option) {
                        case 1 -> {
                            System.out.println("WRITE THE GENRE:");
                            option1 = getString.next();
                            for (Songs songs : list) {
                                if (songs.genre.equals(option1)) {

                                    filteredResult.add("Name: " + songs.getName() + "\n" + "Duration: " + songs.getDuration() + " Min " + "\n" + "Year: " + songs.date + "\n \n");
                                } else {
                                    System.out.println("REMEMBER WRITE THE GENRE WITH LOWERCASE");
                                }
                            }
                            System.out.println("Filtered Result:\n" + filteredResult);
                        }
                        case 2 -> {
                            System.out.println("WRITE THE YEAR:");
                            option1 = getInt.next();
                            for (Songs songs : list) {
                                if (songs.getYear().equals(option1)) {

                                    filteredResult.add("Name: " + songs.getName() + "\n" + "Duration: " + songs.getDuration() + " Min " + "\n" + "Year: " + songs.date + "\n \n");
                                }
                            }
                            System.out.println("Filtered Result:\n" + filteredResult);
                        }
                        case 3 -> {
                            songsList("1. ", song5.getName(), song5.getDuration(), song5.genre, song5.date);
                            songsList("2. ", song1.getName(), song1.getDuration(), song1.genre, song1.date);
                            songsList("3. ", song2.getName(), song2.getDuration(), song2.genre, song2.date);
                            songsList("4. ", song3.getName(), song3.getDuration(), song3.genre, song3.date);
                            songsList("5. ", song4.getName(), song4.getDuration(), song4.genre, song4.date);
                        }
                        case 4 -> {
                            System.out.println("IT'S ORDER FROM THE MOST RECENT UNTIL THE OLDEST");
                            songsList("1. ", song1.getName(), song1.getDuration(), song1.genre, song1.date);
                            songsList("2. ", song3.getName(), song3.getDuration(), song3.genre, song3.date);
                            songsList("3. ", song4.getName(), song4.getDuration(), song4.genre, song4.date);
                            songsList("4. ", song2.getName(), song2.getDuration(), song2.genre, song2.date);
                            songsList("5. ", song5.getName(), song5.getDuration(), song5.genre, song5.date);
                        }
                        case 5 -> continues = true;

                        default -> System.out.println("OPTION NO VALID");

                    }
                }
                case 2 -> {
                    System.out.println("WRITE YOURS LIBRARY'S NAME");
                    playlistName = getString.nextLine();

                    while (continues1) {
                        System.out.println("CHOOSE THE ONES TO ADD by number: ");
                        option = chosenSong(song1.getName(),song2.getName(),song3.getName(),song4.getName(),song5.getName());
                        if (option == 0) {
                            continues1 = false;
                        } else {
                            playList[option - 1] = list.get(option - 1);
                        }
                    }
                }
                case 3 -> {
                    System.out.println("PLAYLIST: " + playlistName);
                    for (Songs songs : playList) {

                        if (songs != null) {
                            System.out.println(songs.getName() + " duration: " + songs.getDuration() + " Min" + " year: " + songs.getYear());
                        }
                    }
                }
                case 4 -> {
                    System.out.println("SERVER DISCONNECTED");
                    continues = false;
                }

                default -> System.out.println("OPTION NO VALID");
            }

        }while(continues);

    }

    /**
     *
     *This method help to choose the songs the user would to add at the playlist, order by date and duration.
     *
     * @param num: param created to assign order to the list.
     * @param name: name of the song
     * @param time: duration of the song
     * @param type: Song's genre.
     * @param day Song's date.
     */
    private static void songsList(String num,String name , float time, String type, String day){
        System.out.println(num + name + " \n  Duration: " + time + "  Min" + " \n  Genre: " + type + " \n  Date " + day);
    }

    /**
     *Method to choose a song
     * @param name1 String to change for the first song's name
     * @param name2 String to change for the first song's name
     * @param name3 String to change for the first song's name
     * @param name4 String to change for the first song's name
     * @param name5 String to change for the first song's name
     * @return returns an int value to know the chosen song
     */
    private static int chosenSong(String name1, String name2, String name3 , String name4, String name5){
           System.out.println("0. NO ADD MORE");
            System.out.println("1. " + name1);
            System.out.println("2. " + name2);
            System.out.println("3. " + name3);
            System.out.println("4. " + name4);
            System.out.println("5. " + name5);
            return getInt.nextInt();
    }
}
