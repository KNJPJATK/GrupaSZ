package pl.edu.pja.k1;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.PrintWriter;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MainTest {
	
	@Rule
	public ExpectedException ex = ExpectedException.none();
	
	@Mock
	private PrintWriter pw;
	
	@Before
	public void setUp() {

		
	}

	@Test
	public void expectYelloWorldOnEmptyParam() {
		// given
		YelloMain main = new YelloMain();
		// when
		String greeting = main.buildGreetings(new String[0]);
		// then
		assertThat(greeting).isEqualTo("Yello world!");
	}
	
	@Test
	public void expectExceptionOnNullParam() {
		// given
		YelloMain main = new YelloMain();
		// then
		ex.expect(RuntimeException.class);
		// when
		main.buildGreetings(null);
	}
	
	@Test
	public void expectYelloFirstParamOnNonEmptyParam() {
		// given
		YelloMain main = new YelloMain();
		// when
		String[] args = { "Pablo" };
		String greeting = main.buildGreetings(args);
		// then
		assertThat(greeting).isEqualTo("Yello Pablo!");
	}
	
	@Test
	public void lama() {
		// given
		YelloMain main = new YelloMain();
		String[] args = { "Pablo" };
		// when
		main.greet(pw, args);
		// then
		Mockito.verify(pw).println(Mockito.anyString());
	}

}
