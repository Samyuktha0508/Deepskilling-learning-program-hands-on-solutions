import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;

    @Before
    public void setUp() {
        System.out.println("🔧 Setting up a new bank account...");
        account = new BankAccount("Alice", 1000.0); // Arrange
    }

    @After
    public void tearDown() {
        System.out.println("🧹 Cleaning up...\n");
        account = null;
    }

    @Test
    public void testDeposit() {
        double newBalance = account.deposit(500.0);

        assertEquals(1500.0, newBalance, 0.001);
        assertEquals(1500.0, account.getBalance(), 0.001);
        System.out.println("✅ Deposit test passed.");
    }

    @Test
    public void testWithdraw() {
        double remainingBalance = account.withdraw(300.0);

        assertEquals(700.0, remainingBalance, 0.001);
        assertFalse(account.isOverdrawn());
        System.out.println("✅ Withdraw test passed.");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithdrawTooMuch() {
        account.withdraw(2000.0);
        System.out.println("✅ Overdraft test passed.");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidDeposit() {
        account.deposit(-100.0);
        System.out.println("✅ Invalid deposit test passed.");
    }

    @Test
    public void testAccountHolderName() {
        String name = account.getAccountHolder();

        assertNotNull(name);
        assertEquals("Alice", name);
        System.out.println("✅ Account holder test passed.");
    }
}
