# Library interesting info collector 

## Context

You are given a collection of books by a library curator. 
Your task is to **collect interesting information** from these books.

## Information about the library

The library consists of fiction books and non-fiction books.

Books always have the following properties:

- ISBN
- title
- author
- summary
- pages

### Fiction books

These are further subdivided in:

- Childrens' tale books
- Fantasy books
- Scifi books
  - with a **ScifiTheme** property
    - zombie apocalypse
    - time travel
    - space exploration

### Non-fiction books

- They can optionally have 0, 1 or 2 **ratings**.
- A **rating** can be **anonymous** or be by a **named reviewer**.



## Collecting interesting information about a book

### **Non-Fiction books**


- A NonFictionBook always needs to have an **InterestingNessFactor** of  **at least interesting** in order to be deemed interesting.
- A NonFictionBook also always needs to have two ratings:
  - OR: both the first and second rating are **good** and by **named reviewers**
    - Collect the information: "A non-fiction book with two good ratings by {first reviewer name} and {second reviewer name}"
  - OR: the first rating is **good** and by a **named reviewer** and the second rating is **BAD**.
    - Collect the information: "A non-fiction book with a first good rating by {first reviewer name} and a bad second rating"
  - OR: there are two bad ratings
    - Collect the information: "A non-fiction book with two bad ratings"


### Fiction books

#### Fantasy book

A fantasy book is **always** found interesting. 

Collect the information: "A Fantasybook with summary: {summary}"

#### Sci-fi book

If a sci-fi book is about **space exploration**:

Collect the information: "A Scifibook about space exploration by {author}"

If a sci-fi book is about **time travel**:

Collect the information: "A Scifibook about time travel. Here's a short summary {summary}"

#### Childrens' tale book

Children's tale books can be interesting under specific conditions:
- Books with 0 pages are considered interesting as they leave everything to imagination
- Books with exactly 100 pages have a certain appeal
- Books with 1000 or more pages are noteworthy due to their unusual length for children's literature
- All other children's tale books are not considered interesting

### What if a book is uninteresting?

The curator asks you to notify the user of the application that the book wasn't interesting.
