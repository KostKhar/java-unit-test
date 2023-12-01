@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
	boolean exp = true;
    assertEquals("Test failed", exp, isAdult);// Напиши код здесь
}
