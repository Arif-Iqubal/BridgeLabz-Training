### Day 34 – Lambda Expressions & Method References in Java
📅 (Date: 27-Jan-2026)

Focused on understanding functional-style programming in Java using lambda expressions and method references. Practiced writing concise, readable code by replacing anonymous classes with lambdas and explored how Java infers types using target typing.

<br>Covered key concepts including:
- Lambda expression syntax (no parameter, single parameter, multiple parameters)
- Functional interfaces and target typing
- Type inference in lambda expressions
- Closures and effectively final variables
- Difference between lambda expressions and anonymous inner classes
- Using lambdas with Streams, Predicate, Comparator, and Runnable


### 🔗 Code Link:
[Day - 34 Lambda & Method Reference Practice](https://github.com/Arif-Iqubal/BridgeLabz-Training/tree/java8-practice/java8-practice/gcr-code-base/Java8Concepts/src/com/lambdaexpressions)


### Day 35 – Interfaces & Functional Interfaces in Java, and Stream API Practice (Real-Time Employee Scenarios)
📅 (Date: 28-Jan-2026)

Practiced interface-based design and modern Java interface features.

<br>Covered:
- Defining and implementing interfaces
- Interface best practices and ISP
- Default and static methods
- Method conflict resolution
- Polymorphism and decoupling

<br><br>Functional Interfaces:
- SAM concept and @FunctionalInterface
- Built-in functional interfaces
- Custom functional interfaces
- Lambda compatibility (SAM conversion)

<br><br>Also explored marker interfaces vs annotations and common design pitfalls.

Practiced Java 8 Stream API using a real-world **Employee dataset** to solve analytical and aggregation-based problems.

<br>Worked on scenarios involving:
- Counting male/female employees (overall & department-wise)
- Extracting department names and grouping employees by department
- Calculating average age and average salary (gender-wise & department-wise)
- Finding highest, lowest, second/third highest & lowest paid employees
- Identifying most experienced and youngest employees
- Filtering employees based on joining year and salary thresholds
- Retrieving top/bottom 5 highest and lowest paid employees
- Computing total and average salary of the organization

<br>Focused on effective usage of:
- `filter`, `map`, `sorted`, `limit`
- `Collectors.groupingBy`, `partitioningBy`, `averagingDouble`, `counting`
- Comparator chaining and Optional handling

### 🔗 Code Link:
[Day - 35 Interfaces Practice](https://github.com/Arif-Iqubal/BridgeLabz-Training/tree/java8-practice/java8-practice/gcr-code-base/Java8Concepts/src/com/functionalinterface)
<br>
[Day - 35 Stream API Employee Scenarios](https://github.com/Arif-Iqubal/BridgeLabz-Training/tree/java8-practice/java8-practice/scenario-based-codebase/Java8ScenarioBased/src/com/employeeoperation)



### Day 36 – Java Stream API & Parallel Streams
📅 (Date: 29-Jan-2026)

Practiced functional-style data processing using the Java Stream API.

<br>Covered:
- Stream pipeline structure (source → intermediate → terminal)
- Intermediate operations: filter, map, sorted, distinct
- Terminal operations: collect, forEach, count
- Lazy evaluation and stateless vs stateful operations
- Ordered vs unordered streams

<br><br>Parallel Streams:
- parallelStream() vs sequential stream
- ForkJoinPool and multi-threaded execution
- Order handling with forEachOrdered()
- Performance considerations and best practices

<br><br>Also practiced forEach() with lambdas and method references.

### 🔗 Code Link:
[Day - 36 Stream API Practice](https://github.com/Arif-Iqubal/BridgeLabz-Training/tree/java8-practice/java8-practice/gcr-code-base/Java8Concepts/src/com/stream)


### Day 37 – Collectors in Java Stream API
📅 (Date: 30-Jan-2026)

Explored the role and capabilities of Collectors used with the Stream.collect() method for data aggregation and transformation.

<br>Covered:
- Converting streams to collections using toList(), toSet(), toMap()
- Transforming and aggregating stream data
- Grouping elements using groupingBy()
- Partitioning data using partitioningBy()
- Joining stream elements into strings with joining()
- Generating statistics using summarizingInt()

<br><br>Practiced real-world scenarios including grouping, partitioning, mapping, and statistical summaries using Collectors.

### 🔗 Code Link:
[Day - 37 Collectors Practice](https://github.com/Arif-Iqubal/BridgeLabz-Training/tree/java8-practice/java8-practice/gcr-code-base/Java8Concepts/src/com/collector)
