class Animal {
  String name;
  String species;
  int height;
  int currentLat;
  int currentLon;
  public Animal(String animalName, String animalSpecies, int animalHeight) {
    name = animalName;
    species = animalSpecies;
    height = animalHeight;
    currentLat = 0;
    currentLon = 0;
  }

  public void introduce() {
    System.out.println("This is " + name + ", a " + species + " that is " + height + "cm tall.");
  }

  public int runLeftOrRight(int distance) {
    return currentLat = currentLat + distance;
  }

  public int runUpOrDown(int distance) {
    return currentLon = currentLon + distance;
  }

  public void getCurrentPosition() {
    System.out.println(name + "'s current position is (" + currentLat + "," + currentLon + ").");
  }

  public static void main(String[] args) {
    Animal ellie = new Animal("Ellie", "elephant", 157);
    ellie.introduce();
    ellie.runLeftOrRight(1);
    ellie.getCurrentPosition();
    ellie.runLeftOrRight(1);
    ellie.getCurrentPosition();
    ellie.runUpOrDown(1);
    ellie.getCurrentPosition();
    ellie.runUpOrDown(1);
    ellie.getCurrentPosition();
    ellie.runLeftOrRight(1);
    ellie.getCurrentPosition();
    ellie.runLeftOrRight(-1);
    ellie.getCurrentPosition();
  }
}
