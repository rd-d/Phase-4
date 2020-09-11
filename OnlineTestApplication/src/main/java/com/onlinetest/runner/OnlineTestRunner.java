package com.onlinetest.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.onlinetest.dao.OnlineTestDAO;
import com.onlinetest.model.OnlineTest;

@Component
public class OnlineTestRunner implements CommandLineRunner{
	
	@Autowired
	private OnlineTestDAO dao;

	@Override
	public void run(String... args) throws Exception {
		dao.deleteAll();
		
		dao.save(new OnlineTest("How does Angular 4 improved error handling, when an error is caused by something in a template?", "By enabling TypeScript's StrictNullChecks", "By creating flattened versions of Angular modules", "By generating source maps in terms of original template", "None of the mentioned", "By creating flattened versions of Angular modules"));
		dao.save(new OnlineTest("The . . . . . decorator allows us to define the pipe name that is globally available for use in any template in the across application.", "pipeName", "pipeDeco", "Pipe", "None", "Pipe"));
		dao.save(new OnlineTest("Observables help you manage . . . . . . . . data.", "synchronous", "asynchronous", "Both asynchronous & synchronous", "None of above", "asynchronous"));
		dao.save(new OnlineTest("Where would you put Observables?", "In the Component", "In the Template", "In the Injectable decorator", "In the module", "In the Injectable decorator"));
		dao.save(new OnlineTest("How would you display a list of Employees on a webpage along with where they were in the list?", "Loop through and print the index", "Loop through and print the employees", "Loop through and print the index and the employee", "Pass both the index and the employee to a web service", "Loop through and print the index and the employee"));
		dao.save(new OnlineTest("If you chain multiple pipes together, they are executed", "in parallel", "LIFO order", "in the order in which you specify them", "None of above", "in the order in which you specify them"));
		dao.save(new OnlineTest("We can subscribe to an observable using the . . . . . . . . The benefit of this is that Angular deals with your subscription during the lifecycle of a component. Angular will automatically subscribe and unsubscribe for you.", "sync pipe", "async var", "async pipe", "syn var", "async pipe"));
		dao.save(new OnlineTest("The number pipe is location sensitive, which means that the same format argument will produce differently formatted results based on the . . . . . . .", "user's format setting", "user's locale setting", "user's currency setting", "All of above", "user's locale setting"));
		dao.save(new OnlineTest("How would you retrieve a list of items from a server's URL?", "Create a URL transaction", "Use the HTTP get method", "Create a get SQL statement", "Use an HTTP package", "Create a URL transaction"));
		dao.save(new OnlineTest("Which of the following is not built-in pipe in Angular?", "DatePipe", "CurrencyPipe", "PercentPipe", "DataPipe", "DataPipe"));
	
	}

}
