import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.ArgumentUtils;

public class BankTest{
	
	@ParameterizedTest
	@MethodSource("checkAccounts")
	public void testAccountGetId(Account account) {
		int expected = account.getId();
		int result = account.getId();
		assertEquals(expected, result);
	}
	
	@ParameterizedTest
	@MethodSource("checkAccounts")
	public void testAccountGetSolde(Account account) {
		double expected = account.getSolde();
		double result = account.getSolde();
		assertEquals(expected, result);
	}
	
	@ParameterizedTest
	@MethodSource("checkAccounts")
	public void testAccountGetTaux(Account account) {
		double expected = account.getTaux();
		double result = account.getTaux();
		assertEquals(expected, result);
	}
	
	@ParameterizedTest
	@MethodSource("checkAccounts")
	public void testAccountDepot(Account account) {
		double expected = account.getSolde() + 50;
		account.depot(50);
		double result = account.getSolde();
		assertEquals(expected, result);
	}
	
	@ParameterizedTest
	@MethodSource("checkAccounts")
	public void testAccountRetrait(Account account) {
		double expected = account.getSolde() - 50;
		account.retrait(50);
		double result = account.getSolde();
		assertEquals(expected, result);
	}
	
	public static Stream<Account> checkAccounts() {
		return Stream.of(
			new Account(0,0,0),
			new Account(1,1850,5)
		);
	}
}
