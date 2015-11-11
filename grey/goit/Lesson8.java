package grey.goit;


/**
 * Created by grey on 26.10.2015.
 */
public class Lesson8 {

    public class Cat{

    private String name = "String";

    }
    public static void main(String[] args) {
        Lesson8 lesson8 = new Lesson8();
        Lesson8.Cat cat = lesson8.new Cat();
       String s =  cat.name;


        System.out.println(cat.name);

        cat.name="String Modyfi";

        System.out.println(cat.name);


    }


}
