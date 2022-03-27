package intduction;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class avaStreams {

	@Test
	public void streamfilter()
	{
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		
		
		ArrayList<String> names1 = new ArrayList<String>();
		names1.add("suprava");
		names1.add("subodh");
		names1.add("piku");
		names1.add("lali");
		names1.add("trisha");
		
		Long c = names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		
	long d = Stream.of("Abhijeet","Don","Alekhya").filter(s->s.startsWith("A")).count();
		
	System.out.println(d);
	names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
	
	Stream.of("Abhieet","Don","Alekhya","Adam","Ram").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	
	names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	Stream<String> newStream = Stream.concat(names.stream(),names1.stream());
	
	newStream.sorted().forEach(s->System.out.println(s));
	
//boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Adam"));
//System.out.println(flag);
//Assert.assertTrue(flag);

List<String> ls = Stream.of("suprava","subodh","piku","lali","trisha").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).collect(Collectors.toList());

System.out.println(ls.get(0));		
		}
		
		
	}
	
	

