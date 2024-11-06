package stream.methodReference;

public class NonStaticMethodReferences {

    public static void main(String[] args) {

        IUpperCase upperCase = NonStaticMethodReferences::convert; // new NonStaticMethodReferences().convert("sai Krishna chokkara")

       String name= upperCase.convertStringToUpperCase(new NonStaticMethodReferences(),"sai Krishna chokkara");
     
        /**
         *     NonStaticMethodReferences ---> new NonStaticMethodReferences()
         *
         *     :: --> .
         *
         *     convert --> convert( String str)
         *
         *     new NonStaticMethodReferences().convert( String str)
         *
         *
         */
        System.out.println("Name : "+name);

    }

  String convert(String str)
  {
      return str.toUpperCase();
  }

}
