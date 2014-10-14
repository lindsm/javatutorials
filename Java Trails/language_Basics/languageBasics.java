package language_Basics;
/**
1. Consider the following code snippet. arrayOfInts[j] > arrayOfInts[j+1] Which operators does the code contain?
Bitwise Shift Right, Addition

2. Consider the following code snippet.
int i = 10;
int n = i++%5;
	A. What are the values of i and n after the code is executed?
	1
	B. What are the final values of i and n if instead of using the postfix
	increment operator (i++), you use the prefix version (++i))?
	6

CONFIRMATION # 7259

3. To invert the value of a boolean, which operator would you use?
	!
4. Which operator is used to compare two values, = or == ?
	== is comparison
5. Explain the following code sample:
	result = someCondition ? value1 : value2;
	if someCondition is true result = value1 else value2;
*/

/**
 * @author Mike
 *
 */
public class languageBasics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test");
        // prints "2"
        int i = 10;
        int n = i++%5;
        System.out.println(i++ / i++);
        System.out.println(n);
	}

}
