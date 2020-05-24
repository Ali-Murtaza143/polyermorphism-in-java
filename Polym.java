class Animal{
void Sound()
{
System.out.print("sound12  ");
}}

class Cat extends Animal{
void Sound()
{
System.out.print("cat say meow  ");
}}

class Dog extends Animal{
void Sound()
{
System.out.print("dog say boww  ");
}}

class Polym{
public static void main (String as[])
{
Animal A;
A=new Animal();
A.Sound();
A=new Dog ();
A.Sound();
A=new Cat ();
A.Sound();
}}