# Talk proposal: "Getting rid of the visitor pattern and using it as first class language feature by leveraging data-oriented programming"


## Context
I would like to propose a talk about **Getting rid of the visitor pattern and using it as first class language feature by leveraging data-oriented programming (DOP)"

This is something which was made possible by the following features in java 21:

- sealed classes
- records
- enhanced, exhaustive pattern matching


Brian Goetz' wrote an article in 2022 about Data Oriented programming in java:

https://www.infoq.com/articles/data-oriented-programming-java/


which got me very interested in the subject. 

Afterwards, I watched following presentation by Nicolai Parlog:

https://www.youtube.com/watch?v=8FRU_aGY4mY

And this presentation had an interesting reflection near the end that - like lambdas did for the strategy pattern in java 8 - DOP could **replace the visitor pattern**.
It became in effect a **first class language feature**.

I invite you to watch the whole thing if you haven't, but the timestamp for this discussion is around 35 mins in.
Even though the presentation by Nicolai already showcased all the relevant concepts of DOP, I felt it would be interesting to have a presentation focussing on the part he mentioned. 
In other words, getting rid of the visitor pattern and **using the visitor pattern as a first class language feature by using (DOP)**.

## The talk

### The example


To that end, I decided to come up with a **library interesting information collector** code example. Attached you'll find a repo with a README explaining the context.
the OOPSolution implements the 'traditional' OOP approach, while the DOPSolution reimplements it using the concepts of DOP.

It is a bit of a contrived example, but it is set up in such a way it will showcase mostly everything DOP has to offer.

### A possible outline:

I think in 15 mins I can tackle:


1. A quick introduction of the context of the problem
2. discussion of the existing implementation using an OOP data model, with the behaviour seperately implemented from it by using the visitor pattern
3. live coding of the implementation using a DOP data model, with the behaviour implemented using DOP concepts.
4. Q/A


If there'd be time left over, it might also be interesting to showcase the compile-time safety DOP provides, by adding a new book type and seeing what happens.


## In conclusion

Please let me know if this is something which might be interesting to present.
I would gladly appreciate any feedback or suggestions you might have to improve upon this, seeing as it would be **my first technical presentation, ever**.



## Other resources

https://www.infoq.com/articles/data-oriented-programming-java/
https://www.youtube.com/watch?v=8FRU_aGY4mY
https://www.youtube.com/watch?v=LgquOtnjMJ8


## To research before bejug

https://www.youtube.com/watch?v=GurtoM8i2TE
https://openjdk.org/jeps/455
