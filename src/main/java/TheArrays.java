//Arrays come from this package
import java.util.Arrays;

public class TheArrays {

    public static void main(String[] args) {
        //to create the array you need to specify the data type and with []
        //Within the array must specify the amount in the array
        String[] colors = new String[5];
        //Assigning the elements to the index's
        colors[0] = "purple";
        colors[1] = "blue";
        //printing the array. For this instance must identify as an array and since its a string it will be a toString
        System.out.println(Arrays.toString(colors));

        //Array index always start at 0
        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);
        System.out.println(colors[4]);

        colors[2] = "yellow";
        System.out.println(Arrays.toString(colors));

        //this method when you know what elements the array will have
        int[] numbers = {100, 200};

        //this loop gives access to the index value
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        //If you want to loop in reverse
        for (int i = colors.length - 1; i >= 0; i--) {
            System.out.println(colors[i]);
        }
        //enhanced for loop
        for (String color : colors) {
            System.out.println(color);
        }
        Arrays.stream(colors).forEach(System.out::println);

        //Be aware of Arrays. for it has a lot of utility methods


    }
}
