package org.coge;

@Generate
public interface GeneratedInterface {

  /** Crea un metodo con la seguente signature:<br>
   * <code>public void method()</code> */
  public _void method();

  /** Crea un metodo con la seguente signature:<br>
   * <code>public void pippo()</code> */
  @Named(eval = "pippo")
  public _void method2();

  /** Crea un metodo con la seguente signature:<br>
   * <code>public T methodReturnGenerics()</code> */
  public _T methodReturnGenerics();

  /** Crea un metodo con la seguente signature:<br>
   * <code>public <T> int methodReturnGenerics(T t)</code> */
  public _GenericT_int methodReturnGenerics(_T t);

  /** Crea un metodo con la seguente signature:<br>
   * <code>public void methodWithArgs(String)</code> */
  public _void methodWithArgs(_String s);

  /** Crea N metodi con la seguente signature:<br>
   * <code>
   * <ul>
   * <li>public void methodWithVarargs(String s1)
   * <li>public void methodWithVarargs(String s1, String s2)
   * <li>public void methodWithVarargs(String s1, String s2, String s3)
   * <li> ....
   * </ul>
   * </code><br>
   * Necessita di essere richiamato per creare i vari metodi */
  @Many
  public _void methodWithVarargs(_String... s);

  /** Crea un metodo con la seguente signature:<br>
   * <code>public void methodWithVarargs(String ... s)</code> */
  public _void methodWithVarargs(Varargs<_String> s);

  /** Crea N metodi con la seguente signature:<br>
   * <code>public void [name depending on parameter]()</code><br>
   * Auto implementato, ma necessita di specificare oggetto di iterazione */
  @Named(eval = "\"get\"+p.toString()")
  @Many
  public _void parametricMethod(Object p);

  /** Crea N metodi con la seguente signature:<br>
   * <code>public void [name depending on parameter](String s)</code><br>
   * Richiede di essere implementato */
  @Many
  public _void parametricMethodWithArgs(Object p, _String s);

  /** Crea N metodi con la seguente signature:<br>
   * <code>public void [name depending on parameter]()</code><br>
   * Richiede di essere implementato */
  @Many
  public _void pMethod(Object p);
}