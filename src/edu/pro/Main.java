package edu.pro;

import java.time.DayOfWeek;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

import com.google.common.collect.ImmutableList;
import java.util.*;

public class Main {
    // This is acceptable
    public static void doNothing() {}

    // This is equally acceptable
    public static void doNothingElse() {
    }
    // Constants
    static final int NUMBER = 5;
    static final ImmutableList<String> NAMES = ImmutableList.of("Ed", "Ann");
    static final Map<String, Integer> AGES = ImmutableMap.of("Ed", 35, "Ann", 32);
    static final Joiner COMMA_JOINER = Joiner.on(','); // because Joiner is immutable
    static final SomeMutableType[] EMPTY_ARRAY = {};

    // Not constants
    static String nonFinal = "non-final";
    final String nonStatic = "non-static";
    static final Set<String> mutableCollection = new HashSet<String>();
    static final ImmutableSet<SomeMutableType> mutableElements = ImmutableSet.of(mutable);
    static final ImmutableMap<String, SomeMutableType> mutableValues =
            ImmutableMap.of("Ed", mutableInstance, "Ann", mutableInstance2);
    static final Logger logger = Logger.getLogger("");
    static final String[] nonEmptyArray = {"these", "can", "change"};

    public static int getDiscount(DayOfWeek day){
        switch (day){
            case MONDAY: return 10;
            case TUESDAY: return 20;
            case WEDNESDAY: return 25;
            case THURSDAY: return 20;
            case FRIDAY: return 5;
        }

        return 0;
    }



    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("a", "b", "c");
        stringList = Collections.unmodifiableList(stringList);


/*
    1. INDENTS
      1.1 ASCII horizontal space character(0x20) is the only whitespace character
      1.2  Tab characters are not used for indentation.
      1.3  Block indentation: +2 spaces

    2. SPECIAL CHARACTERS
      2.1 Use (\b,\t,\n,\f,\r,\",\'  and  \\)  instead of Unicode (‘\u000a’)
      2.2 Otherwise use Unicode instead of octal
**/
      String  greeceLetterMu= "\u03bc";  // "μ"
      System.out.println(greeceLetterMu);




 /*
    3. Ordering and spacing
     Imports are ordered as follows:
      1. All static imports in a single block.
      2. All non-static imports in a single block.
     If there are both static and non-static imports, a single blank line separates the two blocks.
     There are no other blank lines between import statements.
     Within each block the imported names appear in ASCII sort order.
 * */

/*
    4. Curly braces {}
        Braces are used ALWAYS within if, else,for,do and while statements, e
        ven when the body is empty or contains only a single statement.

Examples:
* */
        // This is not acceptable
        for (int i = 0; i < 2; i++) {doNothing();}
        for (int i = 0; i < 2; i++) doNothing();
        
        // This is not acceptable: No concise empty blocks in a multi-block statement
        try {
            doNothingElse();
        } catch (Exception e) {}

/*
    5. Column limit: 100

        Each Unicode code point counts as one character, even if its display width is greater

Exceptions:
    1.  Lines where obeying the column limit is not possible (for example, a long URL in Javadoc, or a long JSNI method reference).
    2.  Package and import statements
    3.  Command lines in a comment that may be copied-and-pasted into a shell.
    4.  Very long identifiers, on the rare occasions they are called for, are allowed to exceed the column limit.


Interesting

Indent continuation lines at least +4 spaces

When line-wrapping, each line after the first (each continuation line) is indented at least +4 from the original line.
When there are multiple continuation lines, indentation may be varied beyond +4 as desired.`

* */
        String str = "11111111111111111111111111111111111111111111111111" +
                "1111111";

/*
6. Vertical Whitespace
A single blank line always appears:

    1. Between consecutive members or initializers of a class: fields,
    constructors, methods, nested classes, static initializers, and instance initializers.

          Exception: A blank line between two consecutive fields (having no other code between them)
          is optional. Such blank lines are used as needed to create logical groupings of fields.



    A single blank line may also appear anywhere it improves readability,
    for example between statements to organize the code into logical subsections.
    A blank line before the first member or initializer, or after the last member or initializer of the class,
    is neither encouraged nor discouraged.


* */

/*
    7. Horizontal alignment: never required
*/
 int age       = 20;  // bad
 double weight = 90;

/*
8.  Field annotations
Annotations applying to a field also appear immediately after the documentation block,
but in this case, multiple annotations (possibly parameterized) may be listed on the same line; for example:
*/

/*
9. Modifiers
Class and member modifiers, when present, appear in the order recommended by the Java Language Specification:

public
protected
private
abstract
default
static
final
transient
volatile
synchronized
native
strictf

 */

/*

   10.   Rules common to all identifiers
    Identifiers use only ASCII letters and digits, and, in a small number of cases noted below, underscores.
    Thus each valid identifier name is matched by the regular expression \w+ .

    In Google Style, special prefixes or suffixes are not used. For example,
    these names are not Google Style: name_, myClass, s_name and kName.

    Package names use only lowercase letters and digits (no underscores).
    Consecutive words are simply concatenated together.
    For example,com.example.deepspace, NOT com.example.deepSpace or com.example.deep_space.

    Constant names use UPPER_SNAKE_CASE: all uppercase letters, with each word separated from the next
    by a single underscore.

    But what is a constant, exactly?

    Constants are static final fields whose contents are deeply immutable
    and whose methods have no detectable side effects.
    Examples include primitives, strings, immutable value classes, and anything set to null.
    If any of the instance's observable state can change, it is not a constant.
    Merely intending to never mutate the object is not enough.
* */

/*
       11. CAMEL CASE


Prose form	               Correct	            Incorrect
"XML HTTP request"	      XmlHttpRequest	    XMLHTTPRequest
"new customer ID"	      newCustomerId	        newCustomerID
"inner stopwatch"	      innerStopwatch	    innerStopWatch
"supports IPv6 on iOS?"   supportsIpv6OnIos	    supportsIPv6OnIOS






*
* */

 /*
        Programming Practices

    -  @Override: always used
        Exception: @Override may be omitted when the parent method is @Deprecated

    -  Static members: qualified using class

    -  Finalizers: not used


 * */

        Accounting mondayAccounting = new MondayAccounting();
        int discount = mondayAccounting.getDiscount();




    }
    /*
              CODE SMELLS
                1.Blowers
                    1.1 Long Method
                    1.2 Large Class
                    1.3 Primitive Obsession
                    1.4 Long Parameter List
                    1.5 Data Clumps
                2. Violators object-oriented design
                    2.1 Switch Statements
                    2.2 Temporary Field
                    2.3 Refused Bequest
                    2.4 Alternative Classes with Different Interfaces
                3. Complicators changes
                    ...
                    ...
                    ...
                    ...
                4. Pollutants code
                    ...
                    ...
                    ...
                    ...
                5. Confusers connections
                    ...
                    ...
                    ...
                    ...
                    ...
                 6. Something else

    * */



}
