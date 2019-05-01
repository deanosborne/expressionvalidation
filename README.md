# expressionvalidation

Projection Information

Not implemented:
- Way to choose brackets for validation, currently looks for all bracket types

Question 2: Stack – Validate an Expression

Stack is the appropriate data structure as you need to wrote an algorithim to read a string left to right and decide whether brackets are balanced. To do this the most recent opening bracket must mathe the next closing symbol, in turn closing symbols match opening symbols in reverse order of appearance, matching inside out. Stack works in a way that it can push an opening bracket on the stack making the closing bracket need to appear later, then if a closing bracket appears the stack will be popped. If the stack pops then brackets are balanced, however if there is no opening symbol to match a closing symbol the brackets are not balanced, at the end of the string the stack should then be empty. The features of stack allow us to easily check if a string is balanced using the LIFO/FILO structure to be able to insert/remove elements.
