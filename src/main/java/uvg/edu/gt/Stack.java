package uvg.edu.gt;

/***
 * Clase Traductor que implementa la calculadora.java para realizar las operaciones mas complejas
 */
public interface Stack<T> {
    /**
     * @param num equivalente a agregar un elemento al vector
     */
    void    push(T num);

    /***
     *
     * @return verifica si el vector esta vacio o no
     */
    boolean empty();

    /**
     *
     * @return regresa la cantidad de elementos en el vector
     */
    int     size();

    /**
     *
     * @return quita el ultimo valor del vector y lo pasa al metodo que lo necesito con el valor que antes estaba en el vector
     */
    T       pop();

    /**
     *
     * @return equivalente al get del vector
     */
    T       peek();
}