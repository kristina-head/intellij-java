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
    return String.format("Account{id=%d, code='%s', balance=%d}", this.id, this.code, this.balance);
  }
}
