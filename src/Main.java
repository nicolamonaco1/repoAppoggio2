//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ripeti(10, (x) -> System.out.println("Hello World!"));
        ripeti(10, (x) -> System.out.print("*"));
        ripeti(10, (x) -> System.out.printf("-> %d\n", x));
        ripeti(10, (x) -> {
            for (int k = 0; k < x; k++) {
                System.out.printf("*");
            }
            System.out.println();
        });



    }

    public static void ripeti(int n, Task task){
        for(int i = 0; i < n; i++){
        task.esegui(i);
        }

    }
}