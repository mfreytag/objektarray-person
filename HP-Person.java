import java.util.*;
public class HP-Person
{
  public static void main(String[] args)
  {
  //Aufgabe a - Objektarray
  final int ANZ = 3;
  Person arrayPerson[] = new Person[ANZ];
  for (int i = 0; i < ANZ; i++)
  {
    arrayPerson[i] = new Person("Mustermann");
  }
  //Aufgabe b - ArrayList
  ArrayList<Person> listePerson = new ArrayList<Person>();
  for (int i = 0; i < ANZ; i++)
  {
    listePerson.add(new Person("Musterfrau"));
  }
  //Aufgabe c - ersetze letzte Elemente mit "Mustermensch"
  arrayPerson[3].setName("Mustermensch");
  listePerson.get(3).setName("Mustermensch");
  //Ausgabe der Arrays
  //Ausgabe des Objektarrays
  for (int i = 0; i < ANZ; i++)
  {
    arrayPerson[i].datenausgabe();
  }
  //Ausgabe der ArrayList
  for (int i = 0; i < ANZ; i++)
  {
    listePerson.get(i).datenausgabe();
  }
  //Aufgabe d - loesche 3. Element
  
  //Angabe der Elementanzahl
  
  }
}
