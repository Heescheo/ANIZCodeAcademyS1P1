package Lesson01.WriteToConsol;


public class WriteToConsol03 {
    public static void main(String[] args) {
        Message03();
    }
//Test comment
    public static void Message03() {
        //This is a variable.
        String Mission = "Mission \t Year \t Days in Space";
        String IRISS = "IRISS \t \t 2015 \t 10";
        String Huginn = "Huginn \t \t 2023 \t 180";
        //The value of the variable is written to the consol.
        System.out.println(Mission);
        System.out.println(IRISS);
        System.out.println(Huginn);
    }
}