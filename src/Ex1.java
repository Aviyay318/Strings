import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter first name");
        String firstName = scanner.nextLine();

        System.out.println("please enter last name");
        String lastName = scanner.nextLine();

        int number = isEquals();
        System.out.println(number);

        System.out.println(isEquals());

//        System.out.println(createFullName(firstName , lastName));
//
//        String fullName= createFullName(firstName , lastName);
//        System.out.println(fullName);
    }
//
//    כתבו פונקציה המקבלת שתי מחרוזות כפרמטרים: firstName ו-lastName
//    שמייצגות את השם הפרטי ואת שם המשפחה של המשתמש בהתאמה.
//    המחרוזת תחזיר מחרוזת שהיא השם המלא של המשתמש,
//    כך שהשם הפרטי יופיע קודם, ואז רווח, ואז שם המשפחה.



    public static String createFullName(String firstname, String lastname){
        String fullName = firstname + "  " + lastname;
        return fullName;
//        return  firstname + "  " + lastname;
    }

//
//    כתבו פונקציה המקבלת כפרמטרים שתי
//    מחרוזות ומדפיסה על המסך את המחרוזת הארוכה מבין השתיים.

    public static void theLongest(String str1 , String str2){
        if (str1.length() > str2.length()){
            System.out.println(str1);
        } else if (str2.length() > str1.length()) {
            System.out.println(str2);
        }
    }
//
//    כתבו פונקציה המקבלת מחרוזת ומספר שלם,
//    ומחזירה תשובה חיובית אם המחרוזת היא בדיוק באורך המספר השלם.


    public static boolean isTheSameLen(String str , int number){
        boolean isTheSameLen = false;
        if (str.length()==number){
            isTheSameLen = true;
        }
        return isTheSameLen;
    }

//    כתבו פונקציה הקולטת מהמשתמש שתי מחרוזות ומחזירה: 1 – אם המחרוזות זהות;
//    2 – אם המחרוזות לא זהות אך מתחילות באותה האות; 3 – עבור כל אפשרות אחרת.

    public static int isEquals(){
        final int EQUALS = 1;
        final int FIRST_CHAR_EQUALS = 2;
        final int NOT_EQUALS = 3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter 2 str");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        int result;
        if (str1.equals(str2)){
            result = EQUALS;
        } else if (str1.charAt(0)==str2.charAt(0)) {
            result = FIRST_CHAR_EQUALS;
        }else {
            result = NOT_EQUALS;
        }
        return result;
    }


//    כתבו פונקציה המקבלת מחרוזת text ותו toCount,
//    ומחזירה את כמות הפעמים שהתו toCount מופיע במחרוזת text.

    public static int countOf(String str , char toCount){
       int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == toCount){
                count++;
            }
        }
        return count;
    }


//    כתבו פונקציה המקבלת כפרמטר מערך של מחרוזות ומחזירה את המחרוזת הארוכה ביותר במערך.
    public static String theLongestStr(String[] array){
        int max = 0;
        String theLongest="";

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > max){
                max = array[i].length();
                theLongest = array[i];
            }
        }
        return theLongest;
    }
}
