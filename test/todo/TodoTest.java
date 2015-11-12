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
public class TodoTest {
  private Todo todo;
  
  public TodoTest() {
  }
  
  @BeforeClass
  public static void setUpClass() {
  }
  
  @AfterClass
  public static void tearDownClass() {
  }
  
  @Before
  public void setUp() {
	this.todo = new Todo("Hey");
  }
  
  @After
  public void tearDown() {
  }

  /**
   * Test of getTodo method, of class Todo.
   */
  @Test
  public void testGetTodo() {
	System.out.println("getTodo");
	Todo instance = this.todo;
	String expResult = "Hey";
	String result = instance.getTodo();
	assertEquals(expResult, result);
  }

  /**
   * Test of setTodo method, of class Todo.
   */
  @Test
  public void testSetTodo() {
	System.out.println("setTodo");
	Todo instance = this.todo;
	instance.setTodo("Nay");
	assertEquals(instance.getTodo(), "Nay");
  }

  /**
   * Test of isCompleted method, of class Todo.
   */
  @Test
  public void testIsCompleted() {
	System.out.println("isCompleted");
	Todo instance = this.todo;
	boolean expResult = false;
	boolean result = instance.isCompleted();
	assertEquals(expResult, result);
  }

  /**
   * Test of complete method, of class Todo.
   */
  @Test
  public void testComplete() {
	System.out.println("complete");
	Todo instance = this.todo;
	instance.complete();
	assertEquals(instance.isCompleted(), true);
  }

  /**
   * Test of toString method, of class Todo.
   */
  @Test
  public void testToString() {
	System.out.println("toString");
	Todo instance = this.todo;
	String expResult = "Hey--ACTIVE";
	String result = instance.toString();
	assertEquals(expResult, result);
  }
  
}
