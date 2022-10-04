import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        //When working with lists should identify what element you want your list to work with
        //If you want to add a value to your list
        colors.add("blue");
        colors.add("purple");
        colors.add("yellow");
        //If you want to know the size of the list
        System.out.println(colors.size());
        //If you want to check whether it contains something
        System.out.println(colors.contains("yellow"));
        System.out.println(colors);

        //if you want to loop through the array
        for (String color : colors) {
            System.out.println(color);
        }
        colors.forEach(System.out::println);

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
    }
}
