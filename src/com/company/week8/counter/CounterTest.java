package counter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CounterTest {
  Counter c = new Counter();

  @Test
  void addMore() {
    c.add(5);
    assertEquals(5, c.get(1));
  }

  @Test
  void addOne() {
    c.add();
    assertEquals(1, c.get(1));
  }

  @Test
  void getZero() {
    assertEquals(0, c.get(1));
  }

  @Test
  void getInit() {
    Counter c = new Counter(7);
    assertEquals(7, c.get(1));
  }

  @Test
  void resetToZero() {
    c.add();
    c.reset();
    assertEquals(0, c.get(1));
  }

  @Test
  void resetToInit() {
    Counter c = new Counter(7);
    c.add(5);
    c.reset();
    assertEquals(7, c.get(1));
  }

}