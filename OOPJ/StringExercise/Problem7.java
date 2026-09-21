class program{
  public static void main(String[] args){

         String str = "The quick brown fox jumps";

        System.out.println("The given string is: " + str);

        System.out.println("The string in reverse order is:");

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
  }
}
