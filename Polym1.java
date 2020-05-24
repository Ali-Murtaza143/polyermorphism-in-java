class Publication {
void CountSell()
{
System.out.print("Pub=  ");
}}

class Book extends Publication {
void CountSell()
{
System.out.print("Book  ");
}}

class Magzine extends Publication {
void CountSell()
{
System.out.print("Magzine ");
}}

class SportsMagzine extends Magzine {
void CountSell()
{
System.out.print("Sports Magzine ");
}}

class Polym1{
public static void main (String aw[])
{
Publication P;
P=new Publication ();
P.CountSell();
P=new Book ();
P.CountSell();
P=new Magzine ();
P.CountSell();
P=new SportsMagzine ();
P.CountSell();
}}