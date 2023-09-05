package PolyMorphism;

 class Animal {
int a=10;
int b = 5;


     void eat()
     {
         System.out.println(a+b);

     }


     public static void main(String[] args) {


         Animal anm1 = new Animal();
         anm1.eat();
     }
}

