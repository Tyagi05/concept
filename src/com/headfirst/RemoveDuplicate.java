package com.headfirst;

public class RemoveDuplicate {

    private static void findAndPrintDuplicates(String sentence) {
        //write code here


        String words[] = sentence.split(" ");
        int count;
        for (int i = 0; i < words.length; i++) {
            count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;

                }

            }

                if(count> 1 ){
                    System.out.println(words[i]);


                }

        }
    }


        public static void main (String[]args){
            //findAndPrintDuplicates("This is a test for duplicate duplicate word");

            findAndPrintDuplicates("This is a test for duplicate duplicate word for test");

        /*ArrayList<String> a = new ArrayList<String>();
        a.add("i ");
        a.add("work");
        a.add("work");
        a.add("here")*/


        }
    }
