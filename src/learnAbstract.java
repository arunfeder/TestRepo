  abstract class animal
 {
      abstract void eat();
     private void age()
      {


      }

 }

 class deer extends animal
 {

     @Override
     void eat() {
         System.out.println("i am deer, i am herbivorous");
     }
 }
 class lion extends animal
 {
     public static void main(String[] args) {

         deer d = new deer();
         d.eat();

     }

     @Override
     void eat() {
         System.out.println("i am lion , i am carni");
     }
 }