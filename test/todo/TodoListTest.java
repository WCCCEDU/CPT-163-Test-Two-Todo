/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author samuraipanzer
 */
public class TodoListTest {
  private TodoList todoList;
  
  public TodoListTest() {
  }
  
  @BeforeClass
  public static void setUpClass() {
  }
  
  @AfterClass
  public static void tearDownClass() {
  }
  
  @Before
  public void setUp() {
	this.todoList = new TodoList();
  }
  
  @After
  public void tearDown() {
  }

  /**
   * Test of addTodo method, of class TodoList.
   */
  @Test
  public void testAddTodo() {
	System.out.println("addTodo");
	TodoList instance = this.todoList;
	instance.addTodo("Butt");
	Todo todoObject = instance.findTodoByIndex(0);
	int num = 7;
	boolean valid = false;
	valid = (num > 0 && num < 10)? true : false;
	assertTrue(valid);
	assertEquals(todoObject.getTodo(), "Butt");
	
  }
  
  /* Other Tests would be here */
  
}
