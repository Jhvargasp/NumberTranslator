package org.sonatype.numbersample.translator;

import java.util.Locale;

import org.springframework.stereotype.Service;

import com.ibm.icu.text.RuleBasedNumberFormat;
import com.ibm.icu.util.ULocale;

@Service
public class ICU4JTranslatorImpl implements Translator {

	public String translateValue(int value) {
		ULocale locale = ULocale.forLocale(Locale.US);
		RuleBasedNumberFormat formatter = new RuleBasedNumberFormat(locale, RuleBasedNumberFormat.SPELLOUT);
		return formatter.format(value, "%spellout-numbering-verbose").replace(",", "").replace("-", " ")
				.replace("minus", "negative");
	}

}
