import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/*

  Name: Bishoy Hanna
   Date: 3/6/2016
   Assignment 5
   number of classes: 10
   this is the manager class that manages all the classes
 */
public class manager {
    private LLLarray la;
    private tree t;
    private LLL l;
    private int choice;
    private String get_translatedWord;
    private String choice2;

    /*
         name of function: constructor
         Input: nothing
         output: nothing
      */
    public manager() {
        // creating new object of the LLLarray and tree
        la = new LLLarray();
        t = new tree();
        l = new LLL();
        // setting choice to zero
        choice = 0;
        // making the gettranslated equlas null
        get_translatedWord = null;
        choice2 = null;
    }

    /*
           name of function: manageAll
           Input: nothing
           output: nothing
        */
    public void manageAll() throws IOException {
        la.readFromFile();
        t.readFromFile();
        l.readFromFile();

     do{
        // printing the menu
        System.out.println("please, enter 1 to translate words which you want into arabic language");
        System.out.println();
        System.out.println("please, enter 2 to translate phrase which you want into arabic language");
        System.out.println();
        System.out.println("please, enter 3 to translate numbers which you want into germany language");
        System.out.println();

        Scanner input = new Scanner(System.in);
        // getting the choice from the user
        choice = input.nextInt();
        input.nextLine();



            switch (choice) {
                case 1:
                    System.out.println("enter the word");
                    // getting the string
                    get_translatedWord = input.next();
                    input.nextLine();
                    // readfrom the file
                    //la.readFromFile();

                    // search it
                    la.search_noun2(get_translatedWord);

                    break;
                case 2:
                    System.out.println("enter the phrase");
                    // getting the string
                    get_translatedWord = input.nextLine();
                    System.out.println("Your phrase: " + get_translatedWord);
                    // readfromfile

                    //t.readFromFile();

                    // search the string
                   // t.search2(get_translatedWord);
                      t.retrieve(get_translatedWord);
                    // do the AVL balance




                    break;
                case 3:

                    System.out.println("enter the number");

                    // getting the string
                    get_translatedWord = input.next();

                    // search the string
                    l.search_number2(get_translatedWord);


                    break;

                default:
                    System.out.println("error");
            }
            System.out.println("press y to continue");
            choice2 = input.next();


         }while(choice2.compareTo("y")==0 );
    }
}
