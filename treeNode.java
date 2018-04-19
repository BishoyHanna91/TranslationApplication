import java.io.IOException;

/**
 * Created by bishoy on 2/23/2016.
 */
public class treeNode {
    private treeNode left;
    private treeNode right;
    private phrases phrase;
    private int height;


public treeNode()
{
    left = null;
    right = null;
    phrase = null;
    height = 0;
}
    public treeNode go_left()
    {
        return left;
    }
public treeNode go_right ()
{
    return right;
}
public void set_left(treeNode left2)
{
    left = left2;
}
public void set_right(treeNode right2)
{
    right= right2;
}
    public String get_phrase() {
        return phrase.get_word();

    }
    public  void  set_phrase(String phrase2,String temp_translated)

    {

     phrase = new phrases(phrase2, temp_translated);


    }
    public void display_phrase()
    {
        phrase.display_word();
    }
    public int get_height()
    {
        return height;
    }


}
