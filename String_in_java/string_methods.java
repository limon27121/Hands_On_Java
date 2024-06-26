import java.util.Arrays;

public class string_methods {
    public static void main(String[] args) {
        //length method
        String s1="welcome";
        System.out.println(s1);
        int size=s1.length();
        System.out.println("the length of string:"+size);

        //concat method
        String s2="home";
        System.out.println(s1.concat(" ").concat(s2));
        System.out.println("another way of concat string: " +s1+" "+s2);

        //trim method
        String s3="    hello my boy    ";
        System.out.println("length of s3 before triming: "+s3.length());
        System.out.println("using trim method: "+s3.trim());
        System.out.println("length of s3 after triming: "+s3.trim().length());


        //charAt method

        char ch1=s1.charAt(1);
        System.out.println("print the first position character of string: "+ch1);
        for (int i = 0; i < s1.length(); i++) {
            System.out.println("print every charcter of string: "+s1.charAt(i));


        //contains method
        // it checks whether given string is part of main string or not

            boolean check=s1.contains("wel");
            System.out.println("validate contains method: "+check);

         //equals and equalsignore

            System.out.println("check the string using equal method:"+s1.equals("welcome"));

            //it gives the output is false because it consider the case sensitivity
            System.out.println("check the string using equal method:"+s1.equals("Welcome"));


            //it gives the output is true because it consider the case insensitivity
            System.out.println("check the string using equalsignore method:"+s1.equalsIgnoreCase("Welcome"));


            //replace method

            String seq="welcome the course of python";
            System.out.println("print the original string: "+seq);
            String mod_seq=seq.replace("python","java");
            System.out.println("using replace method to modify string: "+mod_seq);


            //reverse method
            String substring=mod_seq.substring(0,7);
            System.out.println("extract string using substring method: "+substring);

            //to uppercase
            String upper=mod_seq.toUpperCase();
            System.out.println("covert string to uppercase: "+upper);


            //to lowercase
            String lower=mod_seq.toLowerCase();
            System.out.println("covert string to lowercase: "+lower);

            // split method

            String a[]=seq.split(" ");
            for (String word:a){
                System.out.println(word);
            }
            System.out.println("convert array to string:"+ Arrays.toString(a));
            System.out.println("print the partial array element using index number: "+a[1]);
            
//           use case 01:
            String mail="limon@gmail.com";
            String a1[]=mail.split("@");
            System.out.println(Arrays.toString(a1));
            System.out.println(a1[1].contains("gmail.com"));




            //join method

            String joinString1=String.join("-","welcome","to","javatpoint");
            System.out.println(joinString1);

        }
    }
}
