class Labrador extends Spaniel {

  public Labrador() {

  }

  public void swim() {
    System.out.println("Your dog is swimming!");
  }

  public static void main(String[] args) {
    Labrador leila = new Labrador();
    leila.bite();
    leila.jump();
    leila.swim();
    leila.fetch("bird");
  }
}
