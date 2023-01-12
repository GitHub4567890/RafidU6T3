public class TheBestRunnerClass {
    public static void main(String[] args) {

        String[] strings5 = {"HELLO", "Halo", "Adam", "what", "booyAH", "WHY?"};
        String[] lower = ArrayAlgorithms.makeLowercase(strings5);
        for (String str : lower) {
            System.out.print(str + " ");
        }
        System.out.println("\n\noriginal array not modified:");
        for (String str : strings5) {
            System.out.print(str + " ");
        }
        System.out.println();



    }
}



//    String[] names = {"Mateo", "Sofia", "David", "Ziggy", "Charlie"};
//        for (String nam : names) {
//                System.out.println(nam);
//                }
//
//                System.out.println();
//
//                int[] nums = {8, 4, 10, 5, 7, 11, 3, 9, 23, 6};
//                int sum = 0;
//                for (int n : nums) {
//                sum += n;
//                }
//                System.out.println(sum);
//
//                System.out.println();
//
//                Person p1 = new Person("Adam", 12);
//                Person p2 = new Person("Barb", 15);
//                Person p3 = new Person("Cathy", 14);
//                Person p4 = new Person("Fred", 16);
//
//                Person[] people = {p1, p2, p3, p4};
//                for (Person human : people) {
//                human.introduce();
//                }
//
//                System.out.println();
//
//                int[] grades = {75, 80, 82, 78, 92};
//                for (int i = 0; i <= grades.length - 1; i++) {
//                grades[i] += 5;
//                }
//                for (int grade : grades) {
//                System.out.println(grade);
//                }
//
//                System.out.println();
//
////        int[ ] values = {6, 2, 1, 7, 12, 5};
////
////        // Rewrite this loop using an enhanced for loop, and run to confirm
////        for (int value : values) {
////            if (value % 2 == 0) {
////                System.out.println(value + " is even!");
////            }
////        }
//
//                System.out.println();
//
//                int[ ] values = {6, 2, 1, 7, 12, 5};
//
////        // triple each element in the array
////        for (int val : values) {
////            val *= 3;
////        }
////
////        // print out array to see if they changed
////        System.out.println("Array after the loop: ");
////        for (int val : values) {
////            System.out.print(val + " ");
////        }
//
//                for (int i = 0; i <= values.length - 1; i++) {
//                values[i] *= 3;
//                }
//
//                // print out array to see if they changed
//                System.out.println("Array after the loop: ");
//                for (int val : values) {
//                System.out.print(val + " ");
//                }
