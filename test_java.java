// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//Write a program to find and print the longest word in a given sentence. (eg., "I love Java Programming Language.")
class Main {
    public static void main(String[] args) {
         String str="I love Java Programming Language.";
         String[] word=str.split(" ");
         String longword=" ";
         for(int i=0;i<word.length;i++){
             for(int j=i+1;j<word.length;j++){
                 if(word[i].length()>=word[j].length()){
                     longword = word[i];
                 }
             }
         }
    System.out.println(longword+" is the longest word");
    }
}