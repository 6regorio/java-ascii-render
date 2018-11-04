package com.indvd00m.ascii.render.tests;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.Test;

import com.indvd00m.ascii.render.Canvas;
import com.indvd00m.ascii.render.Point;
import com.indvd00m.ascii.render.api.ICanvas;
import com.indvd00m.ascii.render.api.IContext;
import com.indvd00m.ascii.render.api.IPoint;
import com.indvd00m.ascii.render.elements.Label;
import com.indvd00m.ascii.render.elements.Rectangle;
import com.indvd00m.ascii.render.elements.Table;
import com.indvd00m.ascii.render.elements.Text;

/**
 * @author indvd00m (gotoindvdum[at]gmail[dot]com)
 * @date 2016-Nov-17 5:15:07 PM
 *
 */
public class TestTable {

	@Test
	public void test01() {
		IContext context = mock(IContext.class);
		ICanvas canvas = new Canvas(21, 10);
		Table t = new Table(2, 3);
		IPoint point = t.draw(canvas, context);
		assertEquals(new Point(0, 0), point);
		String s = "";
		s += "┌─────────┬─────────┐\n";
		s += "│         │         │\n";
		s += "│         │         │\n";
		s += "├─────────┼─────────┤\n";
		s += "│         │         │\n";
		s += "│         │         │\n";
		s += "├─────────┼─────────┤\n";
		s += "│         │         │\n";
		s += "│         │         │\n";
		s += "└─────────┴─────────┘";
		System.out.println(canvas.getText());
		assertEquals(s, canvas.getText());
	}

	@Test
	public void test02() {
		IContext context = mock(IContext.class);
		ICanvas canvas = new Canvas(21, 10);
		Table t = new Table(2, 2);
		IPoint point = t.draw(canvas, context);
		assertEquals(new Point(0, 0), point);
		String s = "";
		s += "┌─────────┬─────────┐\n";
		s += "│         │         │\n";
		s += "│         │         │\n";
		s += "│         │         │\n";
		s += "│         │         │\n";
		s += "├─────────┼─────────┤\n";
		s += "│         │         │\n";
		s += "│         │         │\n";
		s += "│         │         │\n";
		s += "└─────────┴─────────┘";
		System.out.println(canvas.getText());
		assertEquals(s, canvas.getText());
	}

	@Test
	public void test03() {
		IContext context = mock(IContext.class);
		ICanvas canvas = new Canvas(21, 10);
		Table t = new Table(2, 1);
		IPoint point = t.draw(canvas, context);
		assertEquals(new Point(0, 0), point);
		String s = "";
		s += "┌─────────┬─────────┐\n";
		s += "│         │         │\n";
		s += "│         │         │\n";
		s += "│         │         │\n";
		s += "│         │         │\n";
		s += "│         │         │\n";
		s += "│         │         │\n";
		s += "│         │         │\n";
		s += "│         │         │\n";
		s += "└─────────┴─────────┘";
		System.out.println(canvas.getText());
		assertEquals(s, canvas.getText());
	}

	@Test
	public void test04() {
		IContext context = mock(IContext.class);
		ICanvas canvas = new Canvas(21, 10);
		Table t = new Table(1, 1);
		IPoint point = t.draw(canvas, context);
		assertEquals(new Point(0, 0), point);
		String s = "";
		s += "┌───────────────────┐\n";
		s += "│                   │\n";
		s += "│                   │\n";
		s += "│                   │\n";
		s += "│                   │\n";
		s += "│                   │\n";
		s += "│                   │\n";
		s += "│                   │\n";
		s += "│                   │\n";
		s += "└───────────────────┘";
		System.out.println(canvas.getText());
		assertEquals(s, canvas.getText());
	}

	@Test
	public void test05() {
		IContext context = mock(IContext.class);
		ICanvas canvas = new Canvas(21, 10);
		Table t = new Table(0, 1);
		IPoint point = t.draw(canvas, context);
		assertEquals(new Point(0, 0), point);
		String s = "";
		s += "┌───────────────────┐\n";
		s += "│                   │\n";
		s += "│                   │\n";
		s += "│                   │\n";
		s += "│                   │\n";
		s += "│                   │\n";
		s += "│                   │\n";
		s += "│                   │\n";
		s += "│                   │\n";
		s += "└───────────────────┘";
		System.out.println(canvas.getText());
		assertEquals(s, canvas.getText());
	}

