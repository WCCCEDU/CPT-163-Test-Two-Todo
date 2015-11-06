/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2todo;

import todo.TodoList;

/**
 *
 * @author samuraipanzer
 */
public class Test2Todo {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
	TodoList todos = new TodoList();
	todos.printTodos();
	todos.addTodo("Butt");
	todos.printTodos();
	System.out.println("Add more\n");
	todos.addTodo("Door");
	todos.printTodos();
	if(todos.findTodoByIndex(1).getTodo().equals("Door")){
	  System.out.println("Finder Works");
	}
	todos.completeTodoByIndex(1);
	if(todos.findTodoByIndex(1).toString().equals("Door--COMPLETED")){
	  System.out.println("Complete By Id Works");
	}
	todos.printTodos();
	todos.addTodo("Dorf Golfing");
	todos.printTodos();
	todos.findTodoByIndex(2).complete();
	todos.printTodos();
	System.out.println("Just Active \n");
	todos.printActiveTodos();
  }
  
}
