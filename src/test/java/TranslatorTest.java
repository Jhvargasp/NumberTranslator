
import org.junit.Test;
import org.junit.runner.RunWith;
import org.sonatype.config.SpringConfig;
import org.sonatype.numbersample.translator.Translator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class})
public class TranslatorTest {

	@Autowired
	private Translator translator;

	@Test
	public void testTranslateMultipleCases() {
		org.junit.Assert.assertEquals("zero", translator.translateValue(0));

		org.junit.Assert.assertEquals("one", translator.translateValue(1));

		org.junit.Assert.assertEquals("negative one", translator.translateValue(-1));

		org.junit.Assert.assertEquals("one hundred and one", translator.translateValue(101));

		org.junit.Assert.assertEquals("one thousand and seventeen", translator.translateValue(1017));

		org.junit.Assert.assertEquals(
				"two billion one hundred and forty seven million four hundred and eighty three thousand six hundred and forty seven",
				translator.translateValue(Integer.MAX_VALUE));

		org.junit.Assert.assertEquals(
				"negative two billion one hundred and forty seven million four hundred and eighty three thousand six hundred and forty eight",
				translator.translateValue(Integer.MIN_VALUE));

		org.junit.Assert.assertEquals(
				"negative two billion one hundred and forty seven million four hundred and eighty three thousand six hundred and forty eight",
				translator.translateValue(Integer.MAX_VALUE + 1));
	}
}
