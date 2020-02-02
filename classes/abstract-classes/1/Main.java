interface AccountService {

  Account findAccountByOwnerId(long id);

  long countAccountsWithBalanceGreaterThan(long value);
}

class AccountServiceImpl implements AccountService {
  Account[] accounts;

  AccountServiceImpl(Account[] accounts) {
    this.accounts = accounts;
  }

  @Override
  public Account findAccountByOwnerId(long id) {
    Account match = null;
    for (Account account : this.accounts) {
      if (account.getOwner().getId() == id) {
        match = account;
        break;
      }
    }
    return match;
  }

  @Override
  public long countAccountsWithBalanceGreaterThan(long value) {
    int count = 0;
    for (Account account : this.accounts) {
      if (account.getBalance() > value) {
        count++;
      }
    }
    return count;
  }
}

class Account {

  private long id;
  private long balance;
  private User owner;

  public Account(long id, long balance, User owner) {
    this.id = id;
    this.balance = balance;
    this.owner = owner;
  }

  public long getId() { return id; }

  public long getBalance() { return balance; }

  public User getOwner() { return owner; }
}

class User {

  private long id;
  private String firstName;
  private String lastName;

  public User(long id, String firstName, String lastName) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public long getId() { return id; }

  public String getFirstName() { return firstName; }

  public String getLastName() { return lastName; }
}
