/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author samuraipanzer
 */
public class TodoList {
  private List<Todo> todoList;

  public TodoList() {
	this.todoList = new ArrayList();
  }
  
  public void addTodo(String todo){
	Todo todoItem = new Todo(todo);
	this.todoList.add(todoItem);
  }
  
  public Todo findTodoByIndex(int index){
	return this.todoList.get(index);
  }
  
  public void completeTodoByIndex(int index){
	this.findTodoByIndex(index).complete();
  }
  
  public void printTodos(){
	for(int i = 0; i < this.todoList.size(); i++){
	  Todo todo = this.findTodoByIndex(i);
	  System.out.println("Index: " + i + " Todo: " + todo);
	}
  }
  
  public void printActiveTodos(){
	for(int i = 0; i < this.todoList.size(); i++){
	  Todo todo = this.findTodoByIndex(i);
	  if(!todo.isCompleted()){
		System.out.println("Index: " + i + " Todo: " + todo);
	  }
	}
  }
  
}
