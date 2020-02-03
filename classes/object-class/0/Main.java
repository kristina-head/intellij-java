class Account {

  private long id;
  private String code;
  private Long balance;

  public Account(long id, String code, Long balance) {
    this.id = id;
    this.code = code;
    this.balance = balance;
  }

  @Override
  public String toString() {
    return "Account{id=" + this.id + ", code='" + this.code + "', balance=" + this.balance + "}";
  }
}
