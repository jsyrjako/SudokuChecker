import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuVerifierTest {

//implement tests to test Sudokuverifier with boundary values.  Use templates from Task 1 to derive and document test cases.
	
// A correct Sudoku string: 417369825632158947958724316825437169791586432346912758289643571573291684164875293
// An incorrect Sudoku string: 123456789912345678891234567789123456678912345567891234456789123345678912234567891
String c = "417369825632158947958724316825437169791586432346912758289643571573291684164875293"; // Correct
String i = "123456789912345678891234567789123456678912345567891234456789123345678912234567891"; // Incorrect

String i2 = "41736982563215894795872431682543716979158643234691275828964357157329168416487529 "; //not Digit (added space to the end)
String i3 = "417369825632158947958724316825437169791586432346912758289643571573291684164875290"; //0 at the end
String i4 = "4173698256321589479587243168254371697915864323469127582896435715732916841648752933"; // too long string
String i5 = "41736982563215894795872431682543716979158643234691275828964357157329168416487529"; // too sort string
String i6 = "123456789789123456456789123312645978978312645645978312231231897897897564564564231"; // Same numbers on Row
String i7 = "123456789789123456456789123312645978978312645645978312123456789789123456456789123"; // Same number on Column

String naughty ="ЁЂЃЄЅІЇЈЉЊЋЌЍЎЏАБВГДЕЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдежзийклмнопрстуфхцчшщъыьэюя"; // Naughty string


SudokuVerifier v = new SudokuVerifier();

	@Test
	public void testCorrectString() {
		int a = v.verify(c);
		assertEquals("correct string", a, 0);
	}

	@Test
	public void testIncorrectString() {
		int a = v.verify(i);
		assertEquals("incorrect string", a, -2);
		
	}
	
	@Test
	public void testIncorrectCharString() {
		int a = v.verify(i2);
		assertEquals("incorrect string", a, 1);
		
	}
	
	@Test
	public void testIncorrectDigitString() {
		int a = v.verify(i3);
		assertEquals("incorrect string", a, -1);
		
	}
	
	@Test
	public void testIncorrectLenghtLongString() {
		int a = v.verify(i4);
		assertEquals("incorrect string", a, -1);
		
	}
	
	@Test
	public void testIncorrectLenghtSortString() {
		int a = v.verify(i5);
		assertEquals("incorrect string", a, -1);
	}
	
	
	@Test
	public void testIncorrectRowsString() {
		int a = v.verify(i6);
		assertEquals("incorrect string", a, -3);
	}
	
	@Test
	public void testIncorrectColumnsString() {
		int a = v.verify(i7);
		assertEquals("incorrect string", a, -4);
	}
	
	
	
	@Test
	public void testIncorrectNaughtyString() {
		int a = v.verify(naughty);
		assertEquals("incorrect string", a, -1);
	}
	
}