	@Test
	public void test06() {
		IContext context = mock(IContext.class);
		ICanvas canvas = new Canvas(21, 10);
		Table t = new Table(0, 0);
		IPoint point = t.draw(canvas, context);
		assertEquals(new Point(0, 0), point);
		String s = "";
		s += "┌───────────────────┐\n";
		s += "│                   │\n";
		s += "│                   │\n";
		s += "│                   │\n";
		s += "│                   │\n";
		s += "│                   │\n";
		s += "│                   │\n";
		s += "│                   │\n";
		s += "│                   │\n";
		s += "└───────────────────┘";
		System.out.println(canvas.getText());
		assertEquals(s, canvas.getText());
	}

	@Test
	public void test07() {
		IContext context = mock(IContext.class);
		ICanvas canvas = new Canvas(21, 10);
		Table t = new Table(1, 2);
		IPoint point = t.draw(canvas, context);
		assertEquals(new Point(0, 0), point);
		String s = "";
		s += "┌───────────────────┐\n";
		s += "│                   │\n";
		s += "│                   │\n";
		s += "│                   │\n";
		s += "│                   │\n";
		s += "├───────────────────┤\n";
		s += "│                   │\n";
		s += "│                   │\n";
		s += "│                   │\n";
		s += "└───────────────────┘";
		System.out.println(canvas.getText());
		assertEquals(s, canvas.getText());
	}

	@Test
	public void test08() {
		IContext context = mock(IContext.class);
		ICanvas canvas = new Canvas(21, 10);
		Table t = new Table(1, 20);
		IPoint point = t.draw(canvas, context);
		assertEquals(new Point(0, 0), point);
		String s = "";
		s += "├───────────────────┤\n";
		s += "├───────────────────┤\n";
		s += "├───────────────────┤\n";
		s += "├───────────────────┤\n";
		s += "├───────────────────┤\n";
		s += "├───────────────────┤\n";
		s += "├───────────────────┤\n";
		s += "├───────────────────┤\n";
		s += "├───────────────────┤\n";
		s += "├───────────────────┤";
		System.out.println(canvas.getText());
		assertEquals(s, canvas.getText());
	}

	@Test
	public void test09() {
		IContext context = mock(IContext.class);
		ICanvas canvas = new Canvas(21, 10);
		Table t = new Table(20, 1);
		IPoint point = t.draw(canvas, context);
		assertEquals(new Point(0, 0), point);
		String s = "";
		s += "┌┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┐\n";
		s += "│││││││││││││││││││││\n";
		s += "│││││││││││││││││││││\n";
		s += "│││││││││││││││││││││\n";
		s += "│││││││││││││││││││││\n";
		s += "│││││││││││││││││││││\n";
		s += "│││││││││││││││││││││\n";
		s += "│││││││││││││││││││││\n";
		s += "│││││││││││││││││││││\n";
		s += "└┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┘";
		System.out.println(canvas.getText());
		assertEquals(s, canvas.getText());
	}

	@Test
	public void test10() {
		IContext context = mock(IContext.class);
		ICanvas canvas = new Canvas(21, 10);
		Table t = new Table(20, 9);
		IPoint point = t.draw(canvas, context);
		assertEquals(new Point(0, 0), point);
		String s = "";
		s += "┌┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┐\n";
		s += "├┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┤\n";
		s += "├┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┤\n";
		s += "├┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┤\n";
		s += "├┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┤\n";
		s += "├┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┤\n";
		s += "├┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┤\n";
		s += "├┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┤\n";
		s += "├┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┤\n";
		s += "└┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┴┘";
		System.out.println(canvas.getText());
		assertEquals(s, canvas.getText());
	}

	@Test
	public void test11() {
		IContext context = mock(IContext.class);
		ICanvas canvas = new Canvas(21, 10);
		Table t = new Table(2, 3);
		t.setElement(1, 2, new Text("Lorem Ipsum is simply dummy text of the printing and typesetting industry."));
		IPoint point = t.draw(canvas, context);
		assertEquals(new Point(0, 0), point);
		String s = "";
		s += "┌─────────┬─────────┐\n";
		s += "│         │         │\n";
		s += "│         │         │\n";
		s += "├─────────┼─────────┤\n";
		s += "│Lorem Ips│         │\n";
		s += "│um is si…│         │\n";
		s += "├─────────┼─────────┤\n";
		s += "│         │         │\n";
		s += "│         │         │\n";
		s += "└─────────┴─────────┘";
		System.out.println(canvas.getText());
		assertEquals(s, canvas.getText());
	}

