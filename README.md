# Java_NewMathLib_java.lang.Math_equivelant

 
### Advanced Software Engineering Topics Group Assignment:

#### Lab 7: JUnit exercise

For implementing the java trigonometric functions we used the formula below which we found from Wikipedia



![Trigonometric functions formulas](https://wikimedia.org/api/rest_v1/media/math/render/svg/8b96cbd9a749c461b481fbd08d70ed37ebb8efd1)

[Wikipedia Link](https://en.wikipedia.org/wiki/Trigonometric_functions#Power_series_expansion "Wikipedia Link")


In the first version we used the testcases to test the trigonometric functions but some of the tests failed as it can be seen in the image below.

![Screen Shot 1](https://anoosheh.info/img/junit-testing-assignment/1stScreenShot.png)

When we traced the reason of the taste failures we found out that there were 2 major issues with our code.

1. The _factorial()_ function
2. The _tan()_ function

By investigating the _factorial()_ function further and doing some manual tests using the _print()_ function, we found out that we should have used an input and output of the type __double__ for implementing the factoriel function.
so we changed the __int__ to __double__ in the _factorial()_ function.

Next we had to fix the problem with the _tan()_ function, so we did some manual tests and found out that when we had implemented the _tan()_ function we hadn't considered the boundary limits of the function and thus the tests did not work.

Finally we fixed the _tan()_ function and ran the tests again and we successfully passed every test as can be seen in the image below.



![Screen Shot 1](https://anoosheh.info/img/junit-testing-assignment/2ndScreenShot.png)
