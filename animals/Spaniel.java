class Spaniel extends Dog {

  public Spaniel() {

  }

  public void fetch(String item) {
    System.out.println("Your dog fetched a " + item);
  }

  public static void main(String[] args) {
    Spaniel tess = new Spaniel();
    tess.bite();
    tess.jump();
    tess.fetch("ball");
  }
}