	@Test
	public void test12() {
		IContext context = mock(IContext.class);
		ICanvas canvas = new Canvas(21, 10);
		Table t = new Table(2, 3);
		t.setElement(1, 2, new Text("1 2 Lorem Ipsum is simply dummy text of the printing and typesetting industry."));
		t.setElement(2, 2, new Text("2 2 Lorem Ipsum is simply dummy text of the printing and typesetting industry."));
		t.setElement(2, 1, new Text("2 1 Lorem Ipsum is simply dummy text of the printing and typesetting industry."));
		t.setElement(2, 3, new Text("2 3 Lorem Ipsum is simply dummy text of the printing and typesetting industry."));
		IPoint point = t.draw(canvas, context);
		assertEquals(new Point(0, 0), point);
		String s = "";
		s += "┌─────────┬─────────┐\n";
		s += "│         │2 1 Lorem│\n";
		s += "│         │ Ipsum i…│\n";
		s += "├─────────┼─────────┤\n";
		s += "│1 2 Lorem│2 2 Lorem│\n";
		s += "│ Ipsum i…│ Ipsum i…│\n";
		s += "├─────────┼─────────┤\n";
		s += "│         │2 3 Lorem│\n";
		s += "│         │ Ipsum i…│\n";
		s += "└─────────┴─────────┘";
		System.out.println(canvas.getText());
		assertEquals(s, canvas.getText());
	}

	@Test
	public void test13() {
		IContext context = mock(IContext.class);
		ICanvas canvas = new Canvas(20, 10);
		Table t = new Table(3, 4);
		t.setElement(1, 2, new Text("1 2 Lorem Ipsum is simply dummy text of the printing and typesetting industry."));
		t.setElement(2, 2, new Text("2 2 Lorem Ipsum is simply dummy text of the printing and typesetting industry."));
		t.setElement(2, 1, new Text("2 1 Lorem Ipsum is simply dummy text of the printing and typesetting industry."));
		IPoint point = t.draw(canvas, context);
		assertEquals(new Point(0, 0), point);
		String s = "";
		s += "┌─────┬──────┬─────┐\n";
		s += "│     │2 1 L…│     │\n";
		s += "├─────┼──────┼─────┤\n";
		s += "│1 2 L│2 2 Lo│     │\n";
		s += "│orem…│rem I…│     │\n";
		s += "├─────┼──────┼─────┤\n";
		s += "│     │      │     │\n";
		s += "├─────┼──────┼─────┤\n";
		s += "│     │      │     │\n";
		s += "└─────┴──────┴─────┘";
		System.out.println(canvas.getText());
		assertEquals(s, canvas.getText());
	}

	@Test
	public void test14() {
		IContext context = mock(IContext.class);
		ICanvas canvas = new Canvas(7, 7);
		Table t = new Table(3, 3);
		t.setElement(1, 1, new Label("1"));
		t.setElement(2, 1, new Label("2"));
		t.setElement(3, 1, new Label("3"));
		t.setElement(1, 2, new Label("4"));
		t.setElement(2, 2, new Label("5"));
		t.setElement(3, 2, new Label("6"));
		t.setElement(1, 3, new Label("7"));
		t.setElement(2, 3, new Label("8"));
		t.setElement(3, 3, new Label("9"));
		IPoint point = t.draw(canvas, context);
		assertEquals(new Point(0, 0), point);
		String s = "";
		s += "┌─┬─┬─┐\n";
		s += "│1│2│3│\n";
		s += "├─┼─┼─┤\n";
		s += "│4│5│6│\n";
		s += "├─┼─┼─┤\n";
		s += "│7│8│9│\n";
		s += "└─┴─┴─┘";
		System.out.println(canvas.getText());
		assertEquals(s, canvas.getText());
	}

	@Test
	public void test15() {
		IContext context = mock(IContext.class);
		ICanvas canvas = new Canvas(10, 10);
		Table t = new Table(3, 3);
		t.setElement(1, 1, new Rectangle());
		t.setElement(2, 1, new Rectangle());
		t.setElement(3, 1, new Rectangle());
		t.setElement(1, 2, new Rectangle());
		t.setElement(2, 2, new Rectangle());
		t.setElement(3, 2, new Rectangle());
		t.setElement(1, 3, new Rectangle());
		t.setElement(2, 3, new Rectangle());
		t.setElement(3, 3, new Rectangle());
		IPoint point = t.draw(canvas, context);
		assertEquals(new Point(0, 0), point);
		String s = "";
		s += "┌──┬──┬──┐\n";
		s += "│┌┐│┌┐│┌┐│\n";
		s += "│└┘│└┘│└┘│\n";
		s += "├──┼──┼──┤\n";
		s += "│┌┐│┌┐│┌┐│\n";
		s += "│└┘│└┘│└┘│\n";
		s += "├──┼──┼──┤\n";
		s += "│┌┐│┌┐│┌┐│\n";
		s += "│└┘│└┘│└┘│\n";
		s += "└──┴──┴──┘";
		System.out.println(canvas.getText());
		assertEquals(s, canvas.getText());
	}

}