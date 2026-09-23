class StringConcat {
  public static void main(String [] args){
    BiFunction<String ,String, String > concat = (s1,s2) -> s1+s2;
		System.out.println(concat.apply("Hii","Sahil "));
	
  }
}
