package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ItemStockTest {

	ItemStock itemStock = new ItemStock();
	Item book = new Item("book", 200);
	Item CD = new Item("CD", 1000);

	@Test
	public void test1() {
		int result1 = itemStock.getNum(book);

		assertEquals(0, result1, "初回は０");
	}

	@Test
	public void test2() {
		itemStock.add(book);
		int result2 = itemStock.getNum(book);

		assertEquals(1, result2, "1つ追加したので1を取得");
	}

	@Test
	public void test3() {
		itemStock.add(book);
		itemStock.add(book);
		int result3 = itemStock.getNum(book);

		assertEquals(2, result3, "2つ追加したので2を取得");
	}

	@Test
	public void test4() {
		itemStock.add(book);
		itemStock.add(CD);
		int result4 = itemStock.getNum(book);

		assertEquals(1, result4, "1つ追加した後に別のオブジェクトを追加したが1を取得");
	}

}
