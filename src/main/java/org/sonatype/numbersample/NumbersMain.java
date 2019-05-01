package org.sonatype.numbersample;

import java.util.Scanner;

import org.sonatype.config.SpringConfig;
import org.sonatype.numbersample.translator.Translator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = { SpringConfig.class })
public class NumbersMain {

	private Translator translator;

	@Autowired
	public NumbersMain(Translator service) {
		this.translator = service;

	}

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		new NumbersMain(context.getBean(Translator.class)).run();
	}

	private void run() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Number translator exercise!!!!");

		while (true) {
			System.out.println("Write a number (integer) and press enter to evaluate, to finish type quit");
			String value = sc.next();
			try {
				System.out.println(String.format("The input %s is translated as: %s", value,
						translator.translateValue(Integer.parseInt(value))));
			} catch (Exception e) {
				if (value.equals("quit")) {
					System.out.println("Closing program, bye!... ");
					break;
				} else {
					System.out.println(String.format("Cant evaluate %s as integer, sorry", value));
				}
			}

		}

	}
}
