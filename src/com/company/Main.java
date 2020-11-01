package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String firstName = "James";
        String lastName = "Shoemaker";

        String name = firstName + " " + lastName; //concatenates a string

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(name); //prints out the concatenated name using the name variable


        String concatName = (firstName.concat(" ")) .concat(lastName); //this is another way to concatenate a string
        System.out.println(concatName); //prints out the concatenated name from the line above

        StringBuilder stringBuilder = new StringBuilder("abc"); //creates an instance of the stringBuilder class
        stringBuilder.append("def"); //appends more letters of the alphabet
        stringBuilder.append("ghi"); //appends more letters of the alphabet
        stringBuilder.append("jkl"); //appends more letters of the alphabet
        stringBuilder.append("mno"); //appends more letters of the alphabet

        stringBuilder.insert(9, "ALPHA"); //this inserts ALPHA at the index of 9 in the alphabet list

        stringBuilder.delete(1, 3); //deletes some characters in the string based on their index

        String a = stringBuilder.toString(); //converts stringBuilder instance into a string
        System.out.println(a); //prints out String a from above



        /*stringBuilder.append("pqr");
        stringBuilder.append("stu");
        stringBuilder.append("vwx");
        stringBuilder.append("yz");*/
    }
}
