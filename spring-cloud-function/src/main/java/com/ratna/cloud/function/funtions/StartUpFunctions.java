package com.ratna.cloud.function.funtions;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ratna.cloud.function.model.Book;

@Configuration
public class StartUpFunctions {
	// it takes an argument (object of type T) and returns an object (object of type
		// R). The argument and output can be a different type.
		@Bean
		public Function<String, Integer> length() {
			// input string output integer
			Function<String, Integer> function = (input) -> input.length();
			return function;
		}

		// it takes no arguments and returns a result
		@Bean
		public Supplier<Book> getBook() {
			Book book = new Book();
			book.setId(1);
			book.setName("Spring Cloud Function");
			// no input,outputs book
			Supplier<Book> supplier = () -> book;
			return supplier;
		}

		// it takes an argument and returns nothing.
		@Bean
		public Consumer<Book> displayBook() {
			Consumer<Book> consumer = (input) -> System.out.println(input);
			return consumer;
		}
	
}
