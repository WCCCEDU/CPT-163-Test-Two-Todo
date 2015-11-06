/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo;

/**
 *
 * @author samuraipanzer
 */
public class Todo {
  private String todo;
  private boolean completed;

  public Todo(String todo) {
	this.todo = todo;
	this.completed = false;
  }
  
  public String getTodo(){ return this.todo; }
  
  public void setTodo(String todo){ this.todo = todo; }
  
  public boolean isCompleted(){ return this.completed; }
  
  public void complete(){
	this.completed = true;
  }

  @Override
  public String toString() {
	String complete = (completed? "--COMPLETED": "--ACTIVE");
	return this.todo + complete;
  }
}
