@Test 
public void testTransactionHistory() { 
    BankSystem bank = new BankSystem(); 
    User user = new User(101, "Hassan Raza", "hassan", "pass123"); 
    Account acc = new Account("987654", "Savings", 1000, user); 
    bank.accounts.add(acc); 
 
    bank.deposit("987654", 500); 
    bank.withdraw("987654", 200); 
 
    assertEquals(2, bank.transactions.size()); 
    assertEquals("Deposit", bank.transactions.get(0).getType()); 
} 