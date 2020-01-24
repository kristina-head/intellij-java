class Application {
  String name;

  public Application(String name) {
    this.name = name;
  }

  public void run(String[] args) {
    System.out.println(this.name);
    for (String arg : args) {
      System.out.println(arg);
    }
  }
}
