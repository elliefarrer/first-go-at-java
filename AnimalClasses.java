class Animal {
  String name;
  String species;
  int height;
  public Animal(String animalName, String animalSpecies, int animalHeight) {
    name = animalName;
    species = animalSpecies;
    height = animalHeight;
  }

  public void introduce() {
    System.out.println("This is " + name + ", a " + species + " that is " + height + "cm tall.");
  }

  public static void main(String[] args) {
    Animal leila = new Animal("Leila", "dog", 50);
    leila.introduce();
  }
}
