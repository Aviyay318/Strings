public class Main {
    public static void main(String[] args) {
        String name = "asi cohen";

        String str1 = "";
            System.out.println(str1.length());
        //אורך המחרוזת
        System.out.println(name.length());

//        for (int i = 0; i < name.length(); i++) {
//            System.out.println(name.charAt(i) + " , ");
//        }

        //מיקום ספיציפי
        System.out.println(name.charAt(1));

        //תת מחרוזת

        String firstName = name.substring(0, 3);
        String lastName = name.substring(4);
        System.out.println(firstName + " ," + lastName);
       // String lastName = name.substring(4,name.length());


        String str2 = "1";
        boolean isC = str2.contains("a");
        if (str2.contains("abc")){
            System.out.println("yes");
        }
int index =  name.indexOf(" ");
        System.out.println(name.substring(0, index));

        String str = " i like java and ... jat";
        System.out.println(str.indexOf("ja",9)); //21
        System.out.println(str.indexOf("ja")); //8
        System.out.println(str.indexOf("jj")); //-1
        str= "i love apple and apple";

        System.out.println(str.replace("apple", "banana"));
        System.out.println(str.replaceFirst("apple", "banana"));
        System.out.println(str.replace("a", ""));
        
    }




}