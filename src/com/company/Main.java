package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("Jone", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        Map<String, Employee> hashmap = new HashMap<String, Employee>();
        hashmap.put("Johns", janeJones);
        hashmap.put("Doe", johnDoe);
        hashmap.put("Smith", marySmith);
//        Employee employee = hashmap.put("Doe", mikeWilson);
        Employee employee = hashmap.putIfAbsent("Doe", mikeWilson);
        System.out.println(employee);

        System.out.println(hashmap.get("Smith"));
        System.out.println(hashmap.getOrDefault("someone", mikeWilson));
        System.out.println(hashmap.remove("Johns"));

//        System.out.println(hashmap.containsKey("Doe"));
//        System.out.println(hashmap.containsValue(janeJones));

//        Iterator<Employee> iterator = hashmap.values().iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        hashmap.forEach((k, v) -> System.out.println("Key = " + k + ", Employee = " + v));
    }
}
