import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class MyTest {
	@DisplayName("Testing")
	@Test
	void display() {
		System.out.println("my program");
	}
	@RepeatedTest(2)
	@DisplayName("2nd test")
	@Test
	void another() {
		System.out.println("My program 2");
	}

}
