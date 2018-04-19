import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
   Name: bishoy Hanna
   Date :
   Assignment 4
   Number of classes: 7
    this class is the tree class which stores the data of the phrase

 */
public class tree {
    // data member
    private treeNode root;
   /*
        Name :  constructor
        Input: nothing
        Output: nothing
     */
    public tree() {
        root = null;
    }
 /*
        Name :  get root
        Input: nothing
        Output: nothing
     */
    public treeNode get_root()
    {
        return root;
    }
    /*
        Name :  insert
        Input: string string
        Output: nothing
     */
    public treeNode insert(String get_value, String temp_translated, treeNode root2) {
       // make check if the get value is less than the root
        if (get_value.compareTo(root2.get_phrase()) < 0)
        {
            // if the left root is null
            if (root2.go_left() == null)
            {
                // creating new node of the tree
                treeNode new_tree = new treeNode();
                // setting the left of the tree to this new tree
                root2.set_left(new_tree);
                // setting the value to the left node of the tree
                root2.go_left().set_phrase(get_value,temp_translated);
                //return root2;
            } else
            {
                // call the fucntion recursively
                insert(get_value, temp_translated,root2.go_left());
                //return root2;
            }

        }
        // if the value of get value is larger than the root
        if (get_value.compareTo(root2.get_phrase()) > 0)
        {
            // make check if the right side is null
            if (root2.go_right() == null) {
                // creating new treenode
                treeNode new_tree2 = new treeNode();

                // set the right pointer to the new_tree2
                root2.set_right(new_tree2);

                // copy the data
                root2.go_right().set_phrase(get_value,temp_translated);
               // return root2;
            } else {
                // call the function recursively
                insert(get_value,temp_translated, root2.go_right());
                //root2 = balance_tree(root);

             //      return root2;
            }

        }
        return root2;
    }

    /*
        Name :  insert2
        Input: string string
        Output: nothing
     */
    public boolean insert2(String temp_value,String temp_translated) {
        // if root is pointing null
        if (root == null) {

            // creating new node
            treeNode new_node = new treeNode();

            // setting the root pointing to it
            root = new_node;
            // copy the data
            root.set_phrase(temp_value,temp_translated);

            // setting the left and the right pointer to null
            root.set_left(null);
            root.set_right(null);
            return true;

        } else {
            // call the function recursively
            root = insert(temp_value, temp_translated,root);

            return true;
        }


    }
   /*
        Name :  display
        Input: pointer
        Output: nothing
     */
    public void display(treeNode temp_root) {
        // if the root is null
        if (temp_root == null) {
            return;
        } else {
            // go left and display then go right
            display(temp_root.go_left());
            temp_root.display_phrase();
            display(temp_root.go_right());
        }
    }
    /*
        Name :  search
        Input: string and pointer
        Output: nothing
     */

    public boolean search(String search_phrase, treeNode search_root) {

        // check if the search root is null
        if (search_root == null) {
            return false;

        }
        // else if the i got the string which i am looking for
        else if (search_phrase.compareTo(search_root.get_phrase()) == 0) {
            // display it
            search_root.display_phrase();

            return true;

        }
        // if the value is smaller go to left and call the fucntion recursively
        else if (search_phrase.compareTo(search_root.get_phrase()) <= 0) {
            return search(search_phrase, search_root.go_left());
            //display2();

        } else {
            // go to the right
            return search(search_phrase, search_root.go_right());
            ///display2();
        }
    }
    /*
        Name :  search which is the wrapper
        Input: string
        Output: nothing
     */

    void search2(String search_phrase2) {
        search(search_phrase2, root);
    }

    public void display2() {

        display(root);

    }









      /*
        Name :  search get
        Input: pointer, string string
        Output: nothing
     */
    boolean search_get(String get_value, treeNode search_root, treeNode get_value_root)
    {
        // check if the search root is null
        if (search_root == null) {
            return true;
        }

        // check if the two strings are same
        else if (get_value.compareTo(search_root.get_phrase()) == 0) {
            // setting the get value root to search root
            get_value_root = search_root;

            // display phrase
            get_value_root.display_phrase();

            // get the phrase
            get_value_root.get_phrase();
            return true;

        }
         // go the left side if it is smaller
        else if (get_value.compareTo(search_root.get_phrase()) <= 0) {
            return search_get(get_value, search_root.go_left(),get_value_root);


        } else {
            // go to the right side
            return search_get(get_value, search_root.go_right(),get_value_root);

        }

    }
     /*
        Name :  retrieve which is wrapper function
        Input: string
        Output: nothing
     */
    void retrieve(String retrive_phrase)
    {
        // setting the retrieve to null
        treeNode retreive_ptr = null;

        // call this fucntion
        search_get(retrive_phrase,root,retreive_ptr);
    }
     /*
        Name :  remove all
        Input: pointer
        Output: nothing
     */
    void remove_All(treeNode deletePtr)
    {
        // check if deleteptr is null
        if(deletePtr ==null)
        {
            return;
        }
            // go left and delete and then go right and delete
            remove_All( deletePtr.go_left());
            remove_All(deletePtr.go_right());
            deletePtr.set_phrase("","");
            deletePtr = null;

    }
  /*
        Name :  remove all wrapper function
        Input: nothing
        Output: nothing
     */
    void remove_All2()
    {
        remove_All(root);
    }
     /*
        Name :  read from file
        Input: nothing
        Output: nothing
     */

    void readFromFile() throws FileNotFoundException, IOException {
        //System.out.println("dir: " + System.getProperty("user.dir"));
        try {
            // creating new object of buffer to read from file
            BufferedReader br = new BufferedReader(new FileReader("phrases.txt"));

            // creating string and setting it to null
            String line = null;

            // check if it is not the end of the file
            while ((line = br.readLine()) != null) {

                // split the string
                String arr[] = line.split("=");
                insert2(arr[0], arr[1]);

            }
            // close the file
            br.close();
        } catch (FileNotFoundException ex) {

            System.out.print("Unable to open file " + "phrases.txt");
        }
            catch (IOException ex) {
                System.out.print("error in reading file "+"phrases.txt");

        }
        //display2();
    }

}
