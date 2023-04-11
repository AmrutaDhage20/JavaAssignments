Q4.Given two strings, a and b, create a bigger string made of the first char of a, 
the first char of b, the second char of a, the second char of b, and so on. 
Any leftover chars go at the end of the result.

mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"

Input : ("abc", "xyz") 
Output: "axbycz"

Input : ("Hi", "There")
Outout: "HTihere"

Input : ("xxxx", "There")
Output: "xTxhxexre"