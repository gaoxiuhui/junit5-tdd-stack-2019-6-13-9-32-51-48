package com.thoughtworks.tdd;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
  @Test
  public void should_return_1_when_input_1() {
	  Game game=new Game();
	  String result=game.getGame(1);
	  Assert.assertEquals("1",result);
  }
  
  @Test
  public void should_return_Fizz_when_input_3() {
	  Game game=new Game();
	  String result=game.getGame(3);
	  Assert.assertEquals("Fizz",result);
  }
  
  @Test
  public void should_return_Buzz_when_input_5() {
	  Game game=new Game();
	  String result=game.getGame(5);
	  Assert.assertEquals("Buzz",result);
  }
  
  @Test
  public void should_return_Whizz_when_input_7() {
	  Game game=new Game();
	  String result=game.getGame(7);
	  Assert.assertEquals("Whizz",result);
  }
  
  @Test
  public void should_return_FizzBuzz_when_input_15() {
	  Game game=new Game();
	  String result=game.getGame(15);
	  Assert.assertEquals("FizzBuzz",result);
  }
  
  @Test
  public void should_return_FizzWhizz_when_input_21() {
	  Game game=new Game();
	  String result=game.getGame(21);
	  Assert.assertEquals("FizzWhizz",result);
  }
  
  @Test
  public void should_return_BuzzWhizz_when_input_35() {
	  Game game=new Game();
	  String result=game.getGame(35);
	  Assert.assertEquals("BuzzWhizz",result);
  }
  
  @Test
  public void should_return_unvalid_when_input_0() {
	  Game game=new Game();
	  String result=game.getGame(0);
	  Assert.assertEquals("unvalid",result);
  }
  
  @Test
  public void should_return_unvalid_when_input_201() {
	  Game game=new Game();
	  String result=game.getGame(201);
	  Assert.assertEquals("unvalid",result);
  }
}
