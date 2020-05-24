class Pub{
int count;
void countSell(){
System.out.println("Publication");
}}
class Book extends Pub {
 void countSell(){
System.out.println("Book");}}

class Mag extends Pub {
 void countSell(){
System.out.println("Mag");}}

class SportsMag extends Mag {
 void countSell(){
System.out.println("Sports Mag"+count);}}


class Polymor {
public static void main (String [] asv){
Pub p=new Pub();
p.countSell();
p=new Book();
p.countSell();
p=new Mag();
p.countSell();
p=new SportsMag();
p.countSell();
}
}